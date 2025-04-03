package net.threeey.compoundedconcrete.item;

import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.threeey.compoundedconcrete.CompoundedConcrete;

public class ModItems {

    //public static final Item DEEP_CHESTNUT_DYE = registerItem("deep_chestnut_dye", new DyeItem(DyeColor.RED_WHITE_71, new Item.Settings()));

    /*private static Item registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, Identifier.of(CompoundedConcrete.MOD_ID, name), item);
    }*/

    public static void registerModItems() {
        CompoundedConcrete.LOGGER.info("Registering Mod Items for Compounded Concrete");
    }
}
