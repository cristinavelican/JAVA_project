package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static utils.DriversUtils.getDriver;

public class MainPage {

    @FindBy(id = "search_query_top")
    private WebElement searchQueryTop;

    @FindBy(name = "submit_search")
    private WebElement submitSearchButton;

    public MainPage() throws IOException {
        PageFactory.initElements(getDriver(), this);
    }

    public void navigateToMainPage() throws IOException {
        try {
            getDriver().get("http://www.automationpractice.pl/index.php");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void searchProduct(String product) {
        searchQueryTop.sendKeys(product);
        submitSearchButton.click();
    }
}
