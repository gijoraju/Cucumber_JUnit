Feature: CRM Deals Test
Scenario: Deals Creation

Given user is already in Login page
When user title of login page is crm
Then user enters username and password
|gijoraju@gmail.com|Summer800!|
Then user clicks on login button
And user is on Homepage 
Then user clicks on deals
Then user clicks on new
Then user enters deal details
|Cucum001|100|100|
|Cucum002|200|200|

Then clicks on save
