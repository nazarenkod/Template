package tests;

import model.User;
import org.testng.annotations.Test;
import testLogic.TestBase;
import static org.junit.Assert.assertTrue;

/**
 * Created by nazarenkod on 14.10.2016.
 */
public class LoginTest extends TestBase {

    @Test
    public void loginTestSuccess() throws Exception {
        // set test's data
        User user = new User();
        user.setLogin("login");
        user.setPassword("password");

        //do test

        app.getUserHalper().loginAs(user);
        assertTrue(app.getUserHalper().isLoggedInAs(user));
    }

    @Test
    public void loginTestFailed() throws Exception {
        // set test's data
        User user = new User();
        user.setLogin("login");
        user.setPassword("wrong");

        //do test

        app.getUserHalper().loginAs(user);
        assertTrue(app.getUserHalper().isNotLoggedIn());
    }
}
