import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.Test;

public class MyTest extends FluentTest {
    @Test
    public void testGoogle() {
        goTo("http://lixiluberstage.ap-northeast-1.elasticbeanstalk.com/login/form");
    }
}
