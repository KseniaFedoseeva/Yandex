package framework.steps;

import framework.managers.PageManager;
import framework.pages.ModelTVPage;
import framework.pages.SearchPage;
import io.cucumber.java.bg.И;

public class SearchPageSteps {

    private final PageManager pageManage= PageManager.getPageManager();

    @И("Назначили цену")
    public void sendPrice(){
        pageManage.getSearchPage().sendPrice();
    }

    @И("Назначили бренды")
    public void checkBrand(){
        pageManage.getSearchPage().checkBrand();
    }

    @И("Запустили поиск")
    public void clickButton(){
        pageManage.getSearchPage().clickButton();
    }
}
