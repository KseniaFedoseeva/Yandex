package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElectronikaPage extends BasePage {

    @FindBy(xpath = "//a[@href='/catalog--televizory/26960210/list?hid=90639' and text() = 'Телевизоры']")
    private WebElement tv;

    public TVPage clickOnTVPage(){
        tv.click();
        return pageManager.getGoTVPage();
    }


}
