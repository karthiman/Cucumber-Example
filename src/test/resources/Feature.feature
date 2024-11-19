Feature: validating function of login in adatin webpage.
Scenario Outline: validating login with incorrect username and password.
Given user is on Adactin Page on chrome.
When user enter "<username>" and "<Password>".
And user should click on login button
Then user should validate home page screen is present.

Examples: 
|username||Password|
|karthikman||Mani@123|
