package org.example.factory.factoryed;

public class LDPepperPizza extends Pizza {
    @Override
    public void prepare() {
        setName("伦敦的Pepper");
        System.out.println("  伦敦的Pepper 准备原材料");
    }
}
