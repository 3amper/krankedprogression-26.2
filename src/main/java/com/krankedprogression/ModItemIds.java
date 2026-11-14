package com.krankedprogression;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class ModItemIds {
	public static ResourceKey<Item> create(String name) {
		// Create the item key.
		return ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath("krankedprogression", name));
	}
	public static final ResourceKey<Item> SPOON = create("spoon");
	public static final ResourceKey<Item> SHARP_STICK = create("sharp_stick");
	
	public static void init(){

	}
}