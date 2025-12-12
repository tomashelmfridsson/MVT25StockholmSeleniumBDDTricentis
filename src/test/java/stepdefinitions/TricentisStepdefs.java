package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TricentisStepdefs {

    WebDriver driver; // Definierar för att gälla i hela klassen

    @After
    public void teardown(){
        driver.close();
    }

    @Given("I open webpage {string}")
    public void iOpenWebpage(String url) {
        driver = new ChromeDriver();
        driver.get(url);
    }

    @When("I click on Category {string}")
    public void iClickOnCategory(String catagory) {
        WebElement catLink = driver.findElement(By.linkText(catagory));
        catLink.click();
    }

    @Then("I am on page {string}")
    public void iAmOnPage(String expectedPageTitle) {
        String actual = driver.findElement(By.cssSelector(".page-title")).getText();
        assertEquals(expectedPageTitle,actual);
    }
}
