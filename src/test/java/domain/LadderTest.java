package domain;

import org.junit.Before;
import org.junit.Test;

public class LadderTest {
    private Ladder ladder;

    @Before
    public void Ladder_생성() {
        this.ladder = new Ladder(4,3);
        ladder.print();
    }

    @Test
    public void resultIndex() {
        System.out.println(this.ladder.calcStartIndex(2));
    }
}
