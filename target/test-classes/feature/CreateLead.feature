Feature: Create new Lead in the Leaftaps Application

Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the Home page is displayed.
@smoke
Scenario Outline: Create Lead with different data
Given Click CRMSFA Link
And Click on Leads Tab
When Click create lead link
When Type the companyName as <companyName>
When Type the firstName as <firstName>
When Type the lastName as <lastName>
And Click the create leads Button
And Verify the view Leads page

Examples:
|companyName|firstName|lastName|
|Alight|Kanmani|NTE|
|Wipro|Ravanan|E|

