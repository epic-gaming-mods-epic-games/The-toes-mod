package com.paybackepicgamer.test;

import com.paybackepicgamer.test.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Test implements ModInitializer {

    public  static final String MOD_ID = "test";

    @Override
    public void onInitialize() {
        ModItems.RegisterItems();
    }
}
