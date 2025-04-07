package net.threeey.compoundedconcrete.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.ConcretePowderBlock;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.threeey.compoundedconcrete.CompoundedConcrete;

import java.util.List;

public class ModBlocks {

    public static final Block WHITE_LIGHTGRAY_CONCRETE_12 = registerBlock("white_lightgray_concrete_12",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_12"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
        });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_13 = registerBlock("white_lightgray_concrete_13",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_13"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_14 = registerBlock("white_lightgray_concrete_14",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_14"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_14"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_15 = registerBlock("white_lightgray_concrete_15",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_15"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_15"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_16 = registerBlock("white_lightgray_concrete_16",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_16"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_16"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_17 = registerBlock("white_lightgray_concrete_17",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_17"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_17"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_21 = registerBlock("white_lightgray_concrete_21",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_21"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_21"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_23 = registerBlock("white_lightgray_concrete_23",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_23"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_23"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_25 = registerBlock("white_lightgray_concrete_25",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_25"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_25"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_31 = registerBlock("white_lightgray_concrete_31",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_31"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_31"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_32 = registerBlock("white_lightgray_concrete_32",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_32"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_32"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_34 = registerBlock("white_lightgray_concrete_34",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_34"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_34"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_35 = registerBlock("white_lightgray_concrete_35",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_35"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_35"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_41 = registerBlock("white_lightgray_concrete_41",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_41"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_41"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_43 = registerBlock("white_lightgray_concrete_43",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_43"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_43"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_51 = registerBlock("white_lightgray_concrete_51",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_51"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_51"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_52 = registerBlock("white_lightgray_concrete_52",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_52"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_52"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_53 = registerBlock("white_lightgray_concrete_53",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_53"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_53"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_61 = registerBlock("white_lightgray_concrete_61",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_61"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_61"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_CONCRETE_71 = registerBlock("white_lightgray_concrete_71",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_71"))
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.8F)) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType type) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_71"));
                    super.appendTooltip(stack, context, tooltip, type);
                }
            });

    public static final Block WHITE_LIGHTGRAY_POWDER_12 = registerBlock("white_lightgray_powder_12",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_12, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_12"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_13 = registerBlock("white_lightgray_powder_13",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_13, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_13"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_14 = registerBlock("white_lightgray_powder_14",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_14, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_12"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_14"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_15 = registerBlock("white_lightgray_powder_15",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_15, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_15"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_15"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_16 = registerBlock("white_lightgray_powder_16",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_16, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_16"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_16"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_17 = registerBlock("white_lightgray_powder_17",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_17, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_17"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_17"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_21 = registerBlock("white_lightgray_powder_21",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_21, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_21"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_21"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_23 = registerBlock("white_lightgray_powder_23",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_23, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_23"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_23"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_25 = registerBlock("white_lightgray_powder_25",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_25, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_25"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_25"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_31 = registerBlock("white_lightgray_powder_31",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_31, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_31"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_31"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_32 = registerBlock("white_lightgray_powder_32",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_32, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_32"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_32"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_34 = registerBlock("white_lightgray_powder_34",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_34, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_34"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_34"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_35 = registerBlock("white_lightgray_powder_35",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_35, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_35"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_35"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_41 = registerBlock("white_lightgray_powder_41",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_41, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_41"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_41"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_43 = registerBlock("white_lightgray_powder_43",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_43, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_43"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_43"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_51 = registerBlock("white_lightgray_powder_51",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_51, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_51"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_51"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_52 = registerBlock("white_lightgray_powder_52",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_52, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_52"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_52"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_53 = registerBlock("white_lightgray_powder_53",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_53, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_53"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_53"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_61 = registerBlock("white_lightgray_powder_61",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_61, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_61"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_61"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_POWDER_71 = registerBlock("white_lightgray_powder_71",
            new ConcretePowderBlock(WHITE_LIGHTGRAY_CONCRETE_71, AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_71"))
                    .instrument(NoteBlockInstrument.SNARE)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.SAND)
            ) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_71"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_12 = registerBlock("white_lightgray_wool_12",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_12"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_12"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_13 = registerBlock("white_lightgray_wool_13",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_13"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_13"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_14 = registerBlock("white_lightgray_wool_14",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_14"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_14"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_15 = registerBlock("white_lightgray_wool_15",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_15"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_15"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_16 = registerBlock("white_lightgray_wool_16",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_16"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_16"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_17 = registerBlock("white_lightgray_wool_17",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_17"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_17"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_21 = registerBlock("white_lightgray_wool_21",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_21"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_21"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_23 = registerBlock("white_lightgray_wool_23",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_23"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_23"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_25 = registerBlock("white_lightgray_wool_25",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_25"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_25"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_31 = registerBlock("white_lightgray_wool_31",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_31"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_31"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_32 = registerBlock("white_lightgray_wool_32",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_32"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_32"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_34 = registerBlock("white_lightgray_wool_34",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_34"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_34"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_35 = registerBlock("white_lightgray_wool_35",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_35"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_35"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_41 = registerBlock("white_lightgray_wool_41",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_41"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_41"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_43 = registerBlock("white_lightgray_wool_43",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_43"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_43"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_51 = registerBlock("white_lightgray_wool_51",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_51"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_51"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );


    public static final Block WHITE_LIGHTGRAY_WOOL_52 = registerBlock("white_lightgray_wool_52",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_52"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_52"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_53 = registerBlock("white_lightgray_wool_53",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_53"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_53"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_61 = registerBlock("white_lightgray_wool_61",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_61"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_61"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    public static final Block WHITE_LIGHTGRAY_WOOL_71 = registerBlock("white_lightgray_wool_71",
            new Block(AbstractBlock.Settings.create()
                    .mapColor(DyeColor.valueOf("WHITE_LIGHTGRAY_71"))
                    .instrument(NoteBlockInstrument.GUITAR).strength(0.8F).sounds(BlockSoundGroup.WOOL).burnable()) {
                @Override
                public void appendTooltip(ItemStack stack, Item.TooltipContext context, List<Text> tooltip, TooltipType options) {
                    tooltip.add(Text.translatable("tooltip.compoundedconcrete.white_lightgray_71"));
                    super.appendTooltip(stack, context, tooltip, options);
                }
            }
    );

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(CompoundedConcrete.MOD_ID, name), block);
    }

    public static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(CompoundedConcrete.MOD_ID, name),
        new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        CompoundedConcrete.LOGGER.info("Registering Mod Blocks for Compounded Concrete");
    }
}
