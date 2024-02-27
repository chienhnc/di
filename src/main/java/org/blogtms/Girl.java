package org.blogtms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Girl {

    @Autowired
    Outfit outfit;

    @Autowired
    Accessories accessories;

    @Autowired
    HairStyle hairStyle;

    public Girl(Outfit outfit, Accessories accessories, HairStyle hairStyle) {
        this.outfit = outfit;
        this.accessories = accessories;
        this.hairStyle = hairStyle;
    }
}
