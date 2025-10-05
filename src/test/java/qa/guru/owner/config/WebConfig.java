package qa.guru.owner.config;

import org.aeonbits.owner.Config;
@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:local.properties",
        "classpath:$(env).properties"
})

public interface WebConfig extends Config {
    @Key("browser")
    @DefaultValue("chrome")
    String browser();

    @Key("browserVersion")
    @DefaultValue("140.0")
    String browserVersion();

    @Key("remoteWebDriverUrl")
    String remoteWebDriverUrl();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String baseUrl();

}
