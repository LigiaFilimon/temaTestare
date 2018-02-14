package org.fasttrackit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;

public class CartTests {


    @Test
    public void addToCart() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.name("q")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(@title, 'Herald Glass Vase')]")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("// div [@class= 'add-to-cart-buttons' and ./descendant ::*[text()='Add to Cart' ]]//button[contains(@class, 'btn-cart' )]")).click();
        driver.quit();
    }


    @Test
    public void DeleteItemFromCart() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/Darius/Documents/webdrivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.name("q")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(@title, 'Herald Glass Vase')]")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("// div [@class= 'add-to-cart-buttons' and ./descendant ::*[text()='Add to Cart' ]]//button[contains(@class, 'btn-cart' )]")).click();
        driver.findElement(By.xpath("//*[@id=\"shopping-cart-table\"]/tbody/tr/td[6]/a")).click();
        driver.quit();
    }

    @Test
    public void increaseQuantity() {
        System.setProperty("webdriver.chrome.driver", "/Users/Darius/Documents/webdrivers/chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://fasttrackit.org/selenium-test/");
        driver.findElement(By.name("q")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("//*[contains(@title, 'Herald Glass Vase')]")).sendKeys("vase" + Keys.ENTER);
        driver.findElement(By.xpath("// div [@class= 'add-to-cart-buttons' and ./descendant ::*[text()='Add to Cart' ]]//button[contains(@class, 'btn-cart')]")).click();
        driver.findElement(By.cssSelector("td>input[class = 'input-text qty'")).click();
        driver.findElement(By.cssSelector("td>input[class = 'input-text qty'")).clear();
        driver.findElement(By.cssSelector("td>input[class = 'input-text qty'")).sendKeys("2" + Keys.ENTER);
        System.out.println(driver.findElement(By.cssSelector("td>input[class = 'input-text qty'")).getText());
        assertThat("number of products added to cart", driver.findElement(By.cssSelector("td>input[class = 'input-text qty'")).getText(), containsString("2"));
        driver.quit();
    }

}
