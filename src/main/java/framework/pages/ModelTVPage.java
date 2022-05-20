package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ModelTVPage extends BasePage {

    @FindBy(xpath = "//div[text() = '48']")
    private WebElement number;

    @FindBy(xpath = "//div[@data-index = '1']")
            private WebElement firstMember;

    @FindBy(xpath = "//input[@id = 'header-search']")
            private WebElement searchLink;

    @FindBy(xpath = "//span[text() = 'Найти']")
            private WebElement btn;

    String count = "48";
    String title = number.getText();

    public ModelTVPage checkCount(){
        Assert.assertEquals("Просмотрено не верно количество", count, number);
        return this;
    }


    public ModelTVPage putValueToSearch(){
        searchLink.click();
        searchLink.sendKeys(title);
        return this;
    }
// Переход к результатам поиска
    public SearchResult clickBtn(){
        btn.click();
        return pageManager.getSearchResult();
    }



}
