package old_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.isChrome;
public class SearchEngine {

    @Test
    public void ShouldSearch(){
        isChrome();
        open("https://www.ebay.com/");
        $(".ui-autocomplete-input").setValue("hot wheels");
        //$("input.btn").click();
        $(byValue("Pesquisar")).click();
        int test = $$(".s-item__title").size();
        Assert.assertTrue(test > 50 );
        sleep(1000);
    }
}

