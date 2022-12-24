package patterns;
import resource.AbstractPizza;

public class PizzaNaples extends AbstractPizza{
    
    public PizzaNaples()
    {
        super();
    }
        @Override
        protected void SetPizzaName()
        {
            this.pizzaName = "Неаполь";
        }
        @Override
        protected void SetIngridients()
        {
            this.ingridients.add("оливки");
            this.ingridients.add("cыр");
            this.ingridients.add("томаты");
            this.ingridients.add("анчоусы");
            this.ingridients.add("белый соус");
        }
        @Override
        protected void SetHotness()
        {
            this.stringHotness = Hotness.jalapeno_peper.name();
        }
        @Override
        protected void SetOpeness()
        {
            this.stringOpeness = Openess.normal_pizza.name();
        }
    }