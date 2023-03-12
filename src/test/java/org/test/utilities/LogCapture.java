package org.test.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class LogCapture {

    public  static void LogFile(String classname, String message){
        DOMConfigurator.configure("C:\\Users\\swati\\IdeaProjects\\YTFrameWorkUsingPOM\\Layout.xml");
        Logger log= Logger.getLogger(classname);
        log.info(message);
//        log.info("Test message one");
//      log.debug("test debug");
//       log.error("Test error message");}
}
}
