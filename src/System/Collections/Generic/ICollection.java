package System.Collections.Generic;

public interface ICollection<T> extends IEnumerable<T>
{
    void Add(T item);
    void Clear();
    boolean Contains(T item);
    void CopyTo(T[] array, int arrayIndex);
    boolean Remove(T item);
    int Count();

}
