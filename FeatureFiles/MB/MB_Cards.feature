@tag 
Feature: Mobile Banking scenario for Cards Module 
Background: 
	Given user logged in with valid credentials and landed in Homepage
	When user navigates to Cards Workspace 
	
@MB_DebitCards_TC_001 
Scenario: User views the Debit card summary 
	Then user can view Static label AN100 as Cards 
	And user can view Product name AN30 as Debit Card 
	And user can view Status AN10 field as Active Inactive Blocked Renew 
	And user can view Card Number N20 in 16 digits where first 6 digits and last 4 digits will be displayed in clear text and the middle 6 digits will be masked 
	And user can view Card holder Name AN30 
	And user can view Expiry Date D in the format MMDD 
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_002 
Scenario: User views the Debit card summary which is in Active status 
	Then user can view Static label AN100 as Cards 
	And user can view Product name AN30 as Debit Card
	And user can view Status AN10 as Active 
	And user can view Card Number N20 in 16 digits where first 6 digits and last 4 digits will be displayed in clear text and the middle 6 digits will be masked 
	And user can view Card holder Name AN30 
	And user can view Expiry Date D in the format MMDD 
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_010 
Scenario: User views respective Debit Card details for Visa Debit Card 
	And selects a Debit Card from the carousel 
	And user clicks on Show More 
	And views Card Account Number label with the card account number N20 
	And views Issuing Branch label with the branch A35 
	And views Card Status A15 with the status Active 
	And views Card Type label with the type Visa Debit Card A20 
	And views toggle button for Block Card 
	And clicks Show Less 
	Then the details will be hidden and Show More link will be displayed 
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_012 
Scenario: User blocks Active Debit Card by using the Toggle button 
	And selects a debit card from the carousel 
	And user clicks on Show More 
	And views Card Account Number label with the card account number displayed N20 
	And user views Issuing Branch label with the branch A35 
	And user views Card Status A15 with the status Active displayed
	And user views Card Type label with the type Debit Classic displayed A20 
	And user turns on the toggle button for Block Card 
	Then the Debit Card will be blocked 
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_013 
Scenario: User unblocks Blocked debit Card by using the Toggle button 
	And selects a blocked debit card from the carousel 
	And user clicks on Show More 
	And views Card Account Number label with the card account number displayed N20 
	And user views Issuing Branch label with the branch A35 
	And user views Card Status A15 with the status Active displayed
	And user views Card Type label with the type Debit Classic displayed A20 
	And user turns off the toggle button for Block Card 
	#And will be directed to Unblock Card business function OTP page 
	#And enters the OTP 
	#And user Clicks on Submit button 
	#Then user will be navigated to Unblock Debit Card confirmation screen 
	#And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	#And can view Please make note of your reference number  A 50 
	#And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	#And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	#And can view Take me to Cards Page and Take me to Home Page button 
	And the Debit Card will be unblocked 
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_014 
Scenario: User activates New debit card 
	And selects a new Visa Premium Debit Card from the carousel 
	And user selects Activate Card function from the contextual menu 
	And views popup Please set  create PIN for all your new cards using Set  Create card PIN 
	And views the Card Holder NameA140 
	And selects the date from the Card Expiry Date dropdown in MMYY format where MM1  12 values and YYcurrent year to next 10 years values 
	And clicks Next  
	And user verifies the details entered in data input screen with the review details screen Activate Card 
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Activate Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted Activate CardAN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	And can view the card status as Active
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_016 
Scenario: User activates replaced debit card 
	And selects a replaced debit card from the carousel 
	And user selects Activate Card function from the contextual menu 
	And views popup Please set  create PIN for all your new cards using Set  Create card PIN 
	And views the Card Holder NameA140 
	And selects the date from the Card Expiry Date dropdown in MMYY format where MM1  12 values and YYcurrent year to next 10 years values 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Activate Card
	And user views static label Please enter your One Time PasswordOTP and enters valid OTP 
	And user clicks Submit 
	Then user will be navigated to Activate Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted Activate CardAN+ 30 
	And can view Please make note of your reference number 
	And can view Reference ID label with the number Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank 
	And can view Take me to Cards Page and Take me to Home Page button 
	And can view the card status as Active
	Then User Logged out of the system successfully 
	
	
@MB_DebitCards_TC_028 
Scenario:
User with Active Card requests for Debit Card replacement for Lost card 
	And selects an Active Visa Debit Card from the carousel 
	And user selects Card Replacement function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for replacement as Lost from the dropdown showing Lost Damaged Early Renewal Others 
	And selects the delivery branch as the default Home Branch 
	And views the Fees for Card replacement A 3 N132 and enters Remarks AN+ 100 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Debit Card Replacement confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_029 
Scenario:
User with Active Card requests for Debit Card replacement with reason as Others and changes the delivery branch 
	And selects an Active debit card from the carousel 
	And user selects Card Replacement function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for replacement as Others from the dropdown showing Lost Damaged Early Renewal Others 
	And user views the reason option getting enabled 
	And user enters the reason in reason text field 
	And selects the delivery branch as any other branch other than the default home branch 
	And views the Fees for Card replacement A 3 N132 and enters Remarks AN+ 100 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and views the auto filled OTPN6 
	And user clicks Submit 
	Then user will be navigated to Debit Card replacement confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	
	Then User Logged out of the system successfully 
	
	
