package StepDefinations;

import UiPages.SearchStore;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;



public class storeSteps {

    SearchStore searchStore;
    public storeSteps(SearchStore searchStore){
        this.searchStore = searchStore;
    }

// UiPage ile Stepleri birleştirmede kaldın
    @Given("Mağazalar sayfasina gidilir")
    public void mağazalar_sayfasina_gidilir() {
        searchStore.startDriver();
        searchStore.navigateToUrl();
    }
    @When("Tum magazalar sayfasina gidilir")
    public void tum_magazalar_sayfasina_gidilir() {
        searchStore.clickStore();
    }
    @When("S harfine tiklanir")
    public void s_harfine_tiklanir() {
        searchStore.clickLetter();
    }
    @When("Herhangi bir magazaya tiklanir")
    public void herhangi_bir_magazaya_tiklanir() {
        searchStore.clickStoreName();
    }
    @Then("Magaza detaylari görülür")
    public void magaza_detaylari_görülür() {
        searchStore.checkStore();
    }
}
