@tag
Feature: Mobile Banking scenario for Tools Module
   Background:
    Given user logged in with valid credentials and landed in Homepage
     
   	
   @MB_Tools_TC_008
   Scenario: User views deposit calculator rates for different deposit products for USD currency
	And clicks deposit rate calculator option
	And views deposit rate calculator Input screen
	And selects a deposit type <TBD><fetched form CBX-R> from the dropdown
	And selects currency <A(3)> as USD from the dropdown
	And selects tenure <A(3)>from the dropdown
	And enters desired amount <N(15)> in the field
	And clicks calculate button
	Then user can view deposit rate calculator output screen
	And can view Interest rate <TBD> for the combination selected in the input screen
	And can view Interest amount <TBD> for the combination selected in the input screen
	And can view Maturity amount <TBD> for the combination selected in the input screen
	And Data matches with Misys equation(core system)
   	Then User Logged out of the system successfully
   	
   @MB_Tools_TC_009
   Scenario: User views error message as Please update Amount to process your request when data in amount field is not entered
	And clicks deposit rate calculator option
	And views deposit rate calculator Input screen
	And selects a deposit type <TBD><fetched form CBX-R> from the dropdown
	And selects currency <A(3)> as QAR from the dropdown
	And selects tenure <A(3)>from the dropdown
	And does not enter the desired amount <N(15)> in the field
	And clicks calculate button
	Then user can view an error message Please update Amount to process your request
	And Data matches with Misys equation(core system)
   	Then User Logged out of the system successfully
   	
   @MB_Tools_TC_010
   Scenario: User Calculates the exchange rate for different currencies
	And clicks Exchange Rate calculator option
	And views Exchange Rate calculator Input screen
	And selects From currency <A(3)> from the drop down
	And selects To currency <A(3)> from the dropdown
	And enters desired amount <N(21, 3)> in  the amount field
	And clicks calculate button
	Then user can view Results in the  same screen
	And can view exchange rate for the entered amount in To currency
	And can view the current date value for one from currency to To currency (1 QAR = 190633 INR)
	And Data matches with Misys equation(core system)
   	Then User Logged out of the system successfully
   	
   	
   @MB_Tools_TC_014
   Scenario: User views the monthly Installment/ EMI for Mortgage loan as a Qatari 
	And clicks Loan Calculator option
	And views Loan Calculator Input screen
	And selects Mortgage loan from the product type dropdown
	And views Qatari by default in the nationality dropdown
	And drags the slide bar for Interest rate <AN+ (3,1)> (between 3 to 7%)
	And drags the slide bar for desired loan amount in QAR  <A(3), N(132)>
	And drags the slide bar for desired months (between 12 to 240 months)
	And clicks the calculate button
	Then user can view the loan calculator - loan schedule screen
	And can view the Monthly repayment <N (3)>for the selected option
	And can view the Total Interest repayable <N (15)for the selected option
	And can view the Total repayment amount <N (15)> for the selected option
	And can view the loan schedule table related to the selected option
	And Data matches with Misys equation(core system)
   	Then User Logged out of the system successfully
   	
   	
   	##Added 16th July ## Purna
   	@MB_Tools_TC_001
   Scenario: User views deposit rates for different deposit products
	When user  navigates to Tools Workspace
	And clicks deposit rates option
	And views deposit rate screen
	And selects a deposit type <TBD><fetched form CBX-R> from the dropdown
	And  selects currency  as QAR or USD from the dropdown
	And clicks search button
	Then user can view Product type<A (30)> <TBD>
	And can view Tenure <AN (20)> for the related  product type
	And can view Deposit Amount <N (15)> for the related product type
	And can view Interest rate <AN+ (2,1)> for the amount, product and tenure combinations.
   	Then User Logged out of the system successfully
   	
   @MB_Tools_TC_002
   Scenario: User views deposit rates for different deposit products for QAR currency
	When user  navigates to Tools Workspace
	And clicks deposit rates option
	And views deposit rate screen
	And selects a deposit type <TBD><fetched form CBX-R> from the dropdown
	And  selects currency  as QAR from the dropdown
	And clicks search button
	Then user can view Product type<A (30)> <TBD>
	And can view Tenure <AN (20)> for the related  product type
	And can view Deposit Amount <N (15)> in QAR  for the related product type
	And can view Interest rate <AN+ (2,1)> for the amount, product and tenure combinations.
   	Then User Logged out of the system successfully
   	
   	 @MB_Tools_TC_003
   Scenario: User views deposit rates for different deposit products for USD currency
	When user  navigates to Tools Workspace
	When user  navigates to Tools Workspace
	And clicks deposit rates option
	And views deposit rate screen
	And selects a deposit type <TBD><fetched form CBX-R> from the dropdown
	And  selects currency  as USD from the dropdown
	And clicks search button
	Then user can view Product type<A (30)> <TBD>
	And can view Tenure <AN (20)> for the related  product type
	And can view Deposit Amount <N (15)> in USD for the related product type
	And can view Interest rate <AN+ (2,1)> for the amount, product and tenure combinations.
   	Then User Logged out of the system successfully
   	
   	 @MB_Tools_TC_017
   Scenario: User views the buying and selling rate of foreign currency against the base currency
	When user  navigates to Tools Workspace
	And clicks FX rates option
	Then user can view FX rates screen
	And can view currency <A (3)>  of all foreign currencies
	And can view currency description <A (30)>of all foreign currencies
	And can view buying <N (15)> and selling <N (15)> rate of all foreign currencies in 6 digits. (if not 6 , 0 will be paddedto ensure 6 digits are getting displayed )
   	Then User Logged out of the system successfully
   	