@MB_DebitCards_TC_041 
Scenario: User request for blocks Active Debit Card 
	And selects an Active debit card from the carousel 
	And selects an Active Visa Platium Private Debit card from the carousel 
	And user selects Block Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for block as Temporary block 
	And user enters the remarks AN100 
	And user views the Note as TBD by default in expanded mode 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Block Debit Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	
	Then User Logged out of the system successfully 
	
	
@MB_DebitCards_TC_053 
Scenario: User request for Unblocks Debit Card which is temporary blocked 
	And selects a Blocked debit card from the carousel 
	And user selects Unblock Card function from the contextual menu 
	And views the Card Holder NameA140 
	And views the Reason for block which is temporarily blocked 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Unblock Debit Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	
	Then User Logged out of the system successfully 
	
	
@MB_DebitCards_TC_064 
Scenario: User request to Stop Active Debit Card which is lost 
	And selects an Active debit card from the carousel 
	And user selects Stop Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for stop as Lost from the dropdown showing Lost and Stolen 
	And views the LostStolen Date field and enters the date 30 days before current date 
	And user enters the block remarks AN100 
	And user views the Note as TBD by default in expanded mode 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Stop Debit Card confirmation screen 
	And can view Tick symbol and heading  Your request for block has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	
	Then User Logged out of the system successfully 
	
@MB_DebitCards_TC_065 
Scenario: User request to Stop Active Debit Card which is Stolen 
	And selects an Active debit card from the carousel 
	And user selects Stop Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for stop as Stolen from the dropdown showing Lost and Stolen 
	And views the LostStolen Date field and enters the date 30 days before current date 
	And user enters the remarks AN100 
	And user views the Note as TBD by default in expanded mode 
	And user clicks on the collapse  button of notes 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and views the auto filled OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Stop Debit Card confirmation screen 
	And can view Tick symbol and heading  Your request fot block has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	And cannot view the blocked card in Card summary
	Then User Logged out of the system successfully 
	
	##Credit Cards################################################################
	
	
@MB_CreditCards_TC_001 
Scenario: User views Credit Card Summary 
	Then user can view Static label as CardsAN 100 
	And can view image of the actual card type with the details embossed on it 
	And can view Product Name AN 30 as Cash Back Credit Card 
	And can view Card Status  AN10  as Active Inactive  BlockedTemporary  Renew 
	And can view 16 digit Credit Card Number N20 where the first 6 and last 4 digits will be displayed in clear text and the middle 6 digits will be masked 
	And can view Card Holder Name AN 30 and Expiry Date in the MMDD form 
	And can view Available Credit Limit A3 N132 
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_002 
Scenario: User views Credit Card Summary for cards in Active status 
	Then user can view Static label as Cards 
	And can view image of the actual card type with the details embossed on it 
	And can view Product Name as TBD 
	And can view Card Status as Active 
	And can view 16 digit Credit Card Number where the first 6 and last 4 digits will be displayed in clear text and the middle 6 digits will be masked 
	And can view Card Holder Name Expiry Date Available Credit Limit 
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_008 
Scenario:
User views respective Credit Card details based on the credit card selection in carousel 
	And selects a Credit Card from the carousel 
	And user clicks on Show More 
	And views Card Number label with the 16 digit number where the first 6 and last 4 digits will be displayed in clear text and the middle 6 digits will be masked  N20 
	And views Card Account Number label with the number N25 
	And views Card Holder Name label with the name A35  Product Type label with the type TBD A 50 
	And views Card Type label as Primary Supplementary A20 Card Status A15 as  Active Inactive Blocked Temporary Renew Issuing Branch label with the branch A35 
	And views Credit Limit N132 Outstanding Balance N132 Unbilled AmountN132 Available Purchase LimitN132Available Cash LimitN132Last Statement balanceN132 
	And views Minimum Payment DueN132 Overdue AmountN132 and Last Payment Received N132 Available Reward Points N20 and Payment Due Date with the date 
	And views Pending AmountA3 N132 with v drill down symbol Cumulative SpendsA3 N132 and Target SpendsA3 N132 
	And views toggle button for Block Card 
	And clicks Show Less 
	Then the details will be hidden and Show More hyperlink will be displayed 	
	Then User Logged out of the system successfully 
	
	
