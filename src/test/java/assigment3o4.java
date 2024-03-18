//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import java.time.Duration;
//
//public class assigment3o4 {
//
//
//    public class GoogleSearch {
//        @BeforeEach
//
//                public void setup() {
//            driver.manage().window().maximize();
//            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//        }
//        @Test
//             public void Test3() {
//
//
//
//
//
//                // Create a new instance of the ChromeDriver
//                WebDriver driver = new ChromeDriver();
//
//                // Navigate to Google
//                driver.get("https://www.google.com/");
//
//                // Find the search input field
//                WebElement searchInput = driver.findElement(By.name("q"));
//
//                // Create an instance of Actions class
//                Actions actions = new Actions(driver);
//
//                // Perform keyboard actions
//                actions.sendKeys(searchInput, "Scroll Methods").sendKeys(Keys.ENTER).build().perform();
//
//                // Wait for the search results page to load
//                // Add necessary code here if required
//
//                // Continue with further actions or assertions as needed
//
//                // Close the browser
//                driver.quit();
//            }
//        }
//
//
//
//
//
