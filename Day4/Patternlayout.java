package logtesting;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Patternlayout {

	static Logger logger = Logger.getLogger("Patternlayout.class");
	
	public static void main(String[] args) throws IOException {
		
		FileAppender fileappender = new FileAppender(new PatternLayout(), "Logpattern.txt");
		logger.addAppender(fileappender);
		
		logger.debug("This is debug message. ");
		logger.info("This is info message ");
		logger.error("This is error message. ");

		System.out.print("Success");
	}

}
