package kom.Aparna.StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import kom.Aparna.Elements;
import org.junit.Assert;

public class SearchProduct {
    Elements elements= new Elements();
    @Given("^iam on homepage$")
    public void iam_on_homepage()  {
     elements.isOnHomePage();
    }

    @When("^i search a product in search coloumn$")
    public void i_search_a_product_in_search_coloumn()  {
        elements.searchForAProduct();

    }

    @Then("^i should get that product only$")
    public void i_should_get_that_product_only()  {
       Assert.assertTrue( elements.ishouldgetthatproduct());

    }
    @Then("^added to basket$")
    public void added_to_basket()  {
        elements.addedtobasket();

    }
}


