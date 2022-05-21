package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage{

    @FindBy(xpath = "/html/body/div[3]/section/div[2]/div/div/div[2]/div[1]/div[4]/div/div/div/div[1]/input")
    private WebElement price;

    @FindBy(xpath = "//div[text()='LG']")
    private WebElement lg;

    @FindBy(xpath = "//div[text()='Samsung']")
    private WebElement samsung;

    @FindBy(xpath = "//a[starts-with(text(), 'Показать')]")
    private WebElement button;

    public SearchPage sendPrice(){
        price.click();
        price.sendKeys("20000");
        return this;
    }

    public SearchPage checkBrand(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        action.moveToElement(lg);
        action.click(lg).perform();
       action.moveToElement(samsung);
       action.click(samsung).perform();
        return this;
    }

    public ModelTVPage clickButton(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        button.click();
        return pageManager.getModelsTV();
    }


}
