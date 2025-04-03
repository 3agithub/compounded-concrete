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
	private static void compoundedconcrete$addColor(List<DyeColor> dyeColors, String name, int color, MapColor mapColor, int fireworkColor, int signColor) {
		dyeColors.add(invokeNew(name.toUpperCase(Locale.ROOT), dyeColors.getLast().ordinal() + 1, dyeColors.getLast().getId() + 1, name, color, mapColor, fireworkColor, signColor));
	}

	@Inject(method = "<clinit>", at = @At(value = "FIELD", target = "Lnet/minecraft/util/DyeColor;field_7953:[Lnet/minecraft/util/DyeColor;", shift = At.Shift.AFTER, opcode = Opcodes.PUTSTATIC))
	private static void addDyeColors(CallbackInfo ci) {
		ArrayList<DyeColor> dyeColors = Lists.newArrayList(field_7953);

		// White + Red
		compoundedconcrete$addColor(dyeColors, "red_white_71", 0xb94841, MapColor.RED, 0xbb4945, 0xb94841);
		compoundedconcrete$addColor(dyeColors, "red_white_62", 0xc2625c, MapColor.RED, 0xc2615d, 0xc2625c);
		compoundedconcrete$addColor(dyeColors, "red_white_53", 0xcb7c77, MapColor.RED, 0xca7976, 0xcb7c77);
		compoundedconcrete$addColor(dyeColors, "red_white_44", 0xd59792, MapColor.RED, 0xd2918e, 0xd59792);
		compoundedconcrete$addColor(dyeColors, "red_white_35", 0xdeb1ad, MapColor.RED, 0xd9a8a7, 0xdeb1ad);
		compoundedconcrete$addColor(dyeColors, "red_white_26", 0xe7cbc8, MapColor.RED, 0xe1c0bf, 0xe7cbc8);
		compoundedconcrete$addColor(dyeColors, "red_white_17", 0xf0e5e3, MapColor.RED, 0xe8d8d8, 0xf0e5e3);

		field_7953 = dyeColors.toArray(DyeColor[]::new);
	}
}