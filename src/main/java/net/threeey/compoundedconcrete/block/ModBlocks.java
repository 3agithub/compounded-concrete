package net.threeey.compoundedconcrete.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.block.piston.PistonBehavior;
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
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ModBlocks {

    public static final Block WHITE_LIGHTGRAY_SHULKER_BOX_12 = registerBlock("white_lightgray_shulkerbox_12",
    createShulkerBoxBlock(DyeColor.valueOf("white_light_gray_12"), MapColor.LIGHT_GRAY, "tooltip.compoundedconcrete.white_lightgray_12"));

    public static final Block WHITE_LIGHTGRAY_SHULKER_BOX_13 = registerBlock("white_lightgray_shulkerbox_13",
            createShulkerBoxBlock(DyeColor.valueOf("white_light_gray_13"), MapColor.LIGHT_GRAY, "tooltip.compoundedconcrete.white_lightgray_13"));

    private static final AbstractBlock.ContextPredicate SHULKER_BOX_SUFFOCATES_PREDICATE = (state, world, pos) -> !(world.getBlockEntity(pos) instanceof ShulkerBoxBlockEntity shulkerBoxBlockEntity) || shulkerBoxBlockEntity.suffocates();

    private static Block createShulkerBoxBlock(@Nullable DyeColor color, MapColor mapColor, String tooltipTranslatable) {
        return new ShulkerBoxBlock(
                color,
                AbstractBlock.Settings.create()
                        .mapColor(mapColor)
                        .solid()
                        .strength(2.0F)
                        .dynamicBounds()
                        .nonOpaque()
                        .suffocates(SHULKER_BOX_SUFFOCATES_PREDICATE)
                        .blockVision(SHULKER_BOX_SUFFOCATES_PREDICATE)
                        .pistonBehavior(PistonBehavior.DESTROY)
        ) {
            @Override
            public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                tooltip.add(Text.translatable(tooltipTranslatable));
                super.appendTooltip(stack, context, tooltip, options);
            }
        };
    }

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
