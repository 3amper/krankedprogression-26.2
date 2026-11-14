package com.krankedprogression;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

public class ToolMaterials {
    
public static final TagKey<Block> INCORRECT_FOR_SHARP_STICK = TagKey.create(Registries.BLOCK,
		Krankedprogression.id("incorrect_for_sharp_stick"));

    public static final ToolMaterial SHARP_STICK_MATERIAL = new ToolMaterial(
		INCORRECT_FOR_SHARP_STICK, // incorrect blocks for drops
		20, // durability
		1.0F, // speed
		0.5F, // attack damage bonus
		22, // enchantment value
		 ItemTags.WOODEN_TOOL_MATERIALS// repair items
);

public static void init() {
        // This method is intentionally left empty. It can be used to trigger the class loading.
    }
}
