package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax4To4Then4() {
        int left = 4;
        int right = 4;
        int result = Max.max(left, right);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}