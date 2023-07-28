Feature: OpenCart Feature

Scenario Outline: OpenCart Login Test Scenario

Given user is already on Login Page
When title of login page is "Account Login"
Then user check forgot password link
Then user enters "<emailId>" and "<password>"
Then user clicks on login button
Then user is on My Account page "My Account"
Then close the browser

Examples:
 		|          emailId       |   password  |  
 		|   mahant12345@gmail.com   |   Baps@12345  | 



