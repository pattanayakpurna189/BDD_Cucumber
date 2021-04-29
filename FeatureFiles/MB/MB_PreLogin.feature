@tag
Feature: Mobile Banking scenario for PreLogin Module
   Background:
     Given user opens the application and landed in PreLogin page
	
	
  @MB_PreLogin_TC_001
  Scenario: User Self Registration using Account Number 
	When user selects the Register for Online Banking option from the login page
	And user views the identification options
	And user selects the option as Account Number
	And user views the account number validation screen 
	And user enters the Account Number N13 be entered in 463 character block
	And user enters the Date of Birth DP in DDMMYYYY format
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers Register for Online Bankinged mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user clicks on Next button 
	And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45
	And user clicks on Next button 
	And user views the user id details page 
	And user enters the valid User name AN+20 and Password AN+20
	And user reenters the Password in the confirm password field AN+20
	And user clicks on Next button 
	And user views the label as Select your secure image
	And user selects the image which are displayed
	And user views the label as Enter your secure phrase
	And user enters the phrase AN100
	And user clicks on Next button 
	Then user can view the final confirmation screen with message as User Registration is successful
	And user can view Get Started button 
	And user closes the App
	

	
  @MB_PreLogin_TC_005
  Scenario: User Self Registration using Debit Card 
	When user selects the Register for Online Banking option from the login page
	And user views the identification options
	And user selects the option as Debit card
	And user views the debit card number validation screen 
	And user enters the Debit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Debit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers Register for Online Bankinged mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user clicks on Next button 
	And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45
	And user clicks on Next button 
	And user views the user id details page 
	And user enters the valid User name AN+20 and Password AN+20
	And user reenters the Password in the confirm password field AN+20
	And user clicks on Next button 
	And user views the label as Select your secure image
	And user selects the image which are displayed
	And user views the label as Enter your secure phrase
	And user enters the phrase AN100
	And user clicks on Next button 
	Then user can view the final confirmation screen with message as User Registration is successful
	And user can view Get Started button 
	And user closes the App
	
	
  @MB_PreLogin_TC_009
  Scenario: User Self Registration using Credit Card 
	When user selects the Register for Online Banking option from the login page
	And user views the identification options
	And user selects the option as Credit Card
	And user views the credit card number validation screen 
	And user enters the Credit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Credit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers Register for Online Bankinged mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user clicks on Next button 
	And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45
	And user clicks on Next button 
	And user views the user id details page 
	And user enters the valid User name AN+20 and Password AN+20
	And user reenters the Password in the confirm password field AN+20
	And user clicks on Next button 
	And user views the label as Select your secure image
	And user selects the image which are displayed
	And user views the label as Enter your secure phrase
	And user enters the phrase AN100
	And user clicks on Next button 
	Then user can view the final confirmation screen with message as User Registration is successful
	And user can view Get Started button 
	And user closes the App
	
	
	
	
  @MB_PreLogin_TC_032
  Scenario: User resets the User Name using Account Number 
	When user selects the Forgot Username option from the login page
	And user views the identification options
	And user selects the option as Account Number
	And user views the account number validation screen 
	And user enters the Account Number N13 be entered in 463 character block
	And user enters the Date of Birth DP in DDMMYYYY format
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	Then user can view Note A 500 message as And its done Username has been sent to your registered Mobile Number and Email ID
	And user can view Sign In button 
	And user closes the App
	

  @MB_PreLogin_TC_036
  Scenario: User resets the User Name using Debit Card 
	When user selects the Forgot Username option from the login page
	And user views the identification options
	And user selects the option as Debit card
	And user views the debit card number validation screen 
	And user enters the Debit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Debit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	Then user can view Note A 500 message as And its done Username has been sent to your registered Mobile Number and Email ID
	And user can view Sign In button  
	And user closes the App
	
	
		
  @MB_PreLogin_TC_040
  Scenario: User resets the user name using Credit Card 
	When user selects the Forgot Username option from the login page
	And user views the identification options
	And user selects the option as Credit Card
	And user views the credit card number validation screen 
	And user enters the Credit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Credit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	Then user can view Note A 500 message as And its done Username has been sent to your registered Mobile Number and Email ID
	And user can view Sign In button  
	And user closes the App
	
	
	
  @MB_PreLogin_TC_051
  Scenario: User resets the Password using Account Number 
	When user selects the Forgot Password option from the login page
	And user views the identification options
	And user selects the option as Account Number
	And user views the account number validation screen 
	And user enters the Account Number N13 be entered in 463 character block
	And user enters the Date of Birth DP in DDMMYYYY format
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	And user enters the password in the field New Password AN+20
	And user reenters the password in the field Confirm Password AN+20
	And user clicks on Next button
	Then user can view Note A 500 message as And its done Password changed successfully
	And user can view Sign In button 
	And user closes the App
	
	
  @MB_PreLogin_TC_055
  Scenario: User resets the Password using Debit Card 
	When user selects the Forgot Password option from the login page
	And user views the identification options
	And user selects the option as Debit card
	And user views the debit card number validation screen 
	And user enters the Debit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Debit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	And user enters the password in the field New Password AN+20
	And user reenters the password in the field Confirm Password AN+20
	And user clicks on Next button
	Then user can view Note A 500 message as And its done Password changed successfully
	And user can view Sign In button  
	And user closes the App
	
	
  @MB_PreLogin_TC_059
  Scenario: User resets the password using Credit Card 
	When user selects the Forgot Password option from the login page
	And user views the identification options
	And user selects the option as Credit Card
	And user views the credit card number validation screen 
	And user enters the Credit Card Number N16 will be entered in 4 character block will be masked
	And user enters the Credit Card pin N4
	And user enters the Qatari ID N13 
	And user clicks on Next button
	And user views the label1 AN+100 as Great going Verify its you… and A verification code OTP has been sent to you on XXX XXX last 4 digits of customers registered mobile number Enter the code below
	And user views the label2 AN50 as Please enter your One Time PasswordOTP
	And user enters otp N6
	And user views the check box as Please confirm your secure access image and phrase
	And user views the secure image and secure phrase
	And user clicks on Next button 
	And user enters the password in the field New Password AN+20
	And user reenters the password in the field Confirm Password AN+20
	And user clicks on Next button
	Then user can view Note A 500 message as And its done Password changed successfully
	And user can view Sign In button  
	And user closes the App
	
	
	


