package Logowanie;

import org.apache.log4j.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Created by olewc on 04/09/2017.
 */
public class Logging4jProba {

    static Logger log = Logger.getLogger(Logging4jProba.class);

    @BeforeClass
    public static void setUpBeforeClass (){
        // PropertyConfigurator.configure("F:\\Git_folder\\Java_selenium_udemy\\src\\Logowanie\\log4j.properties");
        PropertyConfigurator.configure("F:\\Git_folder\\Java_selenium_udemy\\src\\Logowanie\\file_log4j.properties");



        log.info("running before method");
    }

    @Test
    public void test(){
        log.info("running test method");

    }

    @AfterClass
    public static void tearDownAfterClass(){
        log.debug("running after method");
    }
}
