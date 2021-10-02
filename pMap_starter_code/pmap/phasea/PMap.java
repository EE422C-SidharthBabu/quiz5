/*
 * Phase A <sg52879><snb2593>
 * Phase B <snb2593><sg52879>
 */

import java.util.Iterator;

/**
 * PMap stands for Paired Map. A map is a collection of key-value
 * pairs, e.g., (1, 2) (2, 3) (3, 4) are all pairs with an integer key
 * and an integer value. See the
 * <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">
 * java.util.Map documentation</a> for how these methods are supposed
 * to work.
 */
public class PMap {
    private ArrayList<PEntry> mapUtil;

    public PMap()
    {
        this.mapUtil = new ArrayList<PEntry>();
    }

    /**
     * Returns the number of key-value mappings in this map.
     *
     * @return the number of key-value mappings in this map
     */
    public Integer size() {
        // TODO
        return mapUtil.size();
    }

    /**
     * Returns <tt>true</tt> if this map contains no key-value
     * mappings.
     *
     * @return <tt>true</tt> if this map contains no key-value
     *         mappings
     */
    public boolean isEmpty() {
        // TODO
        return (size() == 0);
    }

    /**
     * Returns <tt>true</tt> if this map contains a mapping for the
     * specified key.
     *
     * @param key key whose presence in this map is to be tested
     * @return <tt>true</tt> if this map contains a mapping for the
     *         specified key
     */
    public boolean containsKey(Integer key) {
        // TODO
        Iterator<PEntry> iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next();
            if(hold.getKey() == key) {return true;}
        }
        return false;
    }

    /**
     * Returns <tt>true</tt> if this map maps one or more keys to the
     * specified value.
     *
     * @param value value whose presence in this map is to be tested
     * @return <tt>true</tt> if this map maps one or more keys to the
     *         specified value
     */
    public boolean containsValue(Integer value) {
        // TODO
        Iterator<PEntry> iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next();
            if(hold.getValue() == value) {return true;}
        }
        return false;
    }

    /**
     * Returns the value to which the specified key is mapped, or
     * {@code null} if this map contains no mapping for the key.
     *
     * @param key the key whose associated value is to be returned
     * @return the value to which the specified key is mapped, or
     *         {@code null} if this map contains no mapping for the
     *         key
     */
    public Integer get(Integer key) 
    {
        // TODO
        Iterator<PEntry> iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next();
            if(hold.getKey() == key) {return hold.getValue();}
        }
        return null;
    }

    /**
     * Associates the specified value with the specified key in this
     * map (optional operation).  If the map previously contained a
     * mapping for the key, the old value is replaced by the specified
     * value.
     *
     * @param key key with which the specified value is to be
     *        associated
     * @param value value to be associated with the specified key
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer put(Integer key, Integer value) {
        // TODO
        Iterator<PEntry> iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next();
            if(hold.getKey() == key) 
            {
                Integer get = hold.getValue(); 
                hold.setValue(value); 
                return get;
            }
        }
        PEntry other = new PEntry(key, value);
        mapUtil.add(other);
        return null;
    }

    /**
     * Removes the mapping for a key from this map if it is present
     * (optional operation).
     *
     * <p>Returns the value to which this map previously associated
     * the key, or <tt>null</tt> if the map contained no mapping for
     * the key.
     *
     * <p>The map will not contain a mapping for the specified key
     * once the call returns.
     *
     * @param key key whose mapping is to be removed from the map
     * @return the previous value associated with <tt>key</tt>, or
     *         <tt>null</tt> if there was no mapping for <tt>key</tt>.
     */
    public Integer remove(Integer key) {
        // TODO
        Iterator<PEntry> iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next();
            if(hold.getKey() == key) 
            {
                Integer val = hold.getValue();
                mapUtil.remove(hold);
                return val;
            }
        }
        return null;
    }

    /**
     * Put all of the mappings from a pair of arrays to this map. Each
     * pair of elements sharing the same index in <tt>keys</tt> and
     * <tt>values</tt> composes a mapping to be stored the map.
     *
     * @param keys the array of keys to be stored in this map
     * @param values the array of values to be stored in this map
     */
    public void putAll(Integer[] keys, Integer[] values) 
    {
        if(keys.length != values.length) {throw new IllegalArgumentException("Keys array and Values array must have equal lengths.");}
        for(int i = 0; i < keys.length; i++)
        {
            PEntry toAdd = new PEntry(keys[i], values[i]);
            mapUtil.add(toAdd);
        }
    }

    /**
     * Removes all of the mappings from this map. The map will be
     * empty after this call returns.
     */
    public void clear() {
        // TODO
        mapUtil.clear();
    }

    /**
     * Returns an array of the keys contained in this map.
     *
     * @return an array of the keys contained in this map
     */
    public Integer[] keySet() {
        // TODO
        Integer[] allKeys = new Integer[size()];
        Integer index = 0;
        Iterator iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next(); 
            allKeys[index] = hold.getKey();
            index++;
        }
        return allKeys;
    }

    /**
     * Returns an array of the values contained in this map.
     *
     * @return an array of the values contained in this map
     */
    public Integer[] values() {
        // TODO
        Integer[] allValues = new Integer[size()];
        Integer index = 0;
        Iterator iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            PEntry hold = iter.next(); 
            allValues[index] = hold.getValue();
            index++;
        }
        return allValues;
    }

    /**
     * Returns an array of the mappings contained in this map.
     *
     * @return an array of the mappings contained in this map
     */
    public PEntry[] entrySet() {
        // TODO
        PEntry[] allMappings = new PEntry[size()];
        Integer index = 0;
        Iterator iter = mapUtil.iterator();
        while(iter.hasNext())
        {
            allMappings[index] = iter.next();
            index++;
        }
        return allMappings;
    }
}
