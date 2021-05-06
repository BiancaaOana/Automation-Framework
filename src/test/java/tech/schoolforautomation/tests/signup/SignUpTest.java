package tech.schoolforautomation.tests.signup;

import org.testng.Assert;
import org.testng.annotations.Test;

import tech.schoolforautomation.base.AppBaseTest;
import tech.schoolforautomation.model.SignUp;
import tech.schoolforautomation.selenium.modals.SignUpModal;
import tech.schoolforautomation.selenium.pages.HomePage;
import tech.schoolforautomation.selenium.pages.SignUpPage;

public class SignUpTest extends AppBaseTest {

    @Test
    public void signUpTest() {
        logger.info("Go to Home Page and click account button");
        HomePage homePage = new HomePage(getWebDriver());
        SignUpPage signUpPage = homePage.clickAccountButton();

        logger.info("Fill the Sign Up form");
        SignUp signUp = new SignUp("", "", "", "", " ","");
        SignUpModal signUpModal = signUpPage.fillSignUpForm(signUp);

        logger.info("Verify the correct values are displayed in the Sign Up modal");
        Assert.assertEquals(signUpModal.getFirstnameInputSpan(), signUp.getFirstname());
        Assert.assertEquals(signUpModal.getLastNameInputSpan(), signUp.getLastname());
        Assert.assertEquals(signUpModal.getPasswordInputSpan(), signUp.getPassword());
        Assert.assertEquals(signUpModal.getEmailInputSpan(), signUp.getEmail());
        Assert.assertEquals(signUpModal.getPhoneInputSpan(), signUp.getPhone());

        logger.info("Close the Sign up modal");
        signUpModal.submit();
    }
}