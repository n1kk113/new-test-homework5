import com.codeborne.selenide.Condition;
import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class NewHomeworkFive {
        @Test
        void firstTest() {
            open("https://github.com/");
            $("[aria-label='Global']").shouldHave(Condition.text("Solutions")).hover();
            $("[href='/enterprise']").click();
            $("#hero-section-brand-heading").shouldHave(Condition.text("The AI-powered developer platform."));

        }
    @Test
    void secondTest() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(Condition.text("A"));
        $("#column-b").shouldHave(Condition.text("B"));
        $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
        $("#column-a").shouldHave(Condition.text("B"));
        $("#column-b").shouldHave(Condition.text("A"));
    }
}

