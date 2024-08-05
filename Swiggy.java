package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Swiggy {

	public static void main(String[] args)throws InterruptedException {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.swiggy.com/");
		String Title = dr.getTitle();
		System.out.println("PageTitle-" + " " + Title);
    	String URL = dr.getCurrentUrl();
		System.out.println("URL-" + " " + URL);

		
		

	}

}
