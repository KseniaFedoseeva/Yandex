import org.junit.Test;

public class Scenario_1 extends BaseTests {
    @Test
    public  void firstTest(){

        app.getStartPage()
                .goToMarketPage()
                .goToCatalog()
                .goToElectronika();



    }
}
