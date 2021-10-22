package HotelsTests;

import BaseTest.BaseAbstractTest;
import Entities.HotelsSearch;
import Entities.Travellers;
import TAExceptions.TAUnknownBrowserException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.HotelsPage;
import uicontrols.CustomSelect;
import uicontrols.TravellersControl;

import java.util.Date;

public class HotelsTests extends BaseAbstractTest {

    public HotelsTests() throws TAUnknownBrowserException {
        super("chrome");
    }

    @Test
    public void testHotelsPageResultURL() {
        String urlOfPageWithResult = "https://www.phptravels.net/en/usd/hotels/krakow/24-10-2021/25-10-2021/02/02/02/";
        String city = "Krakow";
        getDriver().navigateTo("https://www.phptravels.net/");
        Travellers travellers = new Travellers("2", "2","2");
        HotelsSearch hotelsSearch = new HotelsSearch(city, travellers);
        new HomePage(getDriver()).switchToHotelsPage().fillPageAndSearch(hotelsSearch);
        Assert.assertEquals(getDriver().getDriver().getCurrentUrl(), urlOfPageWithResult);
    }

    @Test
    public void testHotelsPageDropDownMenuTextAfterSubmit() {
        String travellersControlResult = "Travellers 4 Rooms 2";
        String city = "Krakow";
        getDriver().navigateTo("https://www.phptravels.net/");
        Travellers travellers = new Travellers("2", "2","2");
        HotelsSearch hotelsSearch = new HotelsSearch(city, travellers);
        new HomePage(getDriver()).switchToHotelsPage().fillPageAndSearch(hotelsSearch);
        Assert.assertEquals(getDriver().getElement("//a[@role='button']//p[1]").getText(), travellersControlResult);
    }

    @Test
    public void testHotelsPageImageOOPSAfterSubmit() {
        String tagName = "img";
        String city = "Krakow";
        getDriver().navigateTo("https://www.phptravels.net/");
        Travellers travellers = new Travellers("2", "2","2");
        HotelsSearch hotelsSearch = new HotelsSearch(city, travellers);
        new HomePage(getDriver()).switchToHotelsPage().fillPageAndSearch(hotelsSearch);
        Assert.assertEquals(getDriver().getElement("//img[@alt='no results']").getTagName(), tagName);
    }


}
