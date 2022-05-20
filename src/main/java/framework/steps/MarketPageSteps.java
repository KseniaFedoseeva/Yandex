package framework.steps;

import framework.managers.PageManager;
import framework.pages.ElectronikaPage;
import framework.pages.MarketPage;
import io.cucumber.java.bg.И;
import io.qameta.allure.Step;

public class MarketPageSteps {
    private final PageManager pageManage= PageManager.getPageManager();

    @И("Переход в каталог")
    public void goToCatalog(){
pageManage.getGoToMarketPage().goToCatalog();

    }

    @И("Переход в раздел Электроника")
    public void goToElectronika(){
        pageManage.getGoToMarketPage().goToElectronika();
    }

}
