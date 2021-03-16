package ru.leva.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[@id='header-lk-button']")
    private WebElement buttonLogin;

    /*
    Регистрация нового аккаунта
     */
    @FindBy(xpath = "//label[@for='registrationLk']")
    private WebElement registrationButton;

    @FindBy(xpath = "//button[@ng-tr='WHE1.WHE12']")
    private WebElement toBeClient;

    @FindBy(xpath = "//input[@id='name']")
    private WebElement name;

    @FindBy(xpath = "//input[@id='position']")
    private WebElement position;

    @FindBy(xpath = "//input[@id='company']")
    private WebElement work;

    @FindBy(xpath = "//input[@id='emails']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='phoneNumber']")
    private WebElement phoneNumber;

    @FindBy(xpath = "//button[@ng-tr='WHE.WHE26']")
    private WebElement buttonCreate;

    /*
    Войти в аккаунт
     */

    @FindBy(xpath = "//button[@ng-tr='WHE1.WHE4']")
    private WebElement enterLogin;

    @FindBy(xpath = "//input[@id='login']")
    private WebElement fieldLogin;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement fieldPassword;

    public void clickButtonLogin(){
        buttonLogin.click();
    }

    public void clickRegistrationButton(){
        registrationButton.click();
    }

    public void beClient(){
        toBeClient.click();
    }

    public void fillName(String nickname){
        name.sendKeys(nickname);
    }

    public void fillPosition(String workPosition){
        position.sendKeys(workPosition);
    }

    public void fillWork(String myWork){
        work.sendKeys(myWork);
    }

    public void fillEmail(String myEmail){
        email.sendKeys(myEmail);
    }

    public void fillNumber(String number){
        phoneNumber.sendKeys(number);
    }

    public void clickButtonCreateAccount(){
        buttonCreate.click();
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
}
