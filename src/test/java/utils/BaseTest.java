package utils;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;
import pages.HeaderBar;
import pages.HomePage;
import pages.SearchPage;
import pages.SignInPage;

public class BaseTest {

    protected static HomePage home_page;
    protected static HeaderBar header_bar;
    protected static SearchPage seach_page;
    protected static SignInPage sign_in_page;

    @BeforeMethod
    public void start_browser(){
        Configuration.browser = "chrome";
        Configuration.baseUrl = "http://automationpractice.com/index.php";

        home_page = new HomePage();
        header_bar = new HeaderBar();
        seach_page = new SearchPage();
        sign_in_page = new SignInPage();
    }
}
