package System.Collections.Generic;

import java.util.function.BiConsumer;

/**
 * Defines a key/value pair that can be set or retrieved.
 * @link https://docs.microsoft.com/en-us/dotnet/api/system.collections.generic.keyvaluepair-2?view=netframework-4.7.2
 * @param <TKey>
 * @param <TValue>
 */
public interface KeyValuePair<TKey,TValue> extends BiConsumer<TKey,TValue> { }
