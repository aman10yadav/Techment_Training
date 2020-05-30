package logtesting;

//import java.io.IOException;

//import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
//import org.apache.log4j.PatternLayout;

public class consoleandfile {

	
	static Logger logger = Logger.getLogger("consoleandfile.class");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		logger.debug("This is debug message. ");
		logger.info("This is info message ");
		logger.warn("This is warn message ");
		logger.error("This is error message. ");
		logger.fatal("This is a fatal message");

		System.out.print("Success");
	}

}
