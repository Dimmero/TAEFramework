package HotelsTests;

import BaseTest.BaseAbstractChromeTest;
import BaseTest.TravelBaseTest;
import Entities.Travellers;
import TAExceptions.TAUnknownBrowserException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelsPage;
import uicontrols.CustomSelect;
import uicontrols.TravellersControl;


public class FirstTest extends TravelBaseTest {
    public FirstTest() throws TAUnknownBrowserException {
        super();
    }

    @Test
    public void citySearch() {
        getDriver().getDriver().get("https://www.phptravels.net/");
        changeLanguage();
        CustomSelect customSelect = new CustomSelect("HotelCity", getDriver(), "(//*[@role='combobox'])[1]");
        customSelect.selectItem("Krakow");
        Assert.assertTrue(customSelect.getSelectedItem().contains("Krakow"), "Verify selected item is Krakow");
    }

    @Test
    public void hotelSearchWithTravellers() {

    }

    private void changeLanguage() {
        getDriver().getElement(By.id("languages")).click();
        getDriver().getElement(By.xpath("//ul/li/a[text()=' English']")).click();
    }


}
