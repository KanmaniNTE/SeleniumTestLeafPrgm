Feature: Login to the Leaftaps Application

Background:
Given Open the chrome browser
And Load the URL and Maximize

@smoke
Scenario: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the Home page is displayed.

@sanity
Scenario: Negative Login
Given Type the user name as 'DemoSaleManager'
And Type the password as 'crmsja'
When Click on the Login button
But Verify the Error message is displayed.