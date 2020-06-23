Feature: Makemytrip Login

#without examples keyword
#Scenario: Login Test Scenario
#Given user is already in Login page
#When user title of login page is makemytrip
#Then user enters the "gijoraju@gmail.com" and "SeaWater100@"
#Then user clicks on login button
#And user is on Homepage 



Scenario Outline: Login Test Scenario

Given user is already in Login page
When user title of login page is makemytrip
Then user enters "<username>" and "<password>"
Then user clicks on login button
And user is on Homepage 

Examples:

|username|password|
|gijoraju@gmail.com|Summer800!|
|abc@gmail.com|test@123|