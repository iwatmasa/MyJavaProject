import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumSampleTest {
    @Test
    public void testOpenGoogle() {
        // ChromeDriverのパスはGitHub Actionsでは自動でセットアップされます
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        // タイトルに"Google"が含まれているか確認
        assert driver.getTitle().contains("Google");
        driver.quit();
    }
}
