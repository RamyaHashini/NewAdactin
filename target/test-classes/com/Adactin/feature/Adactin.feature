Feature: Hotel Booking in Adactin Application
@smokeTest
Scenario: User Login in the Web Application
Given user Launch the Adactin in Application
When user Enter the "<Username>" in Username Field
And user Enter the "<password>" in password field
Then user click the Login Button And it Navigates to search Hotel page




@sanityTest
Scenario: User Entering the details in Registration form
When user Select the location from Dropdown menu
And user Select the Hotels from Dropdown menu
And user Select the Room-type from Dropdown menu
And user Select the Number of rooms from Dropdown menu
And user Enter the Check-in-date in  check-in-field
And user Enter the Check-out-date in  check-out-field
And user Select the Adults-per-room from Dropdown menu
And user Select the Children-per-room from Dropdown menu
Then user click the Search Button And it Navigates to SelectHotel page

@sanityTest
Scenario: User Select the Hotel in Select hotel page
When user can click radio-button tp Select the Hotel
Then user can click the continue button And it navigate to BookHotelpage

@sanityTest
Scenario: User can enter the personal details in BookHotel page
When user can Enter the first name in Name textbox
And user can enter the last name in lastname field
And user can Enter the adress in Billing address field
And user can Enter the Credit Card No in Credit Card Number field
And user can Select the Credit Card Type in Credit Card Type dropdown menu
And user can Select month and year in Expiry Date field
And user can enter the 3 digit cvv number in cvv number field
Then user can click the Book now button And it navigate to BookingConfirm page.

@sanityTest
Scenario: User Check The Booking details and Logout from application
When user can check the booking details in this page
Then user can click Logout button And it navigate to Logout page.

@regressionTest
Scenario: If User want to relogin We can use this page
Then user can click- "Click here to login again" And it will navigate to index page that is Login page.

