package runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)	
@CucumberOptions(features= {"D:\\OSWOrkplace\\itecy\\src\\test\\resources\\random\\features.feature"},
monochrome = true,
glue= {"packagee"},
plugin = {"pretty","html:target\\result1","return:target\\failed.txt"})



public class Runnerclass {

	
	
	
	
}
