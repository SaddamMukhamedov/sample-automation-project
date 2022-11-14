package net.absoft.discCalculator;


import net.absoft.discriminantCalculator.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;




@Test
public class SolutionTest {


    public void TestDiscriminantIsZero() {
        Solution test = new Solution(1,-6,9);
        test.RootsSolution();
        Assert.assertEquals(test.Root1, test.Root2);

    }
@Test
    public void TestDiscriminantMoreThanZero() {
        Solution test = new Solution(1,-4,-5);
        test.RootsSolution();
        Assert.assertNotEquals(test.Root1, test.Root2);

    }
@Test
    public void TestDiscriminantLessThanZero() {
        Solution test = new Solution(3,-4,2);
        test.RootsSolution();
        Assert.assertNull(test.Root1);


    }

}