@MB_CreditCards_TC_011 
Scenario: User blocks Active Card by using the Toggle button 
	And selects a credit card from the carousel to be blocked
	And user clicks Show More 
	#And views Card Number label with the 16 digit number where the first 6 and last 4 digits will be displayed in clear text and the middle 6 digits will be masked  N20 
	#And can view Card Account Number label with the number N25 
	#And views Card Holder Name label with the name  Product Type label with the type TBD 
	#And can view Card Type label as Primary Card Status as  Active Issuing Branch label with the branch 
	#And views Credit Limit Outstanding Balance  Unbilled AmountN132 Available Purchase Limit Available Cash Limit Last Statement balance 
	#And views Minimum Payment Due Overdue Amount Last Payment Received Available Reward Points and Payment Due Date with the date 
	#And views Pending Amount Cumulative Spends and Target Spends 
	And user turns on the toggle button for Block Card 
	Then the Credit Card will be blocked 
	
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_012 
Scenario: User unblocks Blocked Card by using the Toggle button 
	And selects a credit card from the carousel to be unblocked
	And user clicks Show More 
	And views Card Number label with the 16 digit number where the first 6 and last 4 digits will be displayed in clear text and the middle 6 digits will be masked  N20 
	#And can view Card Account Number label with the number N25 
	#And views Card Holder Name label with the name  Product Type label with the type TBD 
	#And views Card Type label as Supplementary Card Status as  BlockedTemporary Issuing Branch label with the branch 
	#And views Credit Limit Outstanding Balance  Unbilled AmountN132 Available Purchase Limit Available Cash Limit Last Statement balance 
	#And views Minimum Payment Due Overdue Amount Last Payment Received Available Reward Points and Payment Due Date with the date 
	#And views Pending Amount Cumulative Spends and Target Spends 
	#And user turns off the toggle button for Block Card 
	#And will be directed to Unblock Card business function OTP page 
	#And enters the OTP 
	#And user Clicks on Submit button 
	#Then user will be navigated to Unblock Card confirmation screen 
	#And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	#And can view Please make note of your reference number  A 50 
	#And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	#And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	#And can view Take me to Cards Page and Take me to Home Page button 
	And the Credit Card will be unblocked 
	
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_013 
Scenario: User activates New credit card 
	And selects a new Credit card from the carousel 
	And user selects Activate Credit Card function from the contextual menu 
	And views popup Please set  create PIN for all your new cards using Set  Create card PIN 
	And views the Card Holder NameA140 
	And selects the date from the Card Expiry Date dropdown in MMYY format where MM1  12 values and YYcurrent year to next 10 years values 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Activate Card
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Activate Credit Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted Activate CardAN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 	
	And can view the card status as Active
	Then User Logged out of the system successfully 
	
	
@MB_CreditCards_TC_027 
Scenario:
User with Active Card requests for Credit Card replacement for Lost card 
	And selects an Active Visa Signature Black Credit card from the carousel 
	And user selects Credit Card Replacement function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for replacement as Lost from the dropdown showing Lost Damaged Early Renewal Others 
	And selects the delivery branch as the default Home Branch 
	And views the Fees for Credit Card Replacement A 3 N132 and enters Remarks AN+ 100 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Replacement confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 	
	Then User Logged out of the system successfully 
	 
@MB_CreditCards_TC_028 
Scenario:
User with Inactive Card requests for Credit Card Replacement with reason as Others and changes the delivery branch 
	And selects an Inactive Credit card from the carousel 
	And user selects Credit Card Replacement function from the contextual menu and views error	
	#And views the Card Holder NameA140 
	#And selects the Reason for replacement as Others from the dropdown showing Lost Damaged Early Renewal Others 
	#And views the Specify field AN25 getting enabled enters the reason for replacement in Specify 
	#And selects the delivery branch as any other branch other than the default home branch 
	#And views the Fees for Credit Card Replacement A 3 N132 and enters Remarks AN+ 100 
	#And clicks Next 
	#And user verifies the details entered in data input screen with the review details screen 
	#And views static label Please enter your One Time PasswordOTPAN100 and views auto filled OTPN6 
	#And user clicks Submit 
	#Then user will be navigated to Credit Card Replacement confirmation screen 
	#And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	#And can view Please make note of your reference number  A 50 
	#And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	#And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	#And can view Take me to Cards Page and Take me to Home Page button 
	Then User Logged out of the system successfully 
	
	
	
	
@MB_CreditCards_TC_040 
Scenario: User views monthly Credit Card Statement 
	And selects a Visa Platinum Credit Card from the carousel 
	And user clicks Filter icon 
	And user selects Monthly Statement from the Filter Transactions screen showing Monthly Statement Date Range Unbilled Transactions 
	And selects the month from the month dropdown showing the last 12 months 
	And clicks Apply 
	Then the transaction grid will be displayed 
	And user can view Opening Balance label A3 N132 PaymentsCredits label A3 N132 Finance Charges label A3 N132 Closing Balance label A3 N132 with the respective information only for Monthly Statement 
	And can view Transaction Date Posting Date Transaction amount A3 N132 in local or foreign currency and Billing Amount A3 N132 in QAR currency where amount is displayed with CRCredit indicator and no indication for Debit amount 
	And can view Description AN+50 with Date of Transaction Type of Transaction as Credit and Merchant Details 
	Then User Logged out of the system successfully 
	
	
		
@MB_CreditCards_TC_044 
Scenario: User views Credit Card Statement for a particular date range 
	And selects a Visa Signature Blue Credit Card from the carousel 
	And user selects Credit Card statement from the contextual menu and clicks Filter icon 
	And user selects Date Range from the Filter transactions screen 
	And views From and To fields for selecting the date 
	And selects From date two months before the current date from the date picker 
	And selects To date as current date from the date picker 
	And clicks Apply 
	Then the transaction grid will be displayed 
	And can view Transaction Date Posting Date Transaction amount A3 N132 in local or foreign currency and Billing Amount A3 N132 in QAR currency where amount is displayed with CRCredit indicator and no indication for Debit amount 
	And can view Description with Date of Transaction Type of Transaction as Credit and Merchant Details 
	Then User Logged out of the system successfully 
	
	
	
	
	
