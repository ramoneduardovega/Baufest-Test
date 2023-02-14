package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/baufest-test/src/test/resources/Features/LogoutWeb.feature",
		glue = {"/baufest-test/src/test/java/stepDefinition"},
		format = {	"pretty",
					"html:test_output_logout",
					"json:json_output_logout/cucumber.json",
					"junit:junit_xml_logout/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags = {"@ExamBaufest"}
		)

public class TestRunner_LogoutWeb {

}
