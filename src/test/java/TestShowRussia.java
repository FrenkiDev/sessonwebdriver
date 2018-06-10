import modes.exhibitions.ShowsRussia;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Timeout;

import static core.DriverFactory.getWebdriver;
public class TestShowRussia {
    private ShowsRussia showsRussias = new ShowsRussia(getWebdriver());
    @Rule
    public TestRule timeOutRule = new Timeout(100000);
    /*public TestShowRussia() {
        super("rush_exhibitions");
    }*/

    @Test
    public void goShowsDateInfo() {
            Assert.assertEquals("РКФ", showsRussias.getDateInfo().getText());
            Assert.assertNotNull(showsRussias.getDateInfo());
        System.out.println("goShowsDateInfo");
    }

    @Test
    public void goShowPriche(){
        Assert.assertNotNull(showsRussias.getPriche());
        System.out.println("goShowPriche");
    }

    @Test
    public void goShowListDjudge(){
        Assert.assertNotNull(showsRussias.getListDjude());
        System.out.println("goShowListDjudge");
    }
}
