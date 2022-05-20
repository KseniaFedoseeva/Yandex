package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResult extends BasePage{

    @FindBy(xpath = "//input[@id = 'header-search']")
    private WebElement searchLine;

    @FindBy(xpath = "//div[@data-index = '1']")
    private WebElement firstMember;

    public SearchResult checkResults() {
        String value = searchLine.getAttribute("value");
        String title = firstMember.getAttribute("title");
        Assert.assertEquals("Модель не соответствует", value, title);
        return this;
    }

}
