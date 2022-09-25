import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Gess\\IdeaProjects\\SQAT_Assign_2\\BrowserDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.asos.com/");
//        ResetPassword.reset_password(driver);
//        LogInAccount.log_in_account(driver);
//        LogOutAccount.log_out_account(driver);
//        FalseLogInAccount.false_log_in_account(driver);
    }








}
