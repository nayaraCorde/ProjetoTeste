import static java.lang.System.setProperty;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {

    public static WebDriver driver;
    private final String URL_BASE = "http://www.youutube.com/";
    private final String Caminho_Driver = "src\\main\\driver\\ChromeDriver.exe";

    public String getCaminho_Driver() {
        return Caminho_Driver;
    }

    @BeforeClass
    public void Iniciar() {
        driver.get(URL_BASE);
    }

    @AfterClass
    public void Finalizar() {
        driver.quit();
    }
}
