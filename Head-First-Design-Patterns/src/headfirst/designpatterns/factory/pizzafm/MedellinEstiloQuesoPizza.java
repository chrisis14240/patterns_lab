package headfirst.designpatterns.factory.pizzafm;

public class MedellinEstiloQuesoPizza extends Pizza {

    public MedellinEstiloQuesoPizza() {
        name = "Pizza de Medallo Avemaria ome";
        dough = "Masa de consistencia normal";
        sauce = "Salsa de tomate";

        toppings.add("Exquisito queso Antioqueno");
    }

    void cut() {
        System.out.println("Cortando la pizza en tiras triangulares");
    }
}
