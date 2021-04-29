@tag 
Feature: Automation testing scenarios for payments module  1 
Background: 
	Given user logged in with valid credentials in MB and landed in Home screen 
	
	
@MB_Payments_TC_003 
Scenario: User views the Overdue bills in the Due Bill section  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And navigates to the Payments workspace 
	And user selects the Due Bills Section 
	Then user should view the IconThe first letter of the biller will be shown as the bill icon 
	And user should view the Biller Nick NameAN 35 
	And user should view the Utility number Account number AN8 
	And user should view the Bill amount A3 N132 
	And user should view the Due Date Which lesser than the current business date and the status is Pending payment 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_005 
Scenario: User views the Upcoming Bills  in the Due Bill section  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And navigates to the Payments workspace 
	And user selects the Due Bills Section 
	Then user should view the IconThe first letter of the biller will be shown as the bill icon 
	And user should view the Biller Nick NameAN 35 
	And user should view the Utility number Account number AN8 
	And user should view the Bill amount A3 N132 
	And user should view the Due Date  upcoming bills up to a maximum of 7 days from the current business date will be displayed 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_014 
Scenario: User adds a  Biller in Add a Biller   
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the More option 
	And user clicks the Add a Biller option 
	And user selects the Biller Name AN 50 
	And user enters the Qatari ID AN11 
	And user enters the Utility number  Account number 
	And user enters the Biller Nick Name AN35 
	And user clicks the Save Biller option 
	And user navigates to the review detail screen 
	And user verifies the Biller Name 
	And user verifies the Account NumberUtility Number 
	And user verifies the Biller Nick Name 
	And user enters the OTP 
	And user clicks the Submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol 
	And user should view the successful Note Yay Its done for Add Biller
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Add another Biller 
	And user should view the Go To Bill Payments button 
	
	And user  selects the All Billers section 
	#And user views the record 
	And user selects the record for delete
	And user clicks the delete option  
	And user views Review screen
	And user enters the OTP 
	And user clicks the submit button 
	Then user should view the Tick symbol 
	And user should view the Heading And Its done Yay Its done for Delete Biller
	And user should view the Go To Bill Payments button
	
	
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_015 
Scenario: User views the Account Number getting displayed when Biller name is selected as Kahramma  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the More option 
	And user clicks the Add a Biller option 
	And user selects the Biller Name AN 50 as Kahramma 
	And user enters the Qatari ID AN11 
	Then user should view the Account Number field getting displayed 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_016 
Scenario: User views the Account Number getting displayed when Biller name is selected as either Ooredoo and Vodafone  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the More option 
	And user clicks the Add a Biller option 
	And user selects the Biller Name AN 50 as Ooredoo and Vodafone 
	And user enters the Qatari ID AN11 
	Then user should view the Utility Number field getting displayed 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_031 
Scenario: User views the Manage Biller Details Screen in Payments workspace  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user  selects the All Billers section 
	And user views the record 
	And user selects the record 
	And user should view the Biller Nick Name 
	And user should view the Biller Name 
	And user should view the Qatari ID 
	And user should view the UtilityAccount Number 
	And user should view the Biller Nick Name 
	And user should view back Edit Delete and Pay now button 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_032 
Scenario: User Edits the Manage Biller Details Screen in Payments workspace  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user  selects the All Billers section 
	And user views the record 
	And user selects the record
	And user views the Biller Details in Manage Biller details page 
	And user clicks the Edit button 
	And user views the Edit Biller screen 
	And user views the Biller Nick Name which is non editable 
	And user selects the Biller Name 
	And user enters the Qatari ID
	And user modifies the UtilityAccount Number 	 
	And user clicks Next
	And user verifies the details
	And user enters the OTP
	And user clicks the submit button 
	Then user should view the Tick symbol 
	And user should view the Heading And Its done Yay Its done for Edit Biller
	And user should view the Label1 Please make note of your reference number 
	And user should view the DateTime 
	And user should view the Reference ID 
	And user should view the Transaction Status 
	And user should view the Label 2 Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Edit another biller button 
	And user should view the Go To Bill Payments button 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_036 
