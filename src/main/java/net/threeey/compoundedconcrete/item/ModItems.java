package net.threeey.compoundedconcrete.item;

import net.minecraft.item.DyeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.threeey.compoundedconcrete.CompoundedConcrete;

import java.util.List;

public class ModItems {

    public static final Item WHITE_LIGHTGRAY_DYE_12 = registerItem("white_lightgray_dye_12", new DyeItem(DyeColor.valueOf("white_lightgray_12"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_13 = registerItem("white_lightgray_dye_13", new DyeItem(DyeColor.valueOf("white_lightgray_13"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CompoundedConcrete.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CompoundedConcrete.LOGGER.info("Registering Mod Items for Compounded Concrete");
    }
}
