package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import utils.DriversUtils.*;

import java.io.IOException;

import static utils.DriversUtils.getDriver;

public class CommonUtils {

    public void scrollDown() throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,250)");
    }

    public static void scrollToElement(WebElement element) throws IOException {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
}
