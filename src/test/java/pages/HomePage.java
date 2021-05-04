package pages;

import com.codeborne.selenide.Selenide;

public class HomePage {

    public HomePage open_homepage() {
        Selenide.open("/");
        return this;
    }
}