@MB_CreditCards_TC_069 
Scenario:
User makes payment for Active Credit Card for Last Statement Balance using Active CASA account with Pay Now option 
	And selects an Active Credit card from the carousel 
	And user selects Credit Card Payment function from the contextual menu 
	And user selects an Active CASA account from the Debit Account Number dropdown 
	And views Available Balance of the selected account A 3 N 132 prefixed with the currency 
	And views the Payment Due Date Outstanding Balance A 3 N 132 Unbilled Amount 
	And selects Last Statement Balance from the Payment Option dropdown showing Last Statement Balance Minimum Amount Due and Pay Preferred Amount 
	And views the Amount being auto populated A 3 N 132 
	And selects Pay Now from the Payment Type dropdown showing Pay Now and Pay Later 
	And views Payment Date as current date and enters Remarks AN100 
	And clicks Next
	And user verifies the details for card payment entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Payment confirmation screen 
	And can view Tick symbol for Card Payment and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_070 
Scenario:
User makes payment for Inactive Credit Card for Minimum Amount Due using Active CASA account with Pay Later option 
	And selects an Inactive Credit card from the carousel 
	And user selects Credit Card Payment function from the contextual menu 
	And user selects an Active CASA account from the Debit Account Number dropdown 
	And views Available Balance of the selected account A 3 N 132 prefixed with the currency 
	And views the Payment Due Date Outstanding Balance A 3 N 132 Unbilled Amount 
	And selects Minimum Amount Due from the Payment Option dropdown 
	And views the Amount for Minimum Due being auto populated A 3 N 132 
	And selects Pay Later from the Payment Type dropdown 
	And selects a future date as Payment Date from the calendar 
	And clicks Next 
	And user verifies the details for card payment entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and views auto filled OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Payment confirmation screen 
	And can view Tick symbol for Card Payment and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_071 
Scenario:
User makes payment for Blocked Credit Card for Unbilled Amount using Active CASA account with Pay Now option 
	And selects a Blocked Credit card from the carousel 
	And user selects Credit Card Payment function from the contextual menu 
	And user selects an Active CASA account from the Debit Account Number dropdown 
	And views Available Balance of the selected account A 3 N 132 prefixed with the currency 
	And views the Payment Due Date Outstanding Balance A 3 N 132 Unbilled Amount 
	And selects Pay Preferred Amount from the Payment Option dropdown 
	And enters the Amount which is not greater than unbilled amount + outstanding balance A 3 N 132 
	And selects Pay Now from the Payment Type dropdown 
	And views Payment Date as current date and enters Remarks AN100
	And clicks Next 
	And user verifies the details for card payment entered in data input screen with the review details screen 
	And views static label Please enter your One Time PasswordOTPAN100 and enters OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Payment confirmation screen 
	And can view Tick symbol for Card Payment and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	Then User Logged out of the system successfully 
	
	
	
	
@MB_CreditCards_TC_099 
Scenario: User requests to Block Credit Card 
	And selects an Active Credit card from the carousel 
	And user selects Block Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for block as Temporary Block 
	And user enters the remarks AN100 
	And user views the Note as TBD by default in the expanded mode 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Block Credit Card  confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	Then User Logged out of the system successfully 
	
	
	
	
	@MB_CreditCards_TC_111 
Scenario:
User requests to Unblock Credit Card which is temporary blockedAnd selects a Blocked Credit card from the carousel 
	And user selects Unblock Card function from the contextual menu 
	And views the Card Holder NameA140 
	And views the Reason for block which is temporarily blocked 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Unblock Credit Card confirmation screen 
	And can view Tick symbol and heading  Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
	
@MB_CreditCards_TC_122 
Scenario: User requests to Stop Credit Card  which is lost 
	And selects an Active Credit card from the carousel 
	And user selects Stop Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for stop as Lost from the dropdown showing Lost and Stolen 
	And views the LostStolen Date field and enters the date 30 days before current date 
	And user enters the block remarks AN100 
	#And user enters the remarks AN100 
	And user views the Note as TBD by default in expanded mode 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and user enters the OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Stop Credit Card  confirmation screen 
	And can view Tick symbol and heading  Your request for block has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	And cannot view the blocked card in Card summary
	Then User Logged out of the system successfully 
	
@MB_CreditCards_TC_123 
Scenario: User request to stop Active Credit Card which is Stolen 
	And selects an Active Credit card from the carousel 
	And user selects Stop Card function from the contextual menu 
	And views the Card Holder NameA140 
	And selects the Reason for stop as Stolen from the dropdown showing Lost and Stolen 
	And views the LostStolen Date field and enters the date 15 days before current date 
	And user enters the block remarks AN100 
	#And user enters the remarks AN100 
	And user views the Note as TBD by default in the expanded mode 
	And user clicks collapse  button of notes 
	And user clicks on Next button 
	And user reviews the details previously entered 
	And user the OTP Header AN100 as Please Enter your One Time Password and views the auto filled OTP N6 
	And user Clicks on Submit button 
	Then user will be navigated to Debit stop confirmation screen 
	And can view Tick symbol and heading  Your request for block has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
	
