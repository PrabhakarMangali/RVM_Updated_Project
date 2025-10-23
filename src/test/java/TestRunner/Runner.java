package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\prabh\\eclipse-workspace\\Project1\\Features\\PatientRegistration.feature", 
                 glue = {"stepDefination"},
				plugin= {"pretty","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"})   
                	    

public class Runner {

}
