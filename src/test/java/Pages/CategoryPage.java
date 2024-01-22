package Pages;

import org.openqa.selenium.By;

import static Tests.SeleniumTesting.driver;

public class CategoryPage {

    public static String jewellery_category_xpath = "/html/body/div[2]/div/main/div/div[9]/div/div/div/div/div[5]/div/div/div/div/div/a";
    public static String watches_category_xpath = "//*[@id=\"mountRoot\"]/div/main/div/div[9]/div/div/div/div/div[4]/div/div/div/div/div/a/picture/img";

    public static void click_jewellery_category(){
    driver.findElement(By.xpath(jewellery_category_xpath)).click();
    }

    public static void click_watches_category(){
        driver.findElement(By.xpath(watches_category_xpath)).click();

    }
}
