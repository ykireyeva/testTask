package rozetka;

import core.BaseSeleniumTest;
import org.junit.Test;
import readProperties.ConfigProvider;

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
