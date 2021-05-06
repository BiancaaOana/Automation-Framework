import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Select {
    @Test
    public void select()
    {System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoyo\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://school-for-automation.tech/select.html");
        driver.manage().window().maximize();
        org.openqa.selenium.support.ui.Select select = new org.openqa.selenium.support.ui.Select(driver.findElement(By.id("category")));
        select.selectByVisibleText("Manufactoring");
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Manufactoring");


    }
}
