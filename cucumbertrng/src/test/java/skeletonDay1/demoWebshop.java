package skeletonDay1;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.pageModel;

import java.util.List;

import org.junit.Assert;

public class demoWebshop {
	 WebDriver driver;
	 @Before
	 public void beforeScenario()
	 {
		 String path="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\selenium\\jar\\chromedriver_win32 (1)//chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", path);
	     driver=new ChromeDriver();
	     PageFactory.initElements(driver, pageModel.class);
	 }
	 @After
	 public void afterScenario()
	 {
		 driver.close();
	 }
	@Given("url of demowebshop {string}")
	public void url_of_demowebshop(String string) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.get(string);
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
      pageModel.username.sendKeys(string);
	
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
		pageModel.password.sendKeys(string);
		 pageModel.signIn.click();
		
	
	}

	@Then("user is in webshop as {word}")
	public void user_is_in_webshop_as(String type) {
	    // Write code here that turns the phrase above into concrete actions
	  
	   String actualval=driver.getTitle();
	   String expectval="Demo Web Shop";
	   Assert.assertEquals(expectval, actualval);
	}
	@Given("Admin of the testme app enters")
	public void admin_of_the_testme_app_enters(io.cucumber.datatable.DataTable dataTable) {
	   List<List<String>> list=dataTable.asLists();
	   for(List<String> string:list)
	   {
		   for(String s:string)
		   {
			   System.out.print(s+" ");
		   }
		   System.out.println(" ");
	   }
	}



}
