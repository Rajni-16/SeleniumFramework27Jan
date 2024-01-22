package Pages;

import lombok.Getter;
import lombok.Setter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import static Tests.SeleniumTesting.driver;

@Getter @Setter
public class Homepage {
    @FindBy(xpath = "//*[@id=\"mountRoot\"]/div/main/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/a/div/picture/img")
    public static String women_tab_xpath="//*[@id=\"mountRoot\"]/div/main/div/div[2]/div/div/div/div/div[2]/div/div/div/div/div/a/div/picture/img";

    public  static String homepage_xpath ="//*[@id=\"desktop-header-cnt\"]/div[2]/div[1]/a";
    public static void click_women_tab(){
        driver.findElement(By.xpath(women_tab_xpath)).click();

    }

    public static void goToHomepage(){
        driver.findElement(By.xpath(homepage_xpath)).click();

    }

}
