package parameters;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    @Parameters("browser")
    @Test
    public void parameterstestExample(String browser) throws Exception {
        System.out.println("parameterstestExample - browser recieved - " + browser);
        WebDriver driver = WebDriverFactory.getDriver(browser);
    }
}
