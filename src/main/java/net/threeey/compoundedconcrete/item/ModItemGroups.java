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
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_21);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_23);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_25);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_31);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_32);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_34);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_35);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_41);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_43);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_51);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_52);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_53);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_61);
                        entries.add(ModItems.WHITE_LIGHTGRAY_DYE_71);
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
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71);
                    })
                    .build());

    public static final ItemGroup POWDER = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_powder"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.powder"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_12);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_13);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_14);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_15);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_16);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_17);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_21);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_23);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_25);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_31);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_32);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_34);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_35);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_41);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_43);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_51);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_52);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_53);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_61);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_POWDER_71);
                    })
                    .build());

    public static final ItemGroup WOOL = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_wool"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.WHITE_LIGHTGRAY_WOOL_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.wool"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_12);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_13);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_14);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_15);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_16);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_17);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_21);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_23);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_25);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_31);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_32);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_34);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_35);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_41);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_43);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_51);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_52);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_53);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_61);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_WOOL_71);
                    })
                    .build());

    public static final ItemGroup CARPETS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_carpets"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.WHITE_LIGHTGRAY_CARPET_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.carpets"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_12);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_13);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_14);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_15);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_16);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_17);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_21);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_23);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_25);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_31);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_32);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_34);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_35);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_41);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_43);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_51);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_52);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_53);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_61);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_CARPET_71);
                    })
                    .build());

    public static final ItemGroup GLASS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CompoundedConcrete.MOD_ID, "cc_glass"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModBlocks.WHITE_LIGHTGRAY_GLASS_12))
                    .displayName(Text.translatable("itemgroup.compoundedconcrete.glass"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_12);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_13);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_14);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_15);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_16);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_17);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_21);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_23);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_25);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_31);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_32);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_34);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_35);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_41);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_43);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_51);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_52);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_53);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_61);
                        entries.add(ModBlocks.WHITE_LIGHTGRAY_GLASS_71);
                    })
                    .build());

    public static void registerItemGroups() {
        CompoundedConcrete.LOGGER.info("Registering Item Groups for Compounded Concrete");
    }
}
