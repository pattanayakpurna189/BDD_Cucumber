@tag 
Feature: Automation testing scenarios for Transfers module - feature file 1 
Background: 
	Given user logged in with valid credentials in MB and landed in Home screen
	
	
	
@MB_Transfers_001 
Scenario: User views the Favourite Transfer carousel 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user can view the Header as  Favourite Transfer 
	And user can view the Bank Name 
	And  user can view the Beneficiary Nick Name 
	And  user can view the Transfer Amount 
	Then User Logged out of the system successfully 
	
	
@MB_Transfers_014 
Scenario: User Views the successful transaction for Add a new beneficiary for within bank transfer Type 
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
	And user modifies the Beneficiary Nick Name if needed 
	And uploads the beneficiary photo in the Upload beneficiary field 
	Then user views the Notes AB 
	And User clicks the Create Beneficiary Button 
	And User navigates to the review details screen 
	Then user verifies the  transfer type selected  entered in data entry screen 
	Then user verifies the Beneficiary Account Number  entered in data entry screen 
	Then user verifies the Currency entered in data entry screen 
	Then user verifies the Beneficiary First name populated in the data entry screen 
	Then user verifies the Beneficiary Middle Name populated in the data entry screen 
	Then user verifies the Beneficiary Last Name populated in the data entry screen 
	Then user verifies the Beneficiary Nick Name entered in the data entry screen 
	Then user verifies the profile image uploaded in the data entry screen 
	Then user enters the OTP received to the registered Mobile number 
	Then user clicks the submit button 
	Then user should be navigated to confirmation screen 
	And user should view the Tick symbol 
	And user should view the Transaction status as Beneficiary has been successfully added 
	And user should view the label Please make note of your reference number 
	And user should view the reference ID 
	And user should view the Beneficiary Nick Name for Add Beneficiary
	And user should view the Transfer Type 
	And user should view the DateTime 
	And user should view the GO TO TRANSFER LANDING PAGE Button 
	And clicks the Manage Beneficiary Business function from contextual menu 
	And user clicks the record to view the beneficiary details
	And user clicks the delete button
	Then user should not view the deleted beneficiary in the list
	And user should view the ADD ANOTHER BENEFICIARY button 
	Then User Logged out of the system successfully 
	
@MB_Transfers_015 
Scenario: User views the successful transaction for Add a new beneficiary for Domestic Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the Add A New Beneficiary button 
	And user views the header as Add Beneficiary 
	And user selects transfer type as Domestic Transfer 
	And user enters the IBAN number  in IBAN AN 29 field 
	And user reenters the IBAN number  in Confirm IBAN AN 29 field 
	And user  views the currencyQAR being auto populated based on the entered account Number 
	And user selects the Bank from the Bank name dropdown list 
	And user views the SWIFT Code being displayed based on the selected bank 
	And user enters the Beneficiary first name in Beneficiary First name AN+ 25 
	And user enters the Beneficiary Middle name in Beneficiary Middle name AN+ 20 
	And user enters the Beneficiary Middle name in Beneficiary Middle name AN+ 25 
	And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
	And user modifies the Beneficiary Nick Name if needed 
	And uploads the beneficiary photo in the Upload beneficiary field 
	Then user views the Notes AB 
	And User clicks the Create Beneficiary Button 
	And User navigates to the review details screen 
	Then user verifies the  transfer type selected  entered in data entry screen
	And user verifies the Beneficiary IBAN number entered in data entry screen Local Bank 
	And user verifies the Currency entered in the data entry screen 
	And user verifies the Bank name selected in the data entry screen 
	Then user verifies the Beneficiary First name populated in the data entry screen 
	Then user verifies the Beneficiary Middle Name populated in the data entry screen 
	Then user verifies the Beneficiary Last Name populated in the data entry screen 
	Then user verifies the Beneficiary Nick Name entered in the data entry screen 
	Then user verifies the profile image uploaded in the data entry screen 
	Then user enters the OTP received to the registered Mobile number 
	Then user clicks the submit button 
	Then user should be navigated to confirmation screen 
	And user should view the Tick symbol 
	And user should view the Transaction status as Beneficiary has been successfully added 
	And user should view the label Please make note of your reference number 
	And user should view the reference ID 
	And user should view the Beneficiary Nick Name for Add Beneficiary
	And user should view the Transfer Type 
	And user should view the DateTime 
	And user should view the GO TO TRANSFER LANDING PAGE Button
	And clicks the Manage Beneficiary Business function from contextual menu 
	And user clicks the record to view the beneficiary details
	And user clicks the delete button
	Then user should not view the deleted beneficiary in the list 
	And user should view the ADD ANOTHER BENEFICIARY button 
	Then User Logged out of the system successfully 
	
