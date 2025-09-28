package qa.guru.owner.tests;

import qa.guru.owner.config.ProjectConfiguration;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    @BeforeAll
    public static void setUp() {
        ProjectConfiguration.configure();
    }
}
