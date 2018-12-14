Feature: Is Certificate Number valid?
  Validate data type for Input Cert #

  Scenario: Input is not number
    Given input is "abc"
    When I validate cert #
    Then I should be shown "Invalid Data Type"

  Scenario: Input is number
    Given input is "1234567890"
    When I validate cert #
    Then I should not be shown any validation errors