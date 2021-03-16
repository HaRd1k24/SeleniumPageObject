package ru.leva;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.Random;

public class Test01 extends SettingDriver {

    @Test
    public void registrationNewAccount() {

        String name = "Leva";
        String workPosition = "Qa";
        String myWork = "Google";
        String number = "79015555555";
        int random = new Random().nextInt(9999);
        String email = "asdxczfa" + random + "@1secmail.com";

        mainPage.clickButtonLogin();
        mainPage.clickRegistrationButton();
        mainPage.beClient();
        mainPage.fillName(name);
        mainPage.fillPosition(workPosition);
        mainPage.fillWork(myWork);
        mainPage.fillEmail(email);
        mainPage.fillNumber(number);
        mainPage.clickButtonCreateAccount();

        String text = webDriver.findElement(By.xpath("//div[@ng-bind-html='successMessage.header']")).getText();
        Assertions.assertEquals("Спасибо за регистрацию на UXCrowd!", text);
    }

    @Test
    public void enterAccount() {
        String log = "asdxczfa@1secmail.com";
        String password = "U4D3iD";

        mainPage.clickButtonLogin();
        mainPage.fillFieldLogin(log);
        mainPage.fillFieldPassword(password);
        mainPage.clickButtonEnter();
    }

    @Test
    public void nextProfile() {
        String log = "asdxczfa@1secmail.com";
        String password = "U4D3iD";

        ordersPage.clickButtonLogin();
        ordersPage.fillFieldLogin(log);
        ordersPage.fillFieldPassword(password);
        ordersPage.clickButtonEnter();
        ordersPage.clickPageMenu();



        String text = webDriver.findElement(By.xpath("//div[@class='sc-pjGMk fowmdh'][2]")).getText();
        Assertions.assertEquals("Данные учетной записи", text);
    }

    @Test
    public void createTest() {
        String log = "asdxczfa@1secmail.com";
        String password = "U4D3iD";
        String nameTest = "Test";
        String siteTest = "vk.com";

        ordersPage.clickButtonLogin();
        ordersPage.fillFieldLogin(log);
        ordersPage.fillFieldPassword(password);
        ordersPage.clickButtonEnter();
        ordersPage.clickPageMenu();

        ordersPage.clickNewTest();
        ordersPage.fillFieldNameTest(nameTest);
        ordersPage.fillFieldSiteName(siteTest);
        ordersPage.clickTest();
        ordersPage.createQuestionName(nameTest);
        ordersPage.clickCreateTest();



        webDriver.findElement(By.xpath("//button[@data-testid='Check button']")).click();
    }
}
