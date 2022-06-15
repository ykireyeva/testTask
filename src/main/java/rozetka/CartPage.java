package rozetka;

import core.BaseSeleniumPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BaseSeleniumPage {
    @FindBy(xpath = "//h4[contains(text(), 'Кошик порожній')]")
    private WebElement cartIsEmpty;

    public CartPage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyCart(){
        Assert.assertFalse(cartIsEmpty.isDisplayed());
        System.out.println("The product was added to cart");
    }
}
