import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumSampleTest {
    @Test
    public void testOpenGoogle() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless=new"); // ヘッドレスモードで起動
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.google.com");
        // タイトルに"Google"が含まれているか確認
        assert driver.getTitle().contains("Google");
        driver.quit();
    }
}
