package tests;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.*;
import utils.BaseTest;

public class Search extends BaseTest {

    @DataProvider(name = "search_text")
    public Object[][] searchProvider() {
        return new Object[][]{
                {"Dress"},
                {"Short"},
                {"Blouse"}
        };
    }

    @Test(dataProvider = "search_text")
    public void unloggedSearch(String text) {

        home_page.open_homepage();
        header_bar.search(text);
        ElementsCollection search_results = seach_page.search_results();
        search_results.first().click();

        Selenide.sleep(1000);
    }

    @Test(dataProvider = "search_text")
    public void loggedSearch(String text) {


        home_page.open_homepage();
        header_bar.search(text);
        ElementsCollection search_results = seach_page.search_results();
        search_results.first().click();

        Selenide.sleep(1000);
    }


}
