package net.threeey.compoundedconcrete.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
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

public class ModBlocks {

    public static final Block WHITE_LIGHTGRAY_CONCRETE_12 = registerBlock("white_lightgray_concrete_12",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_12"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
        });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_13 = registerBlock("white_lightgray_concrete_13",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_13"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_14 = registerBlock("white_lightgray_concrete_14",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_14"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_14"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_15 = registerBlock("white_lightgray_concrete_15",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_15"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_15"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_16 = registerBlock("white_lightgray_concrete_16",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_16"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_16"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_17 = registerBlock("white_lightgray_concrete_17",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_17"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_17"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CompoundedConcrete.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CompoundedConcrete.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CompoundedConcrete.LOGGER.info("Registering Mod Blocks for Compounded Concrete");
    }
}
