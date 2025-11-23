package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MainTest {

    @Test
    public void openWebsite() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Brower_folders\\chromedriver.exe");

        WebDriver dr = new ChromeDriver();
        dr.get("https://www.orangehrm.com/");
        dr.manage().window().maximize();

        Thread.sleep(2000);
        dr.quit();
    }
}
