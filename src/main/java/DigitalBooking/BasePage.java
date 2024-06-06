//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package DigitalBooking;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private WebDriver driver;
    public WebDriverWait wait;

    protected BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(60L));
    }

    public void setup() {
        this.driver.manage().window().maximize();
    }

    public void getUrl(String url) throws InterruptedException {
        this.driver.get(url);
        this.wait.until(ExpectedConditions.urlToBe(url));
    }

    public void close() {
        this.driver.quit();
    }

    protected WebElement findElement(By locator) throws InterruptedException {
        this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return this.driver.findElement(locator);
    }

    protected void sendText(String inputText, By locator) throws InterruptedException {
        this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        this.findElement(locator).clear();
        this.findElement(locator).sendKeys(new CharSequence[]{inputText});
    }

    protected void click(By locator) throws InterruptedException {
        this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        this.findElement(locator).click();
    }

    protected void sendKey(CharSequence key, By locator) throws InterruptedException {
        this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        this.findElement(locator).sendKeys(new CharSequence[]{key});
    }

    protected String getText(By locator) throws InterruptedException {
        this.wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return this.findElement(locator).getText();
    }
}

