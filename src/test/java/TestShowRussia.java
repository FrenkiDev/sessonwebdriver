import modes.exhibitions.ShowsRussia;
import org.junit.Assert;
import org.junit.Test;

public class TestShowRussia extends TestBase {
    private ShowsRussia showsRussias = new ShowsRussia();

    public TestShowRussia() {
        super("rush_exhibitions");
    }

    @Test
    public void goShowsRussia() {
            Assert.assertEquals("РКФ", showsRussias.getDateInfo().getText());
            Assert.assertNotNull(showsRussias.getDateInfo());
    }
}
