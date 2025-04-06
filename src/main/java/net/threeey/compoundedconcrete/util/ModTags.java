package net.threeey.compoundedconcrete.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.threeey.compoundedconcrete.CompoundedConcrete;

public class ModTags {

    public static class Blocks {

        public static final TagKey<Block> ALL_CONCRETE = createTag("concrete");
        public static final TagKey<Block> CC_CONCRETE = createTag("cc_concrete");
        public static final TagKey<Block> VANILLA_CONCRETE = createTag("vanilla_concrete");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(CompoundedConcrete.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> ALL_DYES = createTag("dyes");
        public static final TagKey<Item> CC_DYES = createTag("cc_dyes");
        public static final TagKey<Item> VANILLA_DYES = createTag("vanilla_dyes");

        private static TagKey<Item> createTag(String name) {
             return TagKey.of(RegistryKeys.ITEM, Identifier.of(CompoundedConcrete.MOD_ID, name));
        }
    }
}
