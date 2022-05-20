import framework.managers.DriverManager;
import org.junit.Test;

import java.util.ArrayList;

public class Scenario_1 extends BaseTests {
    @Test
    public  void firstTest() {

       app.getGoToMarketPage()
               .goToCatalog()
               .goToElectronika()
               .clickOnTVPage()
               .clickOnAllFilters()
               .sendPrice()
               .checkBrand()
               .clickButton();





    }
}
