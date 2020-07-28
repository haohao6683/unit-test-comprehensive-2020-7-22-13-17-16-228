package UnitTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator implements Generator{
    public String generateAnswer(int length) {
        Random random = new Random();
        int[] nums = new int[length];
        List<Integer> numberFrom0to9 = new ArrayList<>();
        for (int index = 0; index < 10; index++) {
            numberFrom0to9.add(index);
        }
        for (int index = 0; index < length; index++) {
            int k = random.nextInt(10 - index);
            nums[index] = numberFrom0to9.get(k);
            numberFrom0to9.remove(k);
        }
        StringBuilder answer = new StringBuilder();
        for (int number : nums) {
            answer.append(number);
        }
        return answer.toString();
    }
}
