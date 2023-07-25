Feature: Delete Lead in the Leaftaps Application

Background: Positive Login
Given Type the username as 'DemoSalesManager'
And Type the password as 'crmsfa'
When Click on the Login button
Then Verify the Home page is displayed.

@smoke
Scenario Outline: Delete Lead in Leaftaps
Given Click CRMSFA Link
And Click on Leads Tab
When Click Find lead link in Leaftap
And Click on Phone Tab
When Type the PhoneNumber as <phoneNumber>
And Cick on Find Leads from FindLeads page
And Click on First Result in Find Leads
And Cick on Find Delete button
Then Verify the lead Deleted.



Examples:
|phoneNumber|
|91|
|88|