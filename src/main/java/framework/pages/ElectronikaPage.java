package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronikaPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Телевизоры']")
    private WebElement tv;

    public TVPage clickOnTVPage(){
        tv.click();
        return pageManager.getGoTVPage();
    }


}
