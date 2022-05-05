package com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain;

import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.base.Clothes;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.concrete.Shirt;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.component.concrete.Shoe;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.concrete.color.Blue;
import com.edu.rmit.oosd.wk6.creationalpatterns.decorator.sneakervillain.decorator.concrete.size.Large;


public class Main {

    /**
     * Shoe [$10.00]
     *   |
     *   |__ __Color [$0.50]
     *          |
     *          |_____ Blue [$1.25]
     *   |
     *   |______Size [$1.25]
     *          |
     *          |_____ Large [$0.50]
     */

    public static void main(String[] args) {

        Clothes vans = new Shoe();
        vans = new Blue(vans);
        vans = new Large(vans);

        System.out.println(vans.getDescription() + " \n" + "Total: $" + vans.cost());

        Clothes tommyHilfiger = new Shirt();
        tommyHilfiger = new Blue(tommyHilfiger);
        tommyHilfiger = new Large(tommyHilfiger);

        System.out.println(tommyHilfiger.getDescription() + " \n" + "Total: $" + tommyHilfiger.cost());

        Clothes[] clothes = {vans, tommyHilfiger};

        compute(clothes);

    }

    public static void compute(Clothes[] products) {

        double total = 0;

        for (Clothes clothes : products) {
            total += clothes.cost();
        }

        System.out.println(total);
    }
}
