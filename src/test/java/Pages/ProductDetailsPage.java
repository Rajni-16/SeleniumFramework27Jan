package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;

import static Tests.SeleniumTesting.driver;
import static Tests.SeleniumTesting.test;

public class ProductDetailsPage {

    public static String addToCart_bracelet_xpath = "/html/body/div[2]/div/div[1]/main/div[2]/div[2]/div[2]/div[3]/div/div[1]";
    public static String addToCart_watch_xpath = "//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]";

    public static String addedInCart_xpath = "//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[2]";
    public static String cartIcon_xpath= "//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]";

    public static String addedItem_xpath = "//*[@id=\"cartItemsList\"]/div/div/div/div[2]/div[2]/div/div[1]/a";
    public static void click_addToCart(){

        driver.findElement(By.xpath(addToCart_bracelet_xpath)).click();

    }

    public static void verify_addedItem_inCart(){
        driver.findElement(By.xpath(cartIcon_xpath)).click();
        //Thread.sleep(2000);
        String expectedProduct = "Women Gold-Plated American Diamond Bangle-Style Bracelet";
        String actualProduct= driver.findElement(By.xpath(addedItem_xpath)).getText();
        if (expectedProduct.equals(actualProduct)){
            test.log(Status.PASS, "Test passed for verification of correct item added in cart");
        }else{
            test.log(Status.FAIL, "Test failed for verification of correct item addition in cart");
        }
       }

}
