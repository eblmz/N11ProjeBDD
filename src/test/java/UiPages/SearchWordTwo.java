package UiPages;

import com.n11.test.BasePage;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.security.Key;
import java.time.Duration;
import java.util.List;

public class SearchWordTwo extends BasePage {
    private WebElement secondElement;


    public void startDriver() {
        BasePage.setup();
    }

    public void navigateToBaseUrl() {
        driver.get(baseUrl);
    }

    public void searchWord()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element = driver.findElement(By.id("searchData"));
        element.sendKeys("telefon", Keys.ENTER);

    }

    public void selectMark()  {
        element = driver.findElement(By.xpath("//a[contains(text(),'Xiaomi')]"));

    }

    public void findCommentListing()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Select sl = new Select(driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='contentListing']" +
                "/div[1]/div[2]/div[2]/section[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/span[1]")));
        sl.selectByVisibleText(" Yorum sayısı");

    }
    public void commentToSort(){
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@id='view']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        for (WebElement wElement : elementList
        ) {
            List<WebElement> comment = wElement.findElements(By.className("ratingText"));
            for (WebElement text : comment
            ) {

                text.getText();

                int rating[] = new int[comment.size()];
                for (int i=0;i<rating.length-1;i++){
                    int deger = Integer.parseInt(String.valueOf(text));
                    rating[i] = deger;
                    if (rating[i]>rating[i+1]){
                        System.out.println("Sıralama dogru");
                    }else System.out.println("Sıralama yanlış");
                    break;
                }
            }
        }
    }

    public void selectCargoOption()  {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        element = driver.findElement(By.xpath("//h2[contains(text(),'Kargo Seçenekleri')]"));
        element.click();
        secondElement = driver.findElement(By.xpath("//span[contains(text(),'Ücretsiz Kargo')]"));

    }

    public void checkFreeCargo() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        List<WebElement> elementList = driver.findElements(By.xpath("//div[@id='view']"));
        for (WebElement wElement : elementList
        ) {
            List<WebElement> freeCargo = wElement.findElements(By.className("cargoBadgeText"));
            for (WebElement text : freeCargo
            ) {
                text.getText();
                Assert.assertEquals("ÜCRETSİZ KARGO",text);
            }

        }
    }
}
