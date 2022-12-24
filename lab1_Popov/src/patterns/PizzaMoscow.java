package patterns;
import resource.AbstractPizza;

public class PizzaMoscow extends AbstractPizza{
    
    public PizzaMoscow()
    {
        super();
    }
        @Override
        protected void SetPizzaName()
        {
            this.pizzaName = "Москва";
        }
        @Override
        protected void SetIngridients()
        {
            this.ingridients.add("соленые огурцы");
            this.ingridients.add("cыр");
            this.ingridients.add("томаты");
            this.ingridients.add("ветчина");
            this.ingridients.add("укроп");
            this.ingridients.add("салями");
            this.ingridients.add("томатный соус");
        }
        @Override
        protected void SetHotness()
        {
            this.stringHotness = Hotness.tabasco_peper.name();
        }
        @Override
        protected void SetOpeness()
        {
            this.stringOpeness = Openess.normal_pizza.name();
        }
    }