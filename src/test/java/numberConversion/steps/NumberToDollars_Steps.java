package numberConversion.steps;

import core.Endpoint;
import core.EndpointFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import numberConversion.endpoints.NumberToDollars;

public class NumberToDollars_Steps {

	private Endpoint numberToDollars;

	@Given("^que estou trabalhando com o servico numberToDollars$")
	public void que_estou_trabalhando_com_o_servico_numberToDollars() throws Throwable {
		numberToDollars = EndpointFactory.get(NumberToDollars.class);
	}

	@Given("^escolho o \"([^\"]*)\" - numberToDollars$")
	public void escolho_o_numberToDollars(String testCase) throws Throwable {
		numberToDollars.getProject();
		numberToDollars.prepararRequisicao(testCase);
	}

	@When("^realizo o POST deste \"([^\"]*)\" e \"([^\"]*)\" passando os parametros: \"([^\"]*)\" - numberToDollars$")
	public void realizo_o_POST_deste_e_passando_os_parametros_numberToDollars(String testCase, String endpoint,
			String dNum) throws Throwable {
		numberToDollars.enviarRequisicao(testCase, endpoint, dNum);
	}

	@Then("^valido que o status code foi \"([^\"]*)\" - numberToDollars$")
	public void valido_que_o_status_code_foi_numberToDollars(String arg1) throws Throwable {
		numberToDollars.validarStatusCode();
	}

	@Then("^valido o response body atraves do \"([^\"]*)\" - numberToDollars$")
	public void valido_o_response_body_atraves_do_numberToDollars(String expectedResult) throws Throwable {
		numberToDollars.validarResponseBody(expectedResult);
	}

}
