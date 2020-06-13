import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class SILab2Test {


    SILab2 instance = new SILab2();

    @Test
    public void everyStatementTest() {
        //A-K
        Assert.assertFalse(instance.function(null, new ArrayList<>()));
        //A-B, B-C, C-D, D-E, E-F, F-G, G-H, H-D, H-I, I-J,
        Assert.assertTrue(instance.function(new User("biloShto", "biloShto", "biloShto@hotmail.com"),
                new ArrayList<>()));
        //A-B, B-K
        Assert.assertFalse(instance.function(new User(null, "biloShto", "biloShto@hotmail.com"),
                new ArrayList<>()));
    }

}