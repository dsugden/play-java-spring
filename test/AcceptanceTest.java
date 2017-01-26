import org.junit.*;

import play.mvc.*;
import play.test.*;
import static org.fluentlenium.core.filter.FilterConstructor.*;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static play.test.Helpers.*;

public class AcceptanceTest {

    /**
     * in this example we just check if the welcome page is being shown
     */
    @Test
    public void test() {
        running(testServer(3333, fakeApplication(inMemoryDatabase())), HTMLUNIT, browser -> {
            browser.goTo("http://localhost:3333");
            assertThat(browser.pageSource(), containsString("Add Person"));
        });
    }

}


