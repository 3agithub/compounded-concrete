package net.threeey.compoundedconcrete.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
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

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_dye_13");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_14,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_dye_14");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_15,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_dye_15");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_16,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 6, 1, "white_lg_dye_16");

        offerCCDyesRecipe(recipeExporter, ModItems.WHITE_LIGHTGRAY_DYE_17,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 7, 1, "white_lg_dye_17");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_12,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 2, 1, "white_lg_cc_12_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_13,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 3, 1, "white_lg_cc_13_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_14,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 4, 1, "white_lg_cc_14_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_15,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 5, 1, "white_lg_cc_15_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_16,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 6, 1, "white_lg_cc_16_v");

        offerCCVanillaConcreteRecipe(recipeExporter, ModBlocks.WHITE_LIGHTGRAY_CONCRETE_17,
                Items.WHITE_DYE, 1, Items.LIGHT_GRAY_DYE, 7, 1, "white_lg_cc_17_v");

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
    }

    public static void offerCCDyesRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye1, int r1, ItemConvertible dye2, int r2, int multiplier, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, output, (r1+r2)*multiplier)
                .input(dye1, r1*multiplier)
                .input(dye2, r2*multiplier)
                .input(ModItems.FILLED_COLORED_CRAFTER)
                .criterion(hasItem(dye1), conditionsFromItem(dye1))
                .criterion(hasItem(dye2), conditionsFromItem(dye2))
                .offerTo(exporter, id);
    }

    public static void offerCCVanillaConcreteRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye1, int r1, ItemConvertible dye2, int r2, int multiplier, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, (r1+r2)*multiplier)
                .input(dye1, r1*multiplier)
                .input(dye2, r2*multiplier)
                .input(Blocks.WHITE_CONCRETE)
                .criterion(hasItem(dye1), conditionsFromItem(dye1))
                .criterion(hasItem(dye2), conditionsFromItem(dye2))
                .offerTo(exporter, id);
    }

    public static void offerCCModdedConcreteRecipe(RecipeExporter exporter, ItemConvertible output, ItemConvertible dye, String id) {
        ShapelessRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, output, 1)
                .input(dye, 1)
                .input(Blocks.WHITE_CONCRETE)
                .criterion(hasItem(dye), conditionsFromItem(dye))
                .offerTo(exporter, id);
    }
}
