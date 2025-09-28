package qa.guru.owner.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final SelenideElement
            solutionsButton = $x("//button[contains(text(),'Solutions')]"),
            enterpriseLink = $x("//a[contains(text(),'Enterprise')]"),
            heroHeading = $("h1#hero-section-brand-heading");

    private final String title = "The AI-powered developer platform";

    public MainPage openPage() {
        open("/");

        return this;
    }

    public MainPage openSolutionsMenu() {
        solutionsButton.hover();

        return this;
    }

    public MainPage goToEnterprise() {
        enterpriseLink.click();

        return this;
    }

    public MainPage checkTitle() {
        heroHeading.shouldHave(text(title));

        return this;
    }


}
