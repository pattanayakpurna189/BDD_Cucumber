@tag 
Feature: Automation testing scenarios for Transfers module - feature file 1 
Background: 
	Given user logged in with valid credentials in MB and landed in Home screen
	
	
	
@MB_Transfers_220 
Scenario: User transfers the cross currency  amount to Local Bank Beneficiary in send money screen using Pay Now 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
	And user views the Beneficiary Photo for local bank  
	Then user views the Debit From
	And user views theAccount Type
	Then user views the Account Number
	And user views the Account Holder Name
	And user views the Available Balance
	And user views the Transfer Currency defaulted based on the selected debit account currency
	And user enters the transfer amount in How much would you like to send 
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount
	And user selects the payment option  as Pay now 
	Then user views the Payment Date auto populated with current date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Local Bank Transfer 
	And user verifies the Heading Send to Beneficiary Nick Name 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From
	And user verifies theAccount Type
	And user verifies the Account Number 
	And user verifies the Account Holder Name 
	And user verifies the Available Balance 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency 
	And user verifies  the entered transfer amount in How much would you like to send
	And user verifies the Exchange Rate between debit account currency and transfer currency 
	And user verifies the Converted Amount
	And user verifies payment option as Pay Now 
	Then user verifies the Payment Date auto populated with current date 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB
	And user should view the Transferred To LB
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Save as Favourite Button 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
	
	
@MB_Transfers_240 
Scenario: User views the successful transaction for Local Bank Transfer with Pay Now option is getting updated in Transfer History 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
	And user views the Beneficiary Photo for local bank  
	Then user views the Debit From 
	Then user views theAccount Type 
	Then user views the Account Number
	And user views the Account Holder Name 
	And user views the Available Balance
	And user views the Transfer Currency defaulted based on the selected debit account currency
	And user enters the transfer amount in How much would you like to send 
	And user selects payment option as Pay Now 
	Then user views the Payment Date auto populated with current date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Local Bank Transfer 
	And user verifies the Heading Send to Beneficiary Nick Name
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From
	And user verifies theAccount Type
	And user verifies the Account Number
	And user verifies the Account Holder Name
	And user verifies the Available Balance
	And user verifies the Transfer Currency defaulted based on the selected debit account currency 
	And user verifies  the entered transfer amount in How much would you like to send 
	And user verifies payment option as Pay Now 
	Then user verifies the Payment Date auto populated with current date 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	And user navigates to the Confirmation screen 
	And user views the Tick symbol 
	And user views the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB
	And user views the Beneficiary Nick Name 
	And user views the Reference ID 
	And user views the Date  Time 
	Then user views the Send more Money Button 
	Then user views the Take me to Dashboard 
	Then user views the Save as Favourite Button 
	Then user views the Download Receipt 
	Then user views the Share Receipt Button 
	And user clicks send more money button 
	And user clicks the more option 
	And user clicks the Transaction History 
	Then user should view the successful Transaction of own Account TransferPay now in Transaction history list 
	Then User Logged out of the system successfully
	
	
		
@MB_Transfers_241 
Scenario: User views the successful transaction for Local Bank Transfer with Pay Later option is getting updated in Schedule Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
	And user views the Beneficiary Photo for local bank  
	And user views the Debit From
	And user views theAccount Type
	And user views the Account Number
	And user views the Account Holder Name 
	And user views the Available Balance
	And user views the Transfer Currency defaulted based on the selected debit account currency 
	And user enters the transfer amount in How much would you like to send
	And user selects payment option as Pay Later 
	And user views the Payment Date auto populated with Tomorrows Date 
	And user views the Reminder Date field getting auto populated LB 
	And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date  where x is less than 30
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Local Bank Transfer 
	And user verifies the Heading Send to Beneficiary Nick Name 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From
	And user verifies theAccount Type 
	And user verifies the Account Number
	And user verifies the Account Holder Name
	And user verifies the Available Balance
	And user verifies the Transfer Currency defaulted based on the selected debit account currency
	And user verifies  the entered transfer amount in How much would you like to send 
	And user verifies payment option as Pay Later 
	And user verifies the Payment Date auto populated with Tomorrows Date 
	And user verifies the reminder date Ie I would like to receive a reminder x days before Payment Date  where x is less than 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	Then user navigates to the Confirmation screen 
	And user views the Tick symbol 
	And user views the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB 
	Then user views the reference ID 
	Then user views the Date and time 
	Then user views the Send more Money Button 
	Then user views the Take me to Dashboard 
	Then user views the Save as Favourite Button 
	Then user views the Download Receipt 
	Then user views the Share Receipt Button 
	And clicks the send more money button 
	Then user clicks the more option 
	And user clicks the Schedule Transfer 
	Then user should view the successful Transaction of own Account Transfer Pay Later  in Schedule Transfer list 
	Then User Logged out of the system successfully 
	
	
	
@MB_Transfers_249 
Scenario: user transfer money to the International Beneficiary via International Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	Then user clicks the within International Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name International AN40 
	And user views the Beneficiary Photo for International 
	Then user views the Beneficiary First Name 
	And user views the Beneficiary Middle Name 
	And user views the Beneficiary Last Name 
	And user views the Bank Name 
	And user selects the Pay FromOther Currency Account
	And user viewAccount Type
	Then user views the Account Number 
	And user views the Account Holder Name 
	And user views the Available Balance
	And user selects Routing Mode either as Swift Transfer or Remit To India 
	And user selects Transfer Currency 
	And user enters the transfer amount in How much would you like to send
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount 
	And user selects When would you like to do this either as Pay Now Pay Later And Recurring 
	And user views Payments Date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user selects Who should pay the charges either as our share and ben 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name
	And user verifies the Beneficiary Photo 
	And user verifies the Beneficiary First Name 
	And user verifies the Beneficiary Middle Name 
	And user verifies the Beneficiary Last Name 
	And user verifies the Bank Name 
	And user verifies the pay From 
	And user verifies theAccount Type 
	And user verifies the Account Number
	And user verifies the Account Holder Name 
	And user verifies the Available Balance 
	And user verifies the Routing Option 
	And user selected the Transfer Currency 
	And user verifies  the entered transfer amount in How much would you like to send
	And user verifies the Exchange Rate between debit account currency and transfer currency 
	And user verifies the Converted Amount
	And user verifies the Payment option 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies Who should pay the charges either as our share and ben 
	And user verifies the fee 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB
	And user should view the Transferred To LB 
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Save as Favourite Button 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
@MB_Transfers_250 
Scenario: user transfer money to the International Beneficiary via International Transfer by selecting SWIFT Transfer Option  pay now option and Who should pay the charges as Our 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	Then user clicks the within International Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name International AN40 
	And user views the Beneficiary Photo for International 
	Then user views the Beneficiary First Name 
	And user views the Beneficiary Middle Name 
	And user views the Beneficiary Last Name 
	And user views the Bank Name 
	And user selects the Pay FromOther Currency Account
	And user viewAccount Type
	Then user views the Account Number
	And user views the Account Holder Name
	And user views the Available Balance 
	And user selects Routing Mode  as Swift Transfer 
	And user view the static info Transfer in 3 days 
	And user selects Transfer Currency 
	And user enters the transfer amount in How much would you like to send
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount 
	And user selects When would you like to do this either as Pay Now 
	And user views Payments Date as Current Date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user selects Who should pay the charges  as Our 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name 
	And user verifies the Beneficiary Photo 
	And user verifies the Beneficiary First Name 
	And user verifies the Beneficiary Middle Name 
	And user verifies the Beneficiary Last Name 
	And user verifies the Bank Name 
	And user verifies the pay From 
	And user verifies theAccount Type 
	And user verifies the Account Number
	And user verifies the Account Holder Name 
	And user verifies the Available Balance 
	And user verifies the Routing Option 
	And user selected the Transfer Currency 
	And user verifies  the entered transfer amount in How much would you like to send
	And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
	And user verifies the Converted Amount A3 N213 
	And user verifies the Payment option 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies Who should pay the charges 
	And user verifies the Fee 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB 
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Save as Favourite Button 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
	