Scenario: User Deletes the  Biller Details  in Payments workspace  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user  selects the All Billers section 
	#And user views the record 
	And user selects the record for delete
	And user views the Manage Biller details screen 	
	And user views the Biller Nick Name which is non editable 
	And user Views the Biller Name 
	And user views the UtilityAccount Number 
	And user views  the Qatari ID
	And user clicks the delete option  
	And user views Review screen
	And user enters the OTP 
	And user clicks the submit button 
	Then user should view the Tick symbol 
	And user should view the Heading And Its done Yay Its done for Delete Biller
	And user should view the Label1 Please make note of your reference number 
	And user should view the DateTime 
	And user should view the Reference ID 
	And user should view the Transaction Status 
	And user should view the Label 2 Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Edit another biller button 
	And user should view the Go To Bill Payments button 
	Then User Logged out of the system successfully 
	
	
	
@MB_Payments_TC_047 
Scenario: User Pays a bills via pay bill option in Payments workspace  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay bills option 
	And user vies the Biller Icon 
	#And user views the  Biller Nick Name 
	#And user views the UtilityAccount Number
	And user selects  the Bill Amount as Bill Amount Other Amount 
	And user selects  the Payment Mode as AccountsCredit Cards 
	And user views the Account Type card type 
	And user views the Account Status  Card status 
	And user views the Account Number  Card number 
	And user views the Account Name  Card type 
	And user views the Available Balance  Available limit 
	And user selects the When would you like to make this payment as either Now Later and Auto pay 
	And user views the Payment date If later is selected as Payment option 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Bills
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay Bills
	And user should view the successful Note Yay Its done 
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_048 
Scenario: User Pays a bills via pay bill option in Payments workspace using Pay now option   
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay bills option 
	And user vies the Biller Icon 
	#And user views the  Biller Nick Name 
	#And user views the Account Number 
	And user selects  the Bill Amount as Bill Amount 
	And user selects  the Payment Mode as Accounts 
	And user views the Account Type 
	And user views the Account Status 
	And user views the Account Number 
	And user views the Account Name 
	And user views the Available Balance 
	And user selects the When would you like to make this payment as  Now 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay Bills
	And user should view the successful Note Yay Its done 
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_049 
Scenario: User Pays a bills via pay bill option in Payments workspace using Pay Later option   
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay bills option 
	And user vies the Biller Icon 
	#And user views the  Biller Nick Name 
	#And user views the Account Number 
	And user selects  the Bill Amount as  Other Amount 
	And user enters the amount in Other Amount field 
	And user selects  the Payment Mode as Credit Cards 
	And user views the card type 
	And user views the  Card status 
	And user views the Card number 
	And user views the Card type 
	And user views the Available limit 
	And user selects the When would you like to make this payment as Later 
	And user views payment Date  business date + 1 will be populated 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay Bills
	And user should view the successful Note Yay Its done 
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_061 
Scenario: User navigates to Bill Payments  screen by clicking the Go To Bill Payments  screen  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay bills option 
	And user vies the Biller Icon 
	#And user views the  Biller Nick Name 
	#And user views the UtilityAccount Number 
	And user selects  the Bill Amount as Bill Amount Other Amount 
	And user selects  the Payment Mode as AccountsCredit Cards 
	And user views the Account Type card type 
	And user views the Account Status  Card status 
	And user views the Account Number  Card number 
	And user views the Account Name  Card type 
	And user views the Available Balance  Available limit 
	And user selects the When would you like to make this payment as either Now Later and Auto pay 
	And user views the Payment date If later is selected as Payment option 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
	And user enters the OTP 
	And user clicks the submit button 
	And user navigates to confirmation screen 
	And user  views the Tick symbol for Pay Bills
	And user views the successful Note Yay Its done for Pay Bills
	And user views the note Please make note of your reference number 
	And user views the DataTime 
	And user views the Reference ID 
	And user views the Transaction status Processed successfully 
	And user views the Note Please quote the above reference number in all communication with Ahli Bank 
	Then user views the Make another Payments 
	And user views the Go To Bill Payments 
	And user clicks the Go To Bill Payments 
	Then user should be navigated to Bill Payments screen 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_064 
