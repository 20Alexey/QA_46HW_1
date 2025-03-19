package demowebshop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTests  extends TestBase{

    @Test
    public void newUserRegistrPositTest(){
       driver.findElement(By.cssSelector("[href='/login']")).click();

        driver.findElement(By.name("Email")).click();
        driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("yakoales@gmail.com");

        driver.findElement(By.name("Password")).click();
        driver.findElement(By.name("Password")).clear();
        driver.findElement(By.name("Password")).sendKeys("A20112011a$");

        driver.findElement(By.cssSelector(".button-1.register-button")).click();






    }
}
