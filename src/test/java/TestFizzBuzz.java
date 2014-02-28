import org.junit.Test;
import junit.framework.Assert;
import org.omg.DynamicAny._DynFixedStub;

/**
 * Created by valentindufermont on 28/03/2014.
 */
public class TestFizzBuzz {

    @Test
    public void testCasNormal() throws Exception
    {
        FizzBuzz nombretest = new FizzBuzz();
        String nombre = nombretest.jouer(1);
        Assert.assertEquals("1", nombre);

    }

    @Test
    public void testMultiple5() throws Exception
    {
        FizzBuzz nombretest = new FizzBuzz();
        String nombre = nombretest.jouer(5);
        Assert.assertEquals("Buzz", nombre);
    }

    @Test
    public void testMultiple3() throws Exception
    {
        FizzBuzz nombretest = new FizzBuzz();
        String nombre = nombretest.jouer(3);
        Assert.assertEquals("Fizz", nombre);
    }

    @Test
    public void testMultiple3Et5() throws Exception
    {
        FizzBuzz nombretest = new FizzBuzz();
        String nombre = nombretest.jouer(15);
        Assert.assertEquals("FizzBuzz", nombre);
    }

    @Test
    public void tableau100Resultat() throws Exception
    {
        FizzBuzz tableautest = new FizzBuzz();
        String[] tableau = tableautest.nombreFizzBuzz();
        Assert.assertEquals(100, tableau.length);
    }
}
