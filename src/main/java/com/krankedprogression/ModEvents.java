package com.krankedprogression;

import net.fabricmc.fabric.api.event.player.AttackEntityCallback;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;

public class ModEvents {
    
    public static void init(){

        AttackEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (player.getAttackStrengthScale(0.5F) < 1.0F) {
                return InteractionResult.FAIL;
            } else {
                return InteractionResult.PASS;
                
            }
            
        });
	}
}