@MB_Transfers_016 
Scenario: User views the successful transaction for Add a new beneficiary for International Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the Add A New Beneficiary button 
	And user views the header as Add Beneficiary 
	And user selects transfer type as International Transfer 
	And user selects the transfer options as Account to Account 
	And user enters the Beneficiary first name in Beneficiary First name international AN+ 25 
	And user enters the Beneficiary Middle name in Beneficiary Middle name international AN+ 25 
	And user enters the Beneficiary Last name in Beneficiary Last name international AN+ 25 
	And user views the Beneficiary first name being auto populated in Beneficiary Nick name field 
	And user modifies the Beneficiary Nick Name if needed international
	And user selects the Nationality in Beneficiary Nationality drop down field AN30 
	And user enters the Beneficiary Address AN+ 35 
	And user enters the Beneficiary City AN+ 35 
	And user enters the Beneficiary PO Code AN+ 35 
	And user enters the Beneficiary Country 
	And user enters the Beneficiary Contact No N11 
	And user selects the Beneficiary Country 
	And user selects the Currency type in Currency Dropdown list
	And user enters the Beneficiary Account Number AN20 If IBAN is not applicable for that country 
	And user enters IBAN in IBAN field AN35 if IBAN is applicable for that country 
	And user reenters confirm Account Number if he already entered Beneficiary Account Number 
	And user reenters confirm IBAN if he already entered IBAN 
	And user selects the Do you know therouting codeSwift code of the beneficiary Bank Radio Button 
	And user enters SWIFT Code based on the selected country 
	And user views the Beneficiary Bank Name being auto populated based on routingswift code 
	And user views the Beneficiary Bank Branch being auto populated based on routingswift code 
	And user views the Beneficiary Bank Address1 being auto populated based on routingswift code 
	And user views the Beneficiary Bank City being auto populated based on routingswift code 
	And uploads the beneficiary photo in the Upload beneficiary field 
	And User clicks the Create Beneficiary Button 
	Then user views the review details screen 
	Then user verifies the Transfer type selected in the previous screen 
	Then user verifies the Transfer option selected in the previous screen 
	Then user verifies the Beneficiary First Name entered in the previous screen 
	Then user verifies the Beneficiary Middle Name entered in the previous screen 
	Then user verifies the Beneficiary Last Name entered in the previous screen 
	Then user verifies the Beneficiary Nick Name entered in the previous screen 
	Then user verifies the Beneficiary Nationality selected in the previous screen 
	Then user verifies the Beneficiary Address entered in the previous screen 
	Then user verifies the Beneficiary City entered in the previous screen 
	Then user verifies the Beneficiary PO Code entered in the previous screen 
	Then user verifies the Beneficiary Contact No entered in the previous screen 
	Then user verifies the routing Code entered in the previous screen 
	Then user verifies the SWIFT Code entered in the previous screen 
	Then user verifies the Beneficiary Bank Name Code populated in the previous screen 
	Then user verifies the Beneficiary Bank Branch populated in the previous screen 
	Then user verifies the Beneficiary Bank Address 1 populated in the previous screen 
	Then user verifies the City populated in the previous screen 
	Then user verifies the Beneficiary Photo uploaded in the previous screen 
	Then user enters the OTP received to the registered Mobile number 
	Then user clicks the submit button 
	Then user should be navigated to confirmation screen 
	And user should view the Tick symbol 
	And user should view the Transaction status as Beneficiary has been successfully added 
	And user should view the label Please make note of your reference number 
	And user should view the reference ID 
	And user should view the Beneficiary Nick Name for Add Beneficiary 
	And user should view the Transfer Type 
	And user should view the DateTime 
	And user should view the GO TO TRANSFER LANDING PAGE Button
	And clicks the Manage Beneficiary Business function from contextual menu 
	And user clicks the record to view the beneficiary details
	And user clicks the delete button
	Then user should not view the deleted beneficiary in the list 
	And user should view the ADD ANOTHER BENEFICIARY button 
	Then User Logged out of the system successfully 
	
	
