import Utils.ChromeRunner;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;

public class work3 {
        public static class work4 extends ChromeRunner {
            @Test(enabled = true)
            public void upway() {
                $(byName("test1"), 1).click();
            }

            @Test(enabled = true)
            public void upway1() {
                $(byName("test1"), 1).click();
            }

            @Test(priority = 1)
            public void upway2() {
                $(byName("test1"), 1).click();
            }

        }
}
