@tag
Feature: Mobile Banking scenario for Deposits Module
   Background:
     Given user logged in with valid credentials and landed in HomePage
     When user clicks on the burger menu
	 When user navigates to Deposits Workspace
	 
  @MB_Deposits_TC_01
  Scenario: User views Deposit Summary in QAR Currency
	Then user can view Static label as Save Money Get Best Interest Rates in the band
	And can view the number of active Depoist accounts You have number of active deposits deals
	And can view the total balance of the active accounts in QAR
	And can view Deposit Product Name as Call Deposits
	And can view TBD Deal number 
	And can view Deposit Account Holder  Name
	And can view Deposit Amount label and Available Balance amount in their respective currency
	And can view  Maturity Date and date formate will be in ddmmyyyy
	Then User Logged out of the system successfully
	
  @MB_Deposits_TC_05
  Scenario: User views Deposit Summary in Other Currency than QAR
	And user selects the Other currency account  from the corousel
	Then User can view Deposit Product Name as Term Deposit EUR GBP
	And User can view TBD Deal number 
	And User can view Dposit Holder Name in Account Name Field
	And User can view Deposit Amount label and Available Balance amount in their respectiveOther than QAR currency
	And User can view Maturity Date and date formate will be in ddmmyyyy
	Then User Logged out of the system successfully

  @MB_Deposits_TC_06
  Scenario: User views Deposit Account Details of the account appearing in the Deposit Summary carousel
	And user selects the Fixed Deposit account in the deposit summary corousel
	Then user can view the header as Deposit Detais
	And user can view the Deposit Account NumberN13
	And user can view the Deposit TypeAN15
	And user can view the Booking Dateddmmyyyy
	And user can view the Interest RateAN+ 6 represented in  PA
	And user can view the Deposit TermN 3 A 15
	And user can view the Maturity Instruction
	And user can view the Hold Description
	Then User Logged out of the system successfully

  @MB_Deposits_TC_10
  Scenario: User views confirmation success for open new fixed deposit in deposit workspace
	And user chooses a Term Deposit  QAR Deposit account from the carousel
	And user clicks the More icon and selects the Open new Term deposit function from the More menu
	And user views Header as  Open New Fixed Deposit
	And user selects the Deposit Type Currency from the dropdown list
	And user views the Deposit Value Date as a read only field defaulted to current date ddmmyyyy
	And user selects the Tenor from the drop down list
	And user selects the Interest Payment frequency from the drop down list
	And user enters the Deposit Amount 
	And views the Rate of interest which is auto populated
	And user selects the Debit Account from the corousel 
	And user views Account Name as a read only field
	And user selects Maturity instruction from the drop down list
	And user selects account for Principal  Interest to be paid to
	And user accepts the Terms and Conditions
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And user enters valid OTP
	And user clicks Submit
	Then user will be navigated to Open new Term deposit confirmation screen 
	And user can view Tick symbol TBD
	And user can view success message TBD
	And can view Please make note of your reference number
	And can view Date  Time Reference ID Transaction status
	And can view Note Please quote the above reference number in all communication with Ahli Bank
	And can view Go to Homepage
	And can view Open Another Deposit
	Then User Logged out of the system successfully


  @MB_Deposits_TC_13
  Scenario: user views the error message as You do not have sufficient balance in your account when insufficient balance deposit account is selected
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Open new Term deposit function from the More menu
	And user views Header as  Open New Fixed Deposit
	And user selects the Deposit Type Currency from the dropdown list
	And user views the Deposit Value Date as a read only field defaulted to current date ddmmyyyy
	And user selects the Tenor from the drop down list
	And user selects the Interest Payment frequency from the drop down list
	And user enters the Deposit Amount 
	And views the Rate of interest which is auto populated
	And user selects the Debit Account from the corousel which has insufficient balance
	And user views the Available balanceInsufficient Balance which is auto populated 
	And user views Account Name as a read only field
	And user selects Maturity instruction from the drop down list
	And user selects account for Principal  Interest to be paid to
	And user accepts the Terms and Conditions
	And user clicks Next button
	Then user should view the error message as You do not have sufficient balance in your account
	Then User Logged out of the system successfully


  @MB_Deposits_TC_17
  Scenario: user succesfully opens a term deposit  when greater  amount(greater than the configured customer segment minimum limit) is given in Deposit Amount Field
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Open new Term deposit function from the More menu
	And user views Header as  Open New Fixed Deposit
	And user selects the Deposit Type Currency from the dropdown list
	And user views the Deposit Value Date as a read only field defaulted to current date ddmmyyyy
	And user selects the Tenor from the drop down list
	And user selects the Interest Payment frequency from the drop down list
	And user enters the Deposit Amount greater  than the configured customer segment minimum limit 
	And views the Rate of interest which is auto populated
	And user selects the Debit Account from the corousel
	And user views the Available balance which is auto populated 
	And user views Account Name as a read only field
	And user selects Maturity instruction from the drop down list
	And user selects account for Principal  Interest to be paid to
	And user accepts the Terms and Conditions
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And user enters valid OTP
	And user clicks Submit
	Then user will be navigated to Open new Term deposit confirmation screen 
	And user can view Tick symbol TBD
	And user can view success message TBD
	And can view Please make note of your reference number
	And can view Date  Time Reference ID Transaction status
	And can view Note Please quote the above reference number in all communication with Ahli Bank
	Then User Logged out of the system successfully
	
	
  @MB_Deposits_TC_20
  Scenario: user succesfully opens a term deposit  when lesser amount(less than configured customer segment maximum limit) is given in Deposit Amount Field
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Open new Term deposit function from the More menu
	And user views Header as  Open New Fixed Deposit
	And user selects the Deposit Type Currency from the dropdown list
	And user views the Deposit Value Date as a read only field defaulted to current date ddmmyyyy
	And user selects the Tenor from the drop down list
	And user selects the Interest Payment frequency from the drop down list
	And user enters the Deposit Amount  lesser than configured customer segment maximum limit 
	And views the Rate of interest which is auto populated
	And user selects the Debit Account from the corousel
	And user views the Available balance which is auto populated 
	And user views Account Name as a read only field
	And user selects Maturity instruction from the drop down list
	And user selects account for Principal  Interest to be paid to
	And user accepts the Terms and Conditions
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And user enters valid OTP
	And user clicks Submit
	Then user will be navigated to Open new Term deposit confirmation screen 
	And user can view Tick symbol TBD
	And user can view success message TBD
	And can view Please make note of your reference number
	And can view Date  Time Reference ID Transaction status
	And can view Note Please quote the above reference number in all communication with Ahli Bank
	And can view Go to Homepage
	And can view Open Another Deposit
	Then User Logged out of the system successfully

	
	
  @MB_Deposits_TC_67
  Scenario: User simulates preclosure of deposits to know the maturity details on closure of deposits
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Deposit Simulation from the More menu
	And user views Header as Deposit Simulation
	And User selects the Date of closure 
	And user clicks the simulate button
	Then user will be navigated to deposit simulation details page
	And user can view Deposit AmountA3N133
	And user can view Interest PaidA3N133
	And user can view Recovered InterestA3N133
	And user can view Lien AmountA3N133
	And user can view Net AmountA3N133
	And user can view Tax AmountA3N133
	And user can view ChargesA3N133
	And user can view Ok button
	And user can view Back button
	Then User Logged out of the system successfully
	
	##Added By Purna*******************************************************************************************************************************************************
   @MB_Deposits_TC_54
  Scenario: User opts to redeem the deposit in deposit  workspace.
	When user navigates to Deposit Workspace 
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Redeem Deposit from the More menu
	And user views Header as redeem the deposit
	And User Views the Deal Number
	And User Views the Account Name
	And User Views the Deposit Type
	And User Views the Deposit Amount
	And User Views the Deposit Term
	And User Views the Booking Date
	And User Views the Maturity Instructions
	And User Views the Interest Rate
	And User Views the Penalty Amount
	And User Views the Interest Frequency
	And User Views the Principal /Interest to be paid to
	And User enters the remarks
	And user views the Notes
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen redeem
	And user enters valid OTP
	And user clicks Submit
	Then user will be navigated to Redeem Depsoit confirmation screen 
	And user can view Tick symbol
	And user can view success message
	And can view Please make note of your reference number
	And can view Date  Time Reference ID Transaction status
	And can view Note Please quote the above reference number in all communication with Ahli Bank
	And can view Go to Homepage
	And can view Go to Deposit
	Then User Logged out of the system successfully
	
	@MB_Deposits_TC_54
  Scenario: User successfully updates the change maturity instructon 
	When user navigates to Deposit Workspace 
	And user chooses a Deposit account from the carousel
	And user clicks the More icon and selects the Update Maturity Instruction from the More menu
	And user views Header as Update Maturity Instruction
	And User Views the Deal Number
	And User Views the Interest Rate suffixed with % P.A
	And User Views Principal Balance
	And User Views the Accrued Interest Amount
	And User Views the Deposit Term
	And User Views the Booking Date
	And User Views the Maturity Date
	And User selects the Maturity Instruction from the drop down list Credit to account,Renew Principal,Renew interest and Principal
	And user selects the Principal/Interest to be paid to from the dropdown list(All active CASA accounts)
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And user enters valid OTP
	And user clicks Submit
	Then user will be navigated to Update Maturity Instruction confirmation screen 
	And user can view Tick symbol
	And user can view success message
	And can view Please make note of your reference number
	And can view Date  Time Reference ID Transaction status
	And can view Note Please quote the above reference number in all communication with Ahli Bank
	And can view Go to Homepage
	And can view Go to Deposit
	Then User Logged out of the system successfully
	
	