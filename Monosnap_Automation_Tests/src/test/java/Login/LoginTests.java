package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {
    //import selenium driver
    private WebDriver driver;
 //import chrome driver
 public void setUp()throws InterruptedException{
     System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
     driver = new ChromeDriver();
  //Get the project URL
  driver.get("https://monosnap.com/");
  //Wait to load project page
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   //maximize Project page
   driver.manage().window().maximize();
   //Get project Title
     System.out.println(driver.getTitle());
     //lOCATE SIGN IN BUTTON AND CLICK
     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[3]/div[1]/div/div[2]/div[3]/span")).click();
       //Locate username field.
   driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[1]")).sendKeys("mtes7272@gmail.com");
   //Locate password field
     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/div[4]/input[2]")).sendKeys("MOUNTAIN12TEST");
     //CLICK ON SIGN IN BUTTON
     driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[1]/div[1]/div/div[2]/form/button")).click();
     Thread.sleep(10000);
     //close windows
     driver.quit();

 }
 //Initiate
    public static void main(String args[]) throws InterruptedException {
     LoginTests tests = new LoginTests();
     tests.setUp();
    }
}
