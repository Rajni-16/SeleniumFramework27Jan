package Pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.Set;

import static Tests.SeleniumTesting.*;

import static Tests.SeleniumTesting.driver;

public class ProductPage {
    public static String jewellery_selected_xpath = "//html/body/div[2]/div/main/div[3]/div[2]/div/div[2]/section/ul/li[8]/a/div[1]/div/div/div/picture/img";

    public static String watches_selected_xpath = "//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[2]/a/div[1]/div/div/div/picture/img";

    public static String product_description = "//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[8]/a/div[2]/h4[1]";
    public static void verify_product_title() {
        String expectedTitle = "Women Bangle-Style Bracelet";
        String actualTitle = driver.findElement(By.xpath(product_description)).getText();
        Assert.assertEquals(expectedTitle, actualTitle);
        if (expectedTitle.equals(actualTitle)){
            test.log(Status.PASS, "Test passed for title verification of bracelet");
        }
    }

        public static void click_bracelet_product() {
            driver.findElement(By.xpath(jewellery_selected_xpath)).click();
            Set<String> winHandles = driver.getWindowHandles();
            for (String windowHandle : winHandles) {
                driver.switchTo().window(windowHandle);
            }
        }

        public static void click_watches_products() {
            driver.findElement(By.xpath(watches_selected_xpath)).click();

        }
    }

