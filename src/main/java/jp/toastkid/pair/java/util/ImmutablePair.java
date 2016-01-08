package jp.toastkid.pair.java.util;

import java.util.AbstractMap;

/**
 * Immutable key-value pair.
 * @author Toast kid
 *
 * @param <K>
 * @param <V>
 */
public class ImmutablePair<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {

    /**
     * serialVersionUID.
     */
    private static final long serialVersionUID = 3559398847531200896L;

    /**
     * initialize with key and value.
     * @param key
     * @param value
     */
    public ImmutablePair(final K key, final V value) {
        super(key, value);
    }

}
