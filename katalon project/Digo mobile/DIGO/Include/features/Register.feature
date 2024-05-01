
@register
Feature:  Register
  User wants to register account to DIGO Mobile

  @InvalidRegist
  Scenario Outline: Test register with invalid data 
    Given Open the app mobile
    When User go to register page
    And User enters username <username> in the field username
    And User enters email <email> in the field email
    And User enters password <password> in the field password
    And User enters confirm password <confirmpw> in the field confirm password
    And User enters valid code referral <referral> in the field code referral
    And Click on register button in register page
    Then Show alert error state

    Examples: 
      | username  | email | password  |	confirmpw	|	referral	|
      | sarahprb |	sarah@gmail.om | Windows11 |	Windows11	|	A45HYS7	|
      | sarahprb |	sarah@gmail.com | Windows11 |	Windows	|	A45HYS7	|
      | sarahprb |	 | Windows11 |	Windows11	|	A45HYS7	|
      | sarahprb |	sarah@gmail.com | Windows11 |		|	A45HYS7	|