/*
*Mary-Beth Agulhas
* 219082367
* 4 February 2022
* CalculateTest.java
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    public Calculate num1;
    public Calculate num2;

    @BeforeEach
    public void setUp() {
        num1=new Calculate();
        num2=new Calculate();
        num1=num2;
    }
    //object equality
    @Test
    public void testEquality(){
        assertEquals(num1,num2);
    }
    //object identity
    @Test
    public void testIdentity(){
        assertSame(num1,num2);
    }
    //Fail
    @Test

    public void testFail(){
        fail("Failure");
        assertEquals(num1,num2);

    }
    //timout
    @Test
    @Timeout(value=300, unit= TimeUnit.MILLISECONDS)
    public void TestTimeout(){

    }
    //Disable
    @Test
    @Disabled("Disabling")
    public void testDisable(){
        System.out.println("Will not run");
    }
}