package testLogic;

import appLogic.ApplicationManager;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

/**
 * Created by nazarenkod on 14.10.2016.
 */
public class TestBase {

    protected ApplicationManager app;


    @BeforeSuite
    public void setUp() throws Exception {
        app = new ApplicationManager();

    }
}

