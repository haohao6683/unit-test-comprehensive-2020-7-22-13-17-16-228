package UnitTest;

import org.junit.jupiter.api.*;
import org.junit.platform.commons.util.StringUtils;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;
public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_given_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "1234";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_2A2B_when_guess_given_1324() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "1324";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("2A2B", guessResult);
    }

    @Test
    void should_return_1A1B_when_guess_given_1467() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "1467";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("1A1B", guessResult);
    }

    @Test
    void should_return_0A4B_when_guess_given_4321() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "4321";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("0A4B", guessResult);
    }

    @Test
    void should_return_0A1B_when_guess_given_5681() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "5681";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("0A1B", guessResult);
    }

    @Test
    void should_return_0A0B_when_guess_given_6789() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");

        String inputString = "6789";
        String answer = answerGenerator.generateAnswer(4);
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("0A0B", guessResult);
    }

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
