package rozetka;

import core.BaseSeleniumPage;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseSeleniumPage {
    @FindBy(xpath = "//button[contains(@class,'buy-button')]")
    private WebElement btnBuy;

    @FindBy(className = "modal__close")
    private WebElement btnCloseCart;

    @FindBy(xpath = "//img[@alt='Rozetka Logo']")
    private WebElement rozetkaLogo;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public void addToCart() {
        boolean staleElement = true;
        while (staleElement) {
            try {
                btnBuy.click();
                btnCloseCart.click();
                rozetkaLogo.click();
                staleElement = false;

            } catch (StaleElementReferenceException | ElementClickInterceptedException e) {
                staleElement = true;
            }
        }
        new MainPage();
    }
}
