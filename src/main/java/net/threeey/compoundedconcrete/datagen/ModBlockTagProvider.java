package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Blocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.threeey.compoundedconcrete.block.ModBlocks;
import net.threeey.compoundedconcrete.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17);

        getOrCreateTagBuilder(ModTags.Blocks.CC_CONCRETE)
                .add(Blocks.WHITE_CONCRETE)
                .add(Blocks.LIGHT_GRAY_CONCRETE)
                .add(Blocks.GRAY_CONCRETE)
                .add(Blocks.BLACK_CONCRETE)
                .add(Blocks.BROWN_CONCRETE)
                .add(Blocks.RED_CONCRETE)
                .add(Blocks.ORANGE_CONCRETE)
                .add(Blocks.YELLOW_CONCRETE)
                .add(Blocks.LIME_CONCRETE)
                .add(Blocks.GREEN_CONCRETE)
                .add(Blocks.CYAN_CONCRETE)
                .add(Blocks.LIGHT_BLUE_CONCRETE)
                .add(Blocks.BLUE_CONCRETE)
                .add(Blocks.PURPLE_CONCRETE)
                .add(Blocks.MAGENTA_CONCRETE)
                .add(Blocks.PINK_CONCRETE);

        getOrCreateTagBuilder(ModTags.Blocks.VANILLA_CONCRETE)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17);

        getOrCreateTagBuilder(ModTags.Blocks.ALL_CONCRETE)
                .addTag(ModTags.Blocks.CC_CONCRETE)
                .addTag(ModTags.Blocks.VANILLA_CONCRETE);
    }
}