Scenario: User Pays  biller  via pay a biller  option in Payments workspace  
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay a biller option 
	And user selects the Biller Name 
	And user enters the Qatari ID 
	And user UtilityAccount Number 
	#And user enters the Biller Nick Name 
	And user clicks the Proceed button 
	And user views the Bill Payment Screen 
	And user views the Biller Icon 
	And user views the  Biller Nick Name 
	#And user views the UtilityAccount Number 
	And user selects  the Bill Amount as Bill Amount Other Amount 
	And user selects  the Payment Mode as AccountsCredit Cards 
	And user views the Account Type card type 
	And user views the Account Status  Card status 
	And user views the Account Number  Card number 
	And user views the Account Name  Card type 
	And user views the Available Balance  Available limit 
	And user selects the When would you like to make this payment as either Now Later and Auto pay 
	And user views the Payment date If later is selected as Payment option 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Biller
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay a Biller
	And user should view the successful Note Yay Its done for Pay a Biller
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
@MB_Payments_TC_065 
Scenario: User Pays a biller via pay a biller option in Payments workspace using Pay now option   
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay bills option 
	And user clicks the Pay a biller option 
	And user selects the Biller Name 
	And user enters the Qatari ID 
	And user UtilityAccount Number 
	#And user enters the Biller Nick Name 
	And user clicks the Proceed button 
	And user views the Bill Payment Screen 
	And user views the  Biller Nick Name 
	#And user views the Account Number 
	And user selects  the Bill Amount as Bill Amount 
	And user selects  the Payment Mode as Accounts 
	And user views the Account Type 
	And user views the Account Status 
	And user views the Account Number 
	And user views the Account Name 
	And user views the Available Balance 
	And user selects the When would you like to make this payment as  Now 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay a Biller
	And user should view the successful Note Yay Its done for Pay a Biller 
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
	
@MB_Payments_TC_066 
Scenario: User Pays  biller via pay a biller option in Payments workspace using Pay Later option   
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the more option 
	And user clicks the Pay a biller option 
	And user selects the Biller Name 
	And user enters the Qatari ID 
	And user UtilityAccount Number 
	And clicks Register checkbox
	#And user enters the Biller Nick Name 
	And user clicks the Proceed button 
	And user views the Bill Payment Screen 
	And user vies the Biller Icon 
	And user views the  Biller Nick Name 
	#And user views the Account Number 
	And user selects  the Bill Amount as  Other Amount 
	And user enters the amount in Other Amount field 
	And user selects  the Payment Mode as Credit Cards 
	And user views the card type 
	And user views the  Card status 
	And user views the Card number 
	And user views the Card type 
	And user views the Available limit 
	And user selects the When would you like to make this payment as Later 
	And user views payment Date  business date + 1 will be populated 
	And user enters the remarks 
	And views the Fee field 
	And user clicks the confirm Payment 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen for Pay Biller
	And user enters the OTP 
	And user clicks the submit button 
	Then user should navigate to confirmation screen 
	Then user should view the Tick symbol for Pay a Biller
	And user should view the successful Note Yay Its done for Pay a Biller
	And user should view the note Please make note of your reference number 
	And user should view the DataTime 
	And user should view the Reference ID 
	And user should view the Transaction status Processed successfully 
	And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make another Payments 
	And user should view the Go To Bill Payments 
	Then User Logged out of the system successfully 
	
	
	
@MB_Payments_TC_081 
Scenario: User performs Top Up and recharge via Top up and recharge functionality in Payments 
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the More option 
	And user clicks the Top up and Recharge 
	And user selects the Recharge Type
	And user enters the Mobile Number 
	And user selects the Payment Mode either as AccountCredit Card 
	And user views the Debit Account Number Credit card number 
	#And user views the Available Balance	 
	And user selects the value in How much you want to top up  recharge
	And user clicks the confirm Payment screen 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen 
	And user enter the OTP 
	And user clicks the submit button 
	Then user should be navigated to confirmation screen 
	Then user should view the Tick symbol for Topup
	Then user should view the Heading  Your Payment payment amount is successful 
	Then user should view the Label 1 as Please make note of your reference number 
	Then user should view the Transferred From Account Number 
	Then user should view the Paid to 
	Then user should view the Date  Time 
	And user should view the Reference ID 
	Then user should view the Label 2 Please quote the above reference number in all communication with Ahli Bank 
	And user should view the Make Another button 
	And user should view the Share Receipt button 
	And user should view the Download Receipt button 
	And user views the Go to Bill Payments
	Then User Logged out of the system successfully 
	
		
