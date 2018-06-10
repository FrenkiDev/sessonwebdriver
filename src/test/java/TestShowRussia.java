import org.junit.Assert;
import org.junit.Test;

public class TestShowRussia extends TestBase {

    @Test
    public void goShowsRussia() {
            Assert.assertEquals("РКФ", showsRussias.getDateInfo().getText());
            Assert.assertNotNull(showsRussias.getDateInfo());
    }
}
