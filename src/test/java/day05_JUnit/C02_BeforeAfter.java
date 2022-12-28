package day05_JUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {

    @Before
    public void setUp (){
        System.out.println("Her Test Methodundan önce Calisir");

    }

    @After
    public void tearDown(){

        System.out.println(" Her test Metodundan sonra Calisir");

    }
    @Test

    public void test01(){

        System.out.println("ilk Test");
    }


    @Test
    public void test02(){
        System.out.println("ikinci test");
    }


}
