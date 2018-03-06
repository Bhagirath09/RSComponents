package RSComponents;

import com.cucumber.listener.Reporter;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends Utils {

    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProp = new LoadProp();


    String browser = loadProp.getProperty("browser");
    String url = loadProp.getProperty("url");


    @Before
    public void openBrowser(){

        browserSelector.openBrowser(browser);
        driver.get(url);
    }

    @After
    public void takeScreenShotIfTestFailAndQuiteBrowser(Scenario scenario) throws Exception
    {

        if (scenario.isFailed()) {

            captureScreenShot(driver,"./target/ScreenShots/"+scenario.getName()+".png");
            Reporter.addScreenCaptureFromPath("./target/ScreenShots/"+scenario.getName()+".png");
            scenario.write("Scenario is failed");
        }
        else {
            scenario.write("Scenario is passed");
        }
        // close application
        driver.quit();
    }

}
