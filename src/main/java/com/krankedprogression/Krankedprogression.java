package com.krankedprogression;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.PlayerBlockBreakEvents;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class Krankedprogression implements ModInitializer {
	public static final String MOD_ID = "krankedprogression";
	private static final TagKey<Block> LOGS = TagKey.create(Registries.BLOCK,
			Identifier.fromNamespaceAndPath("minecraft", "logs"));
	private static final TagKey<Block> ORES = TagKey.create(Registries.BLOCK,
			Identifier.fromNamespaceAndPath("minecraft", "ores"));
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	
	
	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");
	
	PlayerBlockBreakEvents.BEFORE.register((world, player, pos, state, blockEntity) -> {
		if (state.is(LOGS)) {
			LOGGER.info("You broke a log!");	
		}
		return true;
	});

		ModItemIds.init();
		ModItems.init();
		ToolMaterials.init();
		ModEvents.init();
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
