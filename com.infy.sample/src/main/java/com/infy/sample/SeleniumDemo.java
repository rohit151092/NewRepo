package com.infy.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SeleniumDemo {
    private static WebDriver driver;

    @Test
    public void sampleTest() throws InterruptedException {
	try {
	    System.setProperty("webdriver.chrome.driver", "C:\\My folder\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    String baseUrl = "https://material-ui.com/components/text-fields/";
	    driver.get(baseUrl);
	    driver.manage().window().maximize();
	    System.out.println(driver.getTitle());
	} catch (Exception e) {
	    System.out.println(e.getStackTrace());
	} finally {
	    driver.close();
	}
    }
}
