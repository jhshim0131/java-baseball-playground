package baseball;

public class BaseBallGame {

    public static void main(String[] args) {
        BaseBall baseBall = new BaseBall();
        String number = baseBall.create3DigitRandomNumber();

        // 사용자 입력값 받기
        UserInput userInput = new UserInput();
        String userInputString = userInput.getUserInput();
//        userInput.compareUserInputAndRandomNumber(userInputString, number);

    }


}
