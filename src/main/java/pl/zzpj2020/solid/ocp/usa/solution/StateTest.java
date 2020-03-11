package pl.zzpj2020.solid.ocp.usa.solution;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StateTest {

    @Test
    public void testAlabama() {
        Alabama alabama = new Alabama();
        Assert.assertEquals(alabama.calculateSpeedLimitFine(30), 0.0, 0.0002);
        Assert.assertEquals(alabama.calculateSpeedLimitFine(50), 150.0, 0.0002);
    }

    @Test
    public void testGeorgia() {
        Georgia georgia = new Georgia();
        Assert.assertEquals(georgia.calculateSpeedLimitFine(10), 0.0, 0.0002);
        Assert.assertEquals(georgia.calculateSpeedLimitFine(80), 250.0, 0.0002);
    }

    @Test
    public void testSouthCarolina() {
        SouthCarolina southCarolina = new SouthCarolina();
        Assert.assertEquals(southCarolina.calculateSpeedLimitFine(250), 2000.0, 0.0002);
        Assert.assertEquals(southCarolina.calculateSpeedLimitFine(60), 150.0, 0.0002);
        Assert.assertEquals(southCarolina.calculateSpeedLimitFine(20), 0.0, 0.0002);
    }
}