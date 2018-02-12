package RSComponents;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".", tags = {"@End2End, @Functional"}, format = {"pretty", "html:target/Reports"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/Reports/Cucumber-extent-report.html"})


public class RunTest {

    @AfterClass
    public static void reportSetup() {

        Reporter.loadXMLConfig(new File("src/test/Resources/Properties/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("32 Bit", "Windows 7");
        Reporter.setSystemInfo("2.53.1", "Selenium");
        Reporter.setSystemInfo("4.0.0", "Maven");
        Reporter.setSystemInfo("1.8.0_131", "Java Version");
        Reporter.setTestRunnerOutput("Cucumber Maven Test Runner");
    }

}
