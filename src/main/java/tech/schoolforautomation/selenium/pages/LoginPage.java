
package tech.schoolforautomation.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginPage extends BasePage {

    @FindBy(id = "email")
    private WebElement emailInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(className = "special")
    private WebElement submitButton;



    public LoginPage(final WebDriver webDriver) {
        super(webDriver);

        PageFactory.initElements(getWebDriver(), this);
    }

    public void login(String username, String password) {
        getEmailInput().sendKeys(username);
        getPasswordInput().sendKeys(password);
        getSubmitButton().click();
    }
}