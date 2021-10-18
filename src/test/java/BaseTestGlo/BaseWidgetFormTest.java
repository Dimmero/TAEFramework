package BaseTestGlo;

import BaseTest.BaseAbstractChromeTest;
import Entities.glo.User;
import TAExceptions.TAUnknownBrowserException;
import forms.glo.Cookies;
import forms.glo.ProfileWidgetForm;
import org.testng.annotations.BeforeTest;
import pages.glo.LoginPage;

public class BaseWidgetFormTest extends BaseAbstractChromeTest {
    public BaseWidgetFormTest() throws TAUnknownBrowserException {
        super();
    }

    protected ProfileWidgetForm profileWidgetForm;
    protected Cookies cookies;

    @BeforeTest
    public void passLoginPage() {
        getDriver().getDriver().get("https://glo.globallogic.com/apps/glo/login");
        LoginPage loginPage = new LoginPage(getDriver());
        User user = new User("Valid user name", "Valid Password");
        loginPage.tryLogin(user);
        profileWidgetForm = new ProfileWidgetForm(getDriver());
        skipCookies();
    }

    public void skipCookies() {
        cookies = new Cookies(getDriver());
        cookies.skipCookies.click();
    }

}
