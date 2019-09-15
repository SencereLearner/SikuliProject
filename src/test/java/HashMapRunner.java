import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HashMapRunner {

  static WebDriver _webdriver;

  public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "/Users/firstlast/Desktop/SELENIUM/ChromeDriver/chromedriver");
    _webdriver = new ChromeDriver();
    _webdriver.get("https://vk.com");

    String allUsersCredentials = HashMap.getUserLoginInfo().get("user1");
    String allUsersCredentialsSplit[] = allUsersCredentials.split("_");

    _webdriver.findElement(By.id("index_email")).sendKeys(allUsersCredentialsSplit[0]);
    _webdriver.findElement(By.id("index_pass")).sendKeys(allUsersCredentialsSplit[1]);

    Thread.sleep(1000);

    _webdriver.quit();



  }

}
