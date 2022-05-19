package framework.pages;

import framework.managers.DriverManager;
import framework.managers.PageManager;
import framework.managers.TestPropManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected final DriverManager driverManager =DriverManager.getDriverManager();
    protected PageManager pageManager = PageManager.getPageManager();
    protected Actions action = new Actions (driverManager.getDriver());
    protected WebDriverWait wait = new WebDriverWait(driverManager.getDriver(), 10, 1000);
    private final TestPropManager props = TestPropManager.getTestPropManager();

    public BasePage() {
        PageFactory.initElements(driverManager.getDriver(), this);
    }

    protected WebElement waitUtilElementToBeVisible(WebElement element) {
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    protected WebElement waitUtilElementToBeClickable(WebElement element) {
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

}
