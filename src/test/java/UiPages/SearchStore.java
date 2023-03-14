package UiPages;

import com.n11.test.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.time.Duration;

public class SearchStore extends BasePage {
    public void startDriver() {
        BasePage.setup();
    }

    public void navigateToUrl() {
        driver.get(url);
    }

    public void clickStore() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element = driver.findElement(By.xpath("//h3[contains(text(),'Tüm Mağazalar')]"));
        element.click();
    }

    public void clickLetter() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='contentSellerList']/" +
                "div[1]/div[2]/div[1]/div[2]/div[4]/div[1]/span[22]"));
        element.click();
    }

    public void clickStoreName() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element = driver.findElement(By.xpath("//body[1]/div[1]/div[4]/div[1]" +
                "/div[2]/div[1]/div[2]/div[4]/div[2]/ul[1]/li[3]"));
        element.click();
    }

    public void checkStore() {
        String title = driver.getTitle();
        Assert.assertEquals("Saatinmerkezi - n11.com", title);
    }
}
