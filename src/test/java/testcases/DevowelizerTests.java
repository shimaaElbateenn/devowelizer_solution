package testcases;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Constants;

public class DevowelizerTests extends BaseTest {

    //Remove vowels from string contains special character (":")
    @Test
    public void verifyRemovingVowelsCorrectly() {
        String keyword = ":input";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), homePage.removeVowelsFromText(keyword));
    }

    //Remove vowels from string with null value
    @Test
    public void verifyRemovingVowelsFromNullString() {
        String keyword = null;
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), homePage.removeVowelsFromText("null"));
    }

    //Remove vowels from empty string
    @Test
    public void verifyRemovingVowelsFromEmptyString() {
        String keyword = "";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), "Send GET to /:input");
    }

    //Remove vowels from string with only vowels and spaces
    @Test
    public void verifyRemovingVowelsFromStringWithOnlyVowels() {
        String keyword = "  aeiou  ";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), "NOT_FOUND");
    }

    //Remove vowels from string with only special characters
    //Note: This case should fail as the actual text is "!@" and the expected is "!@#$%^&*()"
    @Test
    public void verifyRemovingVowelsWithOnlySpecialChars() {
        String keyword = "!@#$%^&*()";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), homePage.removeVowelsFromText(keyword));
    }

    //Remove vowels from string with non-alphabetic characters
    @Test
    public void verifyRemovingVowelsFromStringWithNumbers() {
        String keyword = "12345";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), homePage.removeVowelsFromText(keyword));
    }

    //Remove vowels from string with Capital Vowels characters
    //Note: This case should fail as the actual text is "HELLO Wrld" and the expected is "HLL Wrld"
    @Test
    public void verifyRemovingVowelsFromStringWithCapitalCharacters() {
        String keyword = "HELLO World";
        driver.get(baseURL + keyword);
        Assert.assertEquals(homePage.getActualText(), homePage.removeVowelsFromText(keyword));
    }
}
