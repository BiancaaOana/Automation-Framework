import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Table {
    @Test
    public void table()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yoyo\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://school-for-automation.tech/signup.html");
        driver.manage().window().maximize();

        List<WebElement> tablePrices = null;
        tablePrices.set(0, (WebElement) driver.findElements(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[1]/td[3] ")));
        tablePrices.set(1, driver.findElement(By.xpath( "//*[@id=\"main\"]/div/section/div/table/tbody/tr[2]/td[3] ")));
        tablePrices.set(2, driver.findElement(By.xpath( "//*[@id=\"main\"]/div/section/div/table/tbody/tr[3]/td[3]" )));
        tablePrices.set(3, driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[4]/td[3]" )));
        tablePrices.set(4, driver.findElement(By.xpath("//*[@id=\"main\"]/div/section/div/table/tbody/tr[5]/td[3]")));

        Assert.assertEquals(tablePrices.get(0).getText(), "20");
        Assert.assertEquals(tablePrices.get(1).getText(), "30");
        Assert.assertEquals(tablePrices.get(2).getText(), "10");
        Assert.assertEquals(tablePrices.get(3).getText(), "20");
        Assert.assertEquals(tablePrices.get(4).getText(), "20");
         int price=0;
        // for(int i : tablePrices.size())
            // price = i + 1;
         Assert.assertEquals(price,100);
    }
}
