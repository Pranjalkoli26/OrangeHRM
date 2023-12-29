
import org.testng.annotations.Test;

public class SearchTest extends BaseTest{

    @Test
    public void SearchCandidate(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Paras","Rajendra",
                        "Koli","pj@gmail.com").searchCandidate();


    }
}
