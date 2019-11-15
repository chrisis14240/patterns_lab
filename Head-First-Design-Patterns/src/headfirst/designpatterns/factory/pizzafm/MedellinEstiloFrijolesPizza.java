package headfirst.designpatterns.factory.pizzafm;

public class MedellinEstiloFrijolesPizza extends Pizza {

    public MedellinEstiloFrijolesPizza() {
        name = "Pizza de Medallo Avemaria ome";
        dough = "Masa de consistencia normal";
        sauce = "Salsa de tomate";

        toppings.add("Irresisitibles Frijolitos de la tierrita");
    }

    void cut() {
        System.out.println("Cortando la pizza en tiras triangulares");
    }
}
