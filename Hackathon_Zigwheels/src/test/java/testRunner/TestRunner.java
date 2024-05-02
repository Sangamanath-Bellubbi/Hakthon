package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
					features= {".//Features/"},
					//features= {".//Features/NewUpcomingBikes.feature"},
				    //features= {".//Features/UsedCars.feature"},
					//features= {".//Features/Login.feature"},
					//features= {"@target/rerun.txt"},
					glue="stepDefinitions",
					plugin= {
							"html:reports/myreport.html", 
							  "rerun:target/rerun.txt",
							  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
							},
							
					dryRun=false,    // checks mapping between scenario steps and step definition methods
					monochrome=true,    // to avoid junk characters in output
					publish=true   // to publish report in cucumber server
					//tags="@sanity"  // this will execute scenarios tagged with @sanity
					
		)
public class TestRunner {

		}
