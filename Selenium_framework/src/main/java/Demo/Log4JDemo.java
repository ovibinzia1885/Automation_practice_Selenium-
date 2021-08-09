package Demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JDemo {
	
	private  static Logger logger=LogManager.getLogger(Log4JDemo.class);
	public static void main(String[] args) {
		
		System.out.println("\n Hello word....!\n");
		logger.trace("this is trace message");
		logger.info("This is inofrmation message");
		logger.error("This is error messaage");
		logger.warn("This is error messaage");
		logger.fatal("This is fatal messaage");
		System.out.println("Completed!");
		
	}

}
