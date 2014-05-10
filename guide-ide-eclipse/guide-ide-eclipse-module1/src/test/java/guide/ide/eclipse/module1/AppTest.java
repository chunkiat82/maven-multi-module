package guide.ide.eclipse.module1;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    /**
     * Rigourous Test :-)
     */
	@Test
    public void testApp()
    {
		App app = new App();
		app.test();
        Assert.assertTrue( true );
    }
}
