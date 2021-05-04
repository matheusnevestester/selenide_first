package pages;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {

    public void login(String email, String password){
        $("#email").sendKeys(email);
        $("#passwd").sendKeys(password);
        $("#SubmitLogin").click();
    }
}
