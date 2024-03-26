import junit.framework.*;

public class Suite {

    public static Test suite() {
        TestSuite suite = new TestSuite("Tous les tests");

        // Ajoutez vos classes de test ici
        suite.addTestSuite(CalculatorTest.class);

        return suite;
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(suite());
    }
}
