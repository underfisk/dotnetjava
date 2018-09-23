package System.Collections.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.lang.*;
import java.util.Iterator;

/**
 * Creates a list with the methods with .NET Syntax
 * @param <T>
 */
public class List<T>
{
    private ArrayList<T> _list;

    /**
     * Initializes a new instance of the System.Collections.Generic.List<T> class that is empty and has the default initial capacity.
     */
    public List()
    {
        this._list = new ArrayList<>();
    }

    /**
     * Initializes a new instance of the System.Collections.Generic.List<T> class that contains elements copied from the specified
     * collection and has sufficient capacity to accommodate the number of elements copied.
     * @param initial
     */
    public List(Collection<T> initial)
    {
        this._list = new ArrayList<>(initial);
    }

    /**
     * Initializes a new instance of the System.Collections.Generic.List<T> class that is empty and has the specified initial capacity.
     * @param minCapacity
     */
    public List(int minCapacity)
    {
        this._list = new ArrayList<>();
        this._list.ensureCapacity(minCapacity);
    }

    /**
     * Returns the result of the evaluation.
     * @param other
     * @return
     */
    public boolean Equals(List<T> other)
    {
        if (other == null) return false;
        return this._list.equals(other);
    }

    /**
     * Adds an object to the end of the System.Collections.Generic.List<T>.
     * @param item
     */
    public void Add(T item)
    {
        this._list.add(item);
    }

    /**
     * Adds the elements of the specified collection to the end of the System.Collections.Generic.List<T>.
     * @param _collection
     */
    public void AddRange(Collection<T> _collection)
    {
        if (_collection == null) return;
        this._list.addAll(_collection);
    }

    /**
     * Inserts an element into the System.Collections.Generic.List<T> at the specified index.
     * @param item
     * @param index
     */
    public void Insert(T item, int index)
    {
        this._list.add(index,item);
    }

    /**
     * Removes all elements from the System.Collections.Generic.List<T>.
     */
    public void Clear()
    {
        if (this._list.size() > 0)
            this._list.clear();
        else
            throw new RuntimeException("Trying to clear an empty list");
    }

    /**
     * Gets the number of elements contained in the System.Collections.Generic.List<T>.
     * @return
     */
    public int Count()
    {
        return this._list.size();
    }

    /**
     * Gets the element at the specified index.
     * @param index
     * @return
     */
    public T GetItem(int index)
    {
        return this._list.get(index);
    }

    /**
     * Sets the element at the specified index.
     * @param index
     * @return
     */
    public T SetItem(int index, T item)
    {
        return this._list.set(index, item);
    }

    /**
     * Determines whether the System.Collections.Generic.List<T> contains elements that match the conditions defined by the specified predicate.
     * @param item
     * @return
     */
    public boolean Exists(T item)
    {
        if (item == null) throw new RuntimeException("Trying to find whether a given null item exists \n \tat " + this.getClass());
        return this._list.contains(item);
    }

    /**
     * Performs the specified action on each element of the System.Collections.Generic.List<T>.
     * @param action
     */
    public void ForEach(Action<? super T> action)
    {
        this._list.forEach(action);
    }

    /**
     * Searches for the specified object and returns the zero-based index of the first occurrence
     * within the range of elements in the System.Collections.Generic.List<T> that extends from the specified index to the last element.
     * @param item
     */
    public void IndexOf(T item)
    {
        this._list.indexOf(item);
    }

    /**
     * Removes the first occurrence of a specific object from the System.Collections.Generic.List<T>.
     * @param item
     * @return
     */
    public boolean Remove(T item)
    {
        return this._list.remove(item);
    }

    /**
     * Removes the first occurrence of a specific index from the System.Collections.Generic.List<T>.
     * @param index
     * @return
     */
    public T RemoveAt(int index)
    {
        return this._list.remove(index);
    }

    /**
     * Removes all the elements that match the conditions defined by the specified predicate.
     */
    public boolean RemoveAll(Collection<T> _collection)
    {
        return this._list.removeAll(_collection);
    }

    /**
     * Returns whether the list has no elements on it
     * @return
     */
    public boolean IsEmpty()
    {
        return this._list.isEmpty();
    }

    /**
     * Searches for an element whether his index is equal to the given one
     * and returns the first occurrence within the entire System.Collections.Generic.List<T>.
     * @return
     */
    public T Find(int index)
    {
        return this._list.get(index);
    }

    /**
     * Returns the iterator position
     * @return
     */
    public Iterator<T> Iterator()
    {
        return this._list.iterator();
    }

    /**
     * Defines the minimum capacity
     * @param min
     */
    public void EnsureCapacity(int min)
    {
        this._list.ensureCapacity(min);
    }

    /**
     * Copies the elements of the System.Collections.Generic.List<T> to a new array.
     * @return
     */
    public Object[] ToArray()
    {
        return this._list.toArray();
    }

    /**
     * Returns a clone of the current list
     * @return
     */
    public Object Clone()
    {
        return this._list.clone();
    }

    /**
     * Releases this class resources
     */
    public void Dispose()
    {
        this._list.clear();
        this._list = null;
        Runtime.getRuntime().gc();
    }
}