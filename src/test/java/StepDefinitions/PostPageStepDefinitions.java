package StepDefinitions;

import Pages.ExplorePage;
import Pages.PostPage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostPageStepDefinitions {

    private static final Logger log = LoggerFactory.getLogger(PostPageStepDefinitions.class);
    WebDriver driver = DriverFactory.getDriver();
    PostPage postpage = new PostPage(driver);


    @When("User click post menu")
    public void userClickPostMenu() {
        postpage.clickPostMenu();
    }

    @Then("User sees the post page open")
    public void userSeesThePostPageOpen() {
        postpage.openPostPage();
    }

    @Then("User choose who can reply")
    public void userChooseWhoCanReply() {
        postpage.whocanReply();
    }

    @Then("User posts")
    public void userPosts() {
        postpage.Posts();
    }

    @When("User click poll option")
    public void userClickPollOption() {
        postpage.clickPollOption();
    }

    @When("User fill the info")
    public void userFillTheInfo() {
        postpage.fillInfo();
    }

    @Then("User remove poll")
    public void userRemovePoll() {
        postpage.removePoll();
    }


}
