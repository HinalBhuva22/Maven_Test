import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

    public static void main(String[] args) {


        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open the URL
            driver.get("https://demo.guru99.com/test/drag_drop.html");

            // Maximize the window
            driver.manage().window().maximize();

            // Locate the source element for drag and drop
            WebElement from = driver.findElement(By.xpath("//li[@id='credit2']/a")); // Modify the XPath based on the actual element

            // Locate the target element for drag and drop
            WebElement to = driver.findElement(By.id("bank"));

            // Create Actions instance
            Actions builder = new Actions(driver);

            // Perform drag and drop
            builder.dragAndDrop(from, to).build().perform();

            System.out.println("Drag and Drop successful!");
            
            
            
            

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
            
            
        }
    }
}
