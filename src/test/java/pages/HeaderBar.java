package pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class HeaderBar {

    public HeaderBar click_signin() {
        $("a.login").click();
        return this;
    }

    public HeaderBar search(String text) {
        $("#search_query_top").sendKeys(text);
        $("button[name='submit_search']").click();
        return this;
    }

}
