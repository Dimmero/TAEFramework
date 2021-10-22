package gloTests;

import BaseTest.GloBaseWidgetFormTest;
import TAExceptions.TAUnknownBrowserException;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WidgetFormWidgetFormTestGlo extends GloBaseWidgetFormTest {

    public WidgetFormWidgetFormTestGlo() throws TAUnknownBrowserException {
    }

    @Test
    public void testUserNameAndSurname() {
        String expectedFirstAndLastName = "Dmitrij Akulicz";
        Assert.assertEquals(profileWidgetForm.userNameAndSurname.getText(), expectedFirstAndLastName);
    }

    @Test
    public void testVerifyPosition() {
        String expectedPosition = "Trainee Test Engineer,Quality Assurance";
        Assert.assertEquals(profileWidgetForm.userPosition.getText(), expectedPosition);
    }

    @Test
    public void testAmountOfUsersThisUserFollows() {
        String expectedAmountOfUsers = "4";
        Assert.assertEquals(profileWidgetForm.numberPeopleIFollow.getText(), expectedAmountOfUsers);
    }

    @Test
    public void testAmountOfUsersWhichFollowThisUser() {
        String expectedAmountOfUsers = "6";
        Assert.assertEquals(profileWidgetForm.numberPeopleWhoFollowMe.getText(), expectedAmountOfUsers);
    }

    @Test
    public void testTeamMatesCount() {
        String expectedAmountOfUsers = "204";
        Assert.assertEquals(profileWidgetForm.numberUserTeammates.getText(), expectedAmountOfUsers);
    }

    @Test
    public void testCommunitiesCount() {
        String expectedAmountOfUsers = "26";
        Assert.assertEquals(profileWidgetForm.numberUserCommunities.getText(), expectedAmountOfUsers);
    }



}