@MB_CreditRenewal_TC_001 
Scenario: User renews Active Credit card with default home branch for delivery 
	And user selects an Active Credit card that is going to be expired  due for renewal within 3 months from the current business date from the carousel 
	And user selects Card Renewal function from the contextual menu 
	And selects Early Renewal from the Reason dropdown A20 showing Early Renewal and Others 
	And selects Delivery Option as the default home branch AN+50 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Card Renewal 
	And views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Renewal confirmation screen 
	And can view Tick symbol and heading for Card Renewal Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
@MB_CreditRenewal_TC_002 
Scenario:
User renews Active Credit card with reason as Others and changes the delivery branch 
	And user selects an Active Credit card that is going to be expired  due for renewal within 3 months from the current business date from the carousel 
	And user selects Card Renewal function from the contextual menu 
	And selects Others from the Reason dropdown showing Early Renewal and Others 
	And views Remarks field getting enabled and enters Remarks AN+20 when the reason is selected as Others 
	And selects Delivery Option as any other branch other than the default home branch 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Card Renewal 
	And views static label Please enter your One Time PasswordOTPAN100 and views auto filled OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Renewal confirmation screen 
	And can view Tick symbol and heading for Card Renewal Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
	
	
@MB_DebitRenewal_TC_001 
Scenario: User renews Active debit card with default home branch for delivery 
	And user selects an Active Debit card that is going to be expired  due for renewal within 3 months from the current business date from the carousel 
	And user selects Card Renewal function from the contextual menu 
	And selects Early Renewal from the Reason dropdown A20 showing Early Renewal and Others 
	And selects Delivery Option as the default home branch AN+50 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Card Renewal
	And views static label Please enter your One Time PasswordOTPAN100 and enters OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Renewal confirmation screen 
	And can view Tick symbol and heading for Card Renewal Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
@MB_DebitRenewal_TC_002 
Scenario:
User renews Active debit card with reason as Others and changes the delivery branch 
	And user selects an Active Debit card that is going to be expired  due for renewal within 3 months from the current business date from the carousel 
	And user selects Card Renewal function from the contextual menu 
	And selects Others from the Reason dropdown showing Early Renewal and Others 
	And views Remarks field getting enabled and enters Remarks AN+20 when the reason is selected as Others 
	And selects Delivery Option as any other branch other than the default home branch 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen Card Renewal 
	And views static label Please enter your One Time PasswordOTPAN100 and views auto filled OTPN6 
	And user clicks Submit 
	Then user will be navigated to Credit Card Renewal confirmation screen 
	And can view Tick symbol and heading for Card Renewal Your request has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50 
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button 
	 
	Then User Logged out of the system successfully 
	
	
		
@MB_CreditEstatement_001 
Scenario:
User requests for estatement enrolment with the registered email-id for Credit Card E-statement 
	And user clicks More icon and selects the Enroll for Estatement function from the contextual menu 
	And user views Primary email id label with the email id registered  AN+ 50 with the bank as a read only field 
	And user views Enrollment Status label with Not Subscribed status 
	And user checks the I agree to receive Estatement for all my accounts  cards in the above mentioned Email address checkbox 
	And user clicks Next button 
	And user verifies the details entered in data input screen with the review details screen 
	And user views static label Please enter your One Time PasswordOTP AN100 
	And user enters valid OTP N6 
	And user clicks Submit 
	Then user will be navigated to Estatement enrolment confirmation screen 
	And can view Tick symbol 
	And user can view heading  Your request has been successfully submitted 
	And can view Reference Number label with the number AN+13 
	And can view Date  Time label with the date and time 
	And can view Take me to Dashboard button 
	And Data matches with Misys equationcore system 
	Then User Logged out of the system successfully 
	
	
	
@MB_EasyPaymentPlan_001 
Scenario: User sets up EPP for Unbilled transaction for 3 months tenure 
	And selects a credit card from the carousel 
	And user clicks Filter icon 
	And user filters Unbilled Transactions from the Statement 
	And views the Unbilled transactions 
	And views Convert to EPP hyperlink for transactions eligible for EPP and clicks Convert to EPP 
	And views Easy Payment Plan Request screen 
	And views Credit Card Number label with the card selected in the statement screen with first 6 digits and last 4 digits masked and the rest 6 digits will be displayedN16 
	And views Transaction Date label with date in DDMMYYYY format and views Transaction Description label with description 
	And views Transaction Amount prefixed with the currency of the transaction A3 N133 which is the billing amount from the statement screen 
	And selects Number of Months  as 3 from the dropdown showing 361224 AN20 
	And views Monthly Interest Rate label N22 Monthly Instalment Amount label A3N132 Total Amount Payable label A3N132 with the respective information being auto populated based on the tenure and amount 
	And views Disclaimernote as A fee of QAR 2000 will be levied on your credit card for EPP request Charges applied will not be reversed and will be reflected in the billing statement
	And accepts I agree to the Terms and Conditions checkbox A100 
	And clicks Next 
	And user verifies the details entered in data input screen with the review details screen 
	And user views static label Please enter your One Time PasswordOTP and enters the OTP N6 
	And user clicks Submit 
	Then user will be navigated to Easy Payment Plan Request confirmation screen 
	And can view Tick symbol 
	And user can view heading  Your request has been successfully submitted
	And can view Reference Number label with the number AN+13 
	And can view Date  Time label with the date and time 
	And can view Go to Homepage and Go to Credit Card Statement button 
	
	Then User Logged out of the system successfully 
	
	
	
