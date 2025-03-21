package demowebshop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CreateAccountTests  extends TestBase{

    @Test
    public void newUserRegistrPositTest(){
        click(By.cssSelector("[href='/login']"));

        // driver.findElement(By.name("FirstName")).click();
       // driver.findElement(By.name("FirstName")).clear();
       // driver.findElement(By.name("FirstName")).sendKeys("Alexey");


       //driver.findElement(By.name("LastName")).click();
       // driver.findElement(By.name("LastName")).clear();
       // driver.findElement(By.name("LastName")).sendKeys("Alexey");

        type(By.name("Email"), "yakoales@gmail.com");

        type(By.name("Password"), "A20112011a$");

        click(By.cssSelector(".button-1.register-button"));

        // driver.findElement(By.cssSelector(".register-button")).click();
       // Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
        //Assert.assertTrue(isElementPresents(By.cssSelector("[href='/logout']")));
        // Assert.assertTrue(isElementPresent(By.xpath("a[href='/logout']")));
        //ругается






    }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
