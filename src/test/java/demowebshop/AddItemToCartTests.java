package demowebshop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddItemToCartTests extends TestBase{
    //click(By.cssSelector("[href='/logi
    @Test
    public void addItemToCartTest() {
        // Предусловие: логин
        login("yakoales@gmail.com", "A20112011a$");

        // Найти и кликнуть на второй товар на главной странице
        // driver.findElement(By.className("Add to car")).clear();

        //click(By.cssSelector("div.item-box:nth-child(2) .product-title > a"));
       // click(By.xpath("(//input[@value='Add to cart'])[2]"));
        click(By.xpath("(//input[@value='Add to cart'])[4]"));



        // Добавить товар в корзину
        click(By.xpath(".button-1.add-to-cart-button"));

        // Проверка текста в корзине
        Assert.assertTrue(isElementPresent(By.cssSelector(".header-links .cart-label")), "Cart link is not present!");

        // Проверим, что в корзине появился товар, и текст корзины содержит название товара
        String itemText = driver.findElement(By.cssSelector(".cart-item-title")).getText();
        Assert.assertTrue(itemText.contains("Expected Product Name"), "The added item is not present in the cart.");
    }

    // Вспомогательный метод для логина
   private void login(String email, String password) {
        // Перейти на страницу входа
       click(By.cssSelector("[href='/login']"));

        // Ввести email и пароль
        type(By.name("Email"), email);
       type(By.name("Password"), password);

        // Кликнуть по кнопке входа
      click(By.cssSelector(".button-1.login-button"));

        // Проверка успешного логина (например, по наличию ссылки "Logout")
        Assert.assertTrue(isElementPresent(By.cssSelector("[href='/logout']")), "Login failed!");
    }
}


