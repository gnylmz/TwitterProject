package Pages;

import Util.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ExplorePage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    JavascriptExecutor js;


    public ExplorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.js = (JavascriptExecutor) driver;

    }

    By exploreButton = By.xpath("(//span[normalize-space()='Explore'])[1]");
    By trendingButton = By.xpath("//span[normalize-space()='Trending']");
    By newsButton = By.xpath("//span[normalize-space()='News']");
    By sportsButton = By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Sports'])[1]");
    By entertainmentButton = By.xpath("//span[normalize-space()='Entertainment']");


    public void clickExploreMenu() {
        driver.findElement(exploreButton).click();
      WebElement explorepage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Today's News\"])[1]")));
        Assert.assertTrue(explorepage.isDisplayed(),"The explore page opened successfully");
        System.out.println("The explore page opened successfully");

    }

    public void openSearchPage() {
        WebElement explorepage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[normalize-space()=\"Today's News\"])[1]")));
        Assert.assertTrue(explorepage.isDisplayed(),"The explore page opened successfully");
        System.out.println("The explore page opened successfully");
    }

    public void clickTrendingMenu() {
        driver.findElement(trendingButton).click();
        WebElement trendingpage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Trending in Turkey'])[1]")));
        Assert.assertTrue(trendingpage.isDisplayed(),"The trending page opened successfully");
        System.out.println("The trending page opened successfully");
    }

    public void clickNewsMenu() {
        driver.findElement(newsButton).click();
        WebElement newspage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Trending in Politics'])[1]")));
        Assert.assertTrue(newspage.isDisplayed(),"The news page opened successfully");
        System.out.println("The news page opened successfully");
    }

    public void clickSportsMenu() {
        driver.findElement(sportsButton).click();
        WebElement sportspage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Trending in Sports'])[1]")));
        Assert.assertTrue(sportspage.isDisplayed(),"The sports page opened successfully");
        System.out.println("The sports page opened successfully");
    }

    public void clickEntertainmentMenu() {
        driver.findElement(entertainmentButton).click();
        WebElement entertainmentpage =  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][normalize-space()='Trending in Music'])[1]")));
        Assert.assertTrue(entertainmentpage.isDisplayed(),"The entertainment page opened successfully");
        System.out.println("The trending entertainment opened successfully");
    }
}
