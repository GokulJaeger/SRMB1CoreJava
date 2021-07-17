package week1.day1;

import java.util.logging.Logger;

public class Message {
    public static final Logger LOGGER = Logger.getLogger(Message.class.getName());
    public static void main(String[] args) {
        
        LOGGER.info("Hello! I'm Gokul R from SRM Technologies Pvt Ltd.");
        LOGGER.info("I am Programmer!");
        LOGGER.warning("Im Evil");
    }
}
