package logtesting;

import java.io.IOException;

import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Logger;

public class HtmlLayout {

	static Logger logger = Logger.getLogger("HtmlLayout.class");
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileAppender fileappender = new FileAppender(new HTMLLayout(), "LogHtml.html");
		logger.addAppender(fileappender);
		
		logger.debug("This is debug message. ");
		logger.info("This is info message ");
		logger.error("This is error message. ");

		System.out.print("Success");

	}

}
