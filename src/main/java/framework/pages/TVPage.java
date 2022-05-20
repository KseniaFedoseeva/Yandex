package framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TVPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Все фильтры']")
       private WebElement allFilters;

    public SearchPage clickOnAllFilters(){
        allFilters.click();
        return pageManager.getSearchPage();
    }
}
