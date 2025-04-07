package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.threeey.compoundedconcrete.block.ModBlocks;
import net.threeey.compoundedconcrete.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_12);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_13);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_14);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_16);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_17);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_21);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_23);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_25);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_31);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_32);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_34);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_35);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_41);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_43);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_51);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_52);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_53);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_61);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_POWDER_71);

        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_12, ModBlocks.WHITE_LIGHTGRAY_CARPET_12);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_13, ModBlocks.WHITE_LIGHTGRAY_CARPET_13);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_14, ModBlocks.WHITE_LIGHTGRAY_CARPET_14);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_15, ModBlocks.WHITE_LIGHTGRAY_CARPET_15);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_16, ModBlocks.WHITE_LIGHTGRAY_CARPET_16);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_17, ModBlocks.WHITE_LIGHTGRAY_CARPET_17);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_21, ModBlocks.WHITE_LIGHTGRAY_CARPET_21);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_23, ModBlocks.WHITE_LIGHTGRAY_CARPET_23);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_25, ModBlocks.WHITE_LIGHTGRAY_CARPET_25);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_31, ModBlocks.WHITE_LIGHTGRAY_CARPET_31);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_32, ModBlocks.WHITE_LIGHTGRAY_CARPET_32);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_34, ModBlocks.WHITE_LIGHTGRAY_CARPET_34);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_35, ModBlocks.WHITE_LIGHTGRAY_CARPET_35);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_41, ModBlocks.WHITE_LIGHTGRAY_CARPET_41);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_43, ModBlocks.WHITE_LIGHTGRAY_CARPET_43);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_51, ModBlocks.WHITE_LIGHTGRAY_CARPET_51);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_52, ModBlocks.WHITE_LIGHTGRAY_CARPET_52);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_53, ModBlocks.WHITE_LIGHTGRAY_CARPET_53);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_61, ModBlocks.WHITE_LIGHTGRAY_CARPET_61);
        blockStateModelGenerator.registerWoolAndCarpet(ModBlocks.WHITE_LIGHTGRAY_WOOL_71, ModBlocks.WHITE_LIGHTGRAY_CARPET_71);

        /*blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_12);*/
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_13);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_14);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_15);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_16);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_17);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_21);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_23);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_25);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_31);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_32);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_34);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_35);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_41);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_43);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_51);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_52);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_53);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_61);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WHITE_LIGHTGRAY_GLASS_71);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COLORED_CRAFTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.FILLED_COLORED_CRAFTER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DYE_BIT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_12, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_13, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_14, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_15, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_16, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_17, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_21, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_23, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_25, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_31, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_32, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_34, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_35, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_41, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_43, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_51, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_52, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_53, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_61, Models.GENERATED);
        itemModelGenerator.register(ModItems.WHITE_LIGHTGRAY_DYE_71, Models.GENERATED);
    }
}
