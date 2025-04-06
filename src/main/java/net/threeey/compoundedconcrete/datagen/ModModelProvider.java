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
    }
}
