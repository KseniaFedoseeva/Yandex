package framework.managers;

import java.util.concurrent.TimeUnit;

import static framework.util.PropConst.IMPLICITLY_WAIT;
import static framework.util.PropConst.PAGE_LOAD_TIMEOUT;

/**
 *
 * Класс для инициализации фреймворка
 */
public class InitManager {

    /**
     * Менеджер properties
     *
     *
     */
    private static final framework.managers.TestPropManager props = framework.managers.TestPropManager.getTestPropManager();

    /**
     * Менеджер WebDriver
     *
     *
     */
    private static final framework.managers.DriverManager driverManager = framework.managers.DriverManager.getDriverManager();

    /**
     * Инициализация framework и запуск браузера со страницей приложения
     *
     *
     */
    public static void initFramework() {
        driverManager.getDriver().manage().window().maximize();
        driverManager.getDriver().manage().timeouts().implicitlyWait(Integer.parseInt(props.getProperty(IMPLICITLY_WAIT)), TimeUnit.SECONDS);
        driverManager.getDriver().manage().timeouts().pageLoadTimeout(Integer.parseInt(props.getProperty(PAGE_LOAD_TIMEOUT)), TimeUnit.SECONDS);
        driverManager.getDriver().get("https://yandex.ru/");
    }

    /**
     * Завершения работы framework - гасит драйвер и закрывает сессию с браузером
     *
     *
     */
    public static void quitFramework() {
        driverManager.quitDriver();
    }
}