@MB_Transfers_092 
Scenario: User Deletes  Beneficiary via Manage Beneficiary business functions  in Transfers workspace 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And clicks the more icon 
	And clicks the Manage Beneficiary Business function from contextual menu 
	Then user views the header as Manage Beneficiary 
	And user views the Nick Name 
	And user views the Transfer Type 
	And user views the Bank Name 
	And user views the Beneficiary Account Number IBAN No 
	And user views the Currency 
	And user views the Beneficiary status 
	And user clicks the record to view the beneficiary details 
	And  user views the view beneficiary screen 
	And user views the beneficiary details 
	And user clicks the record which has to be deleted 
	And user clicks the view the beneficiary details in view beneficiary screen 
	And user clicks the delete button 
	And user views the Deleting a beneficiary will not delete the corresponding future value dated transactions and standing instructions Once Beneficiary Beneficiary nick name will be deleted it cannot be reverted Would you like to proceed  Alert message 
	And user clicks the OK button 
	Then user should not view the deleted beneficiary in the list 
	Then User Logged out of the system successfully 
	
	
	
@MB_Transfers_134 
Scenario: User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the Own Account Transfer  option 
	And user views the header as Own Account Transfer 
	And user selects the From AccountN13 in Carousel 
	And user views the Available Balance A3N132 getting auto populated based on selected From account 
	And user selects the To Account from the dropdown 
	And user views the Available Balance A3N132 getting auto populated based on selected To account 
	And user views Transfer currency is defaulted based on selected debit account currency 
	And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
	And user selects the payment option either as Pay now  Pay Later and Recurring 
	And user enters the Remarks AN+250 
	And user accepts the Terms and Condition 
	And user views the Note 
	And clicks the Next Button 
	And views the Review details screen 
	And user  verifies the From account selected in the previous screen 
	And user verifies Available Balance field auto populated in the previous screen 
	And user verifies the To account selected in the previous screen 
	And user verifies the Transfer Currency 
	And user verifies the  amount in How much would you like to send  entered in the previous screen 
	And user verifies the Payment option in When do you like to do this selected in the previous screen 
	And user verifies the Remarks entered in the previous screen 
	And user verifies the Terms and conditions 
	And user enters the OTP 
	Then user clicks the submit button 
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
	
	
@MB_Transfers_135 
Scenario: User Transfers the amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace using Pay Now option 
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
	And user selects the payment option  as Pay now 
	And user views Payment Date as Current Date 
	And user enters the Remarks AN+250 
	And user accepts the Terms and Condition 
	And user views the Note 
	And clicks the Next Button 
	And views the Review details screen 
	And user  verifies the From account selected in the previous screen 
	And user verifies Available Balance field auto populated in the previous screen 
	And user verifies the To account selected in the previous screen 
	And user verifies the Transfer Currency 
	And user verifies the  amount in How much would you like to send  entered in the previous screen 
	And user verifies the Payment option as Pay Now in When do you like to do this selected in the previous screen 
	And user views the Payment On  field as Current Date 
	And user verifies the Remarks entered in the previous screen 
	And user verifies the Terms and conditions 
	And user enters the OTP 
	Then user clicks the submit button 
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
	
		
@MB_Transfers_142 
Scenario: User Transfers the Foreign currency Amount to the other Account associated with the bank in Own Account Transfer in Transfer workspace 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the more option 
	And user clicks the Own Account Transfer  option 
	And user views the header as Own Account Transfer 
	And user selects the From AccountN13 in Carousel Which Holds Foreign Currency own account 
	And user views the Available Balance A3N132 getting auto populated based on selected From account 
	And user selects the To Account from the dropdown 
	And user views the Available Balance A3N132 getting auto populated based on selected To account 
	And user views Transfer currency is defaulted based on selected debit account currency 
	And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
	And user views the Exchange Rate field which shows the current exchange rate of the selected currency For Ex 1 USD = 364 QAR 
	And user views the Converted amount field Which shows conversion between debit and Transfer currency 
	And user selects the payment option either as Pay now  Pay Later and Recurring 
	And user enters the Remarks AN+250 
	And user accepts the Terms and Condition 
	And user views the Note 
	And clicks the Next Button 
	And views the Review details screen 
	And user  verifies the From account selected in the previous screen 
	And user verifies Available Balance field auto populated in the previous screen 
	And user verifies the To account selected in the previous screen 
	And user verifies the Transfer Currency 
	And user verifies the  amount in How much would you like to send  entered in the previous screen 
	And user verifies the Exchange rate field 
	And user verifies the Conversion rate field 
	And user verifies the Payment option in When do you like to do this selected in the previous screen 
	And user verifies the Remarks entered in the previous screen 
	And user verifies the Terms and conditions 
	And user enters the OTP 
	Then user clicks the submit button 
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
	
	
		
