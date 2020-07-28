package UnitTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
public class GuessNumberGameTest {
    private GuessNumberGame game;

    @BeforeEach
    public void setup() {
        AnswerGenerator answerGenerator = mock(AnswerGenerator.class);
        when(answerGenerator.generateAnswer(4)).thenReturn("1234");
        String answer = answerGenerator.generateAnswer(4);
        game = new GuessNumberGame(answer);
    }

    @Test
    void should_return_4A0B_when_guess_given_1234() {
        //given
        String answer = "1234";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("4A0B", guessResult);
    }

    @Test
    void should_return_2A2B_when_guess_given_1324() {
        //given
        String answer = "1324";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("2A2B", guessResult);
    }

    @Test
    void should_return_1A1B_when_guess_given_1467() {
        //given
        String answer = "1467";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("1A1B", guessResult);
    }

    @Test
    void should_return_0A4B_when_guess_given_4321() {
        //given
        String answer = "4321";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("0A4B", guessResult);
    }

    @Test
    void should_return_0A1B_when_guess_given_5681() {
        //given
        String answer = "5681";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("0A1B", guessResult);
    }

    @Test
    void should_return_0A0B_when_guess_given_6789() {
        //given
        String answer = "6789";

        //when
        String guessResult = game.guessNumber(answer);

        //then
        assertEquals("0A0B", guessResult);
    }
}