@MB_EasyPaymentPlan_026 
Scenario: User cancels Active EPP 
	And selects a credit card from the carousel 
	And user selects Easy Payment Plan History from the contextual menu 
	And views EPP requests fulfilled in the last 24 months and EPP requests that are settledcompleted in last 12 months from current date in the form of a grid 
	And views EPP Setup Date label Transaction Description label AN+50 Number of Months N2 Monthly Instalment Amount label A3N133 with the respective information 
	And views Start Date label End Date label with the respective dates and Status A10 as Active 
	And selects an Active EPP record and views EPP details screen 
	And views Credit Card Number label with the card number of EPP transaction selected in EPP history screen with first 6 digits and last 4 digits masked and the rest 6 digits will be displayedN16 
	And views Transaction Date label with date in DDMMYYYY format and views Transaction Description label with description AN+50 
	And views Transaction Amount prefixed with the currency of the transaction A3 N133 which is the billing amount from the statement screen 
	And views Number of Months of the selected EPP transaction AN20 
	And views Monthly Interest Rate label N22 Monthly Instalment Amount label A3N132 Outstanding Amount label A3N132 with the respective information 
	And views Status label with the status A10 
	And views Cancel button enabled for Active EPP and clicks Cancel 
	And views View EPP details Pre confirmation screen 
	And views Credit Card Number Transaction Date Transaction Description Transaction Amount Number of Months Monthly Interest Rate Monthly Instalment Amount Total Amount Payable and Fees with the respective information 
	And user views static label Please enter your One Time PasswordOTP and views the auto filled OTP 
	And user clicks Submit 
	Then user will be navigated to View EPP details confirmation screen 
	And can view Tick symbol 
	And user can view heading  Your request has been successfully submitted
	And can view Reference Number label with the number AN+13 
	And can view Date  Time label with the date and time 
	And can view Go to Homepage and Go to Credit Card Statement button 
	Then User Logged out of the system successfully 
	
	
	
	
@MB_ManageMagneticStripe_TC_003 
Scenario: User adds a new country to the international usage of a debit card 
	And selects an Active debit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu 
	And clicks show button 
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the debit card 
	And  views active International usage records of the debit card in the same screen in a grid format  
	And clicks a add button 
	And views  International Usage  Add Input screen   to add a new country to the list 
	And selects a country form the drop down Valid values are all countries in ISO list 
	And views current date as start date D by default 
	And selects a start date D from the date picker 
	And views card expirty date  as end  date D by default 
	And selects a end date D from the date picker should be equal to current date or greater than current date 
	And clicks next button 
	And verifies the details entered in the input screen with the review details screen 
	And views the label AN please enter your one time password OTP 
	And  views OTP number is  getting auto populated based on the permission given to the app to read the SMS 
	And clicks submit button 
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction 
	And can view heading as Your transaction has been processed successfully 
	And can view a label Please make note of your reference number 
	And can view date and time DT 
	And can view the Reference IDAN
	And can view Go to homepage button 
	And can view add more country button 
	Then User Logged out of the system successfully 
	
	
	
	@MB_ManageMagneticStripe_TC_022 
Scenario:
User terminates debit card usage in a country where it was previously valid and eligible for usage 
	And selects an Active debit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu 
	And clicks show button 
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the debit card 
	And  views active International usage records of the debit card in the same screen in a grid format 
	And clicks a specific country  from the grid 
	And views  International Usage  Modify  Terminate  input screen 
	And clicks terminate button 
	And views  International Usage  Modify  Terminate  pre confirmation screen 
	And views the label AN please enter your one time password OTP  
	And  views OTP number is  getting auto populated based on the permission given to the app to read the SMS 
	And clicks submit button 
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction 
	And can view heading as Your transaction has been processed successfully 
	And can view a label Please make note of your reference number 
	And can view date and time DT 
	And can view the Reference IDAN
	And can view Go to homepage button 
	And can view add more country button 
	And can view the specified record for Debit removed from the list
	Then User Logged out of the system successfully 
	
	
@MB_ManageMagneticStripe_TC_032 
Scenario: User adds a new country to the international usage of a Credit card 
	And selects an Active Credit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu 
	And clicks show button 
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the Credit card 
	And  views active International usage records of the Credit card in the same screen in a grid format 
	And clicks a add button 
	And views  International Usage  Add Input screen   to add a new country to the list 
	And selects a country form the drop down Valid values are all countries in ISO list 
	And views current date as start date D by default 
	And selects a start date D from the date picker 
	And views card expirty date  as end  date D by default 
	And selects a end date D from the date picker should be equal to current date or greater than current date 
	And clicks next button 
	And verifies the details entered in the input screen with the review details screen 
	And views the label AN please enter your one time password OTP 
	And  views OTP number is  getting auto populated based on the permission given to the app to read the SMS 
	And clicks submit button 
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction 
	And can view heading as Your transaction has been processed successfully 
	And can view a label Please make note of your reference number 
	And can view date and time DT 
	And can view the Reference IDAN
	And can view Go to homepage button 
	And can view add more country button 
	Then User Logged out of the system successfully 
	
	
		
