package Pages;

import Util.ElementHelper;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage {

    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;
    JavascriptExecutor js;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
        this.js = (JavascriptExecutor) driver;

    }

    By loginButton = By.xpath("//span[contains(text(),'Giriş yap')]");
    By mailbox = By.xpath("(//input[@name='text'])[1]");
    By nextButton = By.xpath("(//span[contains(text(),'İleri')])[1]");
    By login = By.xpath("(//span[@class='css-1jxf684 r-bcqeeo r-1ttztb7 r-qvutc0 r-poiln3'][contains(text(),'Giriş yap')])[1]");

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void incorrectMailAddress() {
        driver.findElement(mailbox).click();
        WebElement incorrectmailaddress = driver.findElement(By.xpath("(//input[@name='text'])[1]"));
        incorrectmailaddress.sendKeys("xx@com");
    }

    public void errorMessage() {


        WebDriverWait wait = new WebDriverWait(driver, 5); // saniye (int/long)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(concat(' ', normalize-space(@class), ' '), ' css-175oi2r ') and contains(concat(' ', normalize-space(@class), ' '), ' r-12vffkv ')]")));
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    public void trueMailAddress() {

        WebElement correctmailadress = driver.findElement(By.xpath("(//input[@name='text'])[1]"));
        driver.findElement(mailbox).click();
        correctmailadress.sendKeys("userfortests@gmail.com");

    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void incorrectPassword() {
        WebElement incorrectpassword = driver.findElement(By.xpath("//input[@name='text']"));
       // driver.findElement(incorrectpassword).click();
        incorrectpassword.sendKeys("1234");
    }

    public void correctPassword() {
        WebElement correctpassword = driver.findElement(By.xpath("//input[@name='text']"));
        correctpassword.sendKeys("userfortests");
        driver.findElement(nextButton).click();
        WebElement password = driver.findElement(By.xpath("(//input[@name='password'])[1]"));
        password.sendKeys("pP622676401.");
        driver.findElement(login).click();
    }

    public void SuccessfullLogin() {
        WebElement homePage = driver.findElement(By.xpath("(//span[normalize-space()='Home'])[1]"));
        Assert.assertTrue(homePage.isDisplayed(),"Successful Login");
        System.out.println("Başarılı login olundu");
    }
   }
