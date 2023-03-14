package StepDefinations;

import UiPages.SearchWordTwo;
import com.n11.test.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class wordTwoSteps {

    SearchWordTwo wordTwo;
    public wordTwoSteps(SearchWordTwo wordTwo){
        this.wordTwo = wordTwo;
    }
    @Given("NOnBir Anasayfasina gidilir")
    public void nonbirAnasayfasinaGidilir() {
        System.out.println("n11.com sayfasına gidilir");
        wordTwo.startDriver();
        wordTwo.navigateToBaseUrl();
    }

    @When("telefon kelimesi aratilir")
    public void telefonKelimesiAratilir() {
        System.out.println("telefon kelimesi aratilir");
        wordTwo.searchWord();
    }

    @And("Sonuc ekranından ikinci marka secilir")
    public void sonucEkranındanIkinciMarkaSecilir() {
        System.out.println("Arama sonucu 2. marka seçilir");
        wordTwo.selectMark();
    }

    @And("Yorum sayisina gore siralama yapilir")
    public void yorumSayisinaGoreSiralamaYapilir() {
        System.out.println("Yorum sayısına göre ürünler sıralanır");
        wordTwo.findCommentListing();
    }

    @And("Siralamanin dogru yapildigi gorulur")
    public void siralamaninDogruYapildigiGorulur() {
        System.out.println("Sıralamanın dogru oldugu kontrol edilir");
        wordTwo.commentToSort();
    }

    @And("Ucretsiz kargo olanlar listelenir")
    public void ucretsizKargoOlanlarListelenir() {
        System.out.println("Ürünler için ücretsiz kargo seçenegi seçilerek listelenir");
        wordTwo.selectCargoOption();
    }

    @Then("Tum urunlerin ucretsiz kargo oldugu gorulur")
    public void tumUrunlerinUcretsizKargoOlduguGorulur() {
        System.out.println("Ücretsiz kargo oldugu kontrol edilir");
        wordTwo.checkFreeCargo();
    }
}