@MB_ManageMagneticStripe_TC_051 
Scenario:
User terminates Credit card usage in a country where it was previously valid and eligible for usage 
	And selects an Active Credit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu 
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the Credit card 
	And  views active International usage records of the Credit card in the same screen in a grid format 
	And clicks a specific country  from the grid 
	And views  International Usage  Modify  Terminate  input screen 
	And clicks terminate button 
	And views  International Usage  Modify  Terminate  pre confirmation screen 
	And views the label AN please enter your one time password OTP 
	And  views OTP number is  getting auto populated based on the permission given to the app to read the SMS 
	And clicks submit button 
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction 
	And can view heading as Your transaction has been processed successfully 
	And can view a label Please make note of your reference number 
	And can view date and time DT 
	And can view the Reference IDAN 
	And can view Go to homepage button 
	And can view add more country button 
	And can view the specified record for Credit removed from the list
	Then User Logged out of the system successfully 
	
@MB_Reset_ChangeCardsPIN_TC_001 
Scenario: User Changes/Resets the Debit Card PIN 
	And selects a Active Debit card from the carousel 
	And user selects Reset and Change Card PIN function from the contextual menu 
	And user navigates to the ResetChange card pin page 
	And user views the Enter New PIN label and enters the 4 digit new pin N6 will be masked 
	And user views the Confirm New PIN label and reenters the new pin N6 will be masked 
	And user clicks on Generate OTP button 
	And user views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks on Submit button 
	Then user will be navigated to Resetchange pin confirmation screen 
	And can view Tick symbol and heading  Your request for set pin has been successfully submitted
	And can view Please make note of your reference number 
	And can view Reference ID label with the number Date  Time label with the date and time DT 
	And can view Note Please quote the above reference number in all communications with Ahli bank
	And can view Take me to Home Page and Take me to Cards Page button 
	Then User Logged out of the system successfully 
	
		
@MB_Reset_ChangeCardsPIN_TC_014 
Scenario: User Changes/Resets the Credit Card PIN 
	And selects a Active Credit card from the carousel 
	And user selects Reset and Change Card PIN function from the contextual menu 
	And user navigates to the ResetChange card pin page 
	And user views the Enter New PIN label and enters the 4 digit new pin N6 will be masked 
	And user views the Confirm New PIN label and reenters the new pin N6 will be masked 
	And user clicks on Generate OTP button 
	And user views static label Please enter your One Time PasswordOTPAN100 and enters valid OTPN6 
	And user clicks on Submit button 
	Then user will be navigated to Resetchange pin confirmation screen 
	And can view Tick symbol and heading  Your request for set pin has been successfully submitted 
	And can view Please make note of your reference number
	And can view Reference ID label with the number Date  Time label with the date and time DT 
	And can view Note Please quote the above reference number in all communications with Ahli bank 
	And can view Take me to Home Page and Take me to Cards Page button 	
	Then User Logged out of the system successfully 
	
	

	##Added By Purna*******************************************************************************************************************
	
			
@MB_CreditCards_TC_084
Scenario: User views Reward points
	When user navigates to Cards Workspace and chooses a card from the carousel
	And user selects View or Redeem Reward Points function from the contextual menu
	Then user can view Opening Balance label, Closing Balance label, Earned this month label, Redeemed this month label,  Expired this Month label with the respective amount (N(10))
	And can view TO REDEEM POINTS FOR YOUR VOUCHER 
	And can view Select Outlet label and Points to redeem label
	And can view Note1 <TBD> and Note2 <TBD> by default in the expanded mode
	Then can view To obtain your voucher and Visit any branch and present your Qatari ID and or Account number to collect your Pearl Point voucher.Visit the selected outlet and present the voucher at the time of payment	
	Then User Logged out of the system successfully 
	
	
@MB_CreditCards_TC_085
Scenario: User redeems Reward Points
	When user navigates to Cards Workspace and chooses a card from the carousel
	And user selects View or Redeem Points function from the contextual menu
	And views view Opening Balance label, Closing Balance label, Earned this month label, Redeemed this month label,  Expired this Month label with the respective amount (N(10))
	And views TO REDEEM POINTS FOR YOUR VOUCHER 
	And selects an outlet <TBD> from the Select Outlet dropdown
	And enters the number of Points to redeem which cannot be greater than the reward points Closing balance
	And views Note1 <TBD> and Note2 <TBD> by default in the expanded mode
	Then can view To obtain your voucher and Visit any branch and present your Qatari ID and or Account number to collect your Pearl Point voucher.Visit the selected outlet and present the voucher at the time of payment
	And clicks Redeem button
	And user verifies the details for Reward points entered in data input screen with the review details screen 
	And views static label Please enter your One Time Password(OTP)(AN(100)) and enters OTP
	And user clicks Submit
	Then user will be navigated to View/Redeem Reward Points confirmation screen 
	And can view Tick symbol and heading  Your request for redeem has been successfully submitted AN+ 30 
	And can view Please make note of your reference number  A 50
	And can view Reference ID label with the number AN+ 10 Date  Time label with the date and time 
	And can view Note Please quote the above reference number in all communications with Ahli bank AN100 
	And can view Take me to Cards Page and Take me to Home Page button
	Then User Logged out of the system successfully 
	
	
	@MB_EasyPaymentPlan_023
