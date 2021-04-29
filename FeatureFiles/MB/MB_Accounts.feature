@tag
Feature: Automation testing scenarios for accounts module - 1
   #21 cases
   Background:
     Given user logged in with valid credentials and landed in Homepage
     
 
@MB_Accounts_TC_001
Scenario: User views the CASA Account Summary 
	When user navigates to Accounts Workspace
	Then user can view Static label as Accounts
	And user can view the Accounts summary for the accounts that the user holds in a carousel
	And can view Account Type (AN(32)) as Minor Sheik Salary Account (ED)
	And can view Account Status (A(20)) as Active, Inactive, Dormant, Blocked 
	And can view 13 digit Account Number (N(13))
	And can view Account Holder Name (AN(35))
	And can view Available Balance label and Available Balance (A(3), N(13,2)) amount in their respective currency 
	Then User Logged out of the system successfully


@MB_Accounts_TC_009  
Scenario: User views CASA Account Details for the respective account appearing in the Account Summary carousel 
	When user navigates to Accounts Workspace
	And user selects the Children Saving Accts (EE) from the caurosel
	And user clicks on Show More
	And views IBAN Number (AN (29)) 
	And views the Account Branch Name (AN+ (100)) 
	And views QAR Equivalent (A(3), N(13,2))
	And views Overdraft Limit (A(3), N(13,2)) 
	And views Cheques in Clearing (N(100)) 
	And views Hold Amount label with drill down v symbol
	And clicks Show Less
	Then the details will be hidden and Show More link will be displayed
	Then User Logged out of the system successfully

@MB_Accounts_TC_012  
Scenario: User views the CASA Accounts Details for the accounts in foreign currency 
	When user navigates to Accounts Workspace and chooses a foreign currecy account from carousel
	And clicks on Show More
	And views the IBAN Number
	And views the Account Branch Name (AN+ (100))
	And views equivalent QAR amount for the foreign currency in QAR Equivalent
	And views Overdraft Limit
	And views Cheques in Clearing
	And views Hold Amount with drill down v symbol
	And clicks Show Less
	Then the details will be hidden and Show More link will be displayed
	Then User Logged out of the system successfully


@MB_Accounts_TC_016  
Scenario: User view statement for Last 5 transactions  
	When user navigates to Accounts Workspace 
	And views last 5 transactions for past 12 months by default  
	And views date of the Transaction
	And views Description of the Transaction (AN(35)) 
	And views Debit/Credit amount with Cr(Credit) indicator and no indication for Debit amount
	And views options(icons) to download as xls, pdf and share option
	And views Load More button if there are more than 5 transactions and clicks on it
	Then user can view more transactions in the statement
	Then User Logged out of the system successfully


@MB_Accounts_TC_018  
Scenario: User views Past months statement 
	When user navigates to Accounts Workspace 
	And user clicks filter icon
	And user selects Past months from the Filter Transactions screen
	And user selects month from the Select month drop down 
	And user clicks Apply button
	Then user can view the past months statement sorted by date in descending order 
	And user can view date of the Transaction
	And user can view Description of the Transaction
	And can view Debit/Credit amount with Cr(Credit) indicator and no indication for Debit amount
	And user can view options(icons) to download as pdf and share option
	Then User Logged out of the system successfully


@MB_Accounts_TC_026  
Scenario: User selects the To date which is equal to From date for the Date Range period selection 
	When user navigates to Accounts Workspace 
	And user clicks Filter icon
	And user selects Date Range from the Filter Transactions screen
	And user select To which is equal to From date from the date picker 
	And user clicks Apply button
	Then user can view selected period statement sorted by date in descending order 
	And user can view date of the Transaction
	And user can view Description of the Transaction
	And can view Debit/Credit amount with Cr(Credit) indicator and no indication for Debit amount
	Then User Logged out of the system successfully

@MB_Accounts_TC_038  
Scenario: User downloads Past months as PDF 
	When user navigates to Accounts Workspace 
	And user clicks Filter icon
	And user selects Past months from the Filter Transactions screen
	And user selects month from the Select month drop down
	And user clicks Apply button
	And user clicks on the Download option(icon) PDF
	Then user can view the statement being downloaded in pdf
	Then User Logged out of the system successfully

