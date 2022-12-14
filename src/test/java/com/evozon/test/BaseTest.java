package com.evozon.test;

import com.evozon.helper.Constants;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected WebDriver driver;

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", Constants.CHROME_PATH);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        driver.get(Constants.BASE_URL);
    }

    @After
    public void tearDown(){
        driver.quit();

    }
}
