package numberConversion.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("numberConversion/features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "numberConversion.steps")
@ConfigurationParameter(
        key = "cucumber.plugin", 
        value = "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm, pretty"
    )
public class RunnerNumberConversionTest {
    static {
        System.setProperty("soapui.logroot", "target/soapui/");
    }
}
