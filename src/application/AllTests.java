package application;

import junit.framework.Test;
import junit.framework.TestSuite;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses({
	TestCouleur.class,
	TestModelGestionnaire.class
})

public class AllTests {
    public static Test suite() {
        TestSuite suite = new TestSuite();
//        suite.addTestSuite(TestCouleur.class);
//        suite.addTestSuite(TestModelGestionnaire.class);
        return suite;
    }
}