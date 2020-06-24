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
|BDD01|100|100|
Then clicks on save
