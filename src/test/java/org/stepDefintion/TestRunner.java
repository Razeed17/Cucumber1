package org.stepDefintion;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="@src\\test\\resources\\feature\\tarrifflist.Feature", glue= {"org.stepDefinition"} , plugin= {"html:target"})
public class TestRunner {

}
