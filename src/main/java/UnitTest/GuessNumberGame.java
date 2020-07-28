package UnitTest;

import java.util.HashSet;
import java.util.Scanner;

public class GuessNumberGame implements Game{
    private final String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    //todo guessNumber
    public String guess(String inputString){
        char[] inputList = inputString.toCharArray();
        char[] answerList = answer.toCharArray();

        int aNum = generateA(inputList,answerList);
        int bNum = generateB(inputList,answerList);
        //todo String.format
        return aNum + "A" + bNum + "B";
    }
    //todo method name
    private int generateB(char[] inputList, char[] answerList) {
        int bNum = 0;
        //todo index naming
        //todo stream
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
        //todo useless
//        for (int i = 0; i < 4; i++) {
//            if (input.lastIndexOf(input.charAt(i)) > i) {//查重
//                return false;
//            }
//        }
    }

    public int getInput(){
        Scanner s = new Scanner(System.in);
        int inputCount = 0;
        //todo
        while (inputCount <= 6) {
            inputCount++;
            String input = s.next();
            if (!validate(input)) {
                //todo magic number
                System.out.println("Wrong Input，Input again");
            }
            else{
                guess(input);
            }
        }
        return inputCount;
    }
}
