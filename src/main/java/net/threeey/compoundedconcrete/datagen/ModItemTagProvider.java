package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.threeey.compoundedconcrete.item.ModItems;
import net.threeey.compoundedconcrete.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup lookup) {
        getOrCreateTagBuilder(ModTags.Items.CC_DYES)
                .add(Items.WHITE_DYE)
                .add(Items.LIGHT_GRAY_DYE)
                .add(Items.GRAY_DYE)
                .add(Items.BLACK_DYE)
                .add(Items.BROWN_DYE)
                .add(Items.RED_DYE)
                .add(Items.ORANGE_DYE)
                .add(Items.YELLOW_DYE)
                .add(Items.LIME_DYE)
                .add(Items.GREEN_DYE)
                .add(Items.CYAN_DYE)
                .add(Items.LIGHT_BLUE_DYE)
                .add(Items.BLUE_DYE)
                .add(Items.PURPLE_DYE)
                .add(Items.MAGENTA_DYE)
                .add(Items.PINK_DYE);

        getOrCreateTagBuilder(ModTags.Items.VANILLA_DYES)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_12)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_13)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_14)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_15)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_16)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_17)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_21)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_23)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_25)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_31)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_32)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_34)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_35)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_41)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_43)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_51)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_52)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_53)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_61)
                .add(ModItems.WHITE_LIGHTGRAY_DYE_71);

        getOrCreateTagBuilder(ModTags.Items.ALL_DYES)
                .addTag(ModTags.Items.CC_DYES)
                .addTag(ModTags.Items.VANILLA_DYES);
    }
}
