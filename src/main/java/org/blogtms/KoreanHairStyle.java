package org.blogtms;

import org.springframework.stereotype.Component;

//@Component
public class KoreanHairStyle implements HairStyle{
    @Override
    public void wear() {
        System.out.println("Toc den");
    }
}
