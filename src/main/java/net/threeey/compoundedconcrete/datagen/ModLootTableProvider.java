package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;
import net.threeey.compoundedconcrete.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17);
    }
}
