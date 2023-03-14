package com.n11.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {

    public static String baseUrl;
    public static String url;
    public static WebDriver driver;
    public static WebElement element;

    public static void setup(){

        driver = new ChromeDriver();
        url = "https://www.n11.com/magazalar";
        baseUrl = "https://www.n11.com";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }



}
