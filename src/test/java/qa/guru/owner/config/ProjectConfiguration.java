package qa.guru.owner.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.codeborne.selenide.Configuration;
import java.util.Map;


public class ProjectConfiguration {
    static WebConfig config = ConfigFactory.create(WebConfig.class, System.getProperties());

    public static void configure () {

        Configuration.baseUrl = config.baseUrl();
        Configuration.browser = config.browser();

        String remoteUrl = config.remoteWebDriverUrl();
        if (remoteUrl != null && !remoteUrl.isBlank()) {
            Configuration.remote = remoteUrl;
            Configuration.browserVersion = config.browserVersion();
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("selenoid:options", Map.<String, Object>of(
                    "enableVNC", true,
                    "enableVideo", true
            ));
            Configuration.browserCapabilities = capabilities;
        }
    }
}
