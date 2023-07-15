Feature: OpenCart Feature

#Without Examples

#Scenario: OpenCart Search Product Test Scenario
#
#Given user is already on Login Page
#When title of login page is Account Login
#Then user enters "vishakhapokiya@gmail.com" and "Vishakha@123"
#Then user clicks on login button


#With Examples Keyword

Scenario Outline: OpenCart Search Product Scenario

Given user is on LoginPage
When title of loginpage is "Account Login"
Then user entering "<emailId>" and "<password>"
Then user clicks on login
Then user is on "My Account"
Then user is searching for the "<productName>"
Then quit browser

Examples:
 		|         emailId      |     password   |   productName   |
 		|  taksh123@gmail.com  |     taksh123   |    Macbook      |
 		|  taksh123@gmail.com  |     taksh123   |    iPhone       |