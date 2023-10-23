Feature: Login Web DQS
    #TCC.DQS.001
  Scenario: Login Valid Test
    Given User enter url DQS
    When User click tab account
    And User input valid username
    And User input valid password
    And User click button login
    Then User get text Hello on dashboard

   #TCC.DQS.002
  Scenario: Login Invalid Test
    Given User logout
    When User input empty username
    And User input empty password
    And User click button login
    Then User get text Error message

     #TCC.DQS.003
   Scenario: Login with Invalid Password Test
    Given User input valid username
    And User input invalid password
     And User click button login
    Then User get text ERROR


     #TCC.DQS.021
    Scenario: Add Cart Test
    Given User clear username
      When User input valid username
    And User input valid password
      And User click button login
    And User click tab demosite
    And User click tshirt product
    And User choose color tshirt
    And User choose size tshirt
    And User click button add to cart
    Then User get text tshirt added to your cart

  #TCC.DQS.022
  Scenario: Add Cart Negative Test One
    Given User click button clear
    When User choose color tshirt
    And User not choose size tshirt
   Then User click button add to cart

#TCC.DQS.023
  #Scenario: Add Cart Negative Test Two
  # Given User click button clear
 #When User not choose color tshirt
   #And User choose size tshirt
    #Then User click button add to cart




