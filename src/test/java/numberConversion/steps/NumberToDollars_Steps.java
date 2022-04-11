package numberConversion.steps;

import core.Endpoint;
import core.EndpointFactory;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import numberConversion.endpoints.NumberToDollars;

public class NumberToDollars_Steps {

	private Endpoint numberToDollars;

	@Dado("^que estou trabalhando com o servico numberToDollars$")
	public void que_estou_trabalhando_com_o_servico_numberToDollars() throws Throwable {
		numberToDollars = EndpointFactory.get(NumberToDollars.class);
	}

	@Dado("^escolho o \"([^\"]*)\" - numberToDollars$")
	public void escolho_o_numberToDollars(String testCase) throws Throwable {
		numberToDollars.getProject();
		numberToDollars.prepararRequisicao(testCase);
	}

	@Quando("^realizo o POST deste \"([^\"]*)\" e \"([^\"]*)\" passando os parametros: \"([^\"]*)\" - numberToDollars$")
	public void realizo_o_POST_deste_e_passando_os_parametros_numberToDollars(String testCase, String endpoint,
			String dNum) throws Throwable {
		numberToDollars.enviarRequisicao(testCase, endpoint, dNum);
	}

	@Entao("^valido que o status code foi \"([^\"]*)\" - numberToDollars$")
	public void valido_que_o_status_code_foi_numberToDollars(String arg1) throws Throwable {
		numberToDollars.validarStatusCode();
	}

	@Entao("^valido o response body atraves do \"([^\"]*)\" - numberToDollars$")
	public void valido_o_response_body_atraves_do_numberToDollars(String expectedResult) throws Throwable {
		numberToDollars.validarResponseBody(expectedResult);
	}

}
