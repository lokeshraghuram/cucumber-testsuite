package com.poc.bdd.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MyStepdefs {

    @Given("that steps are recognised")
    public void thatStepsAreRecognised() {
        System.out.println("Steps are getting recognised");
    }

    @Then("print Hello World")
    public void printHelloWorld() {
        System.out.println("Hello World");
    }
}
