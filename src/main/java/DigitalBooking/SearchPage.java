//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package DigitalBooking;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage extends BasePage {
    private By searchBox = By.name("search");
    private By searchBtn = By.cssSelector("button[type='button'].btn.btn-default.btn-lg i.fa.fa-search");
    private By btnAddCart = By.cssSelector("div.button-group > button > i.fa.fa-shopping-cart");

    public SearchPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void buscar(String articulo) throws InterruptedException {
        this.sendText(articulo, this.searchBox);
        this.sendKey(Keys.ENTER, this.searchBox);
    }

    public void clickBuscar() throws InterruptedException {
        this.click(this.searchBtn);
    }

    public void agregarEnCarrito() throws InterruptedException {
        this.click(this.btnAddCart);
    }
}
