package framework.steps;

import framework.managers.PageManager;
import io.cucumber.java.bg.И;


public class StartPageSteps {
    private final PageManager pageManage= PageManager.getPageManager();

    @И("Переход в маркет")
    public void goToMarketPage(){
        pageManage.getStartPage().goToMarketPage();
    }

}
