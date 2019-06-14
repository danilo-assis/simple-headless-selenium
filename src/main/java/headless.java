import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class headless {

    private ChromeOptions chromeOptions;

    public static void main(String[] args){
        algumaCoisa();
    }




    public static void algumaCoisa()

    {

        ChromeOptions options = new ChromeOptions();


        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);



    driver.get("https://www.google.com.br");
    System.out.println(driver.getTitle());
    driver.findElement(By.name("q")).sendKeys("Headless Test");
        System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")).sendKeys(Keys.RETURN);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(driver.getTitle());

    driver.close();

    }
}