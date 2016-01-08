package jp.toastkid.pair.eclipse;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.eclipse.collections.api.map.MutableMap;
import org.eclipse.collections.api.tuple.Pair;
import org.eclipse.collections.api.tuple.Twin;
import org.eclipse.collections.impl.factory.Maps;
import org.eclipse.collections.impl.tuple.Tuples;
import org.junit.Before;
import org.junit.Test;

/**
 * {@link Twin}'s test.
 * @author Toast kid
 *
 */
public class TwinTest {

    /** test target. */
    private Twin<String> twin;

    /**
     * initialize before every test.
     */
    @Before
    public void setUp() {
        twin = Tuples.twin("key", "value");
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testConstructor() {
        assertNotNull(twin);
        assertEquals("key", twin.getOne());
        assertEquals("value",      twin.getTwo());
    }

    /**
     * check put key-value pair to passed map.
     */
    @Test
    public final void testSetValue() {
        final MutableMap<String, String> map = Maps.mutable.of("newKey", "newValue");
        twin.put(map);
        assertTrue(map.containsKey("key"));
        assertTrue(map.containsValue("value"));
    }

    /**
     * test {@link Pair#swap()}.
     */
    @Test
    public final void testSwap() {
        final Twin<String> swap = twin.swap();
        assertEquals("value",      swap.getOne());
        assertEquals("key", swap.getTwo());
    }

    /**
     * test make instance by constructor.
     */
    @Test
    public final void testNullable() {
        final Twin<Integer> keyNull = Tuples.twin(null, 120);
        assertNull(keyNull.getOne());
        assertEquals(120, keyNull.getTwo().intValue());

        final Twin<Integer> valueNull = Tuples.twin(120, null);
        assertNull(valueNull.getTwo());
        assertEquals(120, valueNull.getOne().intValue());

        final Twin<Integer> bothNull = Tuples.twin(null, null);
        assertNull(bothNull.getOne());
        assertNull(bothNull.getTwo());
    }

}
