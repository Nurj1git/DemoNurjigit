package com.digital;
import com.digital.config.ConfigReader;
import com.digital.driver.Driver;
import com.digital.helper.ElementActions;
import com.digital.pages.CoursesPagePOM;

import com.digital.pages.HomePage;
import com.digital.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;



public abstract class BaseTest {
    public WebDriver driver;
    public    CoursesPagePOM  coursesPagePOM;

    public ElementActions elementActions;
    public LoginPage loginPage;

    public HomePage homePage;


    @BeforeClass(alwaysRun = true)
    public void setUpBrowser() {
        driver = Driver.getDriver();
        driver.get(ConfigReader.getProperty("BASE_URL"));
        coursesPagePOM = new CoursesPagePOM();
        elementActions = new ElementActions();
        homePage = new HomePage();
        loginPage = new LoginPage();


    }

   @AfterClass(alwaysRun = true)
   public void tearDown() {
      Driver.closeDriver();
   }


}
