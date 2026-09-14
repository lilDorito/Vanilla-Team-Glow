package com.lildorito.teamglow.mixin;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.Team;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Entity.class)
public class EntityGlowMixin {

    @Inject(method = "isCurrentlyGlowing", at = @At("HEAD"), cancellable = true)
    private void teamglow$isCurrentlyGlowing(CallbackInfoReturnable<Boolean> cir) {
        Entity self = (Entity) (Object) this;
        if (!(self instanceof Player) || !self.level().isClientSide()) return;

        Minecraft mc = Minecraft.getInstance();
        if (mc.player == null || self == mc.player) return;

        Team myTeam = mc.player.getTeam();
        Team theirTeam = ((Player) self).getTeam();

        if (myTeam != null && theirTeam != null && myTeam.getName().equals(theirTeam.getName())) {
            cir.setReturnValue(true);
        }
    }
}
