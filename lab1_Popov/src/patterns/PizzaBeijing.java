package patterns;
import resource.AbstractPizza;

public class PizzaBeijing extends AbstractPizza{
    
    public PizzaBeijing()
    {
        super();
    }
        @Override
        protected void SetPizzaName()
        {
            this.pizzaName = "Пекин";
        }
        @Override
        protected void SetIngridients()
        {
            this.ingridients.add("соленые огурцы");
            this.ingridients.add("cыр");
            this.ingridients.add("вяленные томаты");
            this.ingridients.add("курица в соусе терияки");
            this.ingridients.add("колечки перца халапеньо");
            this.ingridients.add("томатный соус");
        }
        @Override
        protected void SetHotness()
        {
            this.stringHotness = Hotness.chilli_peper.name();
        }
        @Override
        protected void SetOpeness()
        {
            this.stringOpeness = Openess.calzone.name();
        }
    }