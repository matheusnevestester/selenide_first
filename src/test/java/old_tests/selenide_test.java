package old_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
public class selenide_test {

    @Test
    public void StartBrowser(){
        isChrome();
        open("https://www.ebay.com/");
        Assert.assertNotEquals(title(),"Crzyyyy");
    }
}