@MB_Accounts_TC_044  
Scenario: User Registers for E-Statement with registered email id 
	When user navigates to Accounts workspace
	And user clicks More and selects Register for E-statements function from the contextual menu
	And user views registered email id (AN+ (50)), Enrollment Status as Not Subscribed
	And user enables the Subscription check box  as I agree to receive E-statement for all my accounts cards in the above mentioned Email address
	And user clicks on next button
	And user reviews email id (AN+ (50)) and enrollment status and Subscription
	And user views the static label (AN (100)) as Please enter your One Time Password(OTP)
	And user enters the otp
	And user clicks on submit 
	Then user can views tick symbol 
	And user views the success message (AN+ (30)) as Your request has been successfully submitted
	And user can view Reference Number (AN+ (10)), Date and time (DT) should reflect in Misys equation 
	And user can view Go to Home Page button 
	Then User Logged out of the system successfully

@MB_Accounts_TC_045  
Scenario: User provides the email id for Register for E-statements for CASA accounts 
	When user navigates to Accounts workspace
	And user clicks More and selects Register for E-statements function from the contextual menu
	And user enters email id in the Email id field 
	And user views Enrollment Status as Not Subscribed
	And user enables the Subscription check box  as I agree to receive E-statement for all my accounts cards in the above mentioned Email address
	And user clicks on next button
	And user reviews email id (AN+ (50)) and enrollment status and Subscription
	And user views the static label as Please enter your One Time Password(OTP)
	And user enters the otp
	And user clicks on submit 
	Then user can views tick symbol 
	And user views the success message as Your request has been successfully submitted 
	And user can view Reference Number, Date and time should reflect in Misys equation 
	And user can view Go to Home Page button 
	Then User Logged out of the system successfully


@MB_Accounts_TC_060  
Scenario: User request cheque book for the active current account which is in QAR currency 
	When user navigates to Accounts Workspace 
	And user selects the active Current Account (CA) number which is in QAR currency
	And user clicks on more icon
	And user selects the Cheque Book Request contextual Menu
	And user selects the number of cheque book (N(2)) (1 or 2) 
	And number of leaves for the cheque book
	And user views the delivery option as Branch and default home branch name 
	And user enters the remarks (AN+ (100)) 
	And  user accepts the Acceptance of Charges I hereby authorise Ahlibank to enquire and review all the information related to my financial situation as obtained from Qatar Central Bank - Credit Bureau
	And user clicks on Next button
	And user reviews the details previously entered and views static label (AN (100)) as Please enter your One Time Password(OTP)
	And user enters the otp in the otp field
	And user clicks on Submit
	Then user can view the tick symbol  and the heading (AN+ (30)) as your request has been successfully submitted
	And user can view the Reference Number (AN+ (13)) and Date & Time (DT)
	And user can view the Go to Home Page button
	Then User Logged out of the system successfully


@MB_Accounts_TC_067  
Scenario: User request for the cheques book by selecting the other delivery branch 
	When user navigates to Accounts Workspace 
	And user selects the active Current Account (CK) which is in QAR currency
	And user clicks on more icon
	And user selects the Cheque Book Request contextual Menu
	And user selects the number of cheque book (N(2)) (1 - 2) 
	And number of leaves for the cheque book
	And user views the delivery option as Branch
	And user select the delivery branch from the drop down
	And user enters the remarks 
	And  user accepts the Acceptance of Charges I hereby authorise Ahlibank to enquire and review all the information related to my financial situation as obtained from Qatar Central Bank - Credit Bureau  
	And user clicks on Next button
	And user reviews the details previously entered and views the static label as Please enter your One Time Password(OTP)
	And user enters the otp in the otp field 
	And user clicks on Submit
	Then user can view the tick symbol  and the heading (AN+ (30)) as your request has been successfully submitted
	And user can view the Reference Number (AN+ (13)) and Date & Time (DT)
	And user can view the Go to Home Page
	Then User Logged out of the system successfully