######### Added By Purna 03rd August ******************************************************************************************************************************************************************************************************************************************************************************
		
		
	@MB_PreLogin_TC_002 
	Scenario:
	User views the error message for entered account number and Qatari id is not matching with the values maintained in the core system for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
		
	@MB_PreLogin_TC_003 
	Scenario:
	User views the error message for not entering the values in the account number field for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user does not enters the account number 
		Then user can view the error message 
		And user closes the App 
		
	@MB_PreLogin_TC_004 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in self registration using account number 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen sign up option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_006 
	Scenario:
	User views the error message for entered debit card number and Qatari id is not matching with the values maintained in the core system for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
	@MB_PreLogin_TC_007 
	Scenario:
	User views the error message for not entering the values in the debit card number field for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user does not enters the debit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_008 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in self registration using debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen sign up option selection screen 
		And user closes the Apps 
	@MB_PreLogin_TC_010 
	Scenario:
	User views the error message for entered credit card number and Qatari id is not matching with the values maintained in the core system for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the Apps 
	@MB_PreLogin_TC_011 
	Scenario:
	User views the error message for not entering the values in the credit card number field for self registration 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user does not enters the cedit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_012 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in self registration using Credit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen sign up option selection screen 
		And user closes the App 
		
	@MB_PreLogin_TC_014 
	Scenario:
	User views the error message for entering the user name less than 6 character for self registration debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the User name AN+20 which is less than 6 character 
		Then user can view the error message as User id must be minimum 6 characters long <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_015 
	Scenario:
	User views the error message for entering the user name greater than 20 character for self registration using debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the User name AN+20 which is greater than 20 character 
		Then user can view the error message as User id must be maximum 20 characters long <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_016 
	Scenario:
	User views the error message for entering the user name which is not a alpha numeric for self registration using debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the User name AN+20 which is not a alpha numeric 
		Then user can view the error message as User id must by alpha numeric <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_017 
	Scenario:
	User views the error message for entering the user name which has a special character for self registration debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the User name AN+20 which is greater than 20 character 
		Then user can view the error message as User id must not have special characters <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_019 
	Scenario:
	User views the error message for entering password less than 8 character long for self registration using account number 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 
		And user enters the Password AN20 which is less that 8 character long 
		Then user can view the error message as Your Password must be minimum of 8 character long <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_020 
	Scenario:
	User views the error message for entering password greater than 20 character long for self registration using account number 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 
		And user enters the Password AN20 which is greater than 20 character long 
		Then user can view the error message as Your Password must be maximum of 20 character long <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_021 
	Scenario:
	User views the error message for entering the Password same as User Id for self registration using account number 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 
		And user enters the Password AN20 which is same as User id 
		Then user can view the error message as Password cannot be same as User Id <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_022 
	Scenario:
	User views the error message for entering the password which is not containing the upper lower number special characters for self registration using account number 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 
		And user enters the Password AN20 which is not containing the upper lower number and special characters 
		Then user can view the error message as Your password must contain the upper lower number special characters  <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_023 
	Scenario:
	User views the error message for entering the password in the confirm password fields is not same as in the password field for self registration using Debit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 and Password AN+20 
		And user re-enters the different Password in the confirm password field AN+20 
		And user clicks on Next button 
		Then user can view the error message as Re-enter password is not matching with the password 
		And user closes the App 
	@MB_PreLogin_TC_024 
	Scenario:
	User views the error message for not entering the mandatory fields in the user credential creation page for self registration using credit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		And user views the user id details page 
		And user enters the valid User name AN+20 and Password AN+20 
		And user does not enters the confirm password 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_028 
	Scenario:
	User views the error message for entering the invalid otp for self registration using Credit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 which is invalid 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		Then user can view the error message as Please enter valid OTP <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_029 
	Scenario:
	User views the error message for entering the invalid otp more than three times for self registration using Credit card 
	
		When user selects the Register for Online Banking option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers Register for Online Bankinged mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters invalid otp N6 more than three times 
		And user clicks on Next button 
		And user reviews the details Full Name AN+35 Email AN+35 Mobile N10 Address AN+45 
		And user clicks on Next button 
		Then user can view the error message as You have entered the wrong OTP three times Please initiate the registration process again <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_030 
	Scenario:
	User views the error message for the registering with already register details for the online banking application 
	
		When user selects the Register option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the pop up error message as This combination of data is already registered for Online banking Please log in 
		And user clicks on the OK button 
		Then the application will close the self-registration window 
		And user closes the App
		
	@MB_PreLogin_TC_033 
	Scenario:
	User views the error message for entered account number and Qatari id is not matching with the values maintained in the core system for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
		
	@MB_PreLogin_TC_034 
	Scenario:
	User views the error message for not entering the values in the account number field for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user does not enters the account number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_035 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in forgot user name using account number 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen Forgot Username option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_037 
	Scenario:
	User views the error message for entered debit card number and Qatari id is not matching with the values maintained in the core system for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
	@MB_PreLogin_TC_038 
	Scenario:
	User views the error message for not entering the values in the debit card number field for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user does not enters the debit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_039 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in forgot user name using debit card 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen Forgot Username option selection screen 
		And user closes the Apps 
	@MB_PreLogin_TC_041 
	Scenario:
	User views the error message for entered credit card number and Qatari id is not matching with the values maintained in the core system for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the Apps 
	@MB_PreLogin_TC_042 
	Scenario:
	User views the error message for not entering the values in the credit card number field for forgot user name 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user does not enters the credit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_043 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in forgot user name using Credit card 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen Forgot Username option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_047 
	Scenario:
	User navigates to the customer identification screen by clicking Back arrow  link in the otp validation screen for forgot user name using account number 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters the otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Back arrow link in the otp validation screen 
		Then user will be navigate to the customer identification screen 
		And user closes the App 
	@MB_PreLogin_TC_048 
	Scenario:
	User views the error message for entering the invalid otp for forgot user name using Debit card 
	
		When user selects the Forgot Username option from the login page 
		And user views the identification options 
		And user selects the option as Debit Card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 which is invalid 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view the error message as Please enter valid OTP <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_052 
	Scenario:
	User views the error message for entered account number and Qatari id is not matching with the values maintained in the core system for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
		
	@MB_PreLogin_TC_053 
	Scenario:
	User views the error message for not entering the values in the account number field for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user does not enters the acccount number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_054 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in forgot password using account number 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen forgot user name option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_056 
	Scenario:
	User views the error message for entered debit card number and Qatari id is not matching with the values maintained in the core system for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
	@MB_PreLogin_TC_057 
	Scenario:
	User views the error message for not entering the values in the debit card number field for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user does not enters the debit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_060 
	Scenario:
	User views the error message for entered credit card number and Qatari id is not matching with the values maintained in the core system for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the Apps 
	@MB_PreLogin_TC_061 
	Scenario:
	User views the error message for not entering the values in the credit card number field for forgot password 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user does not enters the credit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_062 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in forgot password using Credit card 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen forgot user name option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_063 
	Scenario:
	User views the error message for not entering the mandatory fields in the user credential creation page for forgot password using credit card 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user left the otp field blank 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_066 
	Scenario:
	User navigates to the customer identification screen by clicking Back arrow  link in the otp validation screen for forgot password using account number 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters the otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Back arrow link in the otp validation screen 
		Then user will be navigate to the customer identification screen 
		And user closes the App 
	@MB_PreLogin_TC_067 
	Scenario:
	User views the error message for entering the invalid otp for forgot password using Debit card 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Debit Card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 which is invalid 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view the error message as Please enter valid OTP <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_068 
	Scenario:
	User views the error message for entering the invalid otp more than three times for forgot password using Debit card 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Debit Card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters invalid otp N6 more than three times 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view the error message as You have entered the wrong OTP three times Please initiate the registration process again <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_069 
	Scenario:
	User navigates to the otp validation screen by clicking previous menu in the new password set up screen using account number 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		And user enters the password in the field New Password AN+20 
		And user re-enters the password in the field Confirm Password AN+20 
		And user clicks on Previous menu button 
		Then user will be navigate to the otp validation screen 
	@MB_PreLogin_TC_074 
	Scenario:
	User views the error message for entering the Password same as User Id for forgot password using account number 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		And user enters the password in the field New Password AN+20 which is same as user name 
		And user re-enters the password in the field Confirm Password AN+20 
		And user clicks on Next button 
		Then user can view the error message as Password cannot be same as User Id <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_075 
	Scenario:
	User views the error message for entering the password which is not containing the upper lower number special characters for forgot password using account number 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		And user enters the password in the field New Password AN+20 which is not containing the upper lower number special characters 
		And user re-enters the password in the field Confirm Password AN+20 
		And user clicks on Next button 
		Then user can view the error message as Your password must contain the upper lower number special characters  <TBD> 
		And user closes the App 
	@MB_PreLogin_TC_076 
	Scenario:
	User views the error message for entering the password in the confirm password fields is not same as in the password field for forgot password using Debit card 
	
		When user selects the Forgot Password option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		And user enters the password in the field New Password AN+20 
		And user re-enters the password in the field Confirm Password AN+20 which is not same as new password 
		And user clicks on Next button 
		Then user can view the error message as Re-enter password is not matching with the password 
		And user closes the App 
	@MB_PreLogin_TC_078 
	Scenario: User enables the User Id using Account Number 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view Note A 500 message as And it’s done User Id enabled Successfully 
		And user can view Sign In button 
		And user closes the App 
	@MB_PreLogin_TC_079 
	Scenario:
	User views the error message for entered account number and Qatari id is not matching with the values maintained in the core system for Enable User Id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
		
	@MB_PreLogin_TC_080 
	Scenario:
	User views the error message for not entering the values in the account number field for Enable User Id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user does not enters the account number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_081 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in enable user id using account number 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen forgot user name option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_082 
	Scenario: User enables user id using Debit Card 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view Note A 500 message as And it’s done User Id enabled Successfully 
		And user can view Sign In button 
		And user closes the App 
	@MB_PreLogin_TC_083 
	Scenario:
	User views the error message for entered debit card number and Qatari id is not matching with the values maintained in the core system for enable user id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the App 
	@MB_PreLogin_TC_084 
	Scenario:
	User views the error message for not entering the values in the debit card number field for enable user id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user does not enters the debit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_085 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in enable user id using debit card 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Debit card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen forgot user name option selection screen 
		And user closes the Apps 
	@MB_PreLogin_TC_086 
	Scenario: User enables User ID using Credit Card 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view Note A 500 message as And it’s done User Id enabled Successfully 
		And user can view Sign In button 
		And user closes the App 
	@MB_PreLogin_TC_087 
	Scenario:
	User views the error message for entered credit card number and Qatari id is not matching with the values maintained in the core system for enable user id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		Then user can view the error message as Entered values doesn’t match Please recheck and enter correct values 
		And user closes the Apps 
	@MB_PreLogin_TC_088 
	Scenario:
	User views the error message for not entering the values in the credit card number field for enable user id 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user does not enters the credit card number 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_089 
	Scenario:
	User taken back to the sign up option selection screen by clicking back arrow link in enable user id using Credit card 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Credit card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Back arrow link 
		Then user will be navigate to the previous screen forgot user name option selection screen 
		And user closes the App 
	@MB_PreLogin_TC_090 
	Scenario:
	User views the error message for not entering the mandatory fields in the user credential creation page for enable user id using credit card 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Credit Card 
		And user views the credit card number validation screen 
		And user enters the Credit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Credit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user left the otp field blank 
		Then user can view the error message 
		And user closes the App 
	@MB_PreLogin_TC_093 
	Scenario:
	User navigates to the customer identification screen by clicking Back arrow  link in the otp validation screen for enable user id using account number 
	
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Account Number 
		And user views the account number validation screen 
		And user enters the Account Number N13 be entered in 4-6-3 character block 
		And user enters the Date of Birth DP in DD/MM/YYYY format 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters the otp N6 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Back arrow link in the otp validation screen 
		Then user will be navigate to the customer identification screen 
		And user closes the App 
	@MB_PreLogin_TC_094 
	Scenario:
	User views the error message for entering the invalid otp for enable user id using Debit card 
		When user selects the Enable User option from the login page 
		And user views the identification options 
		And user selects the option as Debit Card 
		And user views the debit card number validation screen 
		And user enters the Debit Card Number N16 will be entered in 4 character block will be masked 
		And user enters the Debit Card pin N4 
		And user enters the Qatari ID N13 
		And user clicks on Next button 
		And user views the label1 AN+100 as Great going! Verify it’s you… and A verification code OTP has been sent to you on XXX XXX <last 4 digits of customers registered mobile number> Enter the code below 
		And user views the label2 AN50 as Please enter your One Time PasswordOTP 
		And user enters otp N6 which is invalid 
		And user views the check box as Please confirm your secure access image and phrase 
		And user views the secure image and secure phrase 
		And user clicks on Next button 
		Then user can view the error message as Please enter valid OTP <TBD> 
		And user closes the App 
		
	 