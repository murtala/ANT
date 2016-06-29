package ant.samples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorld  {
	 static Logger logger = Logger.getLogger(HelloWorld.class);
	 public static void main(String[] args) {
		 BasicConfigurator.configure();
	        System.out.println("Hello World");
	    }
}