@MB_Transfers_156 
Scenario: User views the successful transaction for Own Account Transfer with Pay Now option is getting updated in Transfer History 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the more option 
	And user clicks the Own Account Transfer  option 
	And user views the header as Own Account Transfer 
	And user selects the From AccountN13 in Carousel Which Holds Foreign Currency 
	And user views the Available Balance A3N132 getting auto populated based on selected From account 
	And user selects the To Account from the dropdown 
	And user views the Available Balance A3N132 getting auto populated based on selected To account 
	And user views Transfer currency is defaulted based on selected debit account currency 
	And user enters the amount to be transferred in  How much would you like to send A3 N213 Field 
	And user views the Exchange Rate field which shows the current exchange rate of the selected currency For Ex 1 USD = 364 QAR 
	And user views the Converted amount field Which shows conversion between debit and Transfer currency 
	And user selects the payment option  as Pay now 
	And user views Payment Date as Current Date 
	And user enters the Remarks AN+250 
	And user accepts the Terms and Condition 
	And user views the Note 
	And clicks the Next Button 
	And views the Review details screen 
	And user  verifies the From account selected in the previous screen 
	And user verifies Available Balance field auto populated in the previous screen 
	And user verifies the To account selected in the previous screen 
	And user verifies the Transfer Currency 
	And user verifies the  amount in How much would you like to send  entered in the previous screen 
	And user verifies the Exchange rate field 
	And user verifies the Conversion rate field 
	And user verifies the Payment option as Pay Now in When do you like to do this selected in the previous screen 
	And user verifies the Payment date as current date 
	And user verifies the Remarks entered in the previous screen 
	And user verifies the Terms and conditions 
	And user enters the OTP 
	Then user clicks the submit button 
	And  user  navigates to confirmation screen 
	Then user views the Tick symbol 
	Then user views the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
	Then user views the Transferred From Account number 
	And user views the Transferred To Account number 
	Then user views the Reference ID 
	And user views the Date and time 
	And user views the Send More Money Button 
	And user clicks send more money button 
	And user clicks the more option 
	And user clicks the Transaction History 
	Then user should view the successful Transaction of own Account TransferPay now in Transaction history list 
	Then User Logged out of the system successfully 
	
	
