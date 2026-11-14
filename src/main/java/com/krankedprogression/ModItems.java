package com.krankedprogression;

import java.util.function.Function;

import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModItems {
	public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings) {
		// Create the item instance.
		Item item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

	public static final Item SHARP_STICK = register(
		ModItemIds.SHARP_STICK,
		settings -> new AxeItem(ToolMaterials.SHARP_STICK_MATERIAL, 0.0F, -2.0F, settings),
		new Item.Properties()
);
    public static final Item SPOON = register(ModItemIds.SPOON, Item::new, new Item.Properties());

    public static void init(){
		// Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS)
		.register((creativeTab) -> creativeTab.accept(ModItems.SPOON)); 

		CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
		.register((creativeTab) -> {
			creativeTab.accept(ModItems.SHARP_STICK);
		});
	}
    
}