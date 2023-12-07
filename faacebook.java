package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class faacebook {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\91917\\Downloads\\chromedriver-win64\\chromedriver-win64.chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/login.php/");
		String s1=dr.getWindowHandle();
		System.out.print("window id 1 "+s1);;
		
		dr.findElement(By.xpath("//*[@id=\"login_link\"]/a[1]")).click();
   Set<String> tabs=dr.getWindowHandles();
   System.out.print("before switch "+dr.getTitle());
     for(String t : tabs)
     {
    	 if(s1 !=t)
    	 {
    		 dr.switchTo().window(t);
    	 }
     }
     System.out.print("after switch"+dr.getTitle());
		dr.findElement(By.xpath("//*[@id=\"login_form\"]/div[2]/div[4]/span/a")).click();
		 System.out.print("after switch "+dr.getTitle());
		 System.out.print("cureent switch "+dr.getCurrentUrl());
		 dr.close(); 
		
		
	}

}
