package core;


import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;

public interface Endpoint {

	WsdlProject getProject();

	TestCase prepararRequisicao(String testCase);

	TestRunner enviarRequisicao(String testCase, String endpoint, String... parametros);

	void validarStatusCode();

	void validarResponseBody(String... parametros);
	
}