import org.fluentlenium.adapter.junit.FluentTest;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MyTest extends FluentTest {
    @Test
    public void title_of_duck_duck_go_should_contain_search_query_name() {
        System.setProperty("webdriver.gecko.driver", "./exe/geckodriver");
        goTo("https://duckduckgo.com");
        $("#search_form_input_homepage").fill().with("FluentLenium");
        $("#search_button_homepage").submit();
        assertThat(window().title()).contains("FluentLenium");
    }

    @Override
    public String getWebDriver() {
        return "firefox";
    }

}
