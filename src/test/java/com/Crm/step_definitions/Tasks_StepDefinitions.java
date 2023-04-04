package com.Crm.step_definitions;

import com.Crm.pages.LoginPage;
import com.Crm.pages.TasksPage;
import com.Crm.utilities.ConfigurationReader;
import com.Crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Tasks_StepDefinitions {

    TasksPage tasksPage = new TasksPage();
    LoginPage loginPage = new LoginPage();


    @Given("user is on the Tasks page")
    public void user_is_on_the_tasks_page() {

        String url = ConfigurationReader.getProperty("web.url");
        Driver.getDriver().get(url);
        loginPage.login();
        tasksPage.tasksButton.click();
    }

    @When("user clicks All tab")
    public void user_clicks_all_tab() {
        tasksPage.allButton.click();
    }

    @Then("user should be able to display tasks -In progress-")
    public void user_should_be_able_to_display_tasks_in_progress() {
        //tasksPage.InProgressTab.isDisplayed()
        Assert.assertTrue(tasksPage.InProgressTab.isDisplayed());

    }

    @When("user clicks Ongoing tab")
    public void user_clicks_ongoing_tab() {
        tasksPage.OngoingButton.click();
    }
    @Then("user should be able to display tasks -Ongoing-")
    public void user_should_be_able_to_display_tasks_ongoing() {
       Assert.assertTrue(tasksPage.OngoingTab.isDisplayed());
    }


}
