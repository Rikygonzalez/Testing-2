//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package DigitalBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    private By myAccountLink = By.cssSelector("body > footer > div > div > div:nth-child(4) > ul > li:nth-child(1) > a");
    private By register = By.cssSelector("a.btn.btn-primary[href='https://opencart.abstracta.us:443/index.php?route=account/register']");
    private By searchBoxFirstName = By.name("firstname");
    private By searchBoxLastName = By.name("lastname");
    private By searchBoxMail = By.name("email");
    private By searchPhone = By.name("telephone");
    private By searchBoxPass = By.name("password");
    private By searchConfirmPass = By.name("confirm");
    private By checkBoxPrivacyPolicy = By.name("agree");
    private By loginButtom = By.cssSelector("input[type='submit'][value='Continue'].btn.btn-primary");

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, (WebDriverWait)null);
    }

    public boolean completarFirstName(String firstName) throws InterruptedException {
        this.sendText(firstName, this.searchBoxFirstName);
        return false;
    }

    public void completarLastName(String lastName) throws InterruptedException {
        this.sendText(lastName, this.searchBoxLastName);
    }

    public String completarMail(String mail) throws InterruptedException {
        this.sendText(mail, this.searchBoxMail);
        return mail;
    }

    public void completarPhone(String phone) throws InterruptedException {
        this.sendText(phone, this.searchPhone);
    }

    public void completarPass(String pass) throws InterruptedException {
        this.sendText(pass, this.searchBoxPass);
    }

    public void completarRePass(String rePass) throws InterruptedException {
        this.sendText(rePass, this.searchConfirmPass);
    }

    public Boolean clickPrivacyPolicy() throws InterruptedException {
        this.click(this.checkBoxPrivacyPolicy);
        return null;
    }

    public void clickContinuar() throws InterruptedException {
        this.click(this.loginButtom);
    }

    public void clickMyAcount() throws InterruptedException {
        this.click(this.myAccountLink);
    }

    public void clickRegister() throws InterruptedException {
        this.click(this.register);
    }
}
