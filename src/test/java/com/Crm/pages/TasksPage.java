package com.Crm.pages;

import com.Crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class TasksPage {

    public TasksPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id="bx_left_menu_menu_tasks")
    public WebElement tasksButton;

    @FindBy(id= "tasks_panel_menu_view_all")
    public WebElement allButton;

    @FindBy(css = "div[title='Default filter']")
    public WebElement InProgressTab;

    @FindBy(id= "tasks_panel_menu_view_role_responsible")
    public WebElement OngoingButton;

    @FindBy(css= "div[title='Role: Ongoing']")
    public WebElement OngoingTab;

}
