package pages;

import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    public MainPage() {
        super(By.xpath("//img[contains(@class,'lnXdpd')]"), "MainPage");
    }

}