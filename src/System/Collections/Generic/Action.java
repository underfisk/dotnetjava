package System.Collections.Generic;

import java.util.function.Consumer;

/**
 * Extends Consumer interface to allow Action being as a delegation interface
 * @param <T>
 */
public interface Action<T> extends Consumer<T> { }
