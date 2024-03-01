package org.blogtms;

import com.google.inject.AbstractModule;

public class GuiceModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Outfit.class).to(Bikini.class);
        bind(Accessories.class).to(GucciAccessories.class);
        bind(HairStyle.class).to(KoreanHairStyle.class);
    }
}
