package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CorrectAnswerTest {

    @DisplayName("정답을 모두 맟췄을 때 모두 초록색이 나온다.")
    @Test
    void test01() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("spill"));

        assertThat(tiles).containsExactly(Tile.GREEN, Tile.GREEN, Tile.GREEN, Tile.GREEN, Tile.GREEN);
    }

    @DisplayName("정답을 모두 빗나갔을 때 모두 노란색이 나온다.")
    @Test
    void test02() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("llsip"));

        assertThat(tiles).containsExactly(Tile.YELLOW, Tile.YELLOW, Tile.YELLOW, Tile.YELLOW, Tile.YELLOW);
    }

    @DisplayName("정답을 모두 틀렸을 때 모두 회색이 나온다.")
    @Test
    void test03() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("mongo"));

        assertThat(tiles).containsExactly(Tile.GRAY, Tile.GRAY, Tile.GRAY, Tile.GRAY, Tile.GRAY);
    }

    /*@DisplayName("그린 1개, 노란색 1개, 회색 3개인 답안을 비교한다.")
    @Test
    void test01() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("hello"));

        assertThat(tiles).containsExactly(Tile.GRAY, Tile.GRAY, Tile.YELLOW, Tile.GREEN, Tile.GRAY);
    }

    @DisplayName("그린 1개, 노란색 1개, 회색 3개인 답안을 비교한다.")
    @Test
    void test02() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("label"));

        assertThat(tiles).containsExactly(Tile.YELLOW, Tile.GRAY, Tile.GRAY, Tile.GRAY, Tile.GREEN);
    }

    @DisplayName("입력된 답안을 존재하는 Word 인지 비교한다.")
    @Test
    void test03() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("spell"));

        assertThat(tiles).containsExactly(Tile.GREEN, Tile.GREEN, Tile.GRAY, Tile.GREEN, Tile.GREEN);
    }

    @DisplayName("입력된 답안을 존재하는 Word 인지 비교한다.")
    @Test
    void test04() {
        CorrectAnswer correctAnswer = new CorrectAnswer(new Word("spill"));

        List<Tile> tiles = correctAnswer.compare(new Word("spill"));

        assertThat(tiles).containsExactly(Tile.GREEN, Tile.GREEN, Tile.GREEN, Tile.GREEN, Tile.GREEN);
    }*/
}