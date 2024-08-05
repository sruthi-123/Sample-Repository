package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {

		WebDriver dr = new ChromeDriver();

		dr.get("https://www.instagram.com/");

		String Title = dr.getTitle();
		System.out.println("PageTitle-" + " " + Title);

		String URL = dr.getCurrentUrl();
		System.out.println("URL-" + " " + URL);
		
		WebElement InstaElement = dr.findElement(By.xpath("//link[@rel='icon']"));
        System.out.println(InstaElement);
		//if (URL.contains("instagram")) {

		//	System.out.println("Successfully Executed");
		//} else {
		//	System.out.println("Page not found");
		}

		// String code=dr.getPageSource();
		// System.out.println(code);
		//Thread.sleep(4000);

		//dr.close();
	}

