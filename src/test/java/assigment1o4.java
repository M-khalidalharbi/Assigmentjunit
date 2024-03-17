import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


    //Go to URL: https://the-internet.herokuapp.com/windows
    //Verify the text: “Opening a new window”
    //Verify the title of the page is “The Internet”
    //Click on the “Click Here” button
    //Verify the new window title is “New Window”
    //Go back to the previous window and then verify the title: “The Internet”



public class assigment1o4 {
    WebDriver driver=new ChromeDriver();
      @BeforeEach
      public void setup() {



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
      @Test
              public void Test1() {





            driver.get("https://the-internet.herokuapp.com/windows");

            // Verify the text: "Opening a new window"
            WebElement openingText = driver.findElement(By.tagName("h3"));
            String text = openingText.getText();
            if (text.equals("Opening a new window")) {
                System.out.println("Text verification successful: " + text);
            } else {
                System.out.println("Text verification failed: " + text);
            }

            // Verify the title of the page is "The Internet"
            String pageTitle = driver.getTitle();
            if (pageTitle.equals("The Internet")) {
                System.out.println("Page title verification successful: " + pageTitle);
            } else {
                System.out.println("Page title verification failed: " + pageTitle);
            }

            // Click on the "Click Here" button
            WebElement clickHereButton = driver.findElement(By.linkText("Click Here"));
            clickHereButton.click();

            // Verify the new window title is "New Window"
            String originalWindowHandle = driver.getWindowHandle();
            for (String windowHandle : driver.getWindowHandles()) {
                driver.switchTo().window(windowHandle);
            }
            String newWindowTitle = driver.getTitle();
            if (newWindowTitle.equals("New Window")) {
                System.out.println("New window title verification successful: " + newWindowTitle);
            } else {
                System.out.println("New window title verification failed: " + newWindowTitle);
            }

            // Go back to the previous window and verify the title is "The Internet"
            driver.switchTo().window(originalWindowHandle);
            String previousWindowTitle = driver.getTitle();
            if (previousWindowTitle.equals("The Internet")) {
                System.out.println("Previous window title verification successful: " + previousWindowTitle);
            } else {
                System.out.println("Previous window title verification failed: " + previousWindowTitle);
            }

            // Close the browser
            driver.quit();
        }
    }


