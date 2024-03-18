import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assigment4o4 {
    WebDriver driver = new ChromeDriver();

    @BeforeEach

    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void Test3() {
            // Set the path to the ChromeDriver executable



            // Navigate to Amazon
            driver.get("https://www.amazon.com/");

            // Scroll to the bottom of the page using JavascriptExecutor
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

            // Wait for the page to load or add necessary wait code here

            // Find and click on the "Back to top" button

        WebElement backToTopButton = driver.findElement(By.id("navBackToTop"));
            backToTopButton.click();

            // Find and click on the Amazon logo in the footer using JavascriptExecutor
            WebElement amazonLogoFooter = driver.findElement(By.xpath("//div[@id='navFooter']//a[@class='nav-logo-link']"));
            js.executeScript("arguments[0].click();", amazonLogoFooter);

            // Wait for the page to load or add necessary wait code here

            // Find the search box
            WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

            // Create an instance of Actions class
            Actions actions = new Actions(driver);

            // Clear the search box, type "ClarusWay", and perform the search
            actions.click(searchBox).sendKeys(Keys.chord(Keys.CONTROL, "a"), "ClarusWay").sendKeys(Keys.ENTER).build().perform();

            // Wait for the search results page to load or add necessary wait code here

            // Continue with further actions or assertions as needed

            // Close the browser
            driver.quit();
        }

    }
