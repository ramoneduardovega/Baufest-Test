package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/baufest-test/src/test/resources/Features/LoginWeb.feature",
		glue = {"/baufest-test/src/test/java/stepDefinition"},
		format = {	"pretty",
					"html:test-output_login",
					"json:json_output_login/cucumber.json",
					"junit:junit_xml_login/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags = {"@ExamBaufest"}
		)

public class TestRunner_LoginWeb {

}