@MB_Payments_TC_093  
Scenario: User views the transaction receipt 
	When user clicks on Burger menu 
	And user clicks the Payments menu 
	And user clicks the More option 
	And user clicks the Top up and Recharge 
	And user selects the Recharge Type 
	And user enters the Mobile Number  
	And user selects the Payment Mode either as AccountCredit Cards 
	And user views the Debit Account Number Credit cards number 
	#And user views the Available Balance 	
	And user selects the value in How much you want to top up  recharge
	And user clicks the confirm Payment screen 
	And user views the review details screen 
	And user verifies the data entered in the previous screen with the review details screen 
	And user enters the OTP 
	And user clicks the submit button 
	And user navigates to confirmation screen 
	Then user should view the Tick symbol for Topup 
	Then user should view the Heading  Your Payment payment amount is successful 
	Then user should view the Label 1 as Please make note of your reference number 
	Then user should view the Transferred From Account Number 
	Then user should view the Paid to 
	Then user should view the Date  Time 
	And user should view the Reference ID 
	And user should view the Label  Please quote the above reference number in all communication with Ahli Bank 
	Then user views the Make another Payments 
	And user clicks the Download option 
	And user  views Transaction receipt 
	Then user should view the Header as Payment Successful 
	#And user should view the Reference ID 
	And user should view the Transaction Type 
	And user should view the Paid To 
	And user should view the Amount 
	And user should view the From Account 
	And user should view the On 
	And user should view the Remarks 
	Then User Logged out of the system successfully 
	
	
	
######Added By Purna 03rd Aug*************************************************************************************************************************************************************************************************
	
	@MB_Payments_TC_017 
	Scenario:
	User views the error message as Please enter <Field name> when mandatory fields are not entered 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user does not enter  the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		Then user should view the error message as Please enter <Field name> 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_018 
	Scenario:
	User views the error message as Biller details are already registered when Existing beneficiary details are given 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the registered Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		Then user should view the error message as Biller details are already registered 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_019 
	Scenario:
	User views the error message as This nick name already exists, please choose another nick name when Existing beneficiary nick name is given 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the registered Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user  enters  the registered Biller Nick Name AN35 
		And user clicks the Save Biller option 
		Then user should view the error message as This nick name already exists, please choose another nick name 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_021 
	Scenario:
	User requests to Resend OTP and re-enters the OTP in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user clicks Resend OTP 
		And enters the OTP re-sent to the registered mobile number 
		And user clicks Submit 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Yay Its done for Add Biller 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		And user should view the Note Please quote the abovereference number in all communication with Ahli Bank 
		And user should view the Add another Biller 
		And user should view the Go To Bill Payments button 
		
		##Delete Biller
#		And user  selects the All Billers section 
#		#And user views the record 
#		And user selects the record for delete
#		And user clicks the delete option  
#		And user views Review screen
#		And user enters ethe OTP 
#		And user clicks the submit button 
#		Then user should view the Tick symbol 
#		And user should view the Heading And Its done Yay Its don for Delete Biller
#		And user should view the Go To Bill Payments button
		##Logged out
		Then User Logged out of the system successfully 
	@MB_Payments_TC_023 
	Scenario:
	User views error message if OTP is not entered in the Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user verifies the data with entered data in the previous screen 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_024 
	Scenario:
	User views error message if invalid  OTP is entered in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user views the review details screen 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_025 
	Scenario:
	User views error message if expired OTP is entered in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_026 
	Scenario:
	User views error message if the wrong OTP is entered thrice in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters wrong OTP thrice 
		Then should view error message as “You have exceeded maximum number of attempts and this transaction has been cancelled Please initiate the transaction again” 
		And user will be navigated to Transfers Workspace Home Page 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_027 
	Scenario:
	User navigates back to the data entry screen from review details screen by clicking the back button 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters OTP 
		And user clicks back button 
		And user should be navigated back to  Add a Biller data entry screen 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_028 
	Scenario:
	User navigates to Add Biller Screen from confirmation screen by clicking pay bills 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters the OTP received to the registered Mobile number 
		And user clicks the submit button 
		And user views the confirmation screen 
		And user should view the Tick symbol 
		And user  views the label Please make note of your reference number 
		And user views the reference ID 
		And user  views the DateTime 
		And user views  the Add another biller 
		And user views  the Go to Bill Payments 
		And user clicks the pay bills Button 
		Then user should be navigated to Add biller page
		
		
