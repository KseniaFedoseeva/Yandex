package framework.util;

import framework.managers.DriverManager;
import io.qameta.allure.junit4.AllureJunit4;
import org.junit.runner.notification.Failure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class AllureListener extends AllureJunit4 {

    @Override
    public void testFailure (final Failure failure){

        byte[] byteImage =  ((TakesScreenshot) DriverManager.getDriverManager().getDriver()).getScreenshotAs(OutputType.BYTES);
        getLifecycle().addAttachment("Screenshot", "imag/png", null, byteImage);
        super.testFailure(failure);



    }
}
