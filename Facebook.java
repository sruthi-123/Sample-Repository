package Programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();

		dr.get("https://www.facebook.com/");

		String Title = dr.getTitle();
		System.out.println("PageTitle-" + " " + Title);

		String URL = dr.getCurrentUrl();
		System.out.println("URL-" + " " + URL);

		WebElement nameelements= dr.findElement(By.name("email"));
		nameelements.sendKeys("siara20@gmail.com");
		
		WebElement passelements= dr.findElement(By.id("pass"));
		passelements.sendKeys("dec@123");
		
		WebElement footerelements= dr.findElement(By.id("pageFooterChildren"));
		footerelements.click();
	}

}
