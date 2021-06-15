package SeleniumAssignments.SeleniumAssignments;

 

import org.openqa.selenium.WebDriver;

 

import org.openqa.selenium.chrome.ChromeDriver;

 


public class TitleAndURLTest {

 

    public static void main(String[] args) {
    
        System.setProperty("webdriver.chrome.driver", "C:\\soft\\Selenium Driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        String title = driver.getTitle();
        
    
        System.out.println(title);
       

 

        driver.close();
    }

 

}