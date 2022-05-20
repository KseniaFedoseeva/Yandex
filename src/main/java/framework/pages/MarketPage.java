package framework.pages;

import framework.managers.DriverManager;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//button[@id = 'catalogPopupButton']")
    private WebElement catalog;

    @FindBy(xpath = "//span[@class='_1UCDW' and text() = 'Электроника']")
    private WebElement elektronika;

    @Step("Переход в каталог")
    public MarketPage goToCatalog(){

        waitUtilElementToBeVisible(catalog);
        waitUtilElementToBeClickable(catalog);
       catalog.click();
       return this;

    }

    @Step ("Переход в раздел Электроника")
    public ElectronikaPage goToElectronika(){
     elektronika.click();
     return pageManager.getGoToElectronikaPage();
    }


}
