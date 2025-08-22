package StepDefinitions;

import Pages.ExplorePage;
import Pages.LoginPage;
import Util.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.zh_cn.而且;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExplorePageStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(LoginPageStepDefinitions.class);
    WebDriver driver = DriverFactory.getDriver();
    ExplorePage explorePage = new ExplorePage(driver);


    @When("User click explore menu")
    public void userClickExploreMenu() {
        explorePage.clickExploreMenu();
    }

    @Then("User sees the search page open")
    public void userSeesTheSearchPageOpen() {
        explorePage.openSearchPage();
    }

    @When("User click trending menu")
    public void userClickTrendingMenu() {
        explorePage.clickTrendingMenu();
    }

    @When("User click news menu")
    public void userClickNewsMenu() {
        explorePage.clickNewsMenu();
    }

    @When("User click sports menu")
    public void userClickSportsMenu() {
        explorePage.clickSportsMenu();
    }

    @When("User click entertainment menu")
    public void userClickEntertainmentMenu() {
        explorePage.clickEntertainmentMenu();
    }
}
