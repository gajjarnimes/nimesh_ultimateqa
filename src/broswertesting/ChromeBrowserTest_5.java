package broswertesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest_5 {

    public static void main(String[] args) {
        String baseUrl ="https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");

        //create object
        WebDriver driver= new ChromeDriver();
        driver.get(baseUrl);

        // print title of the page
        String title = driver.getTitle();
        System.out.println("Page title is:"+title);

        // print the current url
        System.out.println("current url"+driver.getCurrentUrl());

        // print the page source
        System.out.println("page source"+driver.getPageSource());

        // Enter the Email to email field element
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("jhanvi@yahoo.com");

        // Enter the password to password field element
       WebElement passwordField= driver.findElement(By.name("user[password]"));
       passwordField.sendKeys("Anil321");

       // close the browser
        driver.quit();
    }
    }

