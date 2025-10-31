package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
          System.setProperty("webdriver.chrome.driver","C:\\Brower_folders\\chromedriver.exe");
          WebDriver dr=new ChromeDriver();
          dr.get("https://www.orangehrm.com/");
          dr.manage().window();
          Thread.sleep(2000);
    }
}
