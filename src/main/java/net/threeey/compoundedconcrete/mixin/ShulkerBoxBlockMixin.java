package net.threeey.compoundedconcrete.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.util.DyeColor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ShulkerBoxBlock.class)
public class ShulkerBoxBlockMixin {
    @Inject(method = "get", at = @At("HEAD"), cancellable = true)
    private static void addCustomShulkerBoxBlocks(DyeColor dyeColor, CallbackInfoReturnable<Block> cir) {
        Block shulkerBoxBlock = null;

        if ((((dyeColor != DyeColor.WHITE) && (dyeColor != DyeColor.LIGHT_GRAY)) && ((dyeColor != DyeColor.GRAY)
                && (dyeColor != DyeColor.BLACK))) && (((dyeColor != DyeColor.BROWN) && (dyeColor != DyeColor.RED))
                && ((dyeColor != DyeColor.ORANGE) && (dyeColor != DyeColor.YELLOW))) && (((dyeColor != DyeColor.LIME)
                && (dyeColor != DyeColor.GREEN)) && ((dyeColor != DyeColor.CYAN) && (dyeColor != DyeColor.LIGHT_BLUE)))
                && (((dyeColor != DyeColor.BLUE) && (dyeColor != DyeColor.PURPLE)) && ((dyeColor != DyeColor.MAGENTA)
                && (dyeColor != DyeColor.PINK)))) shulkerBoxBlock = Blocks.SHULKER_BOX;
        if (shulkerBoxBlock != null) {
            cir.setReturnValue(shulkerBoxBlock);
        }
    }
}