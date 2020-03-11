package pl.zzpj2020.cleancode;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CounterTest {

    Counter counter = new Counter(Arrays.asList(2, 1, 1, 15, 30, 4, -2));

    @Test
    public void putTest() {
        Assert.assertEquals(counter.getOccur(1), 2);
        Assert.assertEquals(counter.getOccur(41), 0);
        Assert.assertEquals(counter.getOccur(2), 1);
    }

    @Test
    public void testMinValue() {
        Assert.assertEquals(counter.getMinValue(), -2);
    }

    @Test
    public void testMaxValue() {
        Assert.assertEquals(counter.getMaxValue(), 30);
    }

    @Test
    public void testAvg(){
        Counter counter2 = new Counter(Arrays.asList(3,3,9));
        Assert.assertEquals(counter2.countAvg(), 5.0,0.0002);
    }
}