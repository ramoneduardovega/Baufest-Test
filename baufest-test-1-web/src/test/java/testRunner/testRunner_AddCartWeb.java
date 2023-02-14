package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/baufest-test/src/test/resources/Features/AddCartWeb.feature",
		glue = {"/baufest-test/src/test/java/stepDefinition"},
		format = {	"pretty",
					"html:test_output_add",
					"json:json_output_add/cucumber.json",
					"junit:junit_xml_add/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags = {"@ExamBaufest"}
		)

public class testRunner_AddCartWeb {

}
