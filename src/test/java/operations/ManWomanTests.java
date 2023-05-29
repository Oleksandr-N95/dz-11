package operations;

import com.rd.dz11.Man;
import com.rd.dz11.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManWomanTests {

    @Test
    public void testManIsRetired(){
        Man man1 = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Man man2 = new Man("Ben", "Benson", "Kyiv", "Ukraine", null,70);
        Assert.assertEquals(man1.isRetired(), false, "This result is wrong for man");
        Assert.assertEquals(man2.isRetired(), true, "This result is wrong for man");
    }
    @Test
    public void testManRegisterPartnership(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", null,25,"Danielson");
        man.registerPartnership(woman);
        Assert.assertEquals(man.getPartner(), woman, "Register partnership method not working, null is wrong for man");
    }
    @Test
    public void testManDeregisterPartnership(){
        Woman woman = null;
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", woman, 30);
        Woman woman1 = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", man,25,"Danielson");
        man.deregisterPartnership(true);
        Assert.assertNull(man.getPartner(), "Partner value should be null for man");
    }

    @Test
    public void testWomanIsRetired(){
        Woman woman = new Woman("Jacklyn", "Jackson", "Kyiv", "Ukraine", null, 60, "Stevenson");
        Woman woman1 = new Woman("Kathy", "Benson", "Kyiv", "Ukraine", null,45, "Robertson");
        Assert.assertEquals(woman.isRetired(), true, "This result is wrong for woman");
        Assert.assertEquals(woman1.isRetired(), false, "This result is wrong for woman");
    }
    @Test
    public void testWomanRegisterPartnership(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        Man man = new Man("Ben", "Benson", "Kyiv", "Ukraine", null, 30);
        woman.registerPartnership(man);
        Assert.assertEquals(woman.getPartner(), man, "Register partnership method not working, null is wrong for woman");
    }
    @Test
    public void testWomanDeregisterPartnership(){
        Woman woman = null;
        Man man = new Man("Ben", "Benson", "Kyiv", "Ukraine", woman, 30);
        Woman woman1 = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        man.deregisterPartnership(true);
        Assert.assertNull(man.getPartner(), "Partner value should be null for woman");
    }
}
