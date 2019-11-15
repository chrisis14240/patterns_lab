package headfirst.designpatterns.factory.pizzafm;

public class MedellinEstiloArepaPizza extends Pizza {

    public MedellinEstiloArepaPizza() {
        name = "Pizza de Medallo Avemaria ome";
        dough = "Masa de consistencia normal";
        sauce = "Salsa de tomate";

        toppings.add("Trozitos de arepita de la mas fina");
    }

    void cut() {
        System.out.println("Cortando la pizza en tiras triangulares");
    }
}
