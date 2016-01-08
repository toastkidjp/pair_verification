package jp.toastkid.pair.java.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * check Pair's behavior.
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
     * check replaceable value.
     */
    @Test
    public final void testSetValue() {
        pair.setValue(110);
        assertEquals(110, pair.getValue().intValue());
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testNullable() {
        final Pair<Object, Integer> keyNull = new Pair<>(null, 120);
        assertNull(keyNull.getKey());
        assertEquals(120, keyNull.getValue().intValue());
        keyNull.setValue(110);

        final Pair<Object, Integer> valueNull = new Pair<>("test", null);
        assertNull(valueNull.getValue());
        assertEquals("test", valueNull.getKey());
        valueNull.setValue(110);

        final Pair<Object, Integer> bothNull = new Pair<>(null, null);
        assertNull(bothNull.getKey());
        assertNull(bothNull.getValue());
        bothNull.setValue(110);
    }
}
