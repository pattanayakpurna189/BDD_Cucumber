@tag
Feature: Mobile Banking scenario for Other Services Module
   Background:
    Given user logged in with valid credentials and landed in Homepage
     
   @MB_Loans_TC_001
   Scenario: User views Loan Summary 
   	When user navigates to Borrowings Workspace
	Then user can view Static label as Borrowings
	And can view loans in the carousel ordered in ascending order of open date of the Loan with Loan Type (AN(50)) as Auto Loan(CARE01) 
	And can view  13  digit Loan Account Number (N(13))
	And can view Reference Number AN(30)
	And can view Outstanding Balance  with the Outstanding Balance amount (A (3), N(20,2))  in their respective account currency
	Then User Logged out of the system successfully
   
   	
   @MB_Loans_TC_006
   Scenario: User views Loan Details
   	When user navigates to Borrowings Workspace
	And selects a Consumer Loan(CONE01) from the Loan summary carousel
	Then user can view Loan details
	Then clicks Show More
	And views Loan Application Number label with the Number (AN(30)), Disbursed Amount label with the total disbursed amount (A(3),N(13,2)) 
	And views Interest Rate label with the interest(AN+(6)), Loan Tenor label with the tenure (N(3) A (15)), Remaining Tenor label with the remaining payment tenure(N(3) A (15))
	And views First Installment date label, Last Installment Date label, Next Installment Due Date label with the respective installment dates
	And views Next Installment Due Amount label with next due amount (A(3), N(20,2)), Outstanding Principal label with the amount (A(3) N(13,2)), Accrued Interest label with the current Accrued interest (A(3) N(13,2)), Overdue Amount label with the amount (A (3) N(20,2))
	And views Number of Deferment (hyperlink) and Number of overdue days label with the days
	And clicks Show Less
	Then the details will be hidden and Show More link will be displayed
	Then User Logged out of the system successfully
   	
  
   	
   @MB_Loans_TC_013
   Scenario: User Views Loan Repayment Schedule for a selected loan
   	When user navigates to Borrowings Workspace
	And chooses a loan from the Loan summary carousel
	And chooses a Mortgage Loan(MORQ01) from the Loan summary carousel
	And clicks More icon and selects Loan Repayment Schedule function from the contextual menu
	Then user can view respective Loan repayment schedule details of the loan in Loan summary carousel
	And can view Loan Account Number label with the Number (N(15)), Loan Currency label with the currency (A(3)) 
	And can view Customer ID label with the id(N(20)), Customer Name label with the name (AN+(50))
	And can view Due Date label with the date, Principal Amount label, Interest Amount label, Installment Amount label with the respective amount prefixed with Loan currency and suffixed with two decimal places in the table
	And can view Status of Payment as Paid or Unpaid 
	Then User Logged out of the system successfully
	
	
	
	