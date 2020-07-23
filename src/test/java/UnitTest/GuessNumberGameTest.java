package UnitTest;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_given_1234() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputString = "1234";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_2A2B_when_guess_given_1432() {
        //given
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer()).thenReturn("1234");

        String inputString = "1432";
        String answer = answerGenerator.generateAnswer();
        GuessNumberGame game = new GuessNumberGame(answer);

        //when
        String guessResult = game.guess(inputString);

        //then
        assertEquals("2A2B", guessResult);
    }
}
