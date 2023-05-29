import com.rd.dz11.Man;
import com.rd.dz11.Woman;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GetterSetterTests {

    @Test
    public void testManGetCity(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Assert.assertEquals(man.getCity(),"Kyiv", "This parameters not working");
    }
    @Test
    public void testManGetPartner(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", man,25,"Danielson");
        Assert.assertEquals(man.getPartner(),woman, "This parameters not working");
    }
    @Test
    public void testManSetPartner(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Janet", "Johnson", "Kyiv", "Ukraine", null,25,"Danielson");
        man.setPartner(woman);
        Assert.assertEquals(man.getPartner(), woman, "This parameters not working");
    }
    @Test
    public void testManSetCity(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setCity("Lviv");
        Assert.assertEquals(man.getCity(), "Lviv", "This parameters not working");
    }
    @Test
    public void testManGetCountry(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Assert.assertEquals(man.getCountry(), "Ukraine", "This parameters not working");
    }
    @Test
    public void testManSetCountry(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setCountry("USA");
        Assert.assertEquals(man.getCountry(), "USA", "This parameters not working");
    }
    @Test
    public void testMangetAge(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        Assert.assertEquals(man.getAge(), 30, "This parameters not working");
    }
    @Test
    public void testManSetAge(){
        Man man = new Man("Jack", "Jackson", "Kyiv", "Ukraine", null, 30);
        man.setAge(35);
        Assert.assertEquals(man.getAge(), 35, "This parameters not working");
    }

    @Test
    public void testWomanGetCity(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        Assert.assertEquals(woman.getCity(),"Lviv", "This parameters not working");
    }
    @Test
    public void testWomanGetPartner() {
        Man man = new Man("Steve", "Stevson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        Assert.assertEquals(woman.getPartner(), man, "This parameters not working");
    }
    @Test
    public void testWomanSetPartner(){
        Man man = new Man("Steve", "Stevson", "Kyiv", "Ukraine", null, 30);
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setPartner(man);
        Assert.assertEquals(woman.getPartner(), man, "This parameters not working");
    }
    @Test
    public void testWomanSetCity(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setCity("Kharkiv");
        Assert.assertEquals(woman.getCity(), "Kharkiv", "This parameters not working");
    }
    @Test
    public void testWomanGetCountry(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        Assert.assertEquals(woman.getCountry(), "Ukraine", "This parameters not working");
    }
    @Test
    public void testWomanSetCountry(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setCountry("Spain");
        Assert.assertEquals(woman.getCountry(), "Spain", "This parameters not working");
    }
    @Test
    public void testWomangetAge(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        Assert.assertEquals(woman.getAge(), 30, "This parameters not working");
    }
    @Test
    public void testWomanSetAge(){
        Woman woman = new Woman("Beth", "Bethson", "Lviv", "Ukraine", null, 30, "Peterson");
        woman.setAge(40);
        Assert.assertEquals(woman.getAge(), 40, "This parameters not working");
    }
}
