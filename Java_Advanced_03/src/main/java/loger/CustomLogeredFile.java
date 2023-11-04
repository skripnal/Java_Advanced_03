package loger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class CustomLogeredFile {
	
	private static Logger LOG = Logger.getLogger(CustomLogeredFile.class);
	
	
	public static void main(String[] args) {
		DOMLog();
	}
	
	
	public static void DOMLog() {
		DOMConfigurator.configure("log4j.xml");
		LOG.debug("Debug message");
		LOG.info("Info message");
		LOG.warn("Warn message");
		LOG.error("Error message");
		LOG.info("Info message");
		LOG.warn("Warn message");
		LOG.error("Error message");
		LOG.error("Error message");
		LOG.debug("Debug message");
		LOG.info("Info message");
	}
}
