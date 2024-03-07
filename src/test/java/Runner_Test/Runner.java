package Runner_Test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\MONESH\\eclipse-workspace\\Testing\\src\\test\\java\\Feature\\Home.feature",
				glue = "Step_definition",
				
				plugin= {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runner {

}
