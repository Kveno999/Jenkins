package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class MainPage extends Form {

    private final ITextBox searchInput = getElementFactory()
            .getTextBox(By.xpath("//input[contains(@class, 'gLFyf gsfi')]"), "SearchBox");
    private final IButton searchBtn = getElementFactory()
            .getButton(By.xpath("//input[@class='gNO89b' and @name='btnK']"), "SearchBtn");

    public MainPage() {
        super(By.xpath("//img[contains(@class,'lnXdpd')]"), "MainPage");
    }

    public void fillSearchBox(String searchText) {
        searchInput.type(searchText);
    }

    public void clickSearchBtn() {
        searchBtn.click();
    }

}
