package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.threeey.compoundedconcrete.block.ModBlocks;
import net.threeey.compoundedconcrete.item.ModItems;
import net.threeey.compoundedconcrete.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter recipeExporter) {
        ShapedRecipeJsonBuilder.create(
                RecipeCategory.TOOLS, ModItems.COLORED_CRAFTER, 1)
                .pattern("N")
                .pattern("C")
                .pattern("C")
                .input('N', Items.IRON_NUGGET)
                .input('C', Blocks.WHITE_CONCRETE)
                .criterion(hasItem(Items.IRON_NUGGET), conditionsFromItem(Items.IRON_NUGGET))
                .criterion(hasItem(Blocks.WHITE_CONCRETE), conditionsFromItem(Blocks.WHITE_CONCRETE))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(
                RecipeCategory.TOOLS, ModItems.FILLED_COLORED_CRAFTER, 1)
                .input(ModItems.COLORED_CRAFTER, 1)
                .input(ModItems.DYE_BIT, 1)
                .criterion(hasItem(ModItems.COLORED_CRAFTER), conditionsFromItem(ModItems.COLORED_CRAFTER))
                .criterion(hasItem(ModItems.DYE_BIT), conditionsFromItem(ModItems.DYE_BIT))
                .offerTo(recipeExporter);

        ShapelessRecipeJsonBuilder.create(
                RecipeCategory.MISC, ModItems.DYE_BIT, 16)
                .input(Ingredient.fromTag(ModTags.Items.ALL_DYES), 1)
                .criterion(hasItem(Items.WHITE_DYE), conditionsFromTag(ModTags.Items.ALL_DYES))
                .offerTo(recipeExporter);

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_dye_12");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 2, "white_lg_dye_24");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_dye_13");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 2, "white_lg_dye_26");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_14,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_dye_14");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_15,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_dye_15");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_16,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 6, 1, "white_lg_dye_16");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_17,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 7, 1, "white_lg_dye_17");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_21");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_dye_42");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_23,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_dye_23");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_25,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_dye_25");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_31");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_dye_62");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_32,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_dye_32");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_34,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_dye_34");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_35,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_dye_35");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_41,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_41");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_43,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_dye_43");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_51,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_51");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_52,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_dye_52");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_53,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_dye_53");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_61,
                Items.WHITE_DYE, 6, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_61");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_71,
                Items.WHITE_DYE, 7, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_dye_71");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_cc_12_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 2, "white_lg_cc_24_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_cc_13_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 2, "white_lg_cc_26_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_cc_14_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_cc_15_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 6, 1, "white_lg_cc_16_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 7, 1, "white_lg_cc_17_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_21_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_cc_42_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_cc_23_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_cc_25_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_31_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_cc_62_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_cc_32_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_cc_34_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_cc_35_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_41_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_cc_43_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_51_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_cc_52_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_cc_53_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61,
                Items.WHITE_DYE, 6, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_61_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71,
                Items.WHITE_DYE, 7, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_cc_71_v");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12,
                ModItems.WHITE_LIGHTGRAY_DYE_12, "white_lg_cc_12_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13,
                ModItems.WHITE_LIGHTGRAY_DYE_13, "white_lg_cc_13_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14,
                ModItems.WHITE_LIGHTGRAY_DYE_14, "white_lg_cc_14_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15,
                ModItems.WHITE_LIGHTGRAY_DYE_15, "white_lg_cc_15_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16,
                ModItems.WHITE_LIGHTGRAY_DYE_16, "white_lg_cc_16_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17,
                ModItems.WHITE_LIGHTGRAY_DYE_17, "white_lg_cc_17_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_21,
                ModItems.WHITE_LIGHTGRAY_DYE_21, "white_lg_cc_21_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_23,
                ModItems.WHITE_LIGHTGRAY_DYE_23, "white_lg_cc_23_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_25,
                ModItems.WHITE_LIGHTGRAY_DYE_25, "white_lg_cc_25_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_31,
                ModItems.WHITE_LIGHTGRAY_DYE_31, "white_lg_cc_31_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_32,
                ModItems.WHITE_LIGHTGRAY_DYE_32, "white_lg_cc_32_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_34,
                ModItems.WHITE_LIGHTGRAY_DYE_34, "white_lg_cc_34_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_35,
                ModItems.WHITE_LIGHTGRAY_DYE_35, "white_lg_cc_35_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_41,
                ModItems.WHITE_LIGHTGRAY_DYE_41, "white_lg_cc_41_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_43,
                ModItems.WHITE_LIGHTGRAY_DYE_43, "white_lg_cc_43_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_51,
                ModItems.WHITE_LIGHTGRAY_DYE_51, "white_lg_cc_51_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_52,
                ModItems.WHITE_LIGHTGRAY_DYE_52, "white_lg_cc_52_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_53,
                ModItems.WHITE_LIGHTGRAY_DYE_53, "white_lg_cc_53_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_61,
                ModItems.WHITE_LIGHTGRAY_DYE_61, "white_lg_cc_61_m");

        offerCCModdedConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_71,
                ModItems.WHITE_LIGHTGRAY_DYE_71, "white_lg_cc_71_m");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_12,
                ModItems.WHITE_LIGHTGRAY_DYE_12, "white_lg_cp_12");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_13,
                ModItems.WHITE_LIGHTGRAY_DYE_13, "white_lg_cp_13");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_14,
                ModItems.WHITE_LIGHTGRAY_DYE_14, "white_lg_cp_14");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_15,
                ModItems.WHITE_LIGHTGRAY_DYE_15, "white_lg_cp_15");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_16,
                ModItems.WHITE_LIGHTGRAY_DYE_16, "white_lg_cp_16");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_17,
                ModItems.WHITE_LIGHTGRAY_DYE_17, "white_lg_cp_17");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_21,
                ModItems.WHITE_LIGHTGRAY_DYE_21, "white_lg_cp_21");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_23,
                ModItems.WHITE_LIGHTGRAY_DYE_23, "white_lg_cp_23");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_25,
                ModItems.WHITE_LIGHTGRAY_DYE_25, "white_lg_cp_25");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_31,
                ModItems.WHITE_LIGHTGRAY_DYE_31, "white_lg_cp_31");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_32,
                ModItems.WHITE_LIGHTGRAY_DYE_32, "white_lg_cp_32");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_34,
                ModItems.WHITE_LIGHTGRAY_DYE_34, "white_lg_cp_34");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_35,
                ModItems.WHITE_LIGHTGRAY_DYE_35, "white_lg_cp_35");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_41,
                ModItems.WHITE_LIGHTGRAY_DYE_41, "white_lg_cp_41");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_43,
                ModItems.WHITE_LIGHTGRAY_DYE_43, "white_lg_cp_43");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_51,
                ModItems.WHITE_LIGHTGRAY_DYE_51, "white_lg_cp_51");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_52,
                ModItems.WHITE_LIGHTGRAY_DYE_52, "white_lg_cp_52");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_53,
                ModItems.WHITE_LIGHTGRAY_DYE_53, "white_lg_cp_53");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_61,
                ModItems.WHITE_LIGHTGRAY_DYE_61, "white_lg_cp_61");

        offerCCPowderRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_POWDER_71,
                ModItems.WHITE_LIGHTGRAY_DYE_71, "white_lg_cp_71");


        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_wool_12_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 2, "white_lg_wool_24_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_wool_13_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 2, "white_lg_wool_26_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_14,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_wool_14_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_15,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_wool_15_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_16,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 6, 1, "white_lg_wool_16_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_17,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 7, 1, "white_lg_wool_17_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_21_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_21,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_wool_42_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_23,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_wool_23_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_25,
                Items.WHITE_DYE, 2, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_wool_25_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_31_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_31,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 1, 2, "white_lg_wool_62_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_32,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_wool_32_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_34,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_wool_34_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_35,
                Items.WHITE_DYE, 3, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_wool_35_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_41,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_41_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_43,
                Items.WHITE_DYE, 4, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_wool_43_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_51,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_51_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_52,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_wool_52_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_53,
                Items.WHITE_DYE, 5, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_wool_53_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_61,
                Items.WHITE_DYE, 6, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_61_v");

        offerCCVanillaWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_71,
                Items.WHITE_DYE, 7, Items.LIGHT_GRAY_DYE, 1, 1, "white_lg_wool_71_v");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_12,
                ModItems.WHITE_LIGHTGRAY_DYE_12, "white_lg_wool_12_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_13,
                ModItems.WHITE_LIGHTGRAY_DYE_13, "white_lg_wool_13_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_14,
                ModItems.WHITE_LIGHTGRAY_DYE_14, "white_lg_wool_14_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_15,
                ModItems.WHITE_LIGHTGRAY_DYE_15, "white_lg_wool_15_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_16,
                ModItems.WHITE_LIGHTGRAY_DYE_16, "white_lg_wool_16_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_17,
                ModItems.WHITE_LIGHTGRAY_DYE_17, "white_lg_wool_17_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_21,
                ModItems.WHITE_LIGHTGRAY_DYE_21, "white_lg_wool_21_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_23,
                ModItems.WHITE_LIGHTGRAY_DYE_23, "white_lg_wool_23_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_25,
                ModItems.WHITE_LIGHTGRAY_DYE_25, "white_lg_wool_25_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_31,
                ModItems.WHITE_LIGHTGRAY_DYE_31, "white_lg_wool_31_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_32,
                ModItems.WHITE_LIGHTGRAY_DYE_32, "white_lg_wool_32_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_34,
                ModItems.WHITE_LIGHTGRAY_DYE_34, "white_lg_wool_34_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_35,
                ModItems.WHITE_LIGHTGRAY_DYE_35, "white_lg_wool_35_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_41,
                ModItems.WHITE_LIGHTGRAY_DYE_41, "white_lg_wool_41_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_43,
                ModItems.WHITE_LIGHTGRAY_DYE_43, "white_lg_wool_43_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_51,
                ModItems.WHITE_LIGHTGRAY_DYE_51, "white_lg_wool_51_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_52,
                ModItems.WHITE_LIGHTGRAY_DYE_52, "white_lg_wool_52_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_53,
                ModItems.WHITE_LIGHTGRAY_DYE_53, "white_lg_wool_53_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_61,
                ModItems.WHITE_LIGHTGRAY_DYE_61, "white_lg_wool_61_m");

        offerCCModdedWoolRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_WOOL_71,
                ModItems.WHITE_LIGHTGRAY_DYE_71, "white_lg_wool_71_m");

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_12, ModBlocks.WHITE_LIGHTGRAY_WOOL_12);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_13, ModBlocks.WHITE_LIGHTGRAY_WOOL_13);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_14, ModBlocks.WHITE_LIGHTGRAY_WOOL_14);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_15, ModBlocks.WHITE_LIGHTGRAY_WOOL_15);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_16, ModBlocks.WHITE_LIGHTGRAY_WOOL_16);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_17, ModBlocks.WHITE_LIGHTGRAY_WOOL_17);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_21, ModBlocks.WHITE_LIGHTGRAY_WOOL_21);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_23, ModBlocks.WHITE_LIGHTGRAY_WOOL_23);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_25, ModBlocks.WHITE_LIGHTGRAY_WOOL_25);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_31, ModBlocks.WHITE_LIGHTGRAY_WOOL_31);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_32, ModBlocks.WHITE_LIGHTGRAY_WOOL_32);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_34, ModBlocks.WHITE_LIGHTGRAY_WOOL_34);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_35, ModBlocks.WHITE_LIGHTGRAY_WOOL_35);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_41, ModBlocks.WHITE_LIGHTGRAY_WOOL_41);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_43, ModBlocks.WHITE_LIGHTGRAY_WOOL_43);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_51, ModBlocks.WHITE_LIGHTGRAY_WOOL_51);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_52, ModBlocks.WHITE_LIGHTGRAY_WOOL_52);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_53, ModBlocks.WHITE_LIGHTGRAY_WOOL_53);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_61, ModBlocks.WHITE_LIGHTGRAY_WOOL_61);

        offerCarpetRecipe(recipeExporter,
                ModBlocks.WHITE_LIGHTGRAY_CARPET_71, ModBlocks.WHITE_LIGHTGRAY_WOOL_71);

    }

    public static void offerCCDyesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye1, int r1, ItemConvertible dye2, int r2, int multiplier, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, (r1+r2)*multiplier)
                .input(dye1, r1*multiplier)
                .input(dye2, r2*multiplier)
                .input(ModItems.FILLED_COLORED_CRAFTER)
                .group("cc_dyes")
                .criterion(hasItem(dye1), conditionsFromItem(dye1))
                .criterion(hasItem(dye2), conditionsFromItem(dye2))
                .offerTo(exporter, id);
    }

    public static void offerCCVanillaConcreteRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye1, int r1, ItemConvertible dye2, int r2, int multiplier, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, (r1+r2)*multiplier)
                .input(dye1, r1*multiplier)
                .input(dye2, r2*multiplier)
                .input(Blocks.WHITE_CONCRETE)
                .group("cc_concrete")
                .criterion(hasItem(dye1), conditionsFromItem(dye1))
                .criterion(hasItem(dye2), conditionsFromItem(dye2))
                .offerTo(exporter, id);
    }

    public static void offerCCModdedConcreteRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .input(dye, 1)
                .input(Blocks.WHITE_CONCRETE)
                .group("cc_concrete")
                .criterion(hasItem(dye), conditionsFromItem(dye))
                .offerTo(exporter, id);
    }

    public static void offerCCPowderRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 8)
                .input(dye)
                .input(Blocks.SAND, 4)
                .input(Blocks.GRAVEL, 4)
                .group("cc_powder")
                .criterion("has_sand", conditionsFromItem(Blocks.SAND))
                .criterion("has_gravel", conditionsFromItem(Blocks.GRAVEL))
                .offerTo(exporter, id);
    }

    public static void offerCCVanillaWoolRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye1, int r1, ItemConvertible dye2, int r2, int multiplier, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, (r1+r2)*multiplier)
                .input(dye1, r1*multiplier)
                .input(dye2, r2*multiplier)
                .input(Blocks.WHITE_WOOL)
                .group("cc_wool")
                .criterion(hasItem(dye1), conditionsFromItem(dye1))
                .criterion(hasItem(dye2), conditionsFromItem(dye2))
                .offerTo(exporter, id);
    }

    public static void offerCCModdedWoolRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .input(dye, 1)
                .input(Blocks.WHITE_WOOL)
                .group("cc_wool")
                .criterion(hasItem(dye), conditionsFromItem(dye))
                .offerTo(exporter, id);
    }
}
