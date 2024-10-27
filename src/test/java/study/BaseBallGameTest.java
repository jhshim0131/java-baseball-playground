package study;

import baseball.BaseBall;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BaseBallGameTest {


    @Test
    void 세자리_숫자를_만든다() {
        BaseBall baseBall = new BaseBall();
        String number = baseBall.create3DigitRandomNumber();
        System.out.println("number = " + number);

        assertThat(number).hasSize(3);
    }



    // 사용자 입력값 검증
    // 사용자 입력값과 랜덤값 비교
    // 결과 출력

}
