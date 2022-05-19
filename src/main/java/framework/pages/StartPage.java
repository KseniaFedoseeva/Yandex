package framework.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StartPage extends BasePage {

    @FindBy(xpath = "//*[@class='services-new__icon services-new__icon_market']")
    private WebElement iconMarket;

    @Step("Переход в маркет")
    public MarketPage goToMarketPage(){
        iconMarket.click();

        return pageManager.getGoToMarketPage();
    }


}
