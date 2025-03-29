package demowebshop;

import org.openqa.selenium.By;
import org.testng.Assert;
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

       // driver.findElement(By.name("Log in")).click();
         //driver.findElement(By.name("Log in")).clear();
        //driver.findElement(By.cssSelector("input[value='Log in']"));
        //driver.findElement(By.cssSelector("input[value='Log in']")).sendKeys();

        // driver.findElement(By.cssSelector(".register-button")).click();
       // Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")));
        //Assert.assertTrue(isElementPresents(By.cssSelector("[href='/logout']")));
        // Assert.assertTrue(isElementPresent(By.xpath("a[href='/logout']")));

        //ругается
        RegistrationData registrationData = new RegistrationData(
                "Alexey",
                "Alexey",
                "alexey" + System.currentTimeMillis() + "@gmail.com",
                "A20112011a$",
                "A20112011a$"
        );

        // Переход на страницу регистрации
        click(By.cssSelector("[href='/login']"));
        click(By.cssSelector("[href='/register']"));

        // Заполнение формы регистрации
        type(By.name("FirstName"), registrationData.getFirstName());
        type(By.name("LastName"), registrationData.getLastName());
        type(By.name("Email"), registrationData.getEmail());
        type(By.name("Password"), registrationData.getPassword());
        type(By.name("ConfirmPassword"), registrationData.getConfirmPassword());

        // Отправка формы
        click(By.xpath("//input[@id='register-button']"));///????

        // Ожидание появления кнопки "Logout" (подтверждение успешной регистрации)
       // waitForElementVisible(By.cssSelector("[href='/logout']"));

        // Проверка, что пользователь зарегистрирован
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")), "Logout link is not present, registration failed.");
    }
}







