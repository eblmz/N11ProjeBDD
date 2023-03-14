@First
Feature: İstenilen kelimeyi arama,siralama,listeleme
  Scenario: Telefon kelimesini aratma,listeleme ve siralama
    Given NOnBir Anasayfasina gidilir
    When  telefon kelimesi aratilir
    And Sonuc ekranından ikinci marka secilir
    And Yorum sayisina gore siralama yapilir
    And Siralamanin dogru yapildigi gorulur
    And Ucretsiz kargo olanlar listelenir
    Then Tum urunlerin ucretsiz kargo oldugu gorulur