Feature: n11 login
#https://so.n11.com/
  @sellerofficesignin
  Scenario: n11 selleroffice login
    Given user launch browser and open the login page
    When user signed in selleroffice with valid credentials
    Then user signed in selleroffice successfully

  @sellerofficesignup
  Scenario:
    Given user launch browser and open the login page
    When user navigates to sign up page
    And user fills the required fields but not accept the aggreement
    Then verify user see an error message displayed