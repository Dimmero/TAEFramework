package pages;

import BaseElements.BaseAbstractPage;
import Core.TAEDriver;
import Entities.HotelsSearch;
import Entities.Travellers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import uicontrols.CustomSelect;
import uicontrols.TravellersControl;

public class HotelsPage extends BaseAbstractPage {
    public static String TITLE = "Search Hotels - PHPTRAVELS";
    private static By SUBMIT = By.xpath("(//button[@id='submit'])[1]");

    CustomSelect cityDropdown;
    TravellersControl travellersControl;

    public HotelsPage(TAEDriver driver) {
        super(driver, TITLE);
        cityDropdown = new CustomSelect("HotelCity", driver, "//span[@role='combobox']");
        travellersControl = new TravellersControl("TravellersControl", driver, "(//a[@class='dropdown-toggle dropdown-btn travellers waves-effect'])[1]");
    }

    public HotelsPage selectCity(String cityName) {
        cityDropdown.selectItem(cityName);
        return this;
    }

    public HotelsPage setTravellers(Travellers travellers) {
        travellersControl.setTravellers(travellers);
        return this;
    }

    public HotelsPage submit() {
        driver.getElement(SUBMIT).click();
        return this;
    }

    public HotelsPage fillPage(HotelsSearch hotelsSearch) {
        selectCity(hotelsSearch.getCityName());
        setTravellers(hotelsSearch.getTravellers());
        return this;
    }

    public HotelsPage fillPageAndSearch(HotelsSearch hotelsSearch) {
        fillPage(hotelsSearch);
        submit();
        return this;
    }
}
