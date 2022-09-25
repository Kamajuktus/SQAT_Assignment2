import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class ResetPassword {
    public static void reset_password(WebDriver driver){
        WebElement btnAccount = driver.findElement(By.xpath("//*[@id=\"myAccountDropdown\"]/button"));
        btnAccount.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement btnSignIn = driver.findElement(By.xpath("//*[@id=\"myaccount-dropdown\"]/div/div/div/div/div/span/a[1]"));
        btnSignIn.click();

        WebElement btnForgotPassword = driver.findElement(By.xpath("//*[@id=\"signInForm\"]/fieldset/div[4]/a"));
        btnForgotPassword.click();

        WebElement emailInput = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        emailInput.sendKeys("sqatse2007@gmail.com");

        WebElement btnResetPassword = driver.findElement(By.xpath("//*[@id=\"send\"]"));
        btnResetPassword.click();

        driver.get("https://www.gmail.com/");

        WebElement GoogleEmailInput = driver.findElement(By.xpath("//*[@id=\"identifierId\"]"));
        GoogleEmailInput.sendKeys("sqatse2007@gmail.com");

        WebElement GoogleLoginBtn = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button"));
        GoogleLoginBtn.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement GooglePasswordInput = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
        GooglePasswordInput.sendKeys("SqatSE2007");

        WebElement GooglePasswordBtn = driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button"));
        GooglePasswordBtn.click();

        //noinspection deprecation
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        WebElement GooglePasswordResetMail = driver.findElement(By.xpath("//span[text()='Your ASOS password reset link is ready']"));
        GooglePasswordResetMail.click();

        WebElement MailBtn = driver.findElement(By.xpath("//*[@id=\":79\"]/div/table[1]/tbody/tr[2]/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td/table/tbody/tr/td[2]/table/tbody/tr[8]/td/table/tbody/tr/td/a"));
        MailBtn.click();
    }
}
