package com.ICreditWorks.Pages;
import com.ICreditWorks.Utilities.Driver;
import com.ICreditWorks.stepDefinitions.ICreditWorks_StepDefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class ICreditWorksLandingPage{

   /*
    @FindBy(xpath = "//a[@class='link_login_inactive']")
      public WebElement loginButton;

    @FindBy(xpath = "//a[@class='link_login link_consumer']")
    public WebElement consumerButton;
    */


    public WebElement loginButton(){
        return ICreditWorks_StepDefinitions.driver.findElement(By.xpath("//a[@class='link_login_inactive']"));
    }
    public WebElement consumerButton(){
        return ICreditWorks_StepDefinitions.driver.findElement(By.xpath("//a[@class='link_login link_consumer']"));
    }


}
