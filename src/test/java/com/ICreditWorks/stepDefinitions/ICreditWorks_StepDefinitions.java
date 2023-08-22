package com.ICreditWorks.stepDefinitions;

import com.ICreditWorks.Pages.ICreditWorksLandingPage;
import com.ICreditWorks.Utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ICreditWorks_StepDefinitions {
    public static WebDriver driver = Driver.chromeDriver();
    @And("User goes to ICreditWorks landing page")
    public void user_goes_to_i_credit_works_landing_page() {
        driver.get("https://www.icreditworks.com/");
    }
    ICreditWorksLandingPage landingPage = new ICreditWorksLandingPage();
    @And("User navigates to login page")
    public void user_navigates_to_login_page() throws NullPointerException{

        landingPage.loginButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        landingPage.consumerButton().click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement loanOptionsLink = driver.findElement(By.xpath("//a[@class='font-blue cursor-pointer']"));
        loanOptionsLink.click();

    }

    @And("User clicks on Check Loan Options link")
    public void userClicksOnCheckLoanOptionsLink() {

    }
    @Then("User fills out pop-up form")
    public void user_fills_out_pop_up_form() {

    }


}
