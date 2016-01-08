package jp.toastkid.pair.javafx;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import javafx.util.Pair;

import org.junit.Before;
import org.junit.Test;

/**
 * test javafx.util.Pair,
 * @author Toast kid
 *
 */
public class PairTest {

    /** test target. */
    private Pair<String, Integer> pair;

    /**
     * initialize before every test.
     */
    @Before
    public void setUp() {
        pair = new Pair<>("tomato", 120);
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testConstructor() {
        assertNotNull(pair);
        assertEquals("tomato", pair.getKey());
        assertEquals(120,      pair.getValue().intValue());
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testNullable() {
        final Pair<Object, Integer> keyNull = new Pair<>(null, 120);
        assertNull(keyNull.getKey());
        assertEquals(120, keyNull.getValue().intValue());

        final Pair<Object, Integer> valueNull = new Pair<>("test", null);
        assertNull(valueNull.getValue());
        assertEquals("test", valueNull.getKey());

        final Pair<Object, Integer> bothNull = new Pair<>(null, null);
        assertNull(bothNull.getKey());
        assertNull(bothNull.getValue());
    }
}
