package framework.pages;

import framework.managers.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;

public class StartPage extends BasePage {

    @FindBy(xpath = "//*[@class='services-new__icon services-new__icon_market']")
    private WebElement iconMarket;

    @Step("Переход в маркет")
    public MarketPage goToMarketPage(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        iconMarket.click();
       String number = DriverManager.getDriverManager().getDriver().getWindowHandle();
       ArrayList<String> tabs = new ArrayList<String>(DriverManager.getDriverManager().getDriver().getWindowHandles());
       String nextNumber = tabs.get(1);
       DriverManager.getDriverManager().getDriver().switchTo().window(nextNumber);


        return pageManager.getGoToMarketPage();
    }


}
