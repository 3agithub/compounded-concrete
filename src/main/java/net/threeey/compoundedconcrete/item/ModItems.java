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
    public static final Item COLORED_CRAFTER = registerItem("colored_crafter", new Item(new Item.Settings()
            .maxCount(1)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.colored_crafter"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item FILLED_COLORED_CRAFTER = registerItem("filled_colored_crafter", new Item(new Item.Settings()
            .recipeRemainder(COLORED_CRAFTER)
            .maxCount(1)) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.filled_colored_crafter"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item DYE_BIT = registerItem("dye_bit", new Item(new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.dye_bit"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_12 = registerItem("white_lightgray_dye_12", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_12"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_13 = registerItem("white_lightgray_dye_13", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_13"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_14 = registerItem("white_lightgray_dye_14", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_14"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_14"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_15 = registerItem("white_lightgray_dye_15", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_15"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_15"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_16 = registerItem("white_lightgray_dye_16", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_16"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_16"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_17 = registerItem("white_lightgray_dye_17", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_17"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_17"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_21 = registerItem("white_lightgray_dye_21", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_21"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_21"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_23 = registerItem("white_lightgray_dye_23", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_23"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_23"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_25 = registerItem("white_lightgray_dye_25", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_25"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_25"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_31 = registerItem("white_lightgray_dye_31", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_31"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_31"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_32 = registerItem("white_lightgray_dye_32", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_32"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_32"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_34 = registerItem("white_lightgray_dye_34", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_34"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_34"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_35 = registerItem("white_lightgray_dye_35", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_35"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_35"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_41 = registerItem("white_lightgray_dye_41", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_41"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_41"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_43 = registerItem("white_lightgray_dye_43", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_43"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_43"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_51 = registerItem("white_lightgray_dye_51", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_51"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_51"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_52 = registerItem("white_lightgray_dye_52", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_52"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_52"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_53 = registerItem("white_lightgray_dye_53", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_53"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_53"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_61 = registerItem("white_lightgray_dye_61", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_61"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_61"));
            super.appendTooltip(stack, context, tooltip, type);
        }
    });

    public static final Item WHITE_LIGHTGRAY_DYE_71 = registerItem("white_lightgray_dye_71", new DyeItem(DyeColor.valueOf("WHITE_LIGHTGRAY_71"), new Item.Settings()) {
        @Override
        public void appendTooltip(ItemStack stack, TooltipContext context, List<Text> tooltip, TooltipType type) {
            tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_71"));
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
