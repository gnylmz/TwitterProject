package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ProfilePage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    JavascriptExecutor js;


    public ProfilePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.js = (JavascriptExecutor) driver;

    }

    By profileButton = By.xpath("(//span[normalize-space()='Profile'])[1]");
    By following = By.xpath("(//span[contains(text(),'Following')])[1]");
    By followers = By.xpath("(//span[normalize-space()='Followers'])[1]");
    By mainpagebutton = By.xpath("(//*[name()='svg'][@class='r-4qtqp9 r-yyyyoo r-dnmrzs r-bnwqim r-lrvibr r-m6rgpd r-lrsllp r-18jsvk2 r-16y2uox r-8kz0gk'])[1]");
    By settingsButton =By.xpath("(//span[contains(text(),'Set up profile')])[1]");
    By pictureButton = By.xpath("(//span[contains(text(),'Skip for now')])[1]");
    By headerButton = By.xpath("(//span[contains(text(),'Skip for now')])[1]");
    By aboutyou = By.xpath("(//span[contains(text(),'Skip for now')])[1]");
    By locationButton = By.xpath("(//span[contains(text(),'Skip for now')])[1]");
    By saveButton = By.xpath("(//span[contains(text(),'Save')])[1]");


    public void clickProfileMenu() {
        driver.findElement(profileButton).click();

    }

    public void clickWhoToFllow() {
        WebElement whotoFollow = driver.findElement(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Show more'])[1]"));
        js.executeScript("arguments[0].scrollIntoView(true);",whotoFollow);
        whotoFollow.click();
    }

    public void listsOfSuggestions() {
        WebElement suggestions = driver.findElement(By.xpath("(//span[normalize-space()='Suggested for you'])[1]"));
        Assert.assertTrue(suggestions.isDisplayed(),"The suggestion list has been successfully listed.");
    }

    public void clickFollowing() {
        driver.findElement(following).click();

    }

    public void clickFollowers() {
        driver.findElement(followers).click();
    }

    public void backsMainPage() {
        driver.findElement(mainpagebutton).click();
        WebElement mainpage = driver.findElement(By.xpath("(//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr'])[1]"));
        Assert.assertTrue(mainpage.isDisplayed(),"Returned to the mainpage.");
    }

    public void clickSetUpProfile() {
        driver.findElement(settingsButton).click();
        driver.findElement(pictureButton).click();
        driver.findElement(headerButton).click();
        driver.findElement(aboutyou).click();
        driver.findElement(locationButton).click();

    }

    public void saveSettings() {

        driver.findElement(saveButton).click();
    }
}
