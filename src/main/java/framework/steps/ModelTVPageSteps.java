package framework.steps;

import framework.managers.PageManager;
import framework.pages.ModelTVPage;
import framework.pages.SearchResult;
import io.cucumber.java.bg.И;
import org.junit.Assert;

public class ModelTVPageSteps {
    private final PageManager pageManage= PageManager.getPageManager();

    @И("Проверка количества результатов выдачи")
    public void checkCount(){
        pageManage.getModelsTV().checkCount();
    }

    @И("Проверка модели")
    public void putValueToSearch(){
        pageManage.getModelsTV().putValueToSearch();
    }
    @И("Переход к результатам поиска")
    public void clickBtn(){
        pageManage.getModelsTV().clickBtn();
    }
}
