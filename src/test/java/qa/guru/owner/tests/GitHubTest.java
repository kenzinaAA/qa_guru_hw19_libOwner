package qa.guru.owner.tests;

import org.junit.jupiter.api.Test;
import qa.guru.owner.pages.MainPage;


public class GitHubTest extends TestBase {
    MainPage mainPage = new MainPage();

    @Test
    void shouldBeThePageEnterprizeTest() {
        mainPage
                .openPage()
                .openSolutionsMenu()
                .goToEnterprise()
                .checkTitle();
    }
}