#		And user  selects the All Billers section 
#		#And user views the record 
#		And user selects the record for delete
#		And user clicks the delete option  
#		And user views Review screen
#		And user enters the OTP 
#		And user clicks the submit button 
#		Then user should view the Tick symbol 
#		And user should view the Heading And Its done Yay Its done for Delete Biller
#		And user should view the Go To Bill Payments button
		
		Then User Logged out of the system successfully 
	@MB_Payments_TC_029 
	Scenario:
	User navigates to Bill Payments screen from confirmation screen by clicking Go To Bill Payments 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the More option 
		And user clicks the Add a Biller option 
		And user selects the Biller Name AN 50 
		And user enters the Qatari ID AN11 
		And user enters the Utility number  Account number 
		And user enters the Biller Nick Name AN35 
		And user clicks the Save Biller option 
		And user navigates to the review detail screen 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters the OTP received to the registered Mobile number 
		And user clicks the submit button 
		And user views the confirmation screen 
		And user should view the Tick symbol 
		And user  views the label Please make note of your reference number 
		And user views the reference ID 
		And user  views the DateTime 
		And user views  the Add another biller 
		And user views  the Go to Bill Payments 
		And user clicks the Go to Bill Payments button 
		Then user should be navigated to Go to Bill Payments page 
		Then User Logged out of the system successfully 
		
		
	@MB_Payments_TC_030 
	Scenario: User views the Manage Biller landing screen in Payments workspace 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		Then user should view the All Billers Header A 20 
		And user should view the Biller Nick Name in All Biller
		And user should view the UtilityAccount Number AN8 
		And user should navigate back form ManageBiller
		Then User Logged out of the system successfully 
	
	@MB_Payments_TC_033 
	Scenario:
	User navigates to All Billers  Screen from confirmation screen by clicking  Edit  another biller button 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record 
		And user views the Biller Details in Manage Biller details page 
		And user clicks the Edit button 
		And user views the Edit Biller screen 
		And user views the Biller Nick Name which is non editable 
		And user selects the Biller Name 
		And user modifies the UtilityAccount Number 
		And user enters the Qatari ID 
		#And user clicks the submit button 
		 
		And user clicks Next
		And user verifies the details
		And user enters the OTP
		And user clicks the submit button 
		
		Then user should view the Tick symbol
		And user should view the Heading And Its done Yay Its done for Edit Biller
		And user should view the Label1 Please make note of your reference number 
		And user should view the DateTime 
		And user should view the Reference ID 
		And user should view the Transaction Status 
		And user should view the Label 2 Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Edit another biller button 
		And user should view only the Go To Bill Payments button
		
		And user clicks the Edit another biller 
		Then user should navigate to All Biller screen 
		Then User Logged out of the system successfully 
		
	@MB_Payments_TC_034 
	Scenario:
	User navigates to  Bill Payment  Screen from confirmation screen by clicking Go To Bill Payment button 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record 
		And user views the Biller Details in Manage Biller details page 
		And user clicks the Edit button 
		And user views the Edit Biller screen 
		And user views the Biller Nick Name which is non editable 
		And user selects the Biller Name 
		
		And user enters the Qatari ID 
		And user modifies the UtilityAccount Number 
		#And user clicks the submit button 
		And user clicks Next
		And user verifies the details
		And user enters the OTP
		And user clicks the submit button 
		
		
		Then user should view the Tick symbol
		And user should view the Heading And Its done Yay Its done for Edit Biller
		And user should view the Label1 Please make note of your reference number 
		And user should view the DateTime 
		And user should view the Reference ID 
		And user should view the Transaction Status 
		And user should view the Label 2 Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Edit another biller button 
		And user should view only the Go To Bill Payments button 
		
		 
		And user clicks the Go To Bill Payments 
		Then user should navigate to Bill Payment screen 
		Then User Logged out of the system successfully 
		
	@MB_Payments_TC_037 
	Scenario:
	User navigates to All Billers  Screen from confirmation screen by clicking  delete 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete
		And user views the Manage Biller details screen
		And user clicks the delete option
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views the UtilityAccount Number 
		And user views  the Qatari ID 
		And user enters the OTP
		And user clicks the submit button 
		Then user should view the Tick symbol
		
		And user should view the Heading And Its done Yay Its done for Delete Biller
	    And user should view the Go To Bill Payments button
		Then User Logged out of the system successfully 
		
	@MB_Payments_TC_038 
	Scenario:
	User navigates to  Bill Payment  Screen from confirmation screen by clicking Go To Bill Payment button 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section
		And user views the record 
		And user selects the record for delete
		And user views the Manage Biller details screen
		And user clicks the delete option 
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views  the Utility Account Number 
		And user views  the Qatari ID 
		And user enters the OTP
		And user clicks the submit button 
		Then user should view the Tick symbol
		
		And user should view the Heading And Its done Yay Its done for Delete Biller
	    And user should view the Go To Bill Payments button
		Then User Logged out of the system successfully
		
	@MB_Payments_TC_041 
	Scenario:
	User views error message if OTP is not entered in the Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete
		And user views the Manage Biller details screen 
		And user clicks the delete option 
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views the UtilityAccount Number 
		And user views  the Qatari ID 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_042 
	Scenario:
	User views error message if invalid  OTP is entered in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete 
		And user views the Manage Biller details screen 
		And user clicks the delete option 
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views the UtilityAccount Number 
		And user views  the Qatari ID 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_043 
	Scenario:
	User views error message if expired OTP is entered in Add a Biller Pre confirmation screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete
		And user views the Manage Biller details screen 
		And user clicks the delete option 
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views the UtilityAccount Number 
		And user views  the Qatari ID 
		And user verifies the Biller Name 
		And user verifies the Account NumberUtility Number 
		And user verifies the Biller Nick Name 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_044 
	Scenario: 
		User views error message if the wrong OTP is entered thrice in Add a Biller Pre confirmation screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete 
		And user views the Manage Biller details screen 
		And user clicks the delete option 
		And user views the Biller Nick Name which is non editable 
		And user Views the Biller Name 
		And user views the UtilityAccount Number 
		And user views  the Qatari ID 
		And user enters wrong OTP thrice
		Then should view error message as “You have exceeded maximum number of attempts and this transaction has been cancelled Please initiate the transaction again” 
		And user will be navigated to Transfers Workspace Home Page 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_045 
	Scenario: User Navigates to Bill Payments screen from Manage Biller Details Page 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record
		And user selects the record
		And user views the Edit Biller screen 
		And user clicks the Back option
		Then user should be navigated to All Billers Screen  
		Then User Logged out of the system successfully 
	@MB_Payments_TC_046 
	Scenario: User Navigates to All Billers screen from Manage Biller Details Page 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user  selects the All Billers section 
		And user views the record 
		And user selects the record for delete
		And user views the Manage Biller details screen 
		And user clicks the Back option
		Then user should be navigated to All Billers Screen 
		Then User Logged out of the system successfully 
		
		
	@MB_Payments_TC_050 
	Scenario:
	User Pays a bills via pay bill option in Payments workspace using Auto Pay option 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the Account Number 
		And user selects  the Bill Amount as  Other Amount 
		And user enters the amount in Other Amount field 
		And user selects  the Payment Mode as Credit Cards 
		And user views the card type 
		And user views the  Card status 
		And user views the Card number 
		And user views the Card type 
		And user views the Available limit 
		And user selects the When would you like to make this payment as Auto Pay 
		And user views payment Date  due date will be defaulted 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should navigate to confirmation screen 
		And user should view the Tick symbol for Pay Bills 
		And user should view the successful Note Yay It's done 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Make another Payments 
		And user should view the Go To Bill Payments 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_051 
	Scenario:
	User should view the Service Connection Amount and Deposit Amount getting enabled when biller is selected as Kahramaa” in Pay bill screen 
				
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user selects the biller as Kahramaa” 
		Then user should view the Service Connection Amount and Deposit Amount fields are getting enabled in Bill Amount section 
		Then User Logged out of the system successfully 
		
	@MB_Payments_TC_052 
	Scenario: User views the error message as Please enter the <Field name> When mandatory fields are not given in Pay bill input screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user does not select  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		#And user clicks the confirm Payment
		And user clicks the confirm Payment Ten user should view the error message as Please enter the <Field name> 
		Then User Logged out of the system successfully 
		
	@MB_Payments_TC_054 
	Scenario:
	User requests to Resend OTP and re-enters the OTP in Pay Bills Review details screen 
		
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user clicks Resend OTP 
		And enters the OTP re-sent to the registered mobile number 
		And user clicks Submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol for Pay Bills
		And user should view the successful Note Yay It's done 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Add another Biller 
		And user should view the Go To Bill Payments 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_055 
	Scenario: 
		User requests Resend OTP for more than three times in Pay Bills Review details screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user clicks Resend OTP more than thrice with each attempt in a 30 second interval 
		Then user should not be allowed to request for OTP as Resend OTP will be disabled and the transaction will be cancelled 
		And user views error message as “You have exceeded the maximum number of attempts and this transaction has been cancelled 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_056 
	Scenario:
	User views error message if OTP is not entered in the Pay Bills Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_057 
	Scenario:
	User views error message if invalid  OTP is entered in Add a Biller Pre confirmation screen Pay Bills Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_058 
	Scenario:
	User views error message if expired OTP is entered in Pay Bills Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_059 
	Scenario: 
		User views error message if the wrong OTP is entered thrice in Pay Bills Review details screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user enters wrong OTP thrice 
		Then should view error message as “You have exceeded maximum number of attempts and this transaction has been cancelled Please initiate the transaction again” 
		#And user will be navigated to Transfers Workspace Home Page 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_060 
	Scenario:
	User navigates to Pay bill screen by clicking the Make Another Payment screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user vies the Biller Icon 
		#And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Bills 
		And user enters the OTP 
		And user clicks the submit button 
		And user navigates to confirmation screen 
		And user  views the Tick symbol for Pay Bills 
		And user views the successful Note Yay It's done 
		And user views the note Please make note of your reference number 
		And user views the DataTime 
		And user views the Reference ID 
		And user views the Transaction status Processed successfully 
		And user views the Note Please quote the above reference number in all communication with Ahli Bank 
		And user views the Make another Payments 
		And user views the Go To Bill Payments 
		And user clicks the Make another Payments 
		Then user should be navigated tope  Bill screen 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_067 
	Scenario:
	User Pays a biller via pay a biller option in Payments workspace using Auto Pay option 
		 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the Account Number 
		And user selects  the Bill Amount as  Other Amount 
		And user enters the amount in Other Amount field 
		And user selects  the Payment Mode as Credit Cards 
		And user views the card type 
		And user views the  Card status 
		And user views the Card number 
		And user views the Card type 
		And user views the Available limit 
		And user selects the When would you like to make this payment as Auto Pay 
		And user views payment Date  due date will be defaulted 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should navigate to confirmation screen 
		And user should view the Tick symbol for Pay a Biller 
		And user should view the successful Note Yay Its done for Pay a Biller 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Make another Payments 
		And user should view the Go To Bill Payments 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_068 
	Scenario:
	User should view the Service Connection Amount and Deposit Amount getting enabled when biller is selected as Kahramaa” in Pay bill screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user clicks the Pay bills option 
		And user selects the biller as Kahramaa” 
		Then user should view the Service Connection Amount and Deposit Amount fields are getting enabled in Bill Amount section 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_069 
	Scenario: User views the error message as Please enter the <Field name> When mandatory fields are not given in Pay bill input screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user does not select  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		Then user should view the error message as Please enter the <Field name> 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_071 
	Scenario:
	User requests to Resend OTP and re-enters the OTP in Pay a Biller Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user clicks Resend OTP 
		And enters the OTP re-sent to the registered mobile number 
		And user clicks Submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol for Pay a Biller 
		And user should view the successful Note Yay Its done for Pay a Biller 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		And user should view the Note Please quote the above reference number in all communication with Ahli Bank 
		And user should view the Add another Biller 
		And user should view the Go To Bill Payments 
		And data matches with the coreMysys 
	@MB_Payments_TC_072 
	Scenario: 
		User requests Resend OTP for more than three times in Pay a Biller Review details screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen And user clicks the Pay bills option 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user clicks Resend OTP more than thrice with each attempt in a 30 second interval 
		Then user should not be allowed to request for OTP as Resend OTP will be disabled and the transaction will be cancelled 
		And user views error message as “You have exceeded the maximum number of attempts and this transaction has been cancelled 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_073 
	Scenario:
	User views error message if OTP is not entered in the Pay a Biller Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_074 
	Scenario:
	User views error message if invalid  OTP is entered in Pay a Biller Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_075 
	Scenario:
	User views error message if expired OTP is entered in Pay a Biller Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay bills option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_076 
	Scenario: 
		User views error message if the wrong OTP is entered thrice in Pay  a Biller Review details screen
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller
		And user enters wrong OTP thrice 
		Then should view error message as “You have exceeded maximum number of attempts and this transaction has been cancelled Please initiate the transaction again” 
		And user will be navigated to Transfers Workspace Home Page 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_077 
	Scenario:
	User navigates to Pay bill screen by clicking the Make Another Payment screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should navigate to confirmation screen 
		And user should view the Tick symbol for Pay a Biller 
		And user should view the successful Note Yay Its done for Pay a Biller 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		
		And user views the Note Please quote the above reference number in all communication with Ahli Bank 
		And user views the Make another Payments 
		And user views the Go To Bill Payments 
		And user clicks the Make another Payments 
		Then user should be navigated tope  Bill screen 
		Then User Logged out of the system successfully 
	@MB_Payments_TC_078 
	Scenario:
	User navigates to Bill Payments  screen by clicking the Go To Bill Payments  screen 
		 
		When user clicks on Burger menu 
		And user clicks the Payments menu 
		And user clicks the more option 
		And user clicks the Pay a biller option 
		And user selects the Biller Name 
		And user enters the Qatari ID 
		And user UtilityAccount Number 
		#And user enters the Biller Nick Name 
		And user clicks the Proceed button 
		And user views the Bill Payment Screen 
		And user vies the Biller Icon 
		And user views the  Biller Nick Name 
		#And user views the UtilityAccount Number 
		And user selects  the Bill Amount as Bill Amount Other Amount 
		And user selects  the Payment Mode as AccountsCredit Cards 
		And user views the Account Type card type 
		And user views the Account Status  Card status 
		And user views the Account Number  Card number 
		And user views the Account Name  Card type 
		And user views the Available Balance  Available limit 
		And user selects the When would you like to make this payment as either Now Later and Auto pay 
		And user views the Payment date If later is selected as Payment option 
		And user enters the remarks 
		And views the Fee field 
		And user clicks the confirm Payment 
		And user views the review details screen 
		And user verifies the data entered in the previous screen with the review details screen for Pay Biller 
		
		And user enters the OTP 
		And user clicks the submit button 
		Then user should navigate to confirmation screen 
		And user should view the Tick symbol for Pay a Biller 
		And user should view the successful Note Yay Its done for Pay a Biller 
		And user should view the note Please make note of your reference number 
		And user should view the DataTime 
		And user should view the Reference ID 
		And user should view the Transaction status Processed successfully 
		
		And user views the Note Please quote the above reference number in all communication with Ahli Bank 
		And user views the Make another Payments 
		And user views the Go To Bill Payments 
		And user clicks the Go To Bill Payments 
		Then user should be navigated to Bill Payments screen 
		Then User Logged out of the system successfully 
		
     
     