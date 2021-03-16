package ru.leva.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrdersPage {

     /*
    Войти в акк и зайти в меню
     */

    public OrdersPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='header-lk-button']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement fieldLogin;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;

    @FindBy(xpath = "//button[@ng-tr='WHE1.WHE4']")
    private WebElement enterLogin;

    @FindBy(xpath = "//div[@data-testid='Profile client menu button']")
    private WebElement pageMenu;


      /*
    создасть тест,првоерить его создание
     */

    @FindBy(xpath = "//div[@data-testid='New test client menu button']")
    private WebElement newTest;

    @FindBy(xpath = "//input[@data-testid='Test name input']")
    private WebElement testName;

    @FindBy(xpath = "//input[@data-testid='Address site input']")
    private WebElement siteName;

    @FindBy(xpath = "//button[@data-testid='Submit button']")
    private WebElement fieldTest;

    @FindBy(xpath = "//textarea[@data-testid='Tasks task question']")
    private WebElement questionName;

    @FindBy(xpath = "//button[@data-testid='Tasks submit task']")
    private WebElement createTest;

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    public void fillFieldLogin(String login){
        fieldLogin.sendKeys(login);
    }

    public void fillFieldPassword(String password){
        fieldPassword.sendKeys(password);
    }

    public void clickButtonEnter(){
        enterLogin.click();
    }

    public void clickPageMenu(){
        pageMenu.click();
    }

    public void clickNewTest(){
        newTest.click();
    }

    public void fillFieldNameTest(String nameTest){
        testName.sendKeys(nameTest);
    }

    public void fillFieldSiteName(String site){
        siteName.sendKeys(site);
    }

    public void clickTest(){
        fieldTest.click();
    }

    public void createQuestionName(String nameQuestion){
        questionName.sendKeys(nameQuestion);
    }

    public void clickCreateTest(){
        createTest.click();
    }

}
