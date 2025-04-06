package net.threeey.compoundedconcrete.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.threeey.compoundedconcrete.CompoundedConcrete;
import net.threeey.compoundedconcrete.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup BASE_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_base"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.COLORED_CRAFTER))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.base"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.COLORED_CRAFTER);
                        entries.add(ModItems.FILLED_COLORED_CRAFTER);
                        entries.add(ModItems.DYE_BIT);
                    })
                    .build());

    public static final ItemGroup DYES = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_dyes"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.WHITE_LIGHTGRAY_DYE_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.dyes"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_12);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_13);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_14);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_15);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_16);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_17);
                    })
                    .build());

    public static final ItemGroup CONCRETE = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_concrete"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.concrete"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17);
                    })
                    .build());

    public static void registerItemGroups() {
        CompoundedConcrete.LOGGER.info("Registering Item Groups for Compounded Concrete");
    }
}
