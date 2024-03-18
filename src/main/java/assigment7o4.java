
// Go to amazon.com
// Take Full Page Screenshot.
// Take any spesific WebElement ScreenShot

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class assigment7o4 {


            // Set the path to the ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

            // Create a new instance of the ChromeDriver
            WebDriver driver = new ChromeDriver();
    @BeforeEach

    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    @Test
    public void Test7() {


        // Navigate to Amazon
            driver.get("https://www.amazon.com/");

            // Take a full-page screenshot
            File fullPageScreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(fullPageScreenshot, new File("path/to/full-page-screenshot.png"));
                System.out.println("Full-page screenshot captured successfully.");
            } catch (IOException e) {
                System.out.println("Failed to capture full-page screenshot: " + e.getMessage());
            }

            // Find a specific WebElement to capture its screenshot
            WebElement element = driver.findElement(By.xpath("//your/xpath/here"));

            // Scroll to the element to ensure it's visible in the viewport
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            // Wait until the element is fully loaded and visible
            WebDriverWait wait = new WebDriverWait(driver, 10);
            wait.until(ExpectedConditions.visibilityOf(element));

            // Take a screenshot of the specific WebElement
            File elementScreenshot = element.getScreenshotAs(OutputType.FILE);
            try {
                FileHandler.copy(elementScreenshot, new File("path/to/element-screenshot.png"));
                System.out.println("Element screenshot captured successfully.");
            } catch (IOException e) {
                System.out.println("Failed to capture element screenshot: " + e.getMessage());
            }

            // Close the browser
            driver.quit();
        }
    }


