package broswertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest_5 {
    public static void main(String[] args) {
   String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.gecko.driver","driver/geckodriver.exe");
        // create object
        WebDriver driver = new FirefoxDriver();
        // open URL
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        // Print the current Url
        System.out.println("current url:"+driver.getCurrentUrl());

        // Print the page source
        System.out.println("Page source:"+driver.getPageSource());


        //Enter the email to email field element
        WebElement usernameField = driver.findElement(By.id("user[email]"));
        usernameField.sendKeys("shann@gmail.com");

        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("kapoor89");
        // close the browser
        driver.quit();

    }
}
