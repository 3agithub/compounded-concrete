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
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71);

        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_12);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_13);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_14);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_15);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_16);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_17);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_21);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_23);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_25);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_31);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_32);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_34);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_35);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_41);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_43);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_51);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_52);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_53);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_61);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_POWDER_71);

        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_12);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_13);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_14);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_15);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_16);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_17);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_21);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_23);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_25);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_31);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_32);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_34);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_35);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_41);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_43);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_51);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_52);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_53);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_61);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_WOOL_71);

        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_12);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_13);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_14);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_15);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_16);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_17);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_21);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_23);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_25);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_31);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_32);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_34);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_35);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_41);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_43);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_51);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_52);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_53);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_61);
        addDrop(ModBlocks.WHITE_LIGHTGRAY_CARPET_71);

        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_12);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_13);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_14);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_15);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_16);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_17);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_21);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_23);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_25);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_31);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_32);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_34);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_35);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_41);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_43);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_51);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_52);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_53);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_61);
        addDropWithSilkTouch(ModBlocks.WHITE_LIGHTGRAY_GLASS_71);
    }
}
