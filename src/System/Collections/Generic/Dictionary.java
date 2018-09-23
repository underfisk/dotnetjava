package System.Collections.Generic;

import java.util.HashMap;
import java.util.Collection;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * Represents a collection of keys and values.
 *
 * @link https://docs.microsoft.com/en-us/dotnet/api/system.collections.generic.dictionary-2?view=netframework-4.7.2
 * @author Enigma
 * @package org.microsoft.dotnet
 * @param <TKey>
 * @param <TValue>
 */
public class Dictionary<TKey,TValue>
{
    /**
     * Instance of hashmap to refer this class object
     */
    private HashMap<TKey,TValue> map;

    /**
     * Initializes a new instance of the System.Collections.Generic.Dictionary<TKey,TValue> class that is
     * empty, has the default initial capacity, and uses the default equality comparer for the key type.
     */
    public Dictionary()
    {
        this.map = new HashMap<>();
    }

    /**
     * Initializes a new instance of the System.Collections.Generic.Dictionary<TKey,TValue> class that contains elements copied from
     * the specified IDictionary<TKey,TValue> and uses the default equality comparer for the key type.
     */
    public Dictionary(Dictionary<TKey,TValue> dictionary)
    {
        this.map = dictionary.GetInstance();
    }


    /**
     * Adds the specified key and value to the dictionary.
     * @param key
     * @param value
     */
    public void Add(TKey key, TValue value)
    {
        this.map.put(key,value);
    }

    /**
     * Adds a range of objects of type Map which has Key and Value
     * @param map
     */
    public void AddRange(Map<? extends TKey,? extends TValue> map)
    {
        this.map.putAll(map);
    }


    /**
     * Gets the value associated with the specified key.
     * @param key
     * @return
     */
    public TValue GetValue(TKey key)
    {
        return this.map.get(key);
    }

    /**
     * Gets the value associated with the specified key if exists otherwise
     * sets a default value given in case we have no value for this key
     * @param key
     * @param _default
     * @return
     */
    public TValue GetValueOrDefault(TKey key, TValue _default)
    {
        return this.map.getOrDefault(key,_default);
    }

    /**
     * Removes all keys and values from the System.Collections.Generic.Dictionary<TKey,TValue>.
     */
    public void Clear()
    {
        this.map.clear();
    }

    /**
     * Determines whether the System.Collections.Generic.Dictionary<TKey,TValue> contains the specified key.
     * @param key
     * @return
     */
    public boolean ContainsKey(TKey key)
    {
        return this.map.containsKey(key);
    }

    /**
     * Determines whether the System.Collections.Generic.Dictionary<TKey,TValue> contains a specific value.
     * @param value
     * @return
     */
    public boolean ContainsValue(TValue value)
    {
        return this.map.containsValue(value);
    }

    /**
     * Removes the value with the specified key from the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @param key
     * @return
     */
    public boolean Remove(TKey key)
    {
        return (boolean)this.map.remove(key);
    }

    /**
     * Removes the element with the specified key and value from the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @param key
     * @param value
     * @return
     */
    public boolean Remove(TKey key, TValue value)
    {
        return this.map.remove(key,value);
    }

    /**
     * Returns whether the dictionary is empty.
     * @return
     */
    public boolean IsEmpty()
    {
        return this.map.isEmpty();
    }

    /**
     * Gets the number of key/value pairs contained in the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @return
     */
    public int Count()
    {
        return this.map.size();
    }

    /**
     * Gets a collection containing the values in the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @return
     */
    public Collection<TValue> Values()
    {
        return this.map.values();
    }

    /**
     * ets a collection containing the keys in the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @return
     */
    public Collection<TKey> Keys()
    {
        return this.map.keySet();
    }

    /**
     * Performs the specified action on each element of the System.Collections.Generic.Dictionary<TKey,TValue>.
     * @param action
     */
    public void ForEach(KeyValuePair<? super TKey, ? super TValue> action)
    {
        this.map.forEach(action);
    }

    /**
     * Replaces a key value with a given new value
     * @param key
     * @param value
     */
    public void Replace(TKey key, TValue value)
    {
        this.map.replace(key,value);
    }

    /**
     * Replaces all the key values with the given System.Collections.Generic.Dictionary object
     * @param _function
     */
    public void ReplaceAll(BiFunction<? super TKey, ? super TValue, ? extends TValue> _function)
    {
        this.map.replaceAll(_function);
    }

    /**
     * Merges the value(s) to another System.Collections.Generic.Dictionary<TKey,TValue>.
     */
    public TValue Merge(TKey key, TValue value, BiFunction<? super TValue, ? super TValue, ? extends TValue> _function)
    {
        return this.map.merge(key,value,_function);
    }

    /**
     * Returns the java original hashmap instance
     * @return
     */
    public HashMap<TKey,TValue> GetInstance()
    {
        return this.map;
    }

    /**
     * Releases this class resources
     */
    public void Dispose()
    {
        this.map.clear();
        this.map = null;
        Runtime.getRuntime().gc();
    }

}
