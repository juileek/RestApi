package StepDefinitions;

import cucumber.api.java.en.Given;

import static io.restassured.RestAssured.given;




public class loginSteps {
    public String username = "test";
    public String password = "Password1";
    public String baseURL = "https://roombookingmanager.platformcluster.connectib.com/api";
    public String baseURI = "/Authenticate/Login";


    @Given("^I got to login api$")
    public void i_got_to_login() {

        given().auth().basic(username,password).when().basePath(baseURL).baseUri(baseURI).then().statusCode(200).and().contentType("application/json");

    }

 /*   @When("^make a request to \"\\Authenticate\\Login$")
    public void make_a_request_to_Authenticate_Login() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^status code is (\\d+)$")
    public void status_code_is(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }*/
}
