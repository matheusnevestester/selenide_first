package tests;

import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;
import utils.BaseTest;

public class Login extends BaseTest {

    @Test
    public void successfullLogin(){
        home_page.open_homepage();

        String username = "test@meuemail.com.br";
        String password = "123456";

        header_bar.click_signin();
        sign_in_page.login(username,password);
        Selenide.sleep(100);
    }
}
