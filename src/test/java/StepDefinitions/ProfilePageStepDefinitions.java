package StepDefinitions;

import Pages.ExplorePage;
import Pages.ProfilePage;
import Util.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProfilePageStepDefinitions {
    private static final Logger log = LoggerFactory.getLogger(ProfilePageStepDefinitions.class);
    WebDriver driver = DriverFactory.getDriver();
    ProfilePage profilepage = new ProfilePage(driver);

@Then("User click profile menu")
public void userClickProfileMenu() {
    profilepage.clickProfileMenu();
}

@When("User click who to follow")
public void userClickWhoToFollow() {
    profilepage.clickWhoToFllow();
}

@Then("User sees the lists of suggestions")
public void userSeesTheListsOfSuggestions() {
    profilepage.listsOfSuggestions();
}

@When("User click following")
public void userClickFollowing() {
    profilepage.clickFollowing();
}

@When("User click followers")
public void userClickFollowers() {
    profilepage.clickFollowers();
}

@Then("User backs mainpage")
public void userBacksMainpage() {
    profilepage.backsMainPage();
}

@When("User click set up profile")
public void userClickSetUpProfile() {
    profilepage.clickSetUpProfile();
}

@Then("User save settings")
public void userSaveSettings() {
    profilepage.saveSettings();
}
}