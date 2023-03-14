package UiPages;

import com.n11.test.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class SearchWord extends BasePage {
    private WebElement secondElement;
    private WebElement thirdElement;
    private WebElement fourthElement;
    private WebElement sendBasket;

    public void startDriver() {
        BasePage.setup();
    }

    public void navigateToBaseUrl() {
        driver.get(baseUrl);
    }

    public void searchWord() throws InterruptedException {
        element = driver.findElement(By.xpath("//input[@id='searchData']"));
        element.sendKeys("iPhone");
        Thread.sleep(2000);
    }

    public void searchClick() {
        secondElement = driver.findElement(By.className("searchBtn"));
        secondElement.click();
    }

    public void firstItemAddToBasket() {
        element = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='contentListing']" +
                "/div[1]/div[2]/div[2]/section[1]/div[2]/ul[1]/li[1]/div[1]/div[1]/div[1]/span[1]"));
        element.click();
        thirdElement = driver.findElement(By.xpath("//body/div[7]/div[1]/div[3]" +
                "/fieldset[1]/div[1]/div[1]/label[1]"));
        thirdElement.click();
        fourthElement = driver.findElement(By.xpath("//body/div[7]/div[1]/div[3]" +
                "/fieldset[2]/div[1]/div[1]/label[1]"));
        thirdElement.click();
        sendBasket = driver.findElement(By.id("js-addBasketSku"));
        sendBasket.click();
    }

    public void secondItemAddToBasket() {
        element = driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='contentListing']" +
                "/div[1]/div[2]/div[2]/section[1]/div[2]/ul[1]/li[24]/div[1]/div[1]/div[1]/span[1]"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < 30; i++) {
            js.executeScript("argument[0].scrollIntoView(true);", element);
        }
        element.click();
        secondElement = driver.findElement(By.xpath("//body/div[7]/" +
                "div[1]/div[3]/fieldset[1]/div[1]/div[1]/label[1]"));
        secondElement.click();
        thirdElement = driver.findElement(By.xpath("//body/div[7]" +
                "/div[1]/div[3]/fieldset[2]/div[1]/div[1]/label[1]"));
        thirdElement.click();
        sendBasket = driver.findElement(By.xpath("//span[@id='js-addBasketSku']"));
        sendBasket.click();
    }

    public void goToBasket() throws InterruptedException {
        element = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[4]/a[1]"));
        element.click();
        Thread.sleep(2000);
        secondElement = driver.findElement(By.xpath("//span[contains(text(),'Satın Al')]"));
        secondElement.click();
    }

    public void goToPay() {
        element = driver.findElement(By.linkText("Üye Olmadan Devam Et"));
        element.click();
    }

    public void guestBasket() {
        String guestUrl = driver.getCurrentUrl();
        Assert.assertEquals("https://www.n11.com/misafir-sepet", guestUrl);
    }


}
