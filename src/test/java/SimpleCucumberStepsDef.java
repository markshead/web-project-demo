import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.junit.Assert.assertEquals;

/**
 * Created by markshead on 4/30/15.
 */
public class SimpleCucumberStepsDef {

    private WebDriver webDriver;

    @Given("^I control a web browser$")
    public void i_control_a_web_browser() throws Throwable {
        webDriver = new FirefoxDriver();
    }

    @When("^I load the page$")
    public void i_load_the_page() throws Throwable {
        webDriver.get("http://localhost:8080");
    }

    @Then("^I should see a greeting$")
    public void i_should_see_a_greeting() throws Throwable {
        String title = webDriver.getTitle();
        assertEquals("Hello World!", title);
    }

}
