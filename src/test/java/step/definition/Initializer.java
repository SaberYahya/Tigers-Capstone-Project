package step.definition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import core.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utilities.Utils;

public class Initializer extends Base {

	@Before

	public void beforeHooks(Scenario senario) {
		logger.info("Scenario " + senario.getName() + " Started !");
		obtainBrowser();
		launchUrl();
	}

	@After
	public void afterHooks(Scenario scenario) throws Exception {
		logger.info("Scenario " + scenario.getName() + " | " + scenario.getStatus());
		if (scenario.isFailed()) {
			final byte[] screenShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenShot, "image/png", "Failed Scenario" + scenario.getName());
			shutBrowser();
		}
		else {
			Utils.takeScreenShot(scenario.getName());
			logger.info("Scenario " + scenario.getName() + " " + scenario.getStatus());
			shutBrowser();
		}
	}

}
