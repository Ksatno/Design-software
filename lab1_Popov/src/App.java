import resource.AbstractPizza;
import patterns.PizzaBeijing;
import patterns.PizzaMargarita;
import patterns.PizzaMoscow;
import patterns.PizzaNaples;

import java.util.List;
import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {

        List<AbstractPizza> PizzaList = new ArrayList<>();
        PizzaList.add(new PizzaMargarita());
        PizzaList.add(new PizzaNaples());
        PizzaList.add(new PizzaMoscow());
        PizzaList.add(new PizzaBeijing());

        for (AbstractPizza p : PizzaList){

            System.out.println("\n----------------------------------------");
            System.out.println(p.GetPizzaName());
            System.out.println(p.GetPizzaType());
            System.out.println("----------------------------------------");

        }


    }
}