package org.example.factory.factoryed;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza creatPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("Cheess")) {
            pizza = new LDCheessPizza();
        } else if (orderType.equals("Pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
