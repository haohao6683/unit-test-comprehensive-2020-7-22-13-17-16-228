package UnitTest;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AnswerGeneratorTest {
    @Test
    void should_return_randomString() {
        //given
        AnswerGenerator answerGenerator = new AnswerGenerator();

        //when
        String answer = answerGenerator.generateAnswer(4);

        //then
        assertTrue(StringUtils.isNotBlank(answer));
    }
}
