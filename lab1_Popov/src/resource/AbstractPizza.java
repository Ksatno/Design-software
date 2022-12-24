package resource;
import java.util.ArrayList;

public abstract class AbstractPizza {

    public enum Hotness {
        bell_peper, jalapeno_peper, tabasco_peper, chilli_peper, carolina_reaper_peper
    }
    public enum Openess {
        normal_pizza, calzone
    }

    protected String pizzaName;
    protected String stringOpeness;
    protected String stringHotness;
    protected ArrayList<String> ingridients = new ArrayList<>();

    protected AbstractPizza()
    {
        SetPizzaName();
        SetIngridients();
        SetHotness();
        SetOpeness();
    }

    //По-умолчанию делаем пиццу маргарита
    protected void SetPizzaName(){
        this.pizzaName = "Маргарита";
    }
    protected void SetIngridients() {
        ArrayList<String> _ingridients = new ArrayList<String>();
        _ingridients.add("сыр");
        _ingridients.add("томатный соус");
        _ingridients.add("томаты");
        _ingridients.add("итальянские травы");
        this.ingridients = _ingridients;
    }
    protected void SetHotness() {
        this.stringHotness = Hotness.bell_peper.name();
    }
    protected void SetOpeness() {
        this.stringOpeness = Openess.normal_pizza.name();
    }

    //Для удобного вывода текстовой справки о пицце
    public String GetPizzaType(){
        return "It is "+this.stringOpeness+" with " +this.ingridients.toString().replace("[", "").replace("]", "") + " and it is hot like " + this.stringHotness;
    }
    public String GetPizzaName(){
        return this.pizzaName;
    }

}
