import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.Test;

public class MyTest extends FluentTest {
    @Test
    public void testGoogle() {
        System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
        goTo("http://www.google.com");
    }
}
