import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Sikuli {

  WebDriver _webdriver;

  @BeforeMethod
  public void before(){
    System.setProperty("webdriver.chrome.driver", "/Users/firstlast/Desktop/SELENIUM/ChromeDriver/chromedriver");
    _webdriver = new ChromeDriver();
    _webdriver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
    _webdriver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
  }


  @Test
  public void test() throws FindFailed, InterruptedException {
    _webdriver.get("https://www.google.com");
    Thread.sleep(1000);

    Screen s = new Screen();

    Pattern gmail = new Pattern("/Users/firstlast/Desktop/about button.png");
    s.click();

  }

  @AfterMethod
  public void after() throws InterruptedException {
    Thread.sleep(1000);
    _webdriver.quit();
  }

}
