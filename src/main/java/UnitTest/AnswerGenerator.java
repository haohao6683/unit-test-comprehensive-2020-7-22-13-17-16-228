package UnitTest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AnswerGenerator {
    public String generateAnswer(int number){
        Random random = new Random();
        int nums[] = new int[number];
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        for (int i = 0; i < 4; i++) {
            int k = random.nextInt(10 - i);
            nums[i] = list.get(k);
            list.remove(k);
        }
        String answer = "";
        for(int i : nums){
            answer += String.valueOf(i);
        }
        return answer;
    }
}
