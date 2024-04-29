package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class HomePage extends BasePage {
    public WebDriver driver;
    private final String bodyText = "tag=>body";

    public HomePage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public String getActualText() {
        return getText(bodyText, "Body Text");
    }


    public String removeVowelsFromText(String text) {
        ArrayList<Character> array = new ArrayList<>();
        StringBuilder result = new StringBuilder();
        //create string with the vowels uppercase and lowercase
        String vows = "aeuioAEUIO";

        //Add the vowels to the ArrayList
        for (int i = 0; i < vows.length(); i++) {
            array.add(vows.charAt(i));
        }

        //If the character not a vowels add it to the result text
        for (int i = 0; i < text.length(); i++) {
            if (!array.contains(text.charAt(i))) {
                result.append(text.charAt(i));
            }
        }
        //Return the result text after trimming all the extra spaces
        return result.toString().trim();
    }
}
