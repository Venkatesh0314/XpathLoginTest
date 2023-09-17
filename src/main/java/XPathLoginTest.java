import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathLoginTest {
    public static void main(String[] args){
        // to set the path to the chromedriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        // to open the url
        driver.get("https://qaloginpage.ccbp.tech/");

        // enter the username
        WebElement username=driver.findElement(By.xpath("/html/body/div/form/input[1]"));
        username.sendKeys("rahul");
        // enter the password
        WebElement password=driver.findElement(By.xpath("/html/body/div/form/input[2]"));
        password.sendKeys("rahul@2023");
        // submit the button
        WebElement button=driver.findElement(By.xpath("/html/body/div/form/button"));
        button.click();

        // to find the expected url
        String expectedUrl="https://qaloginpage.ccbp.tech/home";
        // to find the current url
        String currentUrl=driver.getCurrentUrl();

        if(currentUrl.equals(expectedUrl)){
            System.out.println("Logged in successfully");
        }
        driver.quit();

    }
}