@MB_Transfers_157 
Scenario: User views the successful transaction for Own Account Transfer with Pay Later option is getting updated in Schedule Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And user clicks the more option 
	And user clicks the Own Account Transfer  option 
	And user views the header as Own Account Transfer 
	And user selects the From AccountN13 in Carousel Which Holds Foreign Currency 
	And user views the Available Balance A3N132 getting auto populated based on selected From account 
	And user selects the To Account from the dropdown 
	And user views the Available Balance A3N132 getting auto populated based on selected To account 
	And user views Transfer currency is defaulted based on selected debit account currency 
	And user enters the amount to be transferred in  How much would you like to send A3 N213 Field
	And user views the Exchange Rate field which shows the current exchange rate of the selected currency For Ex 1 USD = 364 QAR 
	And user views the Converted amount field Which shows conversion between debit and Transfer currency 
	And user selects payment option as Pay Later
	And user views the On Date auto populated with current date 
	And user edits the Payment Date Up to Next one month from the current date if needed 
	And user selects the Reminder Date from Reminder Data picker 
	And user enters the Remarks AN+250
	And user accepts the Terms and Condition 
	And user views the Note 
	And clicks the Next Button 
	And views the Review details screen 
	And user  verifies the From account selected in the previous screen 
	And user verifies Available Balance field auto populated in the previous screen 
	And user verifies the To account selected in the previous screen 
	And user verifies the Transfer Currency 
	And user verifies the  amount in How much would you like to send  entered in the previous screen 
	And user verifies the Exchange rate field 
	And user verifies the Conversion rate field 
	And user verifies the Payment option as Pay later in When do you like to do this selected in the previous screen 
	And user views the Payment On  field as next day date  from the current date by default 
	And user user verifies the selected Reminder Date 
	And user verifies the Remarks entered in the previous screen 
	And user verifies the Terms and conditions 
	And user enters the OTP 
	And user clicks the submit button 
	And user  navigates to confirmation screen 
	And user views the Tick symbol 
	And user views the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
	And user views the Transferred From Account number 
	And user views the reference ID 
	And user views the Date and time 
	And user views the Send More Money Button 
	And user clicks send more money button 
	And user clicks the more option 
	And user clicks the Schedule Transfer 
	Then user should view the successful Transaction of own Account Transfer Pay Later  in Schedule Transfer list 
	Then User Logged out of the system successfully 
	
@MB_Transfers_166 
Scenario: User views the Beneficiary details in the Favourite Transfer List section 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	And User clicks the View All Transfer link from Favourite Transaction Section 
	Then user should view the Bene Photo 
	And user should view the Beneficiary Nick NameAN 20 
	And user should view the Account NumberN 20 
	And user should view the Bank Name 
	And user should view the Branch Name 
	And user should view the Logo based on the transfer type 
	Then User Logged out of the system successfully 
	
	
		
@MB_Transfers_169 
Scenario: User transfers the  amount to Within Bank Beneficiary in send money screen 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the within Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading Send to Beneficiary Nick Name AN40 
	And user views the Beneficiary Photo 
	And user views the Debit From A 10 
	And user views theAccount TypeAN 30 
	And user views the Account Number N 15 
	And user views the Account Holder Name A 40 
	And user views the Available Balance A 3 N102 
	And user views the Transfer Currency defaulted based on the selected debit account currency A3 
	And user enters the transfer amount in How much would you like to send N 132 
	And user selects the transfer option either as Pay Now Pay later and recurring 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	Then user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen 
	And user verifies the Heading Send to Beneficiary Nick Name AN40 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From A 10 
	And user verifies theAccount TypeAN 30 
	And user verifies the Account Number N 15 
	And user verifies the Account Holder Name A 40 
	And user verifies the Available Balance A 3 N102 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
	And user verifies  the entered transfer amount in How much would you like to send N 132 
	And user the verifies  transfer option as either Pay Now Pay Later and Recurring 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	Then user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From 
	And user should view the Transferred To 
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Take me to Dashboard 
	And user should view the Save as Favourite Button 
	And user should view the Download Receipt 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
