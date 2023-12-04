package training;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class DemoTests {


    @Test
    public void searchProductInAList() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.automationpractice.pl/index.php");
        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();
        String numberResults = driver.findElement(By.className("heading-counter")).getText();
        String[] numberResultsArray = numberResults.split(" ");
        assertEquals(driver.findElements(By.className("product_img_link")).size(),Integer.parseInt(numberResultsArray[0]));

    }
}
