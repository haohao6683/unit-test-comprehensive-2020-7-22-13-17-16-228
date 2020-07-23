package UnitTest;

import java.util.HashMap;

public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String inputString){
        if(inputString.equals(answer)){
            return "4A0B";
        }
        String result = "";
        char inputList[] = inputString.toCharArray();
        char answerList[] = answer.toCharArray();

        int aNum = generateA(inputList,answerList);
        int bNum = generateB(inputList,answerList);

        return aNum + "A" + bNum + "B";
    }

    private int generateB(char[] inputList, char[] answerList) {
        int bNum = 0;
        for(int i=0; i < inputList.length; i++)
            for(int j=0; j < answerList.length; j++){
                if(i != j && inputList[i] == answerList[j]){
                    bNum++;
                }
            }
        return bNum;
    }

    private int generateA(char[] inputList, char[] answerList) {
        int aNum = 0;
        for(int i=0; i<inputList.length; i++){
            if(inputList[i] == answerList[i]){
                aNum++;
            }
        }
        return aNum;
    }

}
