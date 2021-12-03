import com.thoughtworks.gauge.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {

    @BeforeScenario
    public void before(){

        System.out.println("senaryo basladı....");

    }
    @AfterScenario
    public void after(){

        System.out.println("senaryo bitti....");

    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("step basladı....");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("step bitti....");
    }

}
