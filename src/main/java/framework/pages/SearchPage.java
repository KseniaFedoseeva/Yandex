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
        lg.click();
        samsung.click();
        return this;
    }

    public ModelTVPage clickButton(){
        button.click();
        return pageManager.getModelsTV();
    }


}
