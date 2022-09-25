import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LogOutAccount {
    public static void log_out_account(WebDriver driver) {
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement btnAccount = driver.findElement(By.xpath("//*[@id=\"myAccountDropdown\"]/button"));
        btnAccount.click();
        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

        WebElement logoutBtn = driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div/div/div/span[2]/button"));
        logoutBtn.click();
    }
}