@MB_Transfers_170
Scenario: User transfers the  amount to Within Bank Beneficiary in send money screen using Pay Now option 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the within Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading Send to Beneficiary Nick Name AN40 
	And user views the Beneficiary Photo 
	And user views the Debit From A 10 
	And user views theAccount TypeAN 30 
	And user views the Account Number N 15 
	And user views the Account Holder Name A 40 
	And user views the Available Balance A 3 N102 
	And user views the Transfer Currency defaulted based on the selected debit account currency A3 
	And user enters the transfer amount in How much would you like to send N 132 
	And user selects payment option as Pay Now 
	Then user views the Payment Date auto populated with current date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	Then user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Within Bank Transfer
	And user verifies the Heading Send to Beneficiary Nick Name AN40 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From A 10 
	And user verifies theAccount TypeAN 30 
	And user verifies the Account Number N 15 
	And user verifies the Account Holder Name A 40 
	And user verifies the Available Balance A 3 N102 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
	And user verifies  the entered transfer amount in How much would you like to send N 132 
	And user verifies payment option as Pay Now 
	Then user verifies the Payment Date auto populated with current date 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	Then user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From 
	And user should view the Transferred To 
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button 
	And user should view the Take me to Dashboard 
	And user should view the Save as Favourite Button 
	And user should view the Download Receipt 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
	
		
@MB_Transfers_201 
Scenario: User views the successful transaction for Within Bank Transfer with Pay Now option is getting updated in Transfer History 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the within Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading Send to Beneficiary Nick Name AN40 
	And user views the Beneficiary Photo 
	And user views the Debit From A 10 
	And user views theAccount TypeAN 30 
	And user views the Account Number N 15 
	And user views the Account Holder Name A 40 
	And user views the Available Balance A 3 N102 
	And user views the Transfer Currency defaulted based on the selected debit account currency A3 
	And user enters the transfer amount in How much would you like to send N 132 
	And user selects payment option as Pay Now 
	Then user views the Payment Date auto populated with current date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	Then user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Within Bank Transfer
	And user verifies the Heading Send to Beneficiary Nick Name AN40 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From A 10 
	And user verifies theAccount TypeAN 30 
	And user verifies the Account Number N 15 
	And user verifies the Account Holder Name A 40 
	And user verifies the Available Balance A 3 N102 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
	And user verifies  the entered transfer amount in How much would you like to send N 132 
	And user verifies payment option as Pay Now 
	Then user verifies the Payment Date auto populated with current date 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	Then user clicks the submit button 
	And user navigates to the Confirmation screen 
	Then user views the Tick symbol 
	And user views the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user views  the Transferred From 
	And user views the Transferred To 
	And user views the Beneficiary Nick Name 
	Then user views the Reference ID 
	Then user views the Date  Time 
	Then user views the Send more Money Button 
	Then user views the Save as Favourite Button 
	Then user views the Share Receipt Button 
	Then clicks the send more money button 
	Then user clicks the more option 
	Then user clicks the Schedule Transfer 
	Then user should view the successful Transaction of own Account Transfer Pay Later  in Schedule Transfer list 
	Then User Logged out of the system successfully
	
