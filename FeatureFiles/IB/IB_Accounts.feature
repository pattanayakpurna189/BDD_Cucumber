@tag
Feature: Automation testing scenario 2
   Background:
   		Given user logged in with valid credentials and landed in Homepage
 	
@IB_Accounts_TC_001
Scenario: User views CASA Account Summary 
	When user clicks on the burger menu
	Then User Logged out of the system successfully
	

@IB_Accounts_TC_002
Scenario: User views CASA Account Summary for account in Active status
	When user clicks on the burger menu
	And navigates to Accounts Workspace
	Then User Logged out of the system successfully


@IB_Accounts_TC_004
Scenario: User views Brokerage Acct Type (Cl) CASA Account Summary
	When user clicks on the burger menu
	And navigates to Accounts Workspace
	Then User Logged out of the system successfully

	