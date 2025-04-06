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

		compounded_concrete$addColor(dyeColors, "white_lightgray_12", 0xBCBEB9, MapColor.LIGHT_GRAY, 0xC2C2C2, 0xBCBEB9);
		compounded_concrete$addColor(dyeColors, "white_lightgray_13", 0xB4B6B1, MapColor.LIGHT_GRAY, 0xBCBCBC, 0xB4B6B1);
		compounded_concrete$addColor(dyeColors, "white_lightgray_14", 0xAFB1AC, MapColor.LIGHT_GRAY, 0xB9B9B9, 0xAFB1AC);
		compounded_concrete$addColor(dyeColors, "white_lightgray_15", 0xACADA8, MapColor.LIGHT_GRAY, 0xB7B7B7, 0xACADA8);
		compounded_concrete$addColor(dyeColors, "white_lightgray_16", 0xAAABA6, MapColor.LIGHT_GRAY, 0xB5B5B5, 0xAAABA6);
		compounded_concrete$addColor(dyeColors, "white_lightgray_17", 0xA9A9A4, MapColor.LIGHT_GRAY, 0xB4B4B4, 0xA9A9A4);
		compounded_concrete$addColor(dyeColors, "white_lightgray_21", 0xDADEDC, MapColor.WHITE, 0xD9D9D9, 0xDADEDC);
		compounded_concrete$addColor(dyeColors, "white_lightgray_23", 0xC2C4C0, MapColor.LIGHT_GRAY, 0xC7C7C7, 0xC2C4C0);
		compounded_concrete$addColor(dyeColors, "white_lightgray_25", 0xB7B9B4, MapColor.LIGHT_GRAY, 0xBFBFBF, 0xB7B9B4);
		compounded_concrete$addColor(dyeColors, "white_lightgray_31", 0xE2E7E4, MapColor.WHITE, 0xDFDFDF, 0xE2E7E4);
		compounded_concrete$addColor(dyeColors, "white_lightgray_32", 0xD4D8D5, MapColor.WHITE, 0xD4D4D4, 0xD4D8D5);
		compounded_concrete$addColor(dyeColors, "white_lightgray_34", 0xC4C7C3, MapColor.LIGHT_GRAY, 0xC9C9C9, 0xC4C7C3);
		compounded_concrete$addColor(dyeColors, "white_lightgray_35", 0xC0C2BE, MapColor.LIGHT_GRAY, 0xC5C5C5, 0xC0C2BE);
		compounded_concrete$addColor(dyeColors, "white_lightgray_41", 0xE7EBE9, MapColor.WHITE, 0xE2E2E2, 0xE7EBE9);
		compounded_concrete$addColor(dyeColors, "white_lightgray_43", 0xD2D5D2, MapColor.WHITE, 0xD2D2D2, 0xD2D5D2);
		compounded_concrete$addColor(dyeColors, "white_lightgray_51", 0xEAEFED, MapColor.WHITE, 0xE5E5E5, 0xEAEFED);
		compounded_concrete$addColor(dyeColors, "white_lightgray_52", 0xDFE3E1, MapColor.WHITE, 0xDCDCDC, 0xDFE3E1);
		compounded_concrete$addColor(dyeColors, "white_lightgray_53", 0xD7DAD7, MapColor.WHITE, 0xD8D8D8, 0xD7DAD7);
		compounded_concrete$addColor(dyeColors, "white_lightgray_61", 0xECF1EF, MapColor.WHITE, 0xE6E6E6, 0xECF1EF);
		compounded_concrete$addColor(dyeColors, "white_lightgray_71", 0xEEF3F1, MapColor.WHITE, 0xE7E7E7, 0xEEF3F1);

		field_7953 = dyeColors.toArray(DyeColor[]::new);
	}
}