@MB_Transfers_202 
Scenario: User views the successful transaction for within bank Transfer with Pay Later option is getting updated in Schedule Transfer 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
	And user clicks the send Money option 
	And user clicks the within Bank Beneficiary from the saved Beneficiary list 
	And user views the Heading Send to Beneficiary Nick Name AN40 
	And user views the Beneficiary Photo 
	And user views the Debit From A 10 
	And user views theAccount TypeAN 30 
	And user views the Account Number N 15 
	And user views the Account Holder Name A 40 
	And user views the Available Balance A 3 N102 
	And user views the Transfer Currency defaulted based on the selected debit account currency A3 
	And user enters the transfer amount in How much would you like to send N 132 
	And user selects payment option as Pay Later 
	And user views the Payment Date auto populated with Tomorrows Date 
	And user views the Reminder Date field getting auto populated 
	And user selects the reminder date Ie I would like to receive a reminder x days before Payment Date  where x is less than 30 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	Then user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Within Bank Transfer
	And user verifies the Heading Send to Beneficiary Nick Name AN40 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From A 10 
	And user verifies theAccount TypeAN 30 
	And user verifies the Account Number N 15 
	And user verifies the Account Holder Name A 40 
	And user verifies the Available Balance A 3 N102 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
	And user verifies  the entered transfer amount in How much would you like to send N 132 
	And user verifies payment option as Pay Later 
	And user verifies the Payment Date auto populated with Tomorrows Date 
	And user verifies the reminder date Ie I would like to receive a reminder x days before Payment Date  where x is less than 30 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	Then user clicks the submit button 
	Then user navigates to the Confirmation screen 
	Then user views the Tick symbol 
	Then user views the Transaction status as Your Fund Transfer ccy transfer amount Is successful to 
	Then user views the Transferred From Account number 
	Then user views the reference ID 
	Then user views the Date and time 
	Then user views the Send More Money Button 
	Then clicks the send more money button 
	Then user clicks the more option 
	Then user clicks the Schedule Transfer 
	Then user should view the successful Transaction of own Account Transfer Pay Later  in Schedule Transfer list 
	Then User Logged out of the system successfully 
	
		
@MB_Transfers_211 
Scenario: User transfers the  amount to Local Bank Beneficiary in send money screen using Pay Now option 
	When user clicks on Burger menu 
	And user clicks the transfer menu 
	And navigates to the transfer workspace 
	Then user clicks the more option 
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
	And user selects payment option as Pay Now 
	Then user views the Payment Date auto populated with current date 
	And user selects the purpose of the transfer 
	And user enters the remarks 
	And user ticks the Terms and Conditions 
	Then user views the Notes 
	Then user clicks the Proceed To Confirm 
	And user views the review details screen of Local Bank Transfer 
	And user verifies the Heading Send to Beneficiary Nick Name AN40 
	And user verifies the Beneficiary Photo 
	And user verifies the Debit From A 10 
	And user verifies theAccount TypeAN 30 
	And user verifies the Account Number N 15 
	And user verifies the Account Holder Name A 40 
	And user verifies the Available Balance A 3 N102 
	And user verifies the Transfer Currency defaulted based on the selected debit account currency A3 
	And user verifies  the entered transfer amount in How much would you like to send N 132 
	And user verifies payment option as Pay Now 
	Then user verifies the Payment Date auto populated with current date 
	And user verifies  the purpose of the transfer 
	And user verifies  the remarks 
	And user verifies  the Terms and Conditions 
	And user enters the OTP received to the registered Mobile Number 
	Then user clicks the submit button 
	Then user will be navigated to the Confirmation screen 
	And user should view the Tick symbol 
	And user should view the successful Note Your Fund Transfer ccy transfer amount Is successful to 
	And user should view the Transferred From LB 
	And user should view the Transferred To LB 
	And user should view the Beneficiary Nick Name 
	And user should view the Reference ID 
	And user should view the Date  Time 
	And user should view the Send more Money Button  
	And user should view the Take me to Dashboard 
	And user should view the Save as Favourite Button 
	And user should view the Download Receipt 
	And user should view the Share Receipt Button 
	Then User Logged out of the system successfully
	
	