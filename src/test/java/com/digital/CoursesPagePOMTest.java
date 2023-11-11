package com.digital;

import com.digital.pages.CoursesPagePOM;
import org.testng.annotations.Test;
import io.qameta.allure.Allure;
import org.testng.annotations.Test;


public class CoursesPagePOMTest extends BaseTest {
    CoursesPagePOM coursesPage = new CoursesPagePOM();

    @Test
    public void CheckBoxAllTestRun(){
        driver.get("https://nbu111.talentlms.com/course/index");
        loginPage.logIn();
        coursesPage.checkBoxAllTest();
        coursesPage.toClickSimpleHyperTextAndReturnBack();
        coursesPage.toClickSignalIconAndReturnBack();
        coursesPage.toClickPencilIconAndReturnBack();
        coursesPage.toClickMagnetIconAndClickCancel();
        coursesPage.toClickRemoveIconAndClickCancel();
    }


}
