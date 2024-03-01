package org.blogtms;

import org.springframework.stereotype.Component;

//@Component
public class GucciAccessories implements Accessories{
    @Override
    public void wear() {
        System.out.println("Gucci champ");
    }
}
