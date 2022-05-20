package framework.steps;

import framework.managers.PageManager;
import framework.pages.SearchResult;
import io.cucumber.java.bg.И;
import org.junit.Assert;

public class SearchResultSteps {
    private final PageManager pageManage= PageManager.getPageManager();

    @И("Проверка результатов")
    public void checkResults() {
        pageManage.getSearchResult().checkResults();    }
}
