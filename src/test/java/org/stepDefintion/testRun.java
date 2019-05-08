package org.stepDefintion;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testRun {
	static WebDriver driver;
	
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nagaraj\\eclipse-workspace\\manoj_project\\cucumbernew\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/addtariffplans.php");
	}
	
	

	@When("^I complete action$")
	public void i_complete_action(DataTable cst)  {

		List<String> clist=cst.asList(String.class);
		
		   driver.findElement(By.id("rental1")).sendKeys(clist.get(0));
		   driver.findElement(By.id("local_minutes")).sendKeys(clist.get(1));
		   driver.findElement(By.id("inter_minutes")).sendKeys(clist.get(2));
		   driver.findElement(By.id("sms_pack")).sendKeys(clist.get(3));
		   driver.findElement(By.id("minutes_charges")).sendKeys(clist.get(4));
		   driver.findElement(By.id("inter_charges")).sendKeys(clist.get(5));
		   driver.findElement(By.id("sms_charges")).sendKeys(clist.get(6));
		   driver.findElement(By.xpath("//input[@name='submit']")).click();
	 
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes()  {
		 Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Congratulation')]")).getText(),driver.getPageSource().contains("Congratulation"));
			
	   
	}



}
