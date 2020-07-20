
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.collection.IsEmptyCollection.empty;

public class CustomCalculatorTest {

    private CustomCalculator customCalculator;

    @Test
    public void add() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10,15);
        assertThat(result, is(25));
        assertTrue(result==25);
        System.out.println("result :: " + result);
    }

    @Test
    public void subtract() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(23,10);
        assertThat(result, is(13));
        assertFalse(result==12);
        System.out.println("result :: " + result);
    }

    @Test
    public void multiply() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.multiply(5,9);
        assertThat(result, is(45));
        assertTrue(result==45);
        System.out.println("result :: " + result);
    }

    @Test
    public void divide() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.divide(25,5);
        assertThat(result, is(5));
        assertTrue(result==5);
        System.out.println("result :: " + result);
    }

    @Test(timeout = 4000)
    public void timeInMethodTest() throws InterruptedException {
        Thread.sleep(5000);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIsEmptyIndexOutOfBoundException(){
        new ArrayList<Object>().get(0);
        new ArrayList<Object>().get(1);
    }

    @Test
    public void testMethod(){
        ArrayList<Object> myList=new ArrayList<Object>();
        assertThat(myList,is(empty()));
        assertTrue(myList.isEmpty());
    }

}