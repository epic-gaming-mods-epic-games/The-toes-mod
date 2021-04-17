package com.paybackepicgamer.test.registry;

import com.paybackepicgamer.test.Test;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item TOES1 = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void RegisterItems() {
        Registry.register(Registry.ITEM, new Identifier(Test.MOD_ID, "toes1"), TOES1);
    }
}
