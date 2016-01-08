package jp.toastkid.pair.java.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

/**
 * Immutable key-value pair's test.
 * @author Toast kid
 *
 */
public class ImmutablePairTest {

    /** test target. */
    private ImmutablePair<String, Integer> pair;

    /**
     * initialize before every test.
     */
    @Before
    public void setUp() {
        pair = new ImmutablePair<>("tomato", 120);
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
     * check immutable object.
     */
    @Test(expected=UnsupportedOperationException.class)
    public final void testImmutable() {
        pair.setValue(110);
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
