Feature: OpenCart Feature

Scenario Outline: OpenCart ProductInfo Test Scenario

Given user opens LoginPage
When title of the loginpage "Account Login"
Then user enter the "<emailId>" and "<password>"
Then user clicking on login
Then user search for the "<productName>"
Then user click on the product
Then verify the product details "MacBook"
Then closing the browser

Examples:
 		|       emailId       |     password    |   productName   |
 		| taksh123@gmail.com  |   taksh123    |    Macbook      |