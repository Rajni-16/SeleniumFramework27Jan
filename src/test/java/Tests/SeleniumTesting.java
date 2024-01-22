package Tests;
import Pages.CategoryPage;
import Pages.Homepage;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTesting {
    public static WebDriver driver = new ChromeDriver();
    static ExtentReports report;
   public static ExtentTest test;
    static  ExtentReports extent = new ExtentReports();

    @BeforeTest
    public static void setUp(){
        System.setProperty("WebDriver.chrome.driver",System.getProperty("user.dir")+"src/test/resources/chromedriver");
        driver.get("https://www.myntra.com/");
        ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
        extent.attachReporter(spark);
        driver.manage().window().maximize();
    }

    @Test
    public static void testSteps_bracelet(){
        test = extent.createTest("validate bracelet product ","this test shows E2E journey to adding product to cart");
        Homepage.click_women_tab();
        CategoryPage.click_jewellery_category();
        ProductPage.verify_product_title();
        ProductPage.click_bracelet_product();
    }
    @Test
    public static void validate_addedToCart(){
        test = extent.createTest("validate bracelet product addition to cart ","this test shows E2E journey to adding product to cart");
        ProductDetailsPage.click_addToCart();
        ProductDetailsPage.verify_addedItem_inCart();
        extent.flush();
    }
    public static void testSteps_watches(){
        test = extent.createTest("validate watches product","this test shows E2E journey to adding product to cart");
        Homepage.click_women_tab();
        CategoryPage.click_watches_category();
        ProductPage.click_watches_products();

    }

}
