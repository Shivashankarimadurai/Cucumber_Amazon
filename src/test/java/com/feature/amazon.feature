Feature: Amazon Website Login

Scenario: User enter valid username And password in Amazon login

Given Launch The Url
When Click The Sigin Button To Navigate To The Loginpage
And user enter the valid moblienum in the moblienum feild
And user click the continue Button to navigate password page
And user should click the password Button and enter the valid password in the password feild
And user landed on the Amazon home page

Scenario: user search the product in home page And Add to cart thr product

When User Select the Search Bar Feild
And User Enter The Product Name In The Search Bar
And Click The Search Button 
And Scrolldown The Window And Click The Product
Then Scrolldown The Page And Click The Add To Cart Button 

Scenario: Amazon Payament Prccess

When User Click The Proceed To Buy Button
And Select default Address Button 
And scroll up the page
Then verifi the checkout page and select apply
      
