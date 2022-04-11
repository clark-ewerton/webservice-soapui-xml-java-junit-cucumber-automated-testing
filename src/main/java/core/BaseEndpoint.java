package core;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestSuite;

public abstract class BaseEndpoint {

	private String NOME_TESTSUITE = "TestSuite 1";
	private WsdlProject project;
	private TestCase testCaseSOAPUI;

	public WsdlProject getProject(String projetoSOAPUI) {
		try {
			project = new WsdlProject(projetoSOAPUI);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

		return project;
	}

	public TestCase prepararRequisicao(String testCase, String projetoSOAPUI) {
		boolean achou = false;
		try {
			Map<String, TestCase> testCases = new HashMap<String, TestCase>();

			WsdlProject wsdlProject = getProject(projetoSOAPUI);
			TestSuite suite = wsdlProject.getTestSuiteByName(NOME_TESTSUITE);

			List<TestCase> testCaseList = suite.getTestCaseList();

			for (TestCase test : testCaseList) {
				if (test.getName().equals(testCase)) {
					achou = true;
					testCases.put(test.getName(), test);
					break;
				}
			}

			if (!achou) {
				Assert.fail("Nome do testCase na feature está diferente do projeto SOAPUI");
			}

			System.out.println("Running SoapUI test: " + testCase);

			testCaseSOAPUI = testCases.get(testCase);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
		return testCaseSOAPUI;
	}

}
