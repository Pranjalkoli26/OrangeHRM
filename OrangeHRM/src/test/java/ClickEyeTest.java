
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickEyeTest extends BaseTest{

    @Test
    public void SearchCandidate(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Paras","Rajendra",
                        "Koli","Pj@gmail.com").searchCandidate("Paras Rajendra Koli").clickEyeButton();

        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[1]/form")).isDisplayed());
    }

}