@MB_Transfers_257 
Scenario: user transfer money to the International Beneficiary via International Transfer by selecting Remit to India Option  pay now option and Who should pay the charges as Our 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	Then user clicks the within International Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name International AN40 
	And user views the Beneficiary Photo for International 
	Then user views the Beneficiary First Name 
	And user views the Beneficiary Middle Name 
	And user views the Beneficiary Last Name 
	And user views the Bank Name 
	And user selects the Pay FromOther Currency Account
	And user viewAccount Type 
	Then user views the Account Number 
	And user views the Account Holder Name 
	And user views the Available Balance
	And user selects Routing Mode  as Remit To India 
	And user view the static info Transfer in 2 days 
	And user selects Transfer Currency 
	And user enters the transfer amount in How much would you like to send
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount 
	And user selects When would you like to do this either as Pay Now 
	And user views Payments Date as Current Date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user selects Who should pay the charges  as Our 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name
	And user verifies the Beneficiary Photo 
	And user verifies the Beneficiary First Name 
	And user verifies the Beneficiary Middle Name 
	And user verifies the Beneficiary Last Name 
	And user verifies the Bank Name 
	And user verifies the pay From
	And user verifies theAccount Type 
	And user verifies the Account Number
	And user verifies the Account Holder Name 
	And user verifies the Available Balance 
	And user verifies the Routing Option 
	And user verifies the Transfer Currency 
	And user verifies  the entered transfer amount in How much would you like to send
	And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
	And user verifies the Converted Amount A3 N213 
	And user verifies the Payment option 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies Who should pay the charges 
	And user verifies the Fee 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Save as Favourite Button 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
	
	
@MB_Transfers_284 
Scenario: User saves  the transaction to the Favourites transfer list 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the more option 
	And user clicks the send Money option 
	Then user clicks the within International Beneficiary from the saved Beneficiary list 
	Then user views the Heading Send to Beneficiary Nick Name 
	Then user views the Beneficiary Photo 
	Then user views the Beneficiary First Name 
	And user views the Beneficiary Middle Name 
	And user views the Beneficiary Last Name 
	And user views the Bank Name 
	And user selects the Pay FromOther Currency Account
	And user viewAccount Type 
	Then user views the Account Number
	And user views the Account Holder Name
	And user views the Available Balance
	And user selects Routing Mode either as Swift Transfer or Remit To India 
	And user selects Transfer Currency 
	And user enters the transfer amount in How much would you like to send 
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount 
	And user selects When would you like to do this either as Pay Now Pay Later And Recurring 
	And user views Payments Date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user selects Who should pay the charges either as our share and ben 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	And user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name
	And user verifies the Beneficiary Photo 
	And user verifies the Beneficiary First Name 
	And user verifies the Beneficiary Middle Name 
	And user verifies the Beneficiary Last Name 
	And user verifies the Bank Name 
	And user verifies the pay From
	And user verifies theAccount Type
	And user verifies the Account Number
	And user verifies the Account Holder Name 
	And user verifies the Available Balance 
	And user verifies the Routing Option 
	And user selected the Transfer Currency 
	And user verifies  the entered transfer amount in How much would you like to send 
	And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
	And user verifies the Converted Amount A3 N213 
	And user verifies the Payment option 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies Who should pay the charges either as our share and ben 
	And user verifies  the Terms and Conditions 
	And user enters the OTP 
	And user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB
	And user views the reference ID 
	And user views the Date and time 
	And user views the Send more Money Button 
	And user views the Take me to Dashboard 
	And user views the Save as Favourite Button 
	And user views the Download Receipt 
	And user views the Share Receipt Button 
	And user clicks the Save as Favourite Button 
	Then user should view the transaction in Favourite Transaction list 
	Then User Logged out of the system successfully 
	
	
	
@MB_Transfers_286 
Scenario: User views the successful transaction for International Transfer with Pay Now option is getting updated in Transfer History 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the more option 
	And user clicks the send Money option 
	Then user clicks the within International Beneficiary from the saved Beneficiary list 
	And user views the Heading: Send to Beneficiary Nick Name International AN40 
	And user views the Beneficiary Photo for International
	Then user views the Beneficiary First Name 
	And user views the Beneficiary Middle Name 
	And user views the Beneficiary Last Name 
	And user views the Bank Name 
	And user selects the Pay FromOther Currency Account
	And user viewAccount Type
	Then user views the Account Number
	And user views the Account Holder Name 
	And user views the Available Balance
	And user selects Routing Mode either as Swift Transfer or Remit To India 
	And user selects Transfer Currency 
	And user enters the transfer amount in How much would you like to send 
	And user views the Exchange Rate between debit account currency and transfer currency 
	And user views the Converted Amount
	And user selects When would you like to do this either as Pay Now Pay Later And Recurring 
	And user views Payments Date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user selects Who should pay the charges either as our share and ben 
	And user ticks the Terms and Conditions 
	And user views the Notes 
	And user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name
	And user verifies the Beneficiary Photo 
	And user verifies the Beneficiary First Name 
	And user verifies the Beneficiary Middle Name 
	And user verifies the Beneficiary Last Name 
	And user verifies the Bank Name 
	And user verifies the pay From 
	And user verifies theAccount Type 
	And user verifies the Account Number
	And user verifies the Account Holder Name
	And user verifies the Available Balance
	And user verifies the Routing Option 
	And user verifies the Transfer Currency 
	And user verifies  the entered transfer amount in How much would you like to send
	And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
	And user verifies the Converted Amount A3 N213
	And user verifies the Payment option 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies Who should pay the charges either as our share and ben 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	And user clicks the submit button 
	And user navigates to the Confirmation screen 
	And user views the Tick symbol 
	And user views the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user views  the Transferred From LB 
	And user views the Transferred To LB
	And user views the Beneficiary Nick Name 
	And user views the Reference ID 
	And user views the Date  Time 
	And user views the Send more Money Button 
	And user views the Take me to Dashboard 
	And user views the Save as Favourite Button 
	And user views the Download Receipt 
	And user views the Share Receipt Button 
	And clicks the send more money button 
	And user clicks the more option 
	And user clicks the Schedule Transfer 
	Then user should view the successful Transaction of own Account Transfer Pay Later  in Schedule Transfer list 
	Then User Logged out of the system successfully 
	
	
	
