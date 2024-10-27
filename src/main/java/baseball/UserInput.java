package baseball;

import java.util.Scanner;

public class UserInput {

    public String getUserInput() {
        System.out.println("세자리 숫자를 입력하세요");
        try (Scanner scanner = new Scanner(System.in)) {
            if (!validateUserInput(scanner.nextLine())) {
                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
                return getUserInput();
            }
            return scanner.nextLine();
        }
    }

    private boolean validateUserInput(String userInput) {
        return isNumeric(userInput) && isThreeDigit(userInput);
    }

    private boolean isThreeDigit(String userInput) {
        return userInput.length() == 3;
    }

    private boolean isNumeric(String userInput) {
        return userInput.chars().allMatch(Character::isDigit);
    }

}
