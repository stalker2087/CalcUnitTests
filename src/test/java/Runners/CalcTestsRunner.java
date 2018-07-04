package Runners;

import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.List;
import java.util.ArrayList;

public class CalcTestsRunner {

    public static void main(String[] args) {

        TestNG testNG = new TestNG();

        XmlSuite xmlSuite = new XmlSuite();
        xmlSuite.setName("All Tests");

        xmlSuite.setParallel(XmlSuite.ParallelMode.METHODS);
        xmlSuite.setThreadCount(2);

        List<String> files = new ArrayList();
        files.addAll(new ArrayList<String>() {{
            add("./src/test/Resources/mainOperationsCalcSuite.xml");
            add("./src/test/Resources/otherOperationsCalcSuite.xml");
        }});
        xmlSuite.setSuiteFiles(files);

        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(xmlSuite);
        testNG.setXmlSuites(suites);
        testNG.run();
    }

}
