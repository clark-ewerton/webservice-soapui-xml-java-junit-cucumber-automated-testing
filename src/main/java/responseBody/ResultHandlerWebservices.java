package responseBody;

import org.junit.Assert;

import io.restassured.path.xml.XmlPath;

public class ResultHandlerWebservices {

	protected XmlPath xPath;

	private ResultHandlerWebservices(XmlPath xmlPath) {
		this.xPath = xmlPath;
	}

	public static ResultHandlerWebservices handler(XmlPath xmlPath) {
		return new ResultHandlerWebservices(xmlPath);
	}

	public void validResponseBody(String mensagem_resposta) {
		
		Assert.assertEquals(mensagem_resposta, xPath.getString("NumberToDollarsResult"));
	}
}
