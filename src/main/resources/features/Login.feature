Feature: Login Web DQS
  #TCC.DQS.001
  Scenario: Login Valid Test
    Given User enter url HRM
    When User click tab account
    And User input valid username
    And User input valid password
    And User click button login
    Then User get text Hello on dashboard

       #TCC.DQS.003
  Scenario: Login with Empty Password and Username
    Given User logout
    When User input empty username
    And User input empty password
    And User click button login
    Then User get text Error message

    #TCC.DQS.002
    Scenario: Login with Invalid Password Test
      Given  User input valid username
      And User input invalid password
      And User click button login
      Then User get text ERROR


