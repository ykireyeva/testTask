package rozetka;

import core.BaseSeleniumTest;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import readProperties.ConfigProvider;

import java.util.concurrent.TimeUnit;

public class RozetkaTest extends BaseSeleniumTest {

    @Test
    public void check() {
        MainPage mainPage = new MainPage();
        ProductPage productPage = new ProductPage();

        mainPage.search(ConfigProvider.PRODUCT_NAME);
        productPage.addToCart();
        mainPage.goToCart();
    }
}
