package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SearchPage extends Form {

    public SearchPage() {
        super(By.xpath("//div[contains(@class,'yg51vc')]"), "SearchPage");
    }

}
