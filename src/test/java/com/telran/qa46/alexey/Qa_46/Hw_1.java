package com.telran.qa46.alexey.Qa_46;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Hw_1 {
     WebDriver driver;

    @BeforeMethod

    public void setUp(){
        driver = new ChromeDriver();
        driver.get("https://demowebshop.tricentis.com/");


       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));


    }
    @Test
    public void openWikipediaTest(){
        System.out.println("Wikipedia");
    }
    

    @AfterMethod
    public  void taerDown(){

        driver.quit();



    }


}
