package ca.genworth.poc;

import com.genworth.poc.cucumber.util.Validator;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class Stepdefs {

    private Validator validator = new Validator();
    private String input;
    private List<String> validationErrors;

    @Given("^input is \"([^\"]*)\"$")
    public void input_is(String input) throws Exception {
        this.input = input;
    }

    @When("^I validate cert #$")
    public void i_validate_cert() throws Exception {
        this.validationErrors =
                validator.validateNumericString(this.input).map(v -> v.getMessage()).collect(Collectors.toList());
    }

    @Then("^I should be shown \"([^\"]*)\"$")
    public void i_should_be_shown(String validationError) throws Exception {
        Assert.assertEquals("Validation Error Expected", validationError, validationErrors.get(0));
    }

    @Then("^I should not be shown any validation errors$")
    public void i_should_not_be_shown_any_validation_errors() throws Exception {
        Assert.assertTrue("Validation Error Expected", validationErrors.isEmpty());
    }

}