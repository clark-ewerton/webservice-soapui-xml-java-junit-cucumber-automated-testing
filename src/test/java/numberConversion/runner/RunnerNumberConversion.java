package numberConversion.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { 
					"src/test/java/numberConversion/features/",
						
			}
			, glue = {
					"numberConversion",
					
			}
			, monochrome = true
			, plugin = {
					"json:json/cucumber.json"
			}
			, tags = {
					"~@ignore"
	}
			
)
public class RunnerNumberConversion {

	/**
	 * Just to place the log files inside the target folder. More logging
	 * configuration changes can be done programmatically or directly in
	 * soapui-4.5.1.jar\com\eviware\soapui\resources\conf\soapui-log4j.xml.
	 */

	@BeforeClass
	public static void setLog() {
		System.setProperty("soapui.logroot", "target/soapui/");

	}
}
