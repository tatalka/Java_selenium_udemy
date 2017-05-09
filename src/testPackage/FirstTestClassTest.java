package testPackage;

import org.junit.*;

public class FirstTestClassTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("Executed before everything...");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("Executed after everything...");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before each test.");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after each test.");
    }

    @Test
    public void test1(){
        System.out.println("Pierwszy test");
    }

    @Test
    public void test2(){
        System.out.println("Drugi test.");
    }

}