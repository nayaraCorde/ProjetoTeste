import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class App extends BaseTest {

    @Test
    public void testeNay2() {

        WebElement inputPesquisa = driver.findElement(By.name("q"));
        inputPesquisa.sendKeys("bitcoin" + Keys.ENTER);

    }

}

/**
 * public class App {
 * public static void main(String[] args) {
 * System.out.println("Hello World!");
 * }
 * }
 * 
 */
