Feature: Merge Lead in the Leaftaps Application

Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the Home page is displayed.

@smoke
Scenario Outline: Merge Lead with different data
Given Click CRMSFA Link
And Click on Leads Tab
When Click Merge lead link
When Type the firstName in FromLead as <firstName1>
And Cick on Find Leads from FromLead
And Click on First Result in Merge Leads
When Type the firstName in ToLead as <firstName2>
And Cick on Find Leads from Tolead
And Click on First Result in ToLead
And Click on Merge button


Examples:
|firstName1|firstName2|
|Kanmani|Makinthan|
|Kanmani|Ravanan|