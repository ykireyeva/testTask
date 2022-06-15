package rozetka;

import core.BaseSeleniumPage;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends BaseSeleniumPage {
//    @FindBy(xpath = "//button[contains(@class,'buy-button')]")
//    private WebElement WebElementbtnBuy;

//    @FindBy(className = "modal__close")
//    private WebElement btnCloseCart;
//
//    @FindBy(xpath = "//img[@alt='Rozetka Logo']")
//    private WebElement rozetkaLogo;

    public ProductPage() {
        PageFactory.initElements(driver, this);
    }

    public MainPage addToCart(){
        boolean staleElement = true;
        while(staleElement){
            try{
                driver.findElement(By.xpath("//button[contains(@class,'buy-button')]")).click();
                driver.findElement(By.className("modal__close")).click();
                driver.findElement(By.xpath("//img[@alt='Rozetka Logo']")).click();
                staleElement = false;

            } catch(StaleElementReferenceException e) {
                staleElement = true;
            }
        }
        return new MainPage();
    }
}
