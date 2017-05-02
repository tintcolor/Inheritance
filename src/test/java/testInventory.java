import com.anthony.classmanager.Inventory;
import com.anthony.classmanager.Shampoo;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by anthonyjones on 5/1/17.
 */
public class testInventory {

    @Test
    public void testShampoo() {
        //given
        Shampoo shampoo = new Shampoo("Shampoo",4.54, 1, 5);
        double expectedSum = 22.70;
        Inventory inventory = new Inventory();

        //when
        double actualSum = inventory.calcShampoo(shampoo);

        //then
        Assert.assertEquals(expectedSum, actualSum, .001);
    }

}
