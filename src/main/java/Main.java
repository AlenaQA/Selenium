import javafx.scene.control.Tab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver_win32 (1)\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/html_tables.asp");
        WebElement tableElement =  driver.findElement(By.xpath("//table[@id='customers']"));

        Table table = new Table(tableElement, driver);
        System.out.println("Rows number is " + table.getRows().size());
        //System.out.println(table.getRowsWithColumns().get(2));
        System.out.println(table.getValueFromCell(2, 2));
        System.out.println(table.getValueFromCell(4, 1));
        System.out.println(table.getValueFromCell(2, "Country"));
        System.out.println(table.getValueFromCell(3, "Company"));
    }
}
