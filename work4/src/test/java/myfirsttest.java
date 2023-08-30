import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class myfirsttest {
    @Test
    public void autotest() {
        Configuration.baseUrl = "https://redmed.ge";
        Configuration.browserSize = "1900x1200";
        open("/user/auth-user?selectedLanguage=ka");


        SelenideElement colee = $("telLogin");
        System.out.println(colee);
    }


}
