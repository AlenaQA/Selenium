import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Table {
    private WebElement tableElement;
    private WebDriver driver;

    public Table(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }

    public List<WebElement> getRows() {
        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
    }
}
