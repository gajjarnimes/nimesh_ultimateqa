package broswertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserTest_5 {
    public static void main(String[] args) {
        String baseUrl="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdrier.msedge.driver","driver/msedgedriver.exe");
        // create object
        WebDriver driver = new EdgeDriver();
        // Open URL
        driver.get(baseUrl);
        // Print the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        //print the current URL
        System.out.println("current url"+driver.getCurrentUrl());

        //print the page source
        System.out.println("Page source"+driver.getPageSource());

        //Enter the email to email field element
        WebElement usernameField = driver.findElement(By.id("user[email]"));
        usernameField.sendKeys("vedant@yahoo.com");

        // Enter the password to password field element
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("vaidehi123");

        //close the browser
        driver.quit();
    }
}

