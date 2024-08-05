package Programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		WebDriver dr = new ChromeDriver();

		dr.get("https://www.amazon.in/");

		String Title = dr.getTitle();
		System.out.println("PageTitle-" + " " + Title);

		String URL = dr.getCurrentUrl();
		System.out.println("URL-" + " " + URL);

		if (URL.contains("amazon")) {

			System.out.println("Successfully Executed");
		} else {
			System.out.println("Page not found");
		}

		// String code=dr.getPageSource();
		// System.out.println(code);
		Thread.sleep(4000);

		dr.close();
	}

}