@MB_AlRabeh_TC_001  
Scenario: User views Al Rabeh certificate Summary 
	When user navigates to Al Rabeh Certificate Workspace
	Then user can view the label Al Rabeh Certificate  (A(10)) in the band
	And can view Al Rabeh Certificate Summary of the certificates that the user holds in a carousel
	And can view Product Name as Al Rabeh Certificate (A(35))
	And can view Channel Type A(10) as Online or Branch 
	And can view Application Certificate Number (N(10))
	And can view Customer Name (A(35))
	And can view label Certificate Value and the total amount of the certificate lot in QAR (A(3),N(20))
	Then User Logged out of the system successfully


@MB_AlRabeh_TC_004  
Scenario: User views respective Al Rabeh Certificate Details based on certificate selection in carousel 
	When user navigates to Al Rabeh Certificate Workspace
	And chooses a certificate from the carousel
	And clicks Show More
	And views No of Certificates label N(5) with the number of certificates
	And views From Certificate Number label with the number from which the certificate is issued in this lot(N (10))
	And views To Certificate Number label with the number to which the certificate is issued in this lot(N (10))
	And views Issue Date label with the date 
	And clicks Show Less
	Then the details will be hidden and Show More link will be displayed
	Then User Logged out of the system successfully

@MB_AlRabeh_TC_005  
Scenario: User purchases Al Rabeh Certificate using CASA account as the source of funds 
	When user navigates to Al Rabeh Workspace
	And user clicks More icon and selects Purchase Al Rabeh Certificate function from the contextual menu
	And views the No of Certificates  label and enters the number to be purchased (N (5))
	And  views label Certificate value  and the total amount of the certificate lot in QAR(A (3),N(20,2)
	And views the Customer Name label with the customer name(A(35))
	And user selects Account from the Payment Type option showing Account, Credit Card
	And selects a CASA account from the Debit From carousel showing QAR Al Rabeh Savings Accounts (EA) in Active status
	And views the Account type, Account Number, Status, Customer Name, Available Balance label with the balance of the account(A (3),N(20,2)) in the carousel card
	And  views Note 1 If the fund is source from credit card, the charges are as per cash withdrawal charges for the card will be applied/n2 Al Rabeh Certificate purchased by default in expanded mode  
	And user accepts the I have read and accept the terms and conditions checkbox
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And views the static label Please enter your One Time Password(OTP)
	And enters the OTP (N(6))
	And user clicks Submit 
	Then user will be navigated to Purchase Al Rabeh Certificate confirmation screen
	And user can view Tick symbol 
	And user can view Transaction status (AN+ (50)) as Your transaction is processed successfully
	And can view Please make note of your reference number (A(50))
	And can view Date & Time label, Reference ID label with reference number (AN+ (10)) 
	And can view Go to Home Page
	And can view Purchase another Certificate
	And can view Share Certificate
	And can view Download Certificate
	Then User Logged out of the system successfully 

@MB_AlRabeh_TC_006  
Scenario: User purchases Al Rabeh Certificate using Credit Card as the source of funds 
	When user navigates to Al Rabeh Workspace
	And user clicks More icon and selects Purchase Al Rabeh Certificate function from the contextual menu
	And views the No of Certificates  label and enters the number to be purchased (N (5))
	And  views label Certificate value  and the total amount of the certificate lot in QAR(A (3),N(20,2)
	And views the Customer Name label with the customer name(A(35))
	And user selects Credit Card from the Payment Type option showing Account, Credit Card
	And selects a Credit Card from the Debit From carousel showing QAR Credit Cards in Active status
	And  views Note 1 If the fund is source from credit card, the charges are as per cash withdrawal charges for the card will be applied/n2 Al Rabeh Certificate purchased by default in expanded mode
	And user clicks on the collapse ^ button of the notes 
	And user accepts the I have read and accept the terms and conditions checkbox
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And views the static label Please enter your One Time Password(OTP)
	And enters the OTP (N(6))
	And user clicks Submit 
	Then user will be navigated to Purchase Al Rabeh Certificate confirmation screen
	And user can view Tick symbol 
	And user can view Transaction status (AN+ (50)) as Your transaction is processed successfully
	And can view Please make note of your reference number (A(50))
	And can view Date & Time label, Reference ID label with reference number (AN+ (10)) 
	And can view Go to Home Page
	And can view Purchase another Certificate
	And can view Share Certificate
	And can view Download Certificate
	Then User Logged out of the system successfully 


@MB_Balance_TC_001  
Scenario: User applies for Balance Certificate for the account which is in QAR by selecting  preferred language as English 
	When user navigates to Accounts Workspace and clicks on more icon
	And user selects the Balance Certificate contextual Menu
	And user selects the Account number (N(13)) from of Current Account (CA) the drop down and views the available balance (A(3)N(132))
	And user selects preferred language as English (A(8))
	And user views the Fee amount prefixed with QAR and suffixed with 2 decimal
	And user enters  Remarks (AN+(50))
	And user can view the Note  as Fee will be levied to the account for which the Balance certificate is requested /n On successful transaction completion, Balance certificate will also be sent to your CBX-R Mail box
	And user clicks on Next button 
	And user reviews details previously entered 
	And user views the static label as Please enter your One Time Password(OTP)
	And user enters the otp
	And user clicks on Submit
	Then user can view the tick symbol  and the heading as Your transaction is processed successfully  (AN+(50))
	And user can view the label as Please make note of your reference number (A(50))
	And user can view the Reference ID (AN+(10)),  Date & Time   
	And can view Go to Home Page, Issue Another Certificate, Share Certificate and Download Certificate
	Then User Logged out of the system successfully



@MB_Balance_TC_003  
Scenario: User applies for Balance Certificate for the account which is in other currency  
	When user navigates to Accounts Workspace and clicks on more icon
	And user selects the Balance Certificate contextual Menu
	And user selects the Account number from the drop down and views the available balance   
	And user selects preferred language as English
	And user can view the equivalent Fee amount in other currency suffixed with 2 decimal
	And user enters  Remarks 
	And user can view the Note  as Fee will be levied to the account for which the Balance certificate is requested /n On successful transaction completion, Balance certificate will also be sent to your CBX-R Mail box
	And user clicks on Next button 
	And user reviews details previously entered 
	And user views the static label as Please enter your One Time Password(OTP)
	And user enters the otp
	And user clicks on Submit
	Then user can view the tick symbol  and the heading as Your transaction is processed successfully
	And user can view the label as Please make note of your reference number
	And user can view the Reference ID, Date & Time 
	And can view Go to Home Page, Issue Another Certificate, Share Certificate and Download Certificate
	Then User Logged out of the system successfully

	
	
@MB_Homepage_TC_001 
Scenario: User views Portfolio Summary   
	When user lands in Homepage 
	Then user can view I have label with the sum amount of savings, current and deposits accounts, Mobile Wallet balance (A(3),N(13,2)) 
	And can view I owe label with the total outstanding balance in all the loan accounts and credit cards(OS + Unbilled) , OD utilized in CASA (A(3),N(13,2)) 
	And can view various products (A50)) in the order : A - Accounts, B - Borrowings, C -Cards, D - Deposits (including AlRabeh Certificates) and Mobile Wallet with the number of accounts or cards in each product 
	And clicks on a particular product to expand it 
	And views various product types under it 
	And can view Account Number/Card Number (AN(35)) for CASA, Deposits, Loans, Cards account and Mobile Wallet 
	And can view label for balance corresponding to the product (A(3),N(20,2)) 
	Then User Logged out of the system successfully
	
	
	
@MB_Homepage_TC_017 
Scenario: User repeats a Favourite transfer transaction  
	When user views Favourite Transfers in the carousel 
	And views the Bank Name label with the name 
	And views Beneficiary Nick Name label with the name 
	And views the transfer amount of favourite transfer 
	Then user can view the Last Transfer Date 
	And clicks Repeat button 
	Then user can view the send money transfer screen of specific transfer type 
	And can view the details pre-filled 
	And can view transaction date with current date 
	And user can edit the values 
	Then User Logged out of the system successfully
	
	
@MB_IBAN_TC_001 
Scenario: User applies for IBAN Certificate for the account which is in QAR by selecting  preferred language as English  
	When user navigates to Accounts Workspace and clicks on more icon 
	And user selects the IBAN Certificate contextual Menu 
	And user selects the (Ultra Savings Account) Account number (N(13)) from the drop down and views the available balance (A(3)N(132)) 
	And user selects preferred language as English (A(8)) 
	And user views the Fee amount prefixed with QAR and suffixed with 2 decimal 
	And user enters  Remarks (AN+(50)) 
	And user can view the Note  as Fee will be levied to the account for which the IBAN certificate is requested /n On successful transaction completion, IBAN certificate will also be sent to your CBX-R Mail box 
	And user clicks on Next button 
	And user reviews details previously entered 
	And user views the static label as Please enter your One Time Password(OTP) 
	And user enters the otp  (N(6)) 
	And user clicks on Submit 
	Then user can view the tick symbol  and the heading as Your transaction is processed successfully  (AN+(50)) 
	And user can view the label as Please make note of your reference number (A(50)) 
	And user can view the Reference ID (AN+(10)),  Date & Time 
	And can view Go to Home Page, Issue Another Certificate, Share Certificate and Download Certificate 
	Then User Logged out of the system successfully
	
	
	
@MB_IBAN_TC_003 
Scenario: User applies for IBAN Certificate for the account which is in other currency   
	When user navigates to Accounts Workspace and clicks on more icon 
	And user selects the IBAN Certificate contextual Menu 
	And user selects the (Current Account (CA)) Account number from the drop down and views the available balance 
	And user selects preferred language as English 
	And user can view the equivalent Fee amount in other currency suffixed with 2 decimal 
	And user enters  Remarks 
	And user can view the Note  as Fee will be levied to the account for which the IBAN certificate is requested /n On successful transaction completion, IBAN certificate will also be sent to your CBX-R Mail box 
	And user clicks on Next button 
	And user reviews details previously entered 
	And user views the static label as Please enter your One Time Password(OTP) 
	And user enters the otp 
	And user clicks on Submit 
	Then user can view the tick symbol  and the heading as Your transaction is processed successfully 
	And user can view the label as Please make note of your reference number 
	And user can view the Reference ID, Date & Time 
	And can view Go to Home Page, Issue Another Certificate, Share Certificate and Download Certificate 
	Then User Logged out of the system successfully
	
	
##Added by Purna*********************************
@MB_Accounts_TC_079
Scenario: User navigates to Accounts workspace and selects the open new term deposits    
	When user navigates to Accounts Workspace 
	And user selects the CASA account
	And user clicks on More icon
	And user selects the Open New Term Deposit contextual Menu
	And user selects the Deposit type, Currency
	And views Deposit value date as current date in dd/mm/yyyy
	And selects Deposit Tenor One month to Three years and Interest Payment frequency as At Maturity
	And user enters the Deposit amount
	And user views the Deposit Rate
	And user selects the Debit account 
	And user view the Available balance and Account name 
	And user selects the maturity instruction as Credit to Account and selects Account for Principal / Interest to be paid to
	And user accepts the Terms and Conditions as Yes I have read the Terms & Conditions and I accept them.
	And user clicks on Next button 
	And user verifies the details entered in data input screen with the review details screen open deposit
	And user views the static label as Please enter your One Time Password(OTP) and enters the otp
	And user clicks on Submit
	Then user can view the tick symbol  and the heading as Your transaction is processed successfully open deposit
	And user can view the label as Please make note of your reference number
	And user can view the Reference ID and Date & Time (DT)
	And user can view the Go to Home Page and Open Another Deposit button 
	Then User Logged out of the system successfully
	
	
		
@MB_Accounts_TC_080
Scenario: User purchases Al Rabeh Certificate using CASA account as the source of funds   
	When user clicks on burger menu and navigates to Accounts workspace
	And user selects Purchase Al Rabeh Certificate function from the contextual menu
	And views the No. of Certificates  label and enters the number to be purchased
	And  views label Certificate value  and the total amount of the certificate lot in QAR
	And views the Customer Name label with the customer name
	And user selects Account from the Payment Type option showing Account, Credit Card
	And selects a CASA account from the Debit From carousel showing accounts in Active status
	And views the Account type, Account Number, Status, Customer Name, Available Balance label with the balance of the account in the carousel card
	And  views Note If the fund is source from credit card, the charges are as per cash withdrawal charges for the card will be applied and Al Rabeh Certificate purchased 
	And user accepts the I have read and accept the terms and conditions checkbox
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen
	And views the static label Please enter your One Time Password(OTP)
	And enters the OTP
	And user clicks Submit 
	Then user will be navigated to Purchase Al Rabeh Certificate confirmation screen
	And user can view Tick symbol 
	And user can view Transaction status (AN+ (50)) as Your transaction is processed successfully
	And can view Please make note of your reference number
	And can view Date & Time label, Reference ID label with reference number
	And can view Go to Home Page
	And can view Purchase another Certificate
	And can view Share Certificate
	And can view Download Certificate
	Then User Logged out of the system successfully
	
			
@MB_AlRabeh_TC_024
Scenario: User redeems Al Rabeh Certificate issued through Online/Mobile  
	When user navigates to Al Rabeh Workspace
	And user clicks More icon and selects Redeem Al Rabeh Certificate function from the contextual menu
	And user selects a certificate issued through Online/Mobile from the Certificate Number dropdown which by default shows the certificate selected in the Al Rabeh Certificate summary
	And views the No. of Certificates  label with the number of certificates in the lot
	And views From Certificate Number label with number from which the certificate is issued in this lot
	And views To Certificate Number label with number till which the certificate is issued in this lot
	And  views  Certificate value label and the total amount of the certificate lot in QAR
	And selects the CASA account to which the funds should be credited from the Credit To carousel which shows Active QAR currency accounts
	And user clicks Next button
	And user verifies the details entered in data input screen with the review details screen Redeem
	And views the static label Please enter your One Time Password(OTP)
	And enters the OTP 
	And user clicks Submit
	Then user will be navigated to Redeem Al Rabeh Certificate confirmation screen
	And user can view Tick symbol 
	And user can view Transaction status as Your transaction is processed successfully
	And can view Please make note of your reference number (A(50))
	And can view Date & Time label, Reference ID label with reference number
	And can view Go to Home Page 
	And can view Take me to Purchase Al Rabeh Certificate Page
	Then User Logged out of the system successfully
	
	
@MB_Homepage_TC_029
Scenario: User views message in Inbox  
	When user navigates to Mailbox
	And views messages from BO users in Inbox with the latest message on top
	And views checkbox to select all messages or multiple messages to archive or delete 
	And views Subject, Category,Sub Category of the message
	And views Reference Number, Received Date, Attachments with the size of the attachment  
	And views Messages over the last month are available. If you wish to save messages for your reference, you can use the archive option
	And views Archive and Delete options
	And clicks a message
	Then user can view detailed view of message 
	And can view Category, Sub-Category, Subject, Date, Reference Number labels with the respective information 
	And can view Message with the content, Attachment (symbol) with the filename
	And can view Messages over the last month are available. If you wish to save messages for your reference, you can use the archive option
	Then User Logged out of the system successfully
	
	
@MB_Homepage_TC_010
Scenario: User views Upcoming Transactions due in the next 15 days for Payments in the Homepage 
	When user views Upcoming Transactions for the next 15 days date wise with three transactions by default showing Bills Generated for which no FVT or SI is set up, Future dated schedule transfer payments,Auto Pay for Pay,Card Payment generated
	And views header Upcoming Transactions
	And views Due in <no.of days to due> days (AN (30))
	And views Your Biller Name payment is coming up
	And clicks Pay Now button
	Then user will be navigated to the Bill payment screen with the details of the selected record auto populated
	Then User Logged out of the system successfully
	
	
	