Scenario: User navigates to EPP history page from EPP View details page
	When user navigates to Cards Workspace and selects a credit card from the carousel
	And user selects Easy Payment Plan History from the contextual menu 
	And views EPP requests fulfilled in the last 24 months and EPP requests that are settled/completed in last 12 months from current date in the form of a grid
	And views EPP Set-up Date label, Transaction Description label, Number of Months, Monthly Instalment Amount label with the respective information
	And views Start Date label, End Date label with the respective dates and Status as Active, Cancelled, Settled
	And selects an Active EPP record and views EPP details screen 
	And views Credit Card Number label with the card number of EPP transaction selected in EPP history screen with first 6 digits and last 4 digits masked and the rest 6 digits will be displayed.(N(16))
	And views Transaction Date label with date in DD/MM/YYYY format and views Transaction Description label with description 
	And views Transaction Amount prefixed with the currency of the transaction (A(3), N(13,3)) which is the billing amount from the statement screen
	And views Number of Months of the selected EPP transaction AN20 
	And views Monthly Interest Rate label (N(2,2)), Monthly Instalment Amount label (A(3),N(13,2)), Outstanding Amount label (A(3),N(13,2)) with the respective information
	And views Status label with the status
	And clicks Back
	Then user will be navigated to EPP history page from EPP View details page
	Then User Logged out of the system successfully 
	
	@MB_ManageMagneticStripe_TC_001
Scenario: View the countries for which the  debit card usage is enabled and check its validity
	#When user navigates to Cards Workspace
	And selects an Active debit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu
	And clicks show button
	Then User can view the list of  3 active International usage records of the debit card in the same screen in a grid format
	And can view the label <A(30)> of the business function 
	And can view the card holder name AN(30) of the debit card  
	#And can view the list of 3 countries for which the selected debit card is enabled 
	And can view the start date <D> from which the debit card is eligible for use (against the listed countries)
	And can view the end date <D> to which the debit card is eligible for use (against the listed countries) (should be equal to current date or greater than current date)
	Then User Logged out of the system successfully 
	
	@MB_ManageMagneticStripe_TC_013
Scenario: Modify the validity of card usage in a specific country for which the debit card usage has been enabled
	#When user navigates to Cards Workspace
	And selects an Active debit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu
	And clicks show button
	#And  views the label <A(30)> of the business function 
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the debit card  
	And  views  3 active  International usage records of the debit card in the same screenin a grid format
	And clicks a specific country  from the grid
	And views  International Usage  Modify  Terminate  input screen
	And  modifies start date <D> from the date picker 
	And modifies  end date <D> from the date picker (should be equal to current date or greater than current date) 
	And clicks modify button
	And verifies the details for modify entered in the input screen with the review details screen
	And views the label <AN (100)> please enter your one time password (OTP)
	And  views OTP <N (6)>number is  getting auto populated based on the permission given to the app to read the SMS.
	And clicks submit button
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction
	And can view heading<AN+ (30)> as Your transaction has been processed successfully
	And can view a label <A (50)>Please make note of your reference number
	And can view date and time DT
	And can view the Reference ID<AN+ (10)>
	And can view Go to homepage button
	And can view add more country button
	Then User Logged out of the system successfully 
	
	
	
	@MB_ManageMagneticStripe_TC_030
Scenario: View the countries for which the  Credit card usage is enabled and check its validity
	#When user navigates to Cards Workspace
	And selects an Active Credit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu
	And clicks show button
	Then User can view the list of  3 active International usage records of the Credit card in the same screen in a grid format
	And can view the label <A(30)> of the business function 
	And can view the card holder name <AN(30)> of the Credit card  
	#And can view the list of 3 countries for which the selected Credit card is enabled 
	And can view the start date <D> from which the Credit card is eligible for use (against the listed countries)
	And can view the end date <D> to which the Credit card is eligible for use (against the listed countries) (should be equal to current date or greater than current date)
	Then User Logged out of the system successfully 
	
	
	@MB_ManageMagneticStripe_TC_042
Scenario: Modify the validity of card usage in a specific country for which the Credit card usage has been enabled
	#When user navigates to Cards Workspace
	And selects an Active Credit card  from the summary carousel 
	And clicks manage magnetic stripe option from the contextual menu
	And  views the label A30 of the business function 
	And  views  the card holder name AN30 of the debit card  
	And  views three active International usage records of the Credit card in the same screenin a grid format
	And clicks a specific country  from the grid
	And views  International Usage  Modify  Terminate  input screen
	And  modifies start date <D> from the date picker 
	And modifies  end date <D> from the date picker (should be equal to current date or greater than current date) 
	And clicks modify button
	And verifies the details entered in the input screen with the review details screen
	And views the label <AN (100)> please enter your one time password (OTP)
	And  views OTP <N (6)>number is  getting auto populated based on the permission given to the app to read the SMS.
	And clicks submit button
	Then user can view the  International Usage  Add Confirmation screen 
	And can view a tick symbol for a successful transaction
	And can view heading<AN+ (30)> as Your transaction has been processed successfully
	And can view a label <A (50)>Please make note of your reference number
	And can view date and time DT
	And can view the Reference ID<AN+ (10)>
	And can view Go to homepage button
	And can view add more country button
	Then User Logged out of the system successfully 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	