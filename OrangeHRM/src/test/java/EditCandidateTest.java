
import org.testng.annotations.Test;

public class EditCandidateTest extends BaseTest {

    @Test
    public void EditCandidateDetails(){
        new LoginPage(driver)
                .performLogin("Admin","admin123")
                .clickRecruitmentButton().clickAdd()
                .EnterDetails("Paras","Rajaram",
                        "Koli","Pj@gmail.com").searchCandidate("Paras Rajaram Koli")
                .clickEyeButton().editCandidate();
    }
}