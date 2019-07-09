package skeletonDay1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class sample {
	person val=new person();
	@Given("Saun is {int} meters away from Lucia")
	public void saun_is_meters_away_from_Lucia(Integer dis) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		val.setDistance(dis);
	}

	@When("Saun shouts {string}")
	public void saun_shouts(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		val.setMessage(string);
	}

	@Then("Lucia (Listens|cannot Listen) to the message")
	public void lucia_Listens_to_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String message=val.getMessage();
		Assert.assertEquals("Free Coffee", message);
		
	}
}
