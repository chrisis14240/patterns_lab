package headfirst.designpatterns.factory.pizzafm;

public class MedellinPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        //Using local ingredients

        if (item.equals("Queso Antioqueno")) {
            return new MedellinEstiloQuesoPizza();
        } else if (item.equals("Frijoles con pezuna")) {
            return new MedellinEstiloFrijolesPizza();
        } else if (item.equals("Masa Arepa Antioquena")) {
            return new MedellinEstiloArepaPizza();
        } else if (item.equals("Arequipe Paisa")) {
            return new MedellinEstiloArequipePizza();
        } else return null;

    }
}
