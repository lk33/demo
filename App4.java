package test3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import java.util.concurrent.TimeUnit;
public class App4 {
 WebDriver driver;
 @BeforeTest
 public void beforetest() {
	 System.setProperty("webdriver.chrome.driver","G:\\Stackroute training\\Softwares\\Selenium\\driver\\chromedriver.exe");
	 driver=new ChromeDriver();
 }
 @BeforeMethod
 public void open() {
  driver.get("http://google.com");
 }
 @Test
 public void verify() {
    if(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed()) {
    	
    }
    else {
    	System.out.println("Serach Engine page not found");
    	driver.close();
    }
//  System.out.println("The image is displayed"+b);
  driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
  }
 @AfterClass
 public void close() {
	 	 driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	 	 driver.close();
 }
 @Test
 public void search() {
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Dish TV");
	  driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
	  String title = driver.getTitle();
	  System.out.println(title);
	  driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
 }
}