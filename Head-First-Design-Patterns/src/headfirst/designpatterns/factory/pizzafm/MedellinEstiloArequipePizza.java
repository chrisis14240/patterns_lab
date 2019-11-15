package headfirst.designpatterns.factory.pizzafm;

public class MedellinEstiloArequipePizza extends Pizza {

    public MedellinEstiloArequipePizza() {
        name = "Pizza de Medallo Avemaria ome";
        dough = "Masa de consistencia normal";
        sauce = "Salsa de tomate";

        toppings.add("Arequipe Antioqueno celestial");
    }

    void cut() {
        System.out.println("Cortando la pizza en tiras triangulares");
    }
}
