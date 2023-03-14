@First
Feature: İstenilen kelimeyi arama

  Scenario: iPhone kelimesi aratilir düzeltme yapilir ve sonuclar gorulur
    Given Anasayfaya gidilir
    When  iPhone kelimesi aratilir
    And İstenen kelime düzeltilir ve aratilir
    And Gelen sonuclardan ilk urun sepete eklenir
    And Gelen sonuclardan son urun sepete eklenir
    And Sepete gidilir
    And Misafir kullanici olarak odeme adimina gidilir
    Then Ödeme sayfasına gidildigi görülür