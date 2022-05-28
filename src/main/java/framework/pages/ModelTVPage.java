package framework.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class ModelTVPage extends BasePage {

    @FindBy(xpath = "//div[text() = '48']")
    private WebElement number;

    @FindBy(xpath = "//a[@data-node-id = 'mcsb1d']")
            private WebElement firstMember;

    @FindBy(xpath = "//input[@id = 'header-search']")
            private WebElement searchLink;

    @FindBy(xpath = "//span[text() = 'Найти']")
            private WebElement btn;

    String count = "48";
    String num;
  // public String title = number.getAttribute("title");

    public ModelTVPage checkCount(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (number.getText().contains("48")){
          num = "48";
        }
        Assert.assertEquals("Просмотрено не верное количество", count, num);
        return this;
    }


    public ModelTVPage putValueToSearch(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       String h = firstMember.getAttribute("title");
        searchLink.click();
        searchLink.sendKeys(h);
        return this;
    }
// Переход к результатам поиска
    public SearchResult clickBtn(){
        btn.click();
        return pageManager.getSearchResult();
    }



}
