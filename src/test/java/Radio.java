import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Radio {
    @Test
    public void radio()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoyo\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://school-for-automation.tech/radio.html");
        driver.manage().window().maximize();

        List<WebElement> radioButtons = driver.findElements(By.name("radio"));
        radioButtons.get(3).click();
        Assert.assertTrue(radioButtons.get(3).isSelected());

    }

}
