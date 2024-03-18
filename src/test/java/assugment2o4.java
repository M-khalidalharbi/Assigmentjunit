//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import java.time.Duration;
//
//public class assugment2o4 {
//
//    /*
//Go to URL: http://demo.guru99.com/test/drag_drop.html
//Drag and drop the BANK button to the Account section in DEBIT SIDE
//Drag and drop the SALES button to the Account section in CREDIT SIDE
//Drag and drop the 5000 button to the Amount section in DEBIT SIDE
//Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
//Verify the visibility of Perfect text.
//*/
//
//    WebDriver driver = new ChromeDriver();
//
//    @BeforeEach
//    public void setup() {
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//    }
//
//
//
//
//    @Test
//    public void Test1() {
//
//        // Set the path to the ChromeDriver executable
//
//
//
//        // Navigate to the URL
//        driver.get("http://demo.guru99.com/test/drag_drop.html");
//
//        // Create an instance of Actions class
//        Actions actions = new Actions(driver);
//
//        // Locate the elements to be dragged and dropped
//        WebElement bankButton = driver.findElement(By.xpath("//a[text()=' BANK ']"));
//        WebElement salesButton = driver.findElement(By.xpath("//a[text()=' SALES ']"));
////        WebElement debitAmountCell = driver.findElement(By.xpath("//li[@id='amt7']"));
//        WebElement creditAmountCell = driver.findElement(By.xpath("//li[@id='amt8']"));
//
//        // Perform drag and drop actions
////        actions.dragAndDrop(bankButton, debitAmountCell).build().perform();
//        actions.dragAndDrop(salesButton, creditAmountCell).build().perform();
//
//        // Locate the 5000 buttons
//        WebElement first5000Button = driver.findElement(By.xpath("//a[text()='5000']"));
//        WebElement second5000Button = driver.findElement(By.xpath("//a[text()='5000']"));
//
//        // Perform drag and drop actions for the 5000 buttons
//        actions.dragAndDrop(first5000Button, debitAmountCell).build().perform();
//        actions.dragAndDrop(second5000Button, creditAmountCell).build().perform();
//
//        // Verify the visibility of the "Perfect" text
//        WebElement perfectText = driver.findElement(By.xpath("//a[text()='Perfect!']"));
//        boolean isPerfectTextVisible = perfectText.isDisplayed();
//
//        // Print the result
//        if (isPerfectTextVisible) {
//            System.out.println("The 'Perfect' text is visible.");
//        } else {
//            System.out.println("The 'Perfect' text is not visible.");
//        }
//
//        // Close the browser
//        driver.quit();
//    }
//}
//
//
//
