package StepDefinations;

import UiPages.SearchStore;
import UiPages.SearchWord;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class wordSteps {
    SearchWord searchWord;

    public void wordSteps(SearchWord searchWord) {
        this.searchWord = searchWord;
    }

    @Given("Anasayfaya gidilir")
    public void anasayfayaGidilir() {
        System.out.println("n11.com sayfasına gidilir");
        searchWord.startDriver();
        searchWord.navigateToBaseUrl();

    }

    @When("iPhone kelimesi aratilir")
    public void iphoneKelimesiAratilir() throws InterruptedException {
        System.out.println("İphone kelimesi aratılır");
        searchWord.searchWord();

    }

    @And("İstenen kelime düzeltilir ve aratilir")
    public void istenenKelimeDüzeltilirVeAratilir() {
        System.out.println("Kelime düzenlemesi tamamlanır ve arama yapılır");
        searchWord.searchClick();
    }

    @And("Gelen sonuclardan ilk urun sepete eklenir")
    public void gelenSonuclardanIlkUrunSepeteEklenir() {
        System.out.println("Listelenen ürünlerden ilki sepete eklenir");
        searchWord.firstItemAddToBasket();
    }

    @And("Gelen sonuclardan son urun sepete eklenir")
    public void gelenSonuclardanSonUrunSepeteEklenir() {
        System.out.println("Listelenen ürünlerden sonuncusu sepete eklenir");
        searchWord.secondItemAddToBasket();
    }

    @And("Sepete gidilir")
    public void sepeteGidilir() throws InterruptedException {
        System.out.println("Sepete gidilir");
        searchWord.goToBasket();
    }

    @And("Misafir kullanici olarak odeme adimina gidilir")
    public void misafirKullaniciOlarakOdemeAdiminaGidilir() {
        System.out.println("Üye olmadan devam edilir");
        searchWord.goToPay();

    }

    @Then("Ödeme sayfasına gidildigi görülür")
    public void ödemeSayfasınaGidildigiGörülür() {
        System.out.println("Misafir olarak ödeme adımına gidildigi görülür");
        searchWord.guestBasket();
    }

}
