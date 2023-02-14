package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="/baufest-test/src/test/resources/Features/AltaWeb.feature",
		glue = {"/baufest-test/src/test/java/stepDefinition"},
		format = {	"pretty",
					"html:test_output_alta",
					"json:json_output_alta/cucumber.json",
					"junit:junit_xml_alta/cucumber.xml"},
		monochrome = true,
		strict = true,
		dryRun = false,
		tags = {"@ExamBaufest"}
		)

public class TestRunner_AltaWeb {

}
