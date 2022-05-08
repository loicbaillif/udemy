public class HelloWorldTest {

    public void testHello() {
        // Method name needs to start with "test" to trigger test.
        System.out.println("TEST - Hello ....");
    }

    public void xtestWorld() {
        // This won't trigger a test from Maven.
        System.out.println("TEST - World!!!!");
    }
}
