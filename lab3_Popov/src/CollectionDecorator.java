import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CollectionDecorator implements Collection {
    Collection collection;

    CollectionDecorator(Collection collection)
    {
        this.collection = collection;
    }

    private void Log(String _fun){
        String out = "";
        out += System.currentTimeMillis() + " " + _fun + " " + this.collection.hashCode() + "\n";
        try (FileWriter writer = new FileWriter("log.txt", true))
        {
            writer.append(out);
        }
        catch (IOException exception)
        {
            return;
        }
    }

    @Override
    public int size()
    {
        Log("size");
        return collection.size();
    }

    @Override
    public boolean isEmpty()
    {
        Log("isEmpty");
        return collection.isEmpty();
    }

    @Override
    public boolean contains(Object o)
    {
        Log("contains");
        return collection.contains(o);
    }

    @Override
    public Iterator iterator()
    {
        Log("iterator");
        return collection.iterator();
    }

    @Override
    public Object[] toArray()
    {
        Log("toArray");
        return collection.toArray();
    }

    @Override
    public boolean add(Object o)
    {
        Log("add");
        return collection.add(o);
    }

    @Override
    public boolean remove(Object o)
    {
        Log("remove");
        return collection.remove(o);
    }

    @Override
    public boolean addAll(Collection c)
    {
        Log("addAll");
        return collection.addAll(c);
    }

    @Override
    public boolean removeIf(Predicate filter)
    {
        Log("removeIf");
        return collection.removeIf(filter);
    }

    @Override
    public void clear()
    {
        Log("clear");
        collection.clear();
    }

    @Override
    public Spliterator spliterator()
    {
        Log("spliterator");
        return collection.spliterator();
    }

    @Override
    public Stream stream()
    {
        Log("stream");
        return collection.stream();
    }

    @Override
    public Stream parallelStream()
    {
        Log("patallelStream");
        return collection.parallelStream();
    }

    @Override
    public boolean retainAll(Collection c)
    {
        Log("retainAll");
        return collection.retainAll(c);
    }

    @Override
    public boolean removeAll(Collection c)
    {
        Log("removeAll");
        return collection.removeAll(c);
    }

    @Override
    public boolean containsAll(Collection c)
    {
        Log("containsAll");
        return collection.containsAll(c);
    }

    @Override
    public Object[] toArray(Object[] a)
    {
        Log("toArray");
        return collection.toArray(a);
    }
}
