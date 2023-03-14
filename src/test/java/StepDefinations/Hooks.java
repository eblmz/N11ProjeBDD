package StepDefinations;

import com.n11.test.BasePage;
import org.junit.After;
import org.junit.Before;


public class Hooks extends BasePage {
    @Before
    public void startDriver(){
        BasePage.setup();
    }
    @After
    public void quit(){
        System.out.println("Browser kapatılır");
        driver.quit();
    }
}
