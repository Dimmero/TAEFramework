package forms.glo;

import BaseElements.BaseAbstractForm;
import Core.TAEDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cookies extends BaseAbstractForm {

    @FindBy(id = "slideSkip")
    public WebElement skipCookies;

    public Cookies(TAEDriver driver) {
        super(driver);
        PageFactory.initElements(driver.getDriver(), this);
        getLogger().info("Cookies are initialized");
    }
}
