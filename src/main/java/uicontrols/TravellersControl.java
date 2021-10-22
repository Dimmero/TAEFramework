package uicontrols;

import BaseControlls.BaseControl;
import Core.TAEDriver;
import Entities.Travellers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.ByChained;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TravellersControl extends BaseControl {

    private static By DROP_DOWN_MENU = By.xpath("(//a[@class='dropdown-toggle dropdown-btn travellers waves-effect'])[1]");
    private static By ROOMS = By.id("rooms");
    private static By ADULTS = By.id("adults");
    private static By CHILDREN = By.id("childs");
    private static By ROOMS_MINUS = By.xpath("//div[@class='roomDec']//i");
    private static By ADULTS_MINUS = By.xpath("//div[@class='qty-box d-flex align-items-center justify-content-between']//div[@class='qtyBtn d-flex align-items-center']//i[@class='la la-minus']");

    public TravellersControl(String name, TAEDriver driver, By locator) {
        super(name, driver, locator);
    }

    public TravellersControl(String name, TAEDriver driver, String xpath) {
        super(name, driver, xpath);
    }

    public void setTravellers(Travellers travellers){
        searchItemAndClick();
        driver.getElement(ROOMS).sendKeys(travellers.getNumberOfAdults());
        driver.getElement(ADULTS).sendKeys(travellers.getNumberOfAdults());
        driver.getElement(CHILDREN).sendKeys(travellers.getNumberOfKids());
    }

    public void searchItemAndClick() {
        getLogger().info(String.format("Expand dropdown '%s'", super.name));
        driver.getElement(DROP_DOWN_MENU).click();
        getLogger().info(String.format("Dropdown '%s' expanded", super.name));
        getLogger().info(String.format("Wait results will be displayed for '%s' dropdown", super.name));
        clearAllOptions();
    }

    public void clearAllOptions() {
        getLogger().info("Clear all options");
        driver.getElement(ROOMS_MINUS).click();
        driver.getElement(ADULTS_MINUS).click();
        driver.getElement(ADULTS_MINUS).click();
    }


}
