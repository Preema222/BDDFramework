package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	

@Given("I have a search field on Amazon page")
public void i_have_a_search_field_on_amazon_page() {
 
   System.out.println("Ste1: Im on search page");
}

@When("I search a product with name {string} and price {int}")
public void i_search_a_product_with_name_and_price(String string, Integer int1) {
  
	String productName = "Apple Macbook";
	int price = 1000;
	System.out.println("Step 2: Search the prodcut with name: "+productName+"price"+ price);

}

@Then("Product with name {string} should be displayed")
public void product_with_name_should_be_displayed(String string) {
   
}



}
