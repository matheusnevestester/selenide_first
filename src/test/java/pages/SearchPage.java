package pages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$;

public class SearchPage {

    public ElementsCollection search_results(){
        ElementsCollection results = $$(".product-container");
        return results;
    }


}