@MB_Transfers_296 
Scenario: User Views the successful transaction for adding a Adhoc beneficiary for within bank transfer Type 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks more option 
	And user clicks the send money option 
	And user selects transfer type as Within Bank 
	And user enters the Account Number in Account Number field 
	And user reenters the Account umber in Confirm Beneficiary Account Number 
	And user  views the currency being auto populated based on the entered account Number 
	Then user views the Beneficiary First Name being auto populated  from the mysys based on the entered account number 
	And user views the Beneficiary middle name being auto populated from the mysys based on the entered account number 
	And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
	Then user views the Beneficiary First Name being auto populated in Beneficiary Nick name field 
	And user modifies the Beneficiary Nick Name if needed 
	And uploads the beneficiary photo in the Upload beneficiary field 
	And clicks the Register Beneficiary option 
	And User views the Notes 
	And User clicks the Next Button 
	And User navigates to the review details screen 
	And user verifies the  transfer type selected  entered in data entry screen 
	And user verifies the Beneficiary Account Number  entered in data entry screen 
	And user verifies the Currency entered in data entry screen 
	And user verifies the Beneficiary First name populated in the data entry screen 
	And user verifies the Beneficiary Middle Name populated in the data entry screen 
	And user verifies the Beneficiary Last Name populated in the data entry screen 
	And user verifies the Beneficiary Nick Name entered in the data entry screen 
	And user verifies the profile image uploaded in the data entry screen 
	And user enters the OTP received to the registered Mobile number 
	And user clicks the submit button 
	Then user should be navigated to confirmation screen 
	And user should view the Tick symbol 
	And user should view the Transaction status as Beneficiary has been successfully added 
	And user should view the label Please make note of your reference number 
	And user should view the reference ID 
	And user should view the Beneficiary Nick Name 
	And user should view the Transfer Type 
	And user should view the DateTime 
	And user should view the GO TO TRANSFER LANDING PAGE Button 
	And user should view the ADD ANOTHER BENEFICIARY button 
	Then User Logged out of the system successfully 
	
	
		
@MB_Transfers_311 
Scenario: User Edits the Scheduled transfer details such as  Transfer Currency Transfer Amount and Payment Date  in  Schedule Edit Screen 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks more option 
	And user clicks the schedule transfer 
	And  user views the Schedule Transfer list 
	And user views the Beneficiary Nick Name field 
	And user views the Payment Type field 
	And user views the Reference Number field 
	And user views the value date 
	And user views the Amount field 
	And user clicks the record 
	And user navigates to Scheduled Transfer View screen 
	And user clicks the Edit button 
	And user Edits either Transfer currency Transfer amount and Payment Date 
	And clicks the next button 
	And user views the review details screen 
	And user verifies the data with entered data in the previous screen 
	And user enters the OTP 
	And user clicks the submit button 
	Then user should view the confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your transaction is processed successfully 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Take me to Dashboard scheduled 
	Then User Logged out of the system successfully 
	
	
@MB_Transfers_334 
Scenario: User Edits the Manage Standing Instructions details such as frequency No of Payments  in  Schedule Edit Screen 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks more option 
	And user clicks the Manage Standing Instruction 
	And user selects the Debit Account Number 
	And user clicks the show 
	And user views the list of record 
	And user clicks the record 
	And user navigates to Manage Standing Instructions View screen 
	And user clicks the Edit button 
	And user Edits either frequency No of Payments 
	And clicks the next button 
	And user views the review details screen 
	And user verifies the data with entered data in the previous screen 
	And user enters the OTP 
	And user clicks the submit button 
	Then user should view the confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your transaction is processed successfully 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	Then User Logged out of the system successfully 
	
	
		
