import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RecruitmentPage {

    WebDriver driver;

    public RecruitmentPage(WebDriver driver) {
        this.driver = driver;
    }

    By addButton = By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]");

    public void clickAdd(){
        driver.findElement(addButton).click();
    }
}
