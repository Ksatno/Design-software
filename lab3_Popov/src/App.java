import java.util.ArrayList;

public class App
{
    public static void main(String[] args)
    {
        CollectionDecorator col = new CollectionDecorator(new ArrayList<String>());
        System.out.print(col.size());
        col.add("123");
        System.out.print(col.size());
    }
}