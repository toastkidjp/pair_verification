package jp.toastkid.pair.commons;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Before;
import org.junit.Test;

/**
 * org.apache.commons.lang3.tuple.Pair's test case.
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
        pair = Pair.of("tomato", 120);
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
     * test equals key-left and value-right.
     */
    @Test
    public final void testLR() {
        assertNotNull(pair);
        assertEquals(pair.getKey(), pair.getLeft());
        assertEquals(pair.getValue(), pair.getRight());
    }

    /**
     * check <b>not</b> replaceable value.
     */
    @Test(expected=UnsupportedOperationException.class)
    public final void testCantSetValue() {
        pair.setValue(110);
    }

    /**
     * test disallow null key.
     */
    @Test
    public final void testKeyNonNullable() {
        final Pair<Object, Integer> keyNull = Pair.of(null, 120);
        assertNull(keyNull.getKey());
        assertEquals(120, keyNull.getValue().intValue());
    }

    /**
     * test disallow null value.
     */
    @Test
    public final void testVakueNonNullable() {
        final Pair<Object, Integer> valueNull = Pair.of("test", null);
        assertNull(valueNull.getValue());
        assertEquals("test", valueNull.getKey());
    }

    /**
     * test disallow null key and value.
     */
    @Test
    public final void testNullable() {
        final Pair<Object, Integer> bothNull = Pair.of(null, null);
        assertNull(bothNull.getKey());
        assertNull(bothNull.getValue());
    }
}
