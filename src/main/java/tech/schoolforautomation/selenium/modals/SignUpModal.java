
package tech.schoolforautomation.selenium.modals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpModal {

    @FindBy(xpath = "//*[@id=\"signup-form\"]/input[7]")
    private WebElement SubmitButton;

    @FindBy(name = "firstname")
    private WebElement FirstnameInputSpan;

    @FindBy(name = "lastname")
    private WebElement LastNameInputSpan;

    @FindBy(name = "password")
    private WebElement passwordInputSpan;

    @FindBy(name = "email")
    private WebElement emailInputSpan;

    @FindBy(name = "phone")
    private WebElement phoneInputSpan;

    @FindBy(name = "adress")
    private WebElement addressInputSpan;

    private WebDriver webDriver;

    public SignUpModal(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    public void submit() {
        getSubmitButton().click();
    }

    public String getFirstName() {
        return getFirstnameInputSpan().getText();
    }
    public String getPassword() {
        return getPasswordInputSpan().getText();
    }
    public String getPhone() {
        return getPhoneInputSpan().getText();
    }
    public String getLastName() {
        return getLastNameInputSpan().getText();
    }

    public String getEmail() {
        return getEmailInputSpan().getText();
    }

    public String getAddress() {
        return getAddressInputSpan().getText();
    }
}