package fr.afpa.logs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App {
  private static final Logger logger = LogManager.getLogger(App.class);

  public static void main(String[] args) {
    logger.info("L'application a demarre");

    System.out.println("Hello, user!");
    logger.trace("We've just greeted the user!");
    logger.debug("We've just greeted the user!");
    logger.info("We've just greeted the user!");
    logger.warn("We've just greeted the user!");
    logger.error("We've just greeted the user!");
    logger.fatal("We've just greeted the user!");

    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
      logger.info("L'application s'arrete");
    }));
  }

}
