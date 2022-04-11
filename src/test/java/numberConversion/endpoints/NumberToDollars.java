package numberConversion.endpoints;

import org.junit.Assert;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestRunner.Status;

import core.BaseEndpoint;
import core.Endpoint;
import io.restassured.path.xml.XmlPath;
import numberConversion.builders.NumberConversionBuilder;
import responseBody.ResultHandlerWebservices;

public class NumberToDollars extends BaseEndpoint implements Endpoint {

	public XmlPath xmlPath;
	private TestCase testCaseSOAPUI;
	private TestRunner testRunnerSOAPUI;
	private String response_body;
	private String projetoSOAPUI = "src/test/resources/soapui/numberConversion/NumberConversion-soapui-project.xml";

	public WsdlProject getProject() {
		return getProject(projetoSOAPUI);
	}

	public TestCase prepararRequisicao(String testCase) {
		return testCaseSOAPUI = prepararRequisicao(testCase, projetoSOAPUI);
	}

	public TestRunner enviarRequisicao(String testCase, String endpoint, String... parametros) {
		try {
			PropertiesMap properties = 
					NumberConversionBuilder
					.builder()
					.setDNum(parametros[0])
					.build();

			testRunnerSOAPUI = testCaseSOAPUI.run(properties, false);
			// guardo o corpo da resposta em uma String
			response_body = testRunnerSOAPUI.getRunContext().expand("${" + endpoint + "#Response}").toString();

			if (response_body.equals("")) {
				Assert.fail("Nome do endpoint na feature está diferente do projeto SOAPUI");
			} else {
				System.out.println(response_body);
			}

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return testRunnerSOAPUI;

	}

	public void validarStatusCode() {
		Assert.assertEquals(testRunnerSOAPUI.getStatus(), Status.FINISHED);
	}

	public void validarResponseBody(String... parametros) {
		String expectedResult = parametros[0];
		try {
			configurarRetorno();
			ResultHandlerWebservices.handler(xmlPath).validResponseBody(expectedResult);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	private void configurarRetorno() {
		xmlPath = new XmlPath(response_body);
	}

}
