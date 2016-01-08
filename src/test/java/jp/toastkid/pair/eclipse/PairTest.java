package jp.toastkid.pair.eclipse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.impl.factory.Maps;
import org.eclipse.collections.impl.tuple.Tuples;
import org.junit.Before;
import org.junit.Test;

/**
 * Eclipse Collections Pair test.
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
        pair = Tuples.pair("tomato", 120);
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testConstructor() {
        assertNotNull(pair);
        assertEquals("tomato", pair.getOne());
        assertEquals(120,      pair.getTwo().intValue());
    }

    /**
     * check passing value to map.
     */
    @Test
    public final void testSetValue() {
        final MutableMap<String, Integer> map = Maps.mutable.of("new", 130);
        pair.put(map);
        assertTrue(map.containsKey("tomato"));
        assertTrue(map.containsValue(120));
    }

    /**
     * test {@link Pair#swap()}.
     */
    @Test
    public final void testSwap() {
        final Pair<Integer,String> swap = pair.swap();
        assertEquals(120,      swap.getOne().intValue());
        assertEquals("tomato", swap.getTwo());
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testNullable() {
        final Pair<Object, Integer> keyNull = Tuples.pair(null, 120);
        assertNull(keyNull.getOne());
        assertEquals(120, keyNull.getTwo().intValue());

        final Pair<Object, Integer> valueNull = Tuples.pair("test", null);
        assertNull(valueNull.getTwo());
        assertEquals("test", valueNull.getOne());

        final Pair<Object, Integer> bothNull = Tuples.pair(null, null);
        assertNull(bothNull.getOne());
        assertNull(bothNull.getTwo());
    }

}
