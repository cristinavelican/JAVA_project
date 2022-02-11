package utils;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class AssertionUtils {

    // --

    public void AssertElementHasText(String expectedText, WebElement element){
        Assert.assertEquals(expectedText,element);
    }
}
