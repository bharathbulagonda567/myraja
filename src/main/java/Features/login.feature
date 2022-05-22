Feature: Free CRM Login Feature


#without Examples Keyword
#Scenario: Free CRM Login Test Scenario
#
#Given user is already on Login Page
#When title of login page is Free CRM
#Then user enters "naveenk" and "test@123"
#Then user clicks on login button
#Then user is on home page


#with Examples Keyword
@Login
Scenario Outline: Free CRM Login Test Scenario

Given user is already on Login Page
When title of login page is Free CRM
And user enters "<username>" and "<password>"
And user clicks on login button
Then user is on home page
And in home page enter search "<searchstring>"
Then verify search results 
And Close the browser


Examples:
	| username | password | searchstring|
	| brajusr  | Welcome*123 |git|
	| brajusr | test456  | 	git|
	| brajusr  | Welcome*123 |git|