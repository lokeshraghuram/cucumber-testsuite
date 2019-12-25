package com.poc;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = false,
        plugin = {"pretty","json:target/cucumber-report.json"},
        features = "src/test/resources/features",
        extraGlue = "com.poc.bdd.component")
public class CucumberTest {


}
