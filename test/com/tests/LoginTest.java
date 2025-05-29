package com.tests;

import com.pomodoro.trace.PomodoroLogger;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void validLoginTest() {
        PomodoroLogger.log("Login Feature", "validLoginTest", "oguz");

        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com/login");
        // Login test işlemleri burada yapılır
        driver.quit();
    }
}
