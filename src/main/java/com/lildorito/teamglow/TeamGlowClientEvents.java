package com.lildorito.teamglow;

import net.minecraft.client.Minecraft;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.scores.Team;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(modid = "teamglow", value = Dist.CLIENT)
public class TeamGlowClientEvents {

    @SubscribeEvent
    public static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;

        Minecraft mc = Minecraft.getInstance();
        if (mc.level == null || mc.player == null) return;

        Team myTeam = mc.player.getTeam();

        for (Player player : mc.level.players()) {
            if (player == mc.player) continue;

            Team theirTeam = player.getTeam();
            boolean isTeammate = myTeam != null
                    && theirTeam != null
                    && myTeam.getName().equals(theirTeam.getName());

            player.setGlowingTag(isTeammate);
        }
    }
}
