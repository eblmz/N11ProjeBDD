@First
Feature: Mağazaya yonlendirme
  Scenario: S harfi ile baslayan rastgele bir mağazaya yonlendirme
    Given Mağazalar sayfasina gidilir
    When  Tum magazalar sayfasina gidilir
    And S harfine tiklanir
    And Herhangi bir magazaya tiklanir
    Then Magaza detaylari görülür


