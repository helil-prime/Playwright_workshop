package step_defs;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import utils.PW;

public class Hooks {
	
	
	
	
	@After
	public void wrapup(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = PW.getPage().screenshot();
			scenario.attach(screenshot, "image/png", "screenshot");
		}
		PW.quitPW();
	}

}
