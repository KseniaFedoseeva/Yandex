package framework.managers;

import framework.pages.StartPage;
import framework.pages.MarketPage;
import framework.pages.ElectronikaPage;
import framework.pages.TVPage;
import framework.pages.SearchPage;
import framework.pages.ModelTVPage;


/**
 *
 * Класс для управления страничками
 */
public class PageManager {

    /**
     * Менеджер страничек
     */
    private static PageManager pageManager;

    private StartPage startPage;

    /**
     * Cтраница перехода в маркет
     */

    private MarketPage goToMarketPage;

    private ElectronikaPage goToElectronikaPage;

    /**
     * Страничка командировок
     */
    //private BusinessTripPage openBusinessTripPage;

    /**
     * Страничка создания командировки
     */
   // private CreateBusinessTripPage openCreateBusinessTripPage;

    /**
     * Страничка авторизации
     */
   // private RegistrationFormPage registrationFormPage;

    /**
     * Конструктор специально был объявлен как private (singleton паттерн)
     *
     * @see PageManager#getPageManager()
     */
    private PageManager() {
    }

    /**
     * Ленивая инициализация PageManager
     *
     * @return PageManager
     */
    public static PageManager getPageManager() {
        if (pageManager == null) {
            pageManager = new PageManager();
        }
        return pageManager;
    }


    public StartPage getStartPage() {
        if (startPage == null) {
            startPage = new StartPage();
        }
        return startPage;
    }

    /**
     * Ленивая инициализация
     *
     * @return InsurancePage
     */
    public MarketPage getGoToMarketPage() {
        if (goToMarketPage == null) {
            goToMarketPage = new MarketPage();
        }
        return goToMarketPage;
    }

    public ElectronikaPage getGoToElectronikaPage() {
        if (goToElectronikaPage == null) {
            goToElectronikaPage = new ElectronikaPage();
        }
        return goToElectronikaPage;
    }

    /**
     * Ленивая инициализация {@link BusinessTripPage}
     *
     * @return BusinessTripPage
     */
//    public BusinessTripPage getOpenBusinessTripPage() {
//        if (openBusinessTripPage == null) {
//            openBusinessTripPage = new BusinessTripPage();
//        }
//        return openBusinessTripPage;
//    }

    /**
     * Ленивая инициализация
     *
     * @return CreateBusinessTripPage
     */
//    public CreateBusinessTripPage getOpenCreateBusinessTripPage() {
//        if (openCreateBusinessTripPage == null) {
//            openCreateBusinessTripPage = new CreateBusinessTripPage();
//        }
//        return openCreateBusinessTripPage;
 //   }

    /**
     *
     *
     * @return RegistrationFormPage
     */
//    public RegistrationFormPage getRegistrationFormPage() {
//        if (registrationFormPage == null) {
//            registrationFormPage = new RegistrationFormPage();
//        }
//        return registrationFormPage;
//    }
}
