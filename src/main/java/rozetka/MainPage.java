package rozetka;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@name='search']")
    private WebElement input;

    @FindBy(xpath = "//button[contains(text(), 'Знайти')]")
    private WebElement searchButton;

    @FindBy(xpath = "//button[@usershash='cart']")
    private WebElement btnCart;

    public MainPage() {
        PageFactory.initElements(driver, this);
    }

    public void search(String searchValue) {
        input.click();
        input.sendKeys(searchValue);
        searchButton.click();
        new ProductPage();
    }

    public void goToCart() {
        btnCart.click();
        try {
            driver.findElement(By.xpath("//div[contains(@class,'sum-price')]"));
            System.out.println("The product was added to cart");
        } catch (NoSuchElementException e) {
            System.out.println("The cart is empty");
        }
    }
}
