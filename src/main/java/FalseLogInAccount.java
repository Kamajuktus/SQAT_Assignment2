import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FalseLogInAccount {
    public static void false_log_in_account(WebDriver driver){
        WebElement btnAccount = driver.findElement(By.xpath("//*[@id=\"myAccountDropdown\"]/button"));
        btnAccount.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement btnSignIn = driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div/div/div/span/a[1]"));
        btnSignIn.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"EmailAddress\"]"));
        emailInput.sendKeys("sqatse2007@gmail.com");

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement passwordInput = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        passwordInput.sendKeys("A!@#$%^&*()_+a");

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"signin\"]"));
        loginBtn.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        passwordInput.sendKeys("A!@#$%^&*()_+a");

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        loginBtn.click();
    }
}
