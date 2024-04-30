package com.Adactin.StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.Adactin.runner.Runnerclass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	public static WebDriver driver=Runnerclass.driver; //Runnerclass driver that is we are calling Runner class driver to execute
	
	@Given("^user Launch the Adactin in Application$")
	public void user_Launch_the_Adactin_in_Application() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
	}

	@When("^user Enter the \"([^\"]*)\" in Username Field$")
	public void user_Enter_the_in_Username_Field(String userdata) throws Throwable {
		WebElement username= driver.findElement(By.id("username"));
		username.sendKeys("Jivita04");
//    	username.sendKeys(userdata);
	    	}

	@When("^user Enter the \"([^\"]*)\" in password field$")
	public void user_Enter_the_in_password_field(String passData) throws Throwable {

	WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("123456");
		
	}

	
//	@When("^user Enter the Username in Username Field$")
//	public void user_Enter_the_Username_in_Username_Field() throws Throwable {
//		WebElement username= driver.findElement(By.id("username"));
//		username.sendKeys("Jivita04");
//	}
//
//	@When("^user Enter the password in password field$")
//	public void user_Enter_the_password_in_password_field() throws Throwable {
//		
//		WebElement password = driver.findElement(By.id("password"));
//		password.sendKeys("123456");
//	   
//	}
//	

	@Then("^user click the Login Button And it Navigates to search Hotel page$")
	public void user_click_the_Login_Button_And_it_Navigates_to_search_Hotel_page() throws Throwable {
		WebElement lgbtn = driver.findElement(By.id("login"));
		lgbtn.click();
	}
	

	@When("^user Select the location from Dropdown menu$")
	public void user_Select_the_location_from_Dropdown_menu() throws Throwable {
		WebElement location=driver.findElement(By.id("location"));
		Select s=new Select(location);
		s.selectByVisibleText("Brisbane");
		
	    	}
	

	@When("^user Select the Hotels from Dropdown menu$")
	public void user_Select_the_Hotels_from_Dropdown_menu() throws Throwable {
		WebElement hotel=driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByIndex(3);
		
	 
	}

	@When("^user Select the Room-type from Dropdown menu$")
	public void user_Select_the_Room_type_from_Dropdown_menu() throws Throwable {
	    WebElement roomtype = driver.findElement(By.id("room_type"));
	    Select s5=new Select(roomtype);
		s5.selectByIndex(2);
	}
	    
	

	@When("^user Select the Number of rooms from Dropdown menu$")
	public void user_Select_the_Number_of_rooms_from_Dropdown_menu() throws Throwable {
		WebElement roomno=driver.findElement(By.id("room_nos"));
		Select s2=new Select(roomno);
		s2.selectByIndex(1);
	}

	@When("^user Enter the Check-in-date in  check-in-field$")
	public void user_Enter_the_Check_in_date_in_check_in_field() throws Throwable {
	    
		WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		date.sendKeys("03/04/2024");
	}
	

	@When("^user Enter the Check-out-date in  check-out-field$")
	public void user_Enter_the_Check_out_date_in_check_out_field() throws Throwable {
	    WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
	    checkoutdate.sendKeys("16/04/2024");
	}

	@When("^user Select the Adults-per-room from Dropdown menu$")
	public void user_Select_the_Adults_per_room_from_Dropdown_menu() throws Throwable {
		WebElement adult_room = driver.findElement(By.id("adult_room"));
		Select s3=new Select(adult_room);
		s3.selectByIndex(2);
	}

	@When("^user Select the Children-per-room from Dropdown menu$")
	public void user_Select_the_Children_per_room_from_Dropdown_menu() throws Throwable {
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s4=new Select(childroom);
		s4.selectByIndex(3);
	}

	@Then("^user click the Search Button And it Navigates to SelectHotel page$")
	public void user_click_the_Search_Button_And_it_Navigates_to_SelectHotel_page() throws Throwable {
		WebElement Searchbtn = driver.findElement(By.id("Submit"));
		Searchbtn.click();
	}

	@When("^user can click radio-button tp Select the Hotel$")
	public void user_can_click_radio_button_tp_Select_the_Hotel() throws Throwable {
		WebElement radiobtn = driver.findElement(By.id("radiobutton_0"));
		radiobtn.click();
	}
	

	@Then("^user can click the continue button And it navigate to BookHotelpage$")
	public void user_can_click_the_continue_button_And_it_navigate_to_BookHotelpage() throws Throwable {
		WebElement continuebutton = driver.findElement(By.id("continue"));
		continuebutton.click();
	    
	}

	@When("^user can Enter the first name in Name textbox$")
	public void user_can_Enter_the_first_name_in_Name_textbox() throws Throwable {
		WebElement Firstname = driver.findElement(By.id("first_name"));
		Firstname.sendKeys("Ramya R");
	}

	@When("^user can enter the last name in lastname field$")
	public void user_can_enter_the_last_name_in_lastname_field() throws Throwable {
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("ravi");
	   
	}

	@When("^user can Enter the adress in Billing address field$")
	public void user_can_Enter_the_adress_in_Billing_address_field() throws Throwable {
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("Bangalore");
	}

	@When("^user can Enter the Credit Card No in Credit Card Number field$")
	public void user_can_Enter_the_Credit_Card_No_in_Credit_Card_Number_field() throws Throwable {
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1234567890987654");
	   
	}

	@When("^user can Select the Credit Card Type in Credit Card Type dropdown menu$")
	public void user_can_Select_the_Credit_Card_Type_in_Credit_Card_Type_dropdown_menu() throws Throwable {
		WebElement credit= driver.findElement(By.id("cc_type"));
		Select s3=new Select(credit);
		s3.selectByValue("AMEX");
	    
	}

	
	@When("^user can Select month and year in Expiry Date field$")
	public void user_can_Select_month_and_year_in_Expiry_Date_field() throws Throwable {
		WebElement expmonth= driver.findElement(By.id("cc_exp_month"));
		Select s4=new Select(expmonth);
		s4.selectByVisibleText("February");
	    
	}

	@When("^user can enter the (\\d+) digit cvv number in cvv number field$")
	public void user_can_enter_the_digit_cvv_number_in_cvv_number_field(int arg1) throws Throwable {
		WebElement expyear=driver.findElement(By.id("cc_exp_year"));
		Select s5=new Select(expyear);
		s5.selectByVisibleText("2029");
	}

	@Then("^user can click the Book now button And it navigate to BookingConfirm page\\.$")
	public void user_can_click_the_Book_now_button_And_it_navigate_to_BookingConfirm_page() throws Throwable {
		WebElement booknowbutton = driver.findElement(By.id("cc_cvv"));
		booknowbutton.sendKeys("747");
	   
	}
	

	@When("^user can check the booking details in this page$")
	public void user_can_check_the_booking_details_in_this_page() throws Throwable {
		WebElement booknowbtn = driver.findElement(By.id("book_now"));
		booknowbtn.click();
	    
	}

	@Then("^user can click Logout button And it navigate to Logout page\\.$")
	public void user_can_click_Logout_button_And_it_navigate_to_Logout_page() throws Throwable {
		WebElement myitinery = driver.findElement(By.id("my_itinerary"));
		myitinery.click();
	}

	@Then("^user can click- \"([^\"]*)\" And it will navigate to index page that is Login page\\.$")
	public void user_can_click_And_it_will_navigate_to_index_page_that_is_Login_page(String arg1) throws Throwable {
	   WebElement lgbtn = driver.findElement(By.id("logout"));
	   lgbtn.click();
	}


}
