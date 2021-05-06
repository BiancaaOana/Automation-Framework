
package tech.schoolforautomation.base;

import org.testng.annotations.BeforeTest;

import lombok.Getter;
import tech.schoolforautomation.pages.LogInPage;
//import tech.schoolforautomation.selenium.pages.LoginPage;

@Getter
public class AppBaseTest extends BaseTest {

    @BeforeTest
    public void logIntoApp() {
        goToLandingPage();
        LogInPage loginPage = new LogInPage(getWebDriver());
        loginPage.login("bianca", "parola1234");
    }
}