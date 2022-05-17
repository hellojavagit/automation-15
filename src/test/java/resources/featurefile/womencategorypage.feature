Feature: women category
  As a User I want see Products and add to cart of my choice
  BackGround:
@sanity,@smoke,@regression
Scenario: User should navigate and access women category successfully
  When I click on Women link
  Then I should see text "Women"
@smoke,@regression
  Scenario Outline: Verify user should add product to the cart successfully
    When I select product "<product>"
    And I change quantity "<qty>"
    And I select size "<size>"
    And I select colour "<colour>"
    And I click on Add Cart
    Then I should see the message "Product added successfully to your shopping cart"
    And I click close button


    Examples:
    |product                                       |qty|size|colour|
    |Blouse                                        | 2  | M  |white |
    |Printed dress                                 | 3  | L  |Orange|
    |printed chiffon dress                         | 4  | S  |Green |
    |Prinetd Summer Dress with Price $28.98        | 2  | M  |  Blue |
