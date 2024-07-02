package definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.prueba.pragma.steps.addLaptopStep;

public class addLaptopDefinition {

    @Steps
    addLaptopStep objaddLaptop;

    @Given("^the user is on the main page of the commerce site$")
    public void the_user_is_on_the_main_page_of_the_commerce_site() {

    }


    @When("^the user is filter for category Laptop$")
    public void the_user_is_filter_for_category_Laptop() {

    }

    @When("^the user is choose the product MacBook air$")
    public void the_user_is_choose_the_product_MacBook_air() {

    }

    @Then("^the user should see the success message confirming the item was added$")
    public void the_user_should_see_the_success_message_confirming_the_item_was_added() {

    }

    @When("^the user is choose the product Sony vaio i(\\d+)$")
    public void the_user_is_choose_the_product_Sony_vaio_i(int arg1) {

    }

}