@MB_Transfers_352 
Scenario: User views the Payments and Transfer Details 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks more option 
	And user clicks the Transfers and Payments history 
	And user selects the Transfer Type 
	And selects the From date and To date 
	And user clicks search 
	Then user should view the Reference No 
	And user should view the Beneficiary Name 
	And user should view the Transaction Type 
	And user should view the Execution Date 
	And user should view the Transaction Amount 
	And user should view the Transaction status 
	Then User Logged out of the system successfully 
	
	
	
	
	##Added BY Purna 05th Aug  *******************************************************************************************************************************************************************************
	
		
	@MB_Transfers_020 
	Scenario: User views the error message Account Number and Confirm Account 
		Number is mis-match  when different account numbers are entered in account number and confirm account number field
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the different Account Number in Confirm Beneficiary Account Number 
		Then user should view the error message as Account Number and Confirm Account Number is mis-match 
		Then User Logged out of the system successfully 
	@MB_Transfers_021 
	Scenario:
	User views the error message The account number you have entered is invalid  when  invalid account numbers is entered in account number 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Invalid Account Number in Account Number field 
		Then user should view the error message as The account number you have entered is invalid 
		Then User Logged out of the system successfully 
	@MB_Transfers_024 
	Scenario: User views the error message as  This beneficiary Nickname 
		provided is already in use Please provide a different nickname when existing beneficiary name is given in add beneficiary data entry screen
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary middle name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user enters the Existing Beneficiary Nick Name 
		And uploads the valid beneficiary photo in upload beneficiary photo field 
		And user clicks the create beneficiary button 
		Then user should view the error message as This beneficiary Nickname provided is already in use Please provide a different nickname 
		Then User Logged out of the system successfully 
	@MB_Transfers_026 
	Scenario: User views the error message as You seem to 
		have already added this Beneficiary's account details when user tries to add the existing beneficiary
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Existing Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number1 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account numberi 
		And user views the Beneficiary middle name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary First Name being auto populated in the beneficiary nick name1 
		And user modifies the beneficiary Nick name1 
		And uploads the valid beneficiary photo in upload beneficiary photo field 
		And user clicks the create beneficiary buttons 
		Then user should view the error message as  You seem to have already added this Beneficiary's account details 
		Then User Logged out of the system successfully
		
	@MB_Transfers_027 
	Scenario:
	User requests to Resend OTP and re-enters the OTP in Add a New beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user waits for 30 second to get resend button enabled 
		And user clicks Resend OTP 
		And enters the OTP re-sent to the registered mobile number 
		And user clicks Submit 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Beneficiary has been successfully added 
		And user should view the label Please make note of your reference number 
		And user should view the reference ID 
		And user should view the Beneficiary Nick Name for Add Beneficiary
		And user should view the Transfer Type 
		And user should view the DateTime 
		And user should view the GO TO TRANSFER LANDING PAGE Button 
		And user should view the ADD ANOTHER BENEFICIARY button 
		Then User Logged out of the system successfully 
	@MB_Transfers_028 
	Scenario:
	User requests Resend OTP for more than three times in Add a New beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB 
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user clicks Resend OTP more than thrice with each attempt in a 30 second interval 
		Then user should not be allowed to request for OTP as Resend OTP will be disabled and the transaction will be cancelled 
		And user should view error message as “You have exceeded the maximum number of attempts and this transaction has been cancelled 
		Then User Logged out of the system successfully 
	@MB_Transfers_029 
	Scenario:
	User views error message if OTP is not entered in the pre confirmation screen  in Add a New beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB 
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Transfers_030 
	Scenario:
	User views error message if invalid  OTP is entered in Add a New Beneficiary review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB 
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Transfers_031 
	Scenario:
	User views error message if expired OTP is entered in Add a New beneficiary  review details 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB 
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired
		Then User Logged out of the system successfully 
	@MB_Transfers_032 
	Scenario:
	User views error message if the wrong OTP is entered thrice in Add a New Beneficiary Review Details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the Add A New Beneficiary button 
		And user views the header as Add Beneficiary 
		And user selects transfer type as Within Bank 
		And user enters the Account Number in Account Number field 
		And user reenters the Account umber in Confirm Beneficiary Account Number 
		And user  views the currency being auto populated based on the entered account Number 
		And user views the Beneficiary first name being auto populated  from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary Last name being auto populated from the mysys based on the entered account number 
		And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
		And user modifies the Beneficiary Nick Name if needed 
		And uploads the beneficiary photo in the Upload beneficiary field 
		Then user views the Notes AB 
		And User clicks the Create Beneficiary Button 
		And User navigates to the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user verifies the details entered in data input screen with the review details screen 
		And user enters wrong OTP thrice 
		Then should view error message as “You have exceeded maximum number of attempts and this transaction has been cancelled Please initiate the transaction again” 
		And user will be navigated to Transfers Workspace Home Page 
		Then User Logged out of the system successfully 
		
	@MB_Transfers_093 
	Scenario: User clicks the cancel button in delete beneficiary alert popup 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details cancel 
		And  user  views the view beneficiary screen cancel 
		And user views the beneficiary details cancel 
		And user clicks the record which has to be deleted 
		And user clicks the view the beneficiary details in view beneficiary screen 
		And user clicks the delete button cancel 
		And user views the Deleting a beneficiary will not delete the corresponding future value dated transactions and standing instructions Once Beneficiary Beneficiary nick name will be deleted it cannot be reverted Would you like to proceed  Alert message 
		And user clicks the cancel button 
		Then user should be navigated to  the view beneficiary screen 
		Then User Logged out of the system successfully 
		
		
		
	@MB_Transfers_094 
	Scenario:
	User Edits Within Bank  Beneficiary via Manage Beneficiary business functions  in Transfers workspace 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user  views  the Beneficiary Account Number  entered in data entry screen 
		And user views  the Currency entered in data entry screen 
		And user  views  the Beneficiary First name populated 
		Then user views the Beneficiary Middle Name
		And user  views  the Beneficiary Last Name populated 
		And user views  the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field within
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters the OTP received to the registered Mobile number 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Beneficiary has been successfully modified 
		And user should view the label Please make note of your reference number 
		And user should view the reference ID 
		And user should view the Beneficiary Nick Name for Modify Beneficiary
		And user should view the Transfer Type 
		And user should view the DateTime 
		And user should view the GO TO TRANSFER LANDING PAGE Button 
		And user should view the ADD ANOTHER BENEFICIARY button 
		Then User Logged out of the system successfully 
	@MB_Transfers_100 
	Scenario:
	User views error message if OTP is not entered in the pre confirmation screen  in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user  views  the Beneficiary Account Number  entered in data entry screen 
		And user views  the Currency entered in data entry screen 
		And user  views  the Beneficiary First name populated 
		Then user views the Beneficiary Middle Name
		And user  views  the Beneficiary Last Name populated 
		And user views  the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field within 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user clicks Submit button without entering the OTP 
		Then user should view the error message as “OTP is mandatory” 
		Then User Logged out of the system successfully 
	@MB_Transfers_101 
	Scenario:
	User views error message if invalid  OTP is entered  in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit 
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user  views  the Beneficiary Account Number  entered in data entry screen 
		And user views  the Currency entered in data entry screen 
		And user  views  the Beneficiary First name populated 
		Then user views the Beneficiary Middle Name
		And user  views  the Beneficiary Last Name populated 
		And user views  the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field within 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary Account Number  entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Transfers_106 
	Scenario:
	User Edits Domestic  Beneficiary via Manage Beneficiary business functions  in Transfers workspace 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user verifies the  transfer type 
		And user views  the Beneficiary IBAN number 
		And user views the Transfer Currency  
		And user views the Bank name 
		And user  views  the Beneficiary First name populated 
		And user views the Beneficiary Middle Name 
		And user views the Beneficiary Last Name 
		And user views the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary IBAN number entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters the OTP received to the registered Mobile number 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Beneficiary has been successfully modified 
		And user should view the label Please make note of your reference number 
		And user should view the reference ID 
		And user should view the Beneficiary Nick Name for Modify Beneficiary
		And user should view the Transfer Type 
		And user should view the DateTime 
		And user should view the GO TO TRANSFER LANDING PAGE Button 
		And user should view the ADD ANOTHER BENEFICIARY button 
		Then User Logged out of the system successfully 
	@MB_Transfers_113 
	Scenario:
	User views error message if invalid  OTP is entered  in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user views  the Beneficiary IBAN number 
		And user views the Transfer Currency
		And user views the Bank name 
		And user  views  the Beneficiary First name populated 
		Then user views the Beneficiary Middle Name
		And user  views  the Beneficiary Last Name populated 
		And user views  the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary IBAN number entered in data entry screen 
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Transfers_114 
	Scenario:
	User views error message if expired OTP is entered in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user views  the Beneficiary IBAN number 
		And user views the Transfer Currency
		And user views the Bank name 
		And user  views  the Beneficiary First name populated 
		Then user views the Beneficiary Middle Name
		And user  views  the Beneficiary Last Name populated 
		And user views  the Beneficiary Nick Name 
		And user views the profile image 
		And user edits  any field Except the Nick Name field 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the  transfer type selected  entered in data entry screen 
		And user verifies the Beneficiary IBAN number entered in data entry screen
		And user verifies the Currency entered in data entry screen 
		And user verifies the Beneficiary First name populated in the data entry screen 
		And user verifies the Beneficiary Middle Name populated in the data entry screen 
		And user verifies the Beneficiary Last Name populated in the data entry screen 
		And user verifies the Beneficiary Nick Name entered in the data entry screen 
		And user verifies the profile image uploaded in the data entry screen 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
	@MB_Transfers_118 
	Scenario:
	User Edits International Beneficiary via Manage Beneficiary business functions  in Transfers workspace 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user views  the Transfer option 
		And user views the Beneficiary first name
		And user views the Beneficiary middle name
		And user views the Beneficiary last name 
		And user views the Beneficiary Nick Name 
		And user views the Beneficiary Nationality 
		And user views the Beneficiary Address 
		And user views the Beneficiary City 
		And user views the Beneficiary PO Code 
		And user views the Beneficiary Contact No 
		And user views the routing Code 
		And user views the SWIFT Code 
		And user views the Beneficiary Bank Name Code 
		And user views the Beneficiary Bank Branch 
		And user views the Beneficiary Bank Address 1 
		And user views the City 
		And user views the profile image 
		And user edits  any field Except the Nick Name field first
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the Transfer type selected in the previous screen 
		And user verifies the Transfer option selected in the previous screen 
		And user verifies the Beneficiary First Name entered in the previous screen 
		And user verifies the Beneficiary Middle Name entered in the previous screen 
		And user verifies the Beneficiary Last Name entered in the previous screen 
		And user verifies the Beneficiary Nick Name entered in the previous screen 
		And user verifies the Beneficiary Nationality selected in the previous screen 
		And user verifies the Beneficiary Address entered in the previous screen 
		And user verifies the Beneficiary City entered in the previous screen 
		And user verifies the Beneficiary PO Code entered in the previous screen 
		And user verifies the Beneficiary Contact No entered in the previous screen 
		And user verifies the routing Code entered in the previous screen 
		And user verifies the SWIFT Code entered in the previous screen 
		And user verifies the Beneficiary Bank Name Code populated in the previous screen 
		And user verifies the Beneficiary Bank Branch populated in the previous screen 
		And user verifies the Beneficiary Bank Address 1 populated in the previous screen 
		And user verifies the City populated in the previous screen 
		And user verifies the Beneficiary Photo uploaded in the previous screen 
		And user enters the OTP received to the registered Mobile number 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Beneficiary has been successfully modified 
		And user should view the label Please make note of your reference number 
		And user should view the reference ID 
		And user should view the Beneficiary Nick Name for Modify Beneficiary
		And user should view the Transfer Type 
		And user should view the DateTime 
		And user should view the GO TO TRANSFER LANDING PAGE Button 
		And user should view the ADD ANOTHER BENEFICIARY button 
		Then User Logged out of the system successfully 
	@MB_Transfers_125 
	Scenario:
	User views error message if invalid  OTP is entered  in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user views  the Transfer option 
		And user views the Beneficiary first name
		And user views the Beneficiary middle name
		And user views the Beneficiary last name 
		And user views the Beneficiary Nick Name 
		And user views the Beneficiary Nationality 
		And user views the Beneficiary Address 
		And user views the Beneficiary City 
		And user views the Beneficiary PO Code 
		And user views the Beneficiary Contact No 
		And user views the routing Code 
		And user views the SWIFT Code 
		And user views the Beneficiary Bank Name Code 
		And user views the Beneficiary Bank Branch 
		And user views the Beneficiary Bank Address 1 
		And user views the City 
		And user views the profile image 
		And user edits  any field Except the Nick Name field first 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the Transfer type selected in the previous screen 
		And user verifies the Transfer option selected in the previous screen 
		And user verifies the Beneficiary First Name entered in the previous screen 
		And user verifies the Beneficiary Middle Name entered in the previous screen 
		And user verifies the Beneficiary Last Name entered in the previous screen 
		And user verifies the Beneficiary Nick Name entered in the previous screen 
		And user verifies the Beneficiary Nationality selected in the previous screen 
		And user verifies the Beneficiary Address entered in the previous screen 
		And user verifies the Beneficiary City entered in the previous screen 
		And user verifies the Beneficiary PO Code entered in the previous screen 
		And user verifies the Beneficiary Contact No entered in the previous screen 
		And user verifies the routing Code entered in the previous screen 
		And user verifies the SWIFT Code entered in the previous screen 
		And user verifies the Beneficiary Bank Name Code populated in the previous screen 
		And user verifies the Beneficiary Bank Branch populated in the previous screen 
		And user verifies the Beneficiary Bank Address 1 populated in the previous screen 
		And user verifies the City populated in the previous screen 
		And user verifies the Beneficiary Photo uploaded in the previous screen 
		And user enters invalid OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” 
		Then User Logged out of the system successfully 
	@MB_Transfers_126 
	Scenario:
	User views error message if expired OTP is entered in Edit Beneficiary Review details screen 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And clicks the more icon 
		And clicks the Manage Beneficiary Business function from contextual menu 
		And user views the header as Manage Beneficiary 
		And user views the Nick Name 
		And user views the Transfer Type 
		And user views the Bank Name 
		And user views the Beneficiary Account Number IBAN No 
		And user views the Currency 
		And user views the Beneficiary status 
		And user clicks the record to view the beneficiary details edit
		And user clicks the Edit Button 
		And user views the Edit Beneficiary screen 
		And user views the  transfer type selected 
		And user views  the Transfer option 
		And user views the Beneficiary first name
		And user views the Beneficiary middle name
		And user views the Beneficiary last name 
		And user views the Beneficiary Nick Name 
		And user views the Beneficiary Nationality 
		And user views the Beneficiary Address 
		And user views the Beneficiary City 
		And user views the Beneficiary PO Code 
		And user views the Beneficiary Contact No 
		And user views the routing Code 
		And user views the SWIFT Code 
		And user views the Beneficiary Bank Name Code 
		And user views the Beneficiary Bank Branch 
		And user views the Beneficiary Bank Address 1 
		And user views the City 
		And user views the profile image 
		And user edits  any field Except the Nick Name field first 
		And user clicks the Next button 
		And user views the review details screen 
		And user verifies the Transfer type selected in the previous screen 
		And user verifies the Transfer option selected in the previous screen 
		And user verifies the Beneficiary First Name entered in the previous screen 
		And user verifies the Beneficiary Middle Name entered in the previous screen 
		And user verifies the Beneficiary Last Name entered in the previous screen 
		And user verifies the Beneficiary Nick Name entered in the previous screen 
		And user verifies the Beneficiary Nationality selected in the previous screen 
		And user verifies the Beneficiary Address entered in the previous screen 
		And user verifies the Beneficiary City entered in the previous screen 
		And user verifies the Beneficiary PO Code entered in the previous screen 
		And user verifies the Beneficiary Contact No entered in the previous screen 
		And user verifies the routing Code entered in the previous screen 
		And user verifies the SWIFT Code entered in the previous screen 
		And user verifies the Beneficiary Bank Name Code populated in the previous screen 
		And user verifies the Beneficiary Bank Branch populated in the previous screen 
		And user verifies the Beneficiary Bank Address 1 populated in the previous screen 
		And user verifies the City populated in the previous screen 
		And user verifies the Beneficiary Photo uploaded in the previous screen 
		And user enters expired OTP 
		And user clicks Submit button 
		Then should view error message as “Please enter valid OTP” expired 
		Then User Logged out of the system successfully 
		
		
	@MB_Transfers_213 
	Scenario:
	User transfers the  amount to Local Bank Beneficiary in send money screen using Pay Recurring Option 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
		And user views the Beneficiary Photo for local bank 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Local Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Take me to Dashboard 
		And user should view the Save as Favourite Button 
		And user should view the Download Receipt 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_215 
	Scenario:
	User transfers the  amount to Local Bank Beneficiary in send money screen using Pay Recurring Option and frequency as weekly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
		And user views the Beneficiary Photo for local bank 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as weekly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Local Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as weekly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_216 
	Scenario:
	User transfers the  amount to Local Bank Beneficiary in send money screen using Pay Recurring Option and frequency as Monthly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
		And user views the Beneficiary Photo for local bank 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as monthly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Local Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as Monthly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_217 
	Scenario:
	User transfers the  amount to Local Bank Beneficiary in send money screen using Pay Recurring Option and frequency as Yearly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the Local Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name for local bank AN40 
		And user views the Beneficiary Photo for local bank 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as yearly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Local Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as yearly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
		
	@MB_Transfers_172 
	Scenario:
	User transfers the  amount to Within Bank Beneficiary in send money screen using Pay Recurring Option 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name AN40 
		And user views the Beneficiary Photo 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Within Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From 
		And user should view the Transferred To 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Take me to Dashboard 
		And user should view the Save as Favourite Button 
		And user should view the Download Receipt 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_174 
	Scenario:
	User transfers the  amount to Within Bank Beneficiary in send money screen using Pay Recurring Option and frequency as weekly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name AN40 
		And user views the Beneficiary Photo 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as weekly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Within Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as weekly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From 
		And user should view the Transferred To 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Take me to Dashboard 
		And user should view the Save as Favourite Button 
		And user should view the Download Receipt 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_175 
	Scenario:
	User transfers the  amount to Within Bank Beneficiary in send money screen using Pay Recurring Option and frequency as Monthly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name AN40 
		And user views the Beneficiary Photo 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as monthly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Within Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as Monthly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From 
		And user should view the Transferred To 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Take me to Dashboard 
		And user should view the Save as Favourite Button 
		And user should view the Download Receipt 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_176 
	Scenario:
	User transfers the  amount to Within Bank Beneficiary in send money screen using Pay Recurring Option and frequency as Yearly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within Bank Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name AN40 
		And user views the Beneficiary Photo 
		And user views the Debit From A 10 
		And user views theAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user views the Transfer Currency defaulted based on the selected debit account currency A3 
		And user enters the transfer amount in How much would you like to send N 132 
		And user selects payment option as Recurring 
		And user views Frequency Start Date No of Payments and End date fields are getting auto populated 
		And user selects the frequency as yearly 
		And user selects the start date 
		And user selects the No of payments 
		And user views the End getting auto populated based on the tart date frequency and number of payments 
		And user views the Payment Date auto populated with Tomorrow's Date recurring
		And user views the Reminder Date field getting auto populated recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 recurring 
		And user selects the purpose of the transfer recurring 
		And user enters the remarks 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen of Within Bank Transfer 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Debit From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies payment option as Pay Recurring 
		And user verifies the frequency as yearly 
		And user verifies the start date 
		And user verifies the No of payments 
		And user verifies the End getting auto populated based on the tart date frequency and number of payments 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From 
		And user should view the Transferred To 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Take me to Dashboard 
		And user should view the Save as Favourite Button 
		And user should view the Download Receipt 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
		
	@MB_Transfers_137 
	Scenario:
	User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace using Recurring option 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the Own Account Transfer  option 
		And user views the header as Own Account Transfer 
		And user selects the From AccountN13 in Carousel 
		And user views the Available Balance A3N132 getting auto populated based on selected From account 
		And user selects the To Account from the dropdown 
		And user views the Available Balance A3N132 getting auto populated based on selected To account 
		And user views Transfer currency is defaulted based on selected debit account currency 
		And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
		And user selects the payment option  as Recurring 
		And user views Frequency  start date  No of Payments and End Date fields  getting Auto populated 
		And user selects the Frequency 
		And user selects the Start Date 
		And user selects the No of Payments 
		And user views the End date getting auto filled based on the above three fields 
		And user edits the Payment Date Up to Next one month from the current date if needed 
		And user enters the Remarks for own account AN+250
		And user accepts the Terms and Condition 
		And user views the Note 
		And clicks the Next Button 
		And views the Review details screen 
		And user  verifies the From account selected in the previous screen 
		And user verifies Available Balance field auto populated in the previous screen 
		And user verifies the To account selected in the previous screen 
		And user verifies the Transfer Currency 
		And user verifies the  amount in How much would you like to send  entered in the previous screen 
		And user verifies the Payment option as Recurring in When do you like to do this selected in the previous screen 
		And user views the Frequency field 
		And user views the Start Date 
		And user views the No of Payments 
		And user views the End Date 
		And user verifies the Remarks entered in the previous screen
		And user verifies the Terms and conditions 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From Account number 
		And user should view the Transferred To Account number 
		And user should view the reference ID 
		And user should view the Date and time 
		And user should view the Send More Money Button 
		And user should view the Take Me to Home Page Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_139 
	Scenario:
	User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace using Recurring option and Frequency as weekly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the Own Account Transfer  option 
		And user views the header as Own Account Transfer 
		And user selects the From AccountN13 in Carousel 
		And user views the Available Balance A3N132 getting auto populated based on selected From account 
		And user selects the To Account from the dropdown 
		And user views the Available Balance A3N132 getting auto populated based on selected To account 
		And user views Transfer currency is defaulted based on selected debit account currency 
		And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
		And user selects the payment option  as Recurring 
		And user views Frequency  start date  No of Payments and End Date fields  getting Auto populated 
		And user selects the Frequency as weekly 
		And user selects the Start Date 
		And user selects the No of Payments 
		And user views the End date getting auto filled based on the above three fields 
		And user edits the Payment Date Up to Next one month from the current date if needed 
		And user enters the Remarks for own account AN+250 
		And user accepts the Terms and Condition 
		And user views the Note 
		And clicks the Next Button 
		And views the Review details screen 
		And user  verifies the From account selected in the previous screen 
		And user verifies Available Balance field auto populated in the previous screen 
		And user verifies the To account selected in the previous screen 
		And user verifies the Transfer Currency 
		And user verifies the  amount in How much would you like to send  entered in the previous screen 
		And user verifies the Payment option as Recurring in When do you like to do this selected in the previous screen 
		And user views the Frequency field 
		And user views the Start Date 
		And user views the No of Payments 
		And user views the End Date 
		And user verifies the Remarks entered in the previous screen 
		And user verifies the Terms and conditions 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From Account number 
		And user should view the Transferred To Account number 
		And user should view the reference ID 
		And user should view the Date and time 
		And user should view the Send More Money Button 
		And user should view the Take Me to Home Page Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_140 
	Scenario:
	User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace using Recurring option and Frequency as Monthly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the Own Account Transfer  option 
		And user views the header as Own Account Transfer 
		And user selects the From AccountN13 in Carousel 
		And user views the Available Balance A3N132 getting auto populated based on selected From account 
		And user selects the To Account from the dropdown 
		And user views the Available Balance A3N132 getting auto populated based on selected To account 
		And user views Transfer currency is defaulted based on selected debit account currency 
		And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
		And user selects the payment option  as Recurring 
		And user views Frequency  start date  No of Payments and End Date fields  getting Auto populated 
		And user selects the Frequency as Monthly 
		And user selects the Start Date 
		And user selects the No of Payments 
		And user views the End date getting auto filled based on the above three fields 
		And user edits the Payment Date Up to Next one month from the current date if needed 
		And user enters the Remarks for own account AN+250 
		And user accepts the Terms and Condition 
		And user views the Note 
		And clicks the Next Button 
		And views the Review details screen 
		And user  verifies the From account selected in the previous screen 
		And user verifies Available Balance field auto populated in the previous screen 
		And user verifies the To account selected in the previous screen 
		And user verifies the Transfer Currency 
		And user verifies the  amount in How much would you like to send  entered in the previous screen 
		And user verifies the Payment option as Recurring in When do you like to do this selected in the previous screen 
		And user views the Frequency field as Monthly 
		And user views the Start Date 
		And user views the No of Payments 
		And user views the End Date 
		And user verifies the Remarks entered in the previous screen 
		And user verifies the Terms and conditions 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From Account number 
		And user should view the Transferred To Account number 
		And user should view the reference ID 
		And user should view the Date and time 
		And user should view the Send More Money Button 
		And user should view the Take Me to Home Page Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_141 
	Scenario:
	User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace using Recurring option and Frequency option as Yearly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the Own Account Transfer  option 
		And user views the header as Own Account Transfer 
		And user selects the From AccountN13 in Carousel 
		And user views the Available Balance A3N132 getting auto populated based on selected From account 
		And user selects the To Account from the dropdown 
		And user views the Available Balance A3N132 getting auto populated based on selected To account 
		And user views Transfer currency is defaulted based on selected debit account currency 
		And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
		And user selects the payment option  as Recurring 
		And user views Frequency  start date  No of Payments and End Date fields  getting Auto populated 
		And user selects the Frequency as Yearly 
		And user selects the Start Date 
		And user selects the No of Payments 
		And user views the End date getting auto filled based on the above three fields 
		And user edits the Payment Date Up to Next one month from the current date if needed 
		And user enters the Remarks for own account AN+250 
		And user accepts the Terms and Condition 
		And user views the Note 
		And clicks the Next Button 
		And views the Review details screen 
		And user  verifies the From account selected in the previous screen 
		And user verifies Available Balance field auto populated in the previous screen 
		And user verifies the To account selected in the previous screen 
		And user verifies the Transfer Currency 
		And user verifies the  amount in How much would you like to send  entered in the previous screen 
		And user verifies the Payment option as Recurring in When do you like to do this selected in the previous screen 
		And user views the Frequency field as Yearly 
		And user views the Start Date 
		And user views the No of Payments 
		And user views the End Date 
		And user verifies the Remarks entered in the previous screen 
		And user verifies the Terms and conditions 
		And user enters the OTP 
		And user clicks the submit button 
		Then user should be navigated to confirmation screen 
		And user should view the Tick symbol 
		And user should view the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From Account number 
		And user should view the Transferred To Account number 
		And user should view the reference ID 
		And user should view the Date and time 
		And user should view the Send More Money Button 
		And user should view the Take Me to Home Page Button 
		Then User Logged out of the system successfully 
		
	@MB_Transfers_252 
	Scenario:
	user transfer money to the International Beneficiary via International Transfer by selecting SWIFT Transfer Option  Recurring option and Who should pay the charges as Share 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within International Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name International AN40 
		And user views the Beneficiary Photo for International 
		And user views the Beneficiary First Name 
		And user views the Beneficiary Middle Name 
		And user views the Beneficiary Last Name 
		And user selects the Pay FromOther Currency AccountA 10 
		And user viewAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user selects Routing Mode  as Swift Transfer 
		And user view the static info Transfer in 3 days 
		And user selects Transfer Currency 
		And user enters the transfer amount in How much would you like to send N 132 
		And user views the Exchange Rate N 66 between debit account currency and transfer currency 
		And user views the Converted Amount A3 N213 
		And user selects When would you like to do this either as Recurring 
		And views Frequency Start Date No of Payments and End Date fields are getting displayed 
		And user selects the frequency 
		And user selects the start date 
		And user enters No of Payments 
		And user views end date getting displayed based on the above three given inputs 
		And user views Payments Date as Current Date recurring 
		And user views the reminder getting enabled recurring
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 
		And user selects the purpose of the transfer recurring
		And user enters the remarks 
		And user selects Who should pay the charges  as Share 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Beneficiary First Name 
		And user verifies the Beneficiary Middle Name 
		And user verifies the Beneficiary Last Name 
		And user verifies the Bank Name 
		And user verifies the pay From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Routing Option 
		And user verifies the Transfer Currency 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
		And user verifies the Converted Amount A3 N213 
		And user verifies the Payment option as Recurring 
		And user verifies the frequency 
		And user verifies the start date 
		And user verifies the  No of Payments 
		And user verifies end date 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies Who should pay the charges 
		And user verifies the Fee 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_254 
	Scenario:
	user transfer money to the International Beneficiary via International Transfer by selecting SWIFT Transfer Option and Recurring Frequency as Weekly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within International Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name International AN40 
		And user views the Beneficiary Photo for International 
		And user views the Beneficiary First Name 
		And user views the Beneficiary Middle Name 
		And user views the Beneficiary Last Name 
		And user views the Bank Name 
		And user selects the Pay FromOther Currency AccountA 10 
		And user viewAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user selects Routing Mode  as Swift Transfer 
		And user view the static info Transfer in 3 days 
		And user selects Transfer Currency 
		And user enters the transfer amount in How much would you like to send N 132 
		And user views the Exchange Rate N 66 between debit account currency and transfer currency 
		And user views the Converted Amount A3 N213 
		And user selects When would you like to do this either as Recurring 
		And views Frequency Start Date No of Payments and End Date fields are getting displayed 
		And user selects the frequency as Weekly 
		And user selects the start date 
		And user enters No of Payments 
		And user views end date getting displayed based on the above three given inputs 
		And user views Payments Date as Current Date recurring 
		And user views the reminder getting enabled recurring 
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 
		And user selects the purpose of the transfer recurring
		And user enters the remarks 
		And user selects Who should pay the charges  as Share 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Beneficiary First Name 
		And user verifies the Beneficiary Middle Name 
		And user verifies the Beneficiary Last Name 
		And user verifies the Bank Name 
		And user verifies the pay From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Routing Option 
		And user verifies the Transfer Currency 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
		And user verifies the Converted Amount A3 N213 
		And user verifies the Payment option as Recurring 
		And user verifies the frequency as Weekly 
		And user verifies the start date 
		And user verifies the  No of Payments 
		And user verifies end date 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies Who should pay the charges 
		And user verifies the Fee 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_255 
	Scenario:
	user transfer money to the International Beneficiary via International Transfer by selecting SWIFT Transfer Option and Recurring Frequency as Monthly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within International Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name International AN40 
		And user views the Beneficiary Photo for International 
		And user views the Beneficiary First Name 
		And user views the Beneficiary Middle Name 
		And user views the Beneficiary Last Name 
		And user views the Bank Name 
		And user selects the Pay FromOther Currency AccountA 10 
		And user viewAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user selects Routing Mode  as Swift Transfer 
		And user view the static info Transfer in 3 days 
		And user selects Transfer Currency 
		And user enters the transfer amount in How much would you like to send N 132 
		And user views the Exchange Rate N 66 between debit account currency and transfer currency 
		And user views the Converted Amount A3 N213 
		And user selects When would you like to do this either as Recurring 
		And views Frequency Start Date No of Payments and End Date fields are getting displayed 
		And user selects the frequency as Monthly 
		And user selects the start date 
		And user enters No of Payments 
		And user views end date getting displayed based on the above three given inputs 
		And user views Payments Date as Current Date recurring 
		And user views the reminder getting enabled recurring 
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 
		And user selects the purpose of the transfer recurring
		And user enters the remarks 
		And user selects Who should pay the charges  as Share 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Beneficiary First Name 
		And user verifies the Beneficiary Middle Name 
		And user verifies the Beneficiary Last Name 
		And user verifies the Bank Name 
		And user verifies the pay From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Routing Option 
		And user verifies the Transfer Currency 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
		And user verifies the Converted Amount A3 N213 
		And user verifies the Payment option as Recurring 
		And user verifies the frequency as Monthly 
		And user verifies the start date 
		And user verifies the  No of Payments 
		And user verifies end date 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies Who should pay the charges 
		And user verifies the Fee 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button 
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
	@MB_Transfers_256 
	Scenario:
	user transfer money to the International Beneficiary via International Transfer by selecting SWIFT Transfer Option and Recurring Frequency as Yearly 
		 
		When user clicks on Burger menu 
		And user clicks the transfer menu 
		And navigates to the transfer workspace 
		And user clicks the more option 
		And user clicks the send Money option 
		And user clicks the within International Beneficiary from the saved Beneficiary list 
		And user views the Heading: Send to Beneficiary Nick Name International AN40 
		And user views the Beneficiary Photo for International 
		And user views the Beneficiary First Name 
		And user views the Beneficiary Middle Name 
		And user views the Beneficiary Last Name 
		And user views the Bank Name 
		And user selects the Pay FromOther Currency AccountA 10 
		And user viewAccount TypeAN 30 
		And user views the Account Number N 15 
		And user views the Account Holder Name A 40 
		And user views the Available Balance A 3 N102 
		And user selects Routing Mode  as Swift Transfer 
		And user view the static info Transfer in 3 days 
		And user selects Transfer Currency 
		And user enters the transfer amount in How much would you like to send N 132 
		And user views the Exchange Rate N 66 between debit account currency and transfer currency 
		And user views the Converted Amount A3 N213 
		And user selects When would you like to do this either as Recurring 
		And views Frequency Start Date No of Payments and End Date fields are getting displayed 
		And user selects the frequency as Yearly 
		And user selects the start date 
		And user enters No of Payments 
		And user views end date getting displayed based on the above three given inputs 
		And user views Payments Date as Current Date recurring 
		And user views the reminder getting enabled recurring 
		And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date - where x is less than 30 
		And user selects the purpose of the transfer recurring
		And user enters the remarks 
		And user selects Who should pay the charges  as Share 
		And user ticks the Terms and Conditions 
		And user views the Notes 
		And user clicks the Proceed To Confirm 
		And user views the review details screen 
		And user verifies the Heading: Send to Beneficiary Nick Name AN40 
		And user verifies the Beneficiary Photo 
		And user verifies the Beneficiary First Name 
		And user verifies the Benefsiciary Middle Name 
		And user verifies the Beneficiary Last Name 
		And user verifies the Bank Name 
		And user verifies the pay From A 10 
		And user verifies theAccount TypeAN 30 
		And user verifies the Account Number N 15 
		And user verifies the Account Holder Name A 40 
		And user verifies the Available Balance A 3 N102 
		And user verifies the Routing Option 
		And user verifies the Transfer Currency 
		And user verifies  the entered transfer amount in How much would you like to send N 132 
		And user verifies the Exchange Rate N 66 between debit account currency and transfer currency 
		And user verifies the Converted Amount A3 N213 
		And user verifies the Payment option as Recurring 
		And user verifies the frequency as Yearly 
		And user verifies the start date 
		And user verifies the  No of Payments 
		And user verifies end date 
		And user verifies  the purpose of the transfer 
		And user verifies  the remarks 
		And user verifies Who should pay the charges 
		And user verifies the Fee 
		And user verifies  the Terms and Conditions 
		And user enters the OTP received to the registered Mobile Number 
		And user clicks the submit button  
		Then user will be navigated to the Confirmation screen 
		And user should view the Tick symbol 
		And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
		And user should view the Transferred From LB 
		And user should view the Transferred To LB 
		And user should view the Beneficiary Nick Name 
		And user should view the Reference ID 
		And user should view the Date & Time 
		And user should view the Send more Money Button 
		And user should view the Save as Favourite Button 
		And user should view the Share Receipt Button 
		Then User Logged out of the system successfully 
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	