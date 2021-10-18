package forms.glo;

import BaseElements.BaseAbstractForm;
import Core.TAEDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileWidgetForm extends BaseAbstractForm {

    @FindBy(xpath = "//div[@class='profile-widget-content']//h2")
    public WebElement userNameAndSurname;
    @FindBy(xpath = "//div[@class='profile-widget-content']//p")
    public WebElement userPosition;
    @FindBy(xpath = "//div[text()='People Who Follow Me']//following-sibling::div")
    public WebElement numberPeopleWhoFollowMe;
    @FindBy(xpath = "//div[text()='People I Follow']//following-sibling::div")
    public WebElement numberPeopleIFollow;
    @FindBy(xpath = "//div[text()='Teammates']//following-sibling::div")
    public WebElement numberUserTeammates;
    @FindBy(xpath = "//div[text()='My Communities']//following-sibling::div")
    public WebElement numberUserCommunities;

    public ProfileWidgetForm(TAEDriver driver) {
        super(driver);
        PageFactory.initElements(driver.getDriver(), this);
        getLogger().info("Widget form initialized");
    }

}
