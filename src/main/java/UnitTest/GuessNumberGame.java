package UnitTest;

import java.util.HashSet;
import java.util.Scanner;

public class GuessNumberGame implements Game{
    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guessNumber(String answer){
        char[] inputList = answer.toCharArray();
        char[] answerList = this.answer.toCharArray();

        int aNum = generateACount(inputList,answerList);
        int bNum = generateBCount(inputList,answerList);
        return String.format("%sA%sB",aNum,bNum);
    }
    private int generateBCount(char[] inputList, char[] answerList) {
        int bNum = 0;
        for(int indexA=0; indexA < inputList.length; indexA++)
            for(int indexB=0; indexB < answerList.length; indexB++){
                if(indexA != indexB && inputList[indexA] == answerList[indexB]){
                    bNum++;
                }
            }
        return bNum;
    }

    private int generateACount(char[] inputList, char[] answerList) {
        int aNum = 0;
        for(int index=0; index<inputList.length; index++){
            if(inputList[index] == answerList[index]){
                aNum++;
            }
        }
        return aNum;
    }

    public boolean validate(String input) {
        if (input.length() != 4) {
            return false;
        }
        if (!input.matches("\\d{4}")) {//0-9 number
            return false;
        }
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            hashSet.add(String.valueOf(input.charAt(i)));
        }
        return hashSet.size() == input.length();
    }

    public int getInput(){
        Scanner s = new Scanner(System.in);
        int inputCount = 0;
        while (inputCount <= 6) {
            inputCount++;
            String input = s.next();
            if (!validate(input)) {
                //todo magic number
                System.out.println("Wrong Input，Input again");
            }
            else{
                guessNumber(input);
            }
        }
        return inputCount;
    }
}
