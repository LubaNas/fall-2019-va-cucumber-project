package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        System.out.println("Going to the login page");
        // login
        // Driver.getDriver()  --> gives us a driver object
        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        System.out.println("Logging in as a librarian");
        String email = ConfigurationReader.getProperty("librarian_email");
        String password = ConfigurationReader.getProperty("librarian_password");
        loginPage.login(email, password);
    }

    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        System.out.println("Verifying dashboard page");
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        System.out.println("Logging in as a student");
    }

    @When("I login as an admin")
    public void i_login_as_a_admin() {
        System.out.println("Logging in as an admin");
    }

}
