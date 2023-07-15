Feature: OpenCart Feature

#Without Examples

Scenario: OpenCart Registration Test Scenario

Given user is on Login Page
When title of login page "Account Login"
Then go to registration page
Then user enters all the details

| firstname | lastname |     emailid  |  contact   |    password    | confirm Password |
|    abc    |   Patel  |   abcpatel   | 5647347353 |  abcpatel@1753 |  abcpatel@1753   | 

Then verify title "Your Account Has Been Created!"
Then user click on logout link
Then user click on registration link

Then quite the browser
