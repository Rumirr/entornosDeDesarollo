/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Gustavo Pereira Kurpel
 */
public class JunitTest {
    
    private static final String THREE_IS_J ="J";
    private static final String FIVE_IS_UNIT ="Unit";
    private static final String THREE_AND_FIVE_IS_JUNIT ="JUnit";
    
    Junit j = new Junit();
    
    @Test
    public void testMultiploDe3() {
        Assert.assertEquals(THREE_IS_J, j.multiploDe3(3));
    }

    @Test
    public void testMultiploDe5() {
        Assert.assertEquals(FIVE_IS_UNIT, j.multiploDe5(5));
    }

    @Test
    public void testMultiploDe3Y5() {
        Assert.assertEquals(THREE_AND_FIVE_IS_JUNIT, j.multiploDe3Y5(15));
    }
    
}
