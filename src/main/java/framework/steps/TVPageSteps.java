package framework.steps;

import framework.managers.PageManager;
import framework.pages.SearchPage;
import io.cucumber.java.bg.И;

public class TVPageSteps {

    private final PageManager pageManage= PageManager.getPageManager();

    @И("Переход во все фильтры")
    public void clickOnAllFilters(){
        pageManage.getGoTVPage().clickOnAllFilters();
    }
}
