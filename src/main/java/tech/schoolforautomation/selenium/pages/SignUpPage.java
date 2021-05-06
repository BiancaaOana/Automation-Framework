
package tech.schoolforautomation.selenium.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import lombok.Getter;
import lombok.Setter;
import tech.schoolforautomation.model.SignUp;
import tech.schoolforautomation.selenium.modals.SignUpModal;


@Getter
@Setter
public class SignUpPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"signup-form\"]/input[7]")
    private WebElement SubmitButton;


    @FindBy(name = "firstname")
    private WebElement FirstnameInput;

    @FindBy(name = "lastname")
    private WebElement LastNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy(name = "phone")
    private WebElement phoneInput;

    @FindBy(name = "adress")
    private WebElement addressInput;




    private SignUpModal signUpModal;

    public SignUpPage(final WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(getWebDriver(), this);
        setSignUpModal(new SignUpModal(getWebDriver()));
    }

    public SignUpModal fillSignUpForm(SignUp signUpData) {
        insertFirstName(signUpData.getFirstname());
        insertLastName(signUpData.getLastname());
        insertPassword(signUpData.getPassword());
        insertEmail(signUpData.getEmail());
        insertPhone(signUpData.getPhone());
        insertAddress(signUpData.getAddress());
        clickSubmitButton();

        new WebDriverWait(getWebDriver(), 2)
                .until(ExpectedConditions.textToBePresentInElement(getSignUpModal().getFirstnameInputSpan(), signUpData.getFirstname()));
        return getSignUpModal();
    }



    public void insertFirstName(String firstname) {
        getFirstnameInput().sendKeys(firstname);
    }
    public void insertLastName(String lastname) {
        getLastNameInput().sendKeys(lastname);
    }
    public void insertPassword(String password) {
        getPasswordInput().sendKeys(password);
    }

    public void insertEmail(String email) {
        getEmailInput().sendKeys(email);
    }
    public void insertPhone(String phone) {
        getPhoneInput().sendKeys(phone);
    }
    public void insertAddress(String address) {
        getAddressInput().sendKeys(address);
    }

    public void clickSubmitButton() {
        getSubmitButton().click();
    }
}