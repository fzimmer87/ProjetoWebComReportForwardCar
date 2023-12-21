package configHook;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Hook {
    public static WebDriver driver;
    @Before
    public void IniciarDriverAntesdeCadaTeste() throws IOException {
        LerProperties lerProperties = new LerProperties();
        switch (lerProperties.getDrivers()) {
            case 1:
                System.setProperty(lerProperties.configChromeDriver, lerProperties.chrome);
                driver = new ChromeDriver();
                break;
            case 2:
                System.setProperty(lerProperties.configedgedriver, lerProperties.caminhoedgedriver);
                driver = new EdgeDriver();
                break;
            case 3:
                System.setProperty(lerProperties.configfirefoxdriver, lerProperties.caminhofirefoxdriver);
                driver = new FirefoxDriver();
                break;
        }
    }
    @After
    public void fecharNavegador() {
        driver.quit();
    }
}
