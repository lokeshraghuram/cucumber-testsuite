package com.poc;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true,
        plugin = {"pretty", "json:target/cucumber.json"},
        features = "src/test/resources/features",
        extraGlue = "com.poc.bdd.component")
public class CucumberTest {


}
