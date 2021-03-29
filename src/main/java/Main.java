import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "browserDrivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();

        String searchFieldXpath = "//input[@title='Поиск']";

        WebElement searchElement = driver.findElement(By.xpath(searchFieldXpath));
        searchElement.sendKeys("SoftServe it academy");
        searchElement.submit();

        WebElement searchElement1 = driver.findElement(By.xpath("//a[@href='https://career.softserveinc.com/uk-ua/learning-and-certification']"));
        searchElement1.click();

        driver.getCurrentUrl();
        driver.close();

    }
}