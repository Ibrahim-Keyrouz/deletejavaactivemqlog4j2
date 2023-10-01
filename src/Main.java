import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {

   // private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main(String [] args) {
       final  Logger LOGGER = LogManager.getLogger("loggerjms");
      //  log.info("This is an INFO level log message!");
        System.out.println("hrllo");
        LOGGER.info("This is an INFO level log message!");
    }


}
