package net.threeey.compoundedconcrete.mixin;

import com.google.common.collect.Lists;
import net.minecraft.block.MapColor;
import net.minecraft.util.DyeColor;
import org.objectweb.asm.Opcodes;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Mixin(DyeColor.class)
public abstract class DyeColorMixin {

	@Final
	@Shadow
	@Mutable
	private static DyeColor[] field_7953;

	@Invoker("<init>")
	private static DyeColor invokeNew(String internalName, int ordinal, int id, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
		throw new IllegalStateException();
	}

	@Unique
	private static void compounded_concrete$addColor(List<DyeColor> dyeColors, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
		dyeColors.add(invokeNew(name.toUpperCase(Locale.ROOT), dyeColors.getLast().ordinal() + 1, dyeColors.getLast().getId() + 1, name, color, mapColor, fireworkColor, signColor));
	}

	@Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/util/DyeColor;field_7953:[Lnet/minecraft/util/DyeColor;", shift = At.Shift.AFTER, opcode = Opcodes.PUTSTATIC))
	private static void addWhiteDyeColors(CallbackInfo ci) {
		ArrayList<DyeColor> dyeColors = Lists.newArrayList(field_7953);

		compounded_concrete$addColor(dyeColors, "white_light_gray_12", 0xBCBEB9, MapColor.LIGHT_GRAY, 0xC2C2C2, 0xBCBEB9);
		compounded_concrete$addColor(dyeColors, "white_light_gray_13", 0xB4B6B1, MapColor.LIGHT_GRAY, 0xBCBCBC, 0xB4B6B1);

		field_7953 = dyeColors.toArray(DyeColor[]::new);
	}
}