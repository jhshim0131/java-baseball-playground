package study;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringTest {
    @Test
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }


    @Test
    void containsChar() {
        String sample = "1,2";
        String[] split = sample.split(",");
        assertThat(split).contains("1");
        assertThat(split).contains("2");
        assertThat(split).containsExactly("1","2");
    }

    @Test
    void takeoutParenthesis() {
        String sample = "(1,2)";
        String substring = sample.substring(1,4);
        assertThat(substring).isEqualTo("1,2");
    }
}
