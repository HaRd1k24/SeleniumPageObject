package ru.leva;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.leva.pages.MainPage;
import ru.leva.pages.OrdersPage;

import java.util.concurrent.TimeUnit;

public class SettingDriver {

    private final static String URL = "https://test.uxcrowd.ru/";
    static WebDriver webDriver;
    static MainPage mainPage;
    static OrdersPage ordersPage;




    @BeforeAll
    static void up() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\79013\\Downloads\\chromedriver.exe");
        webDriver = new ChromeDriver();
        mainPage = new MainPage(webDriver);
        ordersPage = new OrdersPage(webDriver);
        webDriver.manage().window().maximize();
        webDriver.get(URL);
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterAll
    static void down() {
        webDriver.close();
    }
}
