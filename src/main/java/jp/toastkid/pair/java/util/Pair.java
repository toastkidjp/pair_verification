package jp.toastkid.pair.java.util;

import java.util.AbstractMap;

/**
 * extends AbstractMap.SimpleEntry&lt;K, V&gt;.
 * @author Toast kid
 *
 * @param <K>
 * @param <V>
 */
public class Pair<K, V> extends AbstractMap.SimpleEntry<K, V> {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 6411527075103472113L;

    /**
     * initialize with key and value.
     * @param key
     * @param value
     */
    public Pair(final K key, final V value) {
        super(key, value);
    }

}
