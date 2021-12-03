import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GittigidiyorStep {

    WebDriver driver;

    @BeforeScenario
    public void before() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

    @AfterScenario
    public void after() {
        driver.close();

    }

    @Step("Navigate to the <gittigidiyor.com>")
    public void navigateToTheHomePage(String url) {
        driver.get(url);
    }

    @Step("Search a <tablet> product")
    public void searchProduct(String prd) {
        driver.findElement(By.xpath("//input[@data-cy='header-search-input']")).sendKeys(prd, Keys.ENTER);

    }
}
