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
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71);

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
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61)
                .add(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71);

        getOrCreateTagBuilder(ModTags.Blocks.ALL_CONCRETE)
                .addTag(ModTags.Blocks.CC_CONCRETE)
                .addTag(ModTags.Blocks.VANILLA_CONCRETE);

        getOrCreateTagBuilder(ModTags.Blocks.CC_POWDER)
                .add(Blocks.WHITE_CONCRETE_POWDER)
                .add(Blocks.LIGHT_GRAY_CONCRETE_POWDER)
                .add(Blocks.GRAY_CONCRETE_POWDER)
                .add(Blocks.BLACK_CONCRETE_POWDER)
                .add(Blocks.BROWN_CONCRETE_POWDER)
                .add(Blocks.RED_CONCRETE_POWDER)
                .add(Blocks.ORANGE_CONCRETE_POWDER)
                .add(Blocks.YELLOW_CONCRETE_POWDER)
                .add(Blocks.LIME_CONCRETE_POWDER)
                .add(Blocks.GREEN_CONCRETE_POWDER)
                .add(Blocks.CYAN_CONCRETE_POWDER)
                .add(Blocks.LIGHT_BLUE_CONCRETE_POWDER)
                .add(Blocks.BLUE_CONCRETE_POWDER)
                .add(Blocks.PURPLE_CONCRETE_POWDER)
                .add(Blocks.MAGENTA_CONCRETE_POWDER)
                .add(Blocks.PINK_CONCRETE_POWDER);

        getOrCreateTagBuilder(ModTags.Blocks.VANILLA_POWDER)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_12)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_13)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_14)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_15)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_16)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_17)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_21)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_23)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_25)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_31)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_32)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_34)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_35)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_41)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_43)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_51)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_52)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_53)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_61)
                .add(ModBlocks.WHITE_LIGHTGRAY_POWDER_71);

        getOrCreateTagBuilder(ModTags.Blocks.ALL_POWDER)
                .addTag(ModTags.Blocks.CC_POWDER)
                .addTag(ModTags.Blocks.VANILLA_POWDER);

        getOrCreateTagBuilder(ModTags.Blocks.CC_WOOL)
                .add(Blocks.WHITE_WOOL)
                .add(Blocks.LIGHT_GRAY_WOOL)
                .add(Blocks.GRAY_WOOL)
                .add(Blocks.BLACK_WOOL)
                .add(Blocks.BROWN_WOOL)
                .add(Blocks.RED_WOOL)
                .add(Blocks.ORANGE_WOOL)
                .add(Blocks.YELLOW_WOOL)
                .add(Blocks.LIME_WOOL)
                .add(Blocks.GREEN_WOOL)
                .add(Blocks.CYAN_WOOL)
                .add(Blocks.LIGHT_BLUE_WOOL)
                .add(Blocks.BLUE_WOOL)
                .add(Blocks.PURPLE_WOOL)
                .add(Blocks.MAGENTA_WOOL)
                .add(Blocks.PINK_WOOL);

        getOrCreateTagBuilder(ModTags.Blocks.VANILLA_WOOL)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_12)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_13)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_14)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_15)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_16)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_17)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_21)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_23)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_25)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_31)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_32)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_34)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_35)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_41)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_43)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_51)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_52)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_53)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_61)
                .add(ModBlocks.WHITE_LIGHTGRAY_WOOL_71);

        getOrCreateTagBuilder(ModTags.Blocks.ALL_WOOL)
                .addTag(ModTags.Blocks.CC_WOOL)
                .addTag(ModTags.Blocks.VANILLA_WOOL);

        getOrCreateTagBuilder(ModTags.Blocks.CC_CARPET)
                .add(Blocks.WHITE_CARPET)
                .add(Blocks.LIGHT_GRAY_CARPET)
                .add(Blocks.GRAY_CARPET)
                .add(Blocks.BLACK_CARPET)
                .add(Blocks.BROWN_CARPET)
                .add(Blocks.RED_CARPET)
                .add(Blocks.ORANGE_CARPET)
                .add(Blocks.YELLOW_CARPET)
                .add(Blocks.LIME_CARPET)
                .add(Blocks.GREEN_CARPET)
                .add(Blocks.CYAN_CARPET)
                .add(Blocks.LIGHT_BLUE_CARPET)
                .add(Blocks.BLUE_CARPET)
                .add(Blocks.PURPLE_CARPET)
                .add(Blocks.MAGENTA_CARPET)
                .add(Blocks.PINK_CARPET);

        getOrCreateTagBuilder(ModTags.Blocks.VANILLA_CARPET)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_12)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_13)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_14)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_15)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_16)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_17)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_21)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_23)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_25)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_31)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_32)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_34)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_35)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_41)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_43)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_51)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_52)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_53)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_61)
                .add(ModBlocks.WHITE_LIGHTGRAY_CARPET_71);

        getOrCreateTagBuilder(ModTags.Blocks.ALL_CARPET)
                .addTag(ModTags.Blocks.CC_CARPET)
                .addTag(ModTags.Blocks.VANILLA_CARPET);
    }
}
