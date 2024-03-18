import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

/*   Go to URL: http://facebook.com
      getCookies,
      addCookie,
      deleteCookieNamed,
      deleteAllCookies
   */
public class assigment5o4 {

    WebDriver driver = new ChromeDriver();
    @BeforeEach

    public void setup() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void Test5() {


            // Create a new instance of the ChromeDriver


            // Navigate to Facebook
            driver.get("http://facebook.com");

            // Get all cookies
            Set<Cookie> cookies = driver.manage().getCookies();
            for (Cookie cookie : cookies) {
                System.out.println("Cookie Name: " + cookie.getName());
                System.out.println("Cookie Value: " + cookie.getValue());
            }

            // Create a new cookie
            Cookie newCookie = new Cookie("exampleCookie", "exampleValue");

            // Add the new cookie
            driver.manage().addCookie(newCookie);

            // Delete a cookie by name
            driver.manage().deleteCookieNamed("exampleCookie");

            // Delete all cookies
            driver.manage().deleteAllCookies();

            // Close the browser
            driver.quit();
        }
    }


