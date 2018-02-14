package org.fasttrackit;


import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * Unit test for simple App.
 */

public class SimpleSearch {


    @Test
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public void SimpleSearch() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.id("search")).sendKeys("vase"+ Keys.ENTER);
        driver.quit();

    }

    @Test
    public void SimpleSearchByName() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");

        driver.findElement(By.name("q")).sendKeys("vase"+Keys.ENTER);
        driver.quit();

    }

    @Test

    public void SimpleSearchByClass(){
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.className("required-entry")).sendKeys("a tale of two cities"+Keys.ENTER);
    }

}




