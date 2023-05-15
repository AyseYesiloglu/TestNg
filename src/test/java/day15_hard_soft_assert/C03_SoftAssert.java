package day15_hard_soft_assert;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.AmazonPage;
import utilities.Driver;

public class C03_SoftAssert {

    @Test
    public void test01(){

        //  // 3 test method olusturun
        //    //1. Amazon's gidip amazon'a gittiginizi test edin
        //    //2. Nutella aratip, sonucun Nutella icerdigini test edin
        //    //3. Ilk urune click yapip, urun isminin Nutella icerdigini test edin

        Driver.getDriver().get("https://www.amazon.com");

        //verify that you are in amazon.com

      SoftAssert softAssert=new SoftAssert();
      String expectedUrl="amazon";
      String actualUrl=Driver.getDriver().getCurrentUrl();
      softAssert.assertTrue(actualUrl.contains(expectedUrl));

        //search for nutella and click on the first product

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonSearchBox.sendKeys("Nutella"+ Keys.ENTER);
        amazonPage.firstProduct.click();
        String actualFirsProductText=amazonPage.firstProductText.getText();
        String expectedFirstProductText="Nutella";
        softAssert.assertTrue(actualFirsProductText.contains(expectedFirstProductText));
        softAssert.assertAll();

    }

}
