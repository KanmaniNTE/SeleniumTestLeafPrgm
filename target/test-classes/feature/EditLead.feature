Feature: Edit Lead in the Leaftaps Application

Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the Home page is displayed.

Scenario Outline: Edit Lead with different data
Given Click CRMSFA Link
And Click on Leads Tab
When Click Find lead link
When Type the firstName in EditLead as <firstName1>
And Cick on Find Leads
And Click on First Result in Find Leads
And Click on Edit Button
When Click Update the company Name as <companyName>
And Click on update button
Then Confirm the changed name appears

Examples:
|firstName1|companyName1|
|Babu|Wipro|
|Kanmani|Testleaf|