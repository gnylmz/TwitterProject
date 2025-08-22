package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PostPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    JavascriptExecutor js;


    public PostPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.js = (JavascriptExecutor) driver;

    }

    By postMenu = By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Post'])[2]");
    By whocanreply = By.xpath("(//span[contains(text(),'Everyone can reply')])[1]");
    By replyoption = By.xpath("//span[normalize-space()='Accounts you follow']");
    By postBox = By.xpath("(//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr'])[1]");
    By removePollButton = By.xpath("(//span[normalize-space()='Remove poll'])[1]");


    public void clickPostMenu() {

       driver.findElement(postMenu).click();
    }

    public void openPostPage() {
    }

    public void whocanReply() {
        driver.findElement(whocanreply).click();
        driver.findElement(replyoption).click();

    }

    public void Posts() {
        driver.findElement(postBox).click();
        WebElement post = driver.findElement(By.xpath("(//div[@class='public-DraftStyleDefault-block public-DraftStyleDefault-ltr'])[1]"));
        post.sendKeys("TEST");
        WebElement postbutton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Post'])[1]")));
        postbutton.click();
    }

    public void clickPollOption() {

        WebElement pollButton = driver.findElement(By.xpath("(//*[name()='svg'][@class='r-4qtqp9 r-yyyyoo r-dnmrzs r-bnwqim r-lrvibr r-m6rgpd r-z80fyv r-19wmn03'])[5]"));
        pollButton.click();

    }

    public void fillInfo() {

        WebElement choice1 = driver.findElement(By.xpath("(//input[@name='Choice1'])[1]"));
        choice1.sendKeys("xxx");
        WebElement choice2 = driver.findElement(By.xpath("(//input[@name='Choice2'])[1]"));
        choice2.sendKeys("yyy");


    }

    public void removePoll() {
        driver.findElement(removePollButton).click();
    }
}
