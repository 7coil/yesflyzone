package cy.jdkdigital.noflyzone.util;

import cy.jdkdigital.noflyzone.Config;
import cy.jdkdigital.noflyzone.NoFlyZone;
import cy.jdkdigital.noflyzone.network.PacketHandler;
import cy.jdkdigital.noflyzone.util.compat.GameStagesCompat;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fml.ModList;

import java.util.*;

public class FlightHelper {
    public static boolean isAllowedToFly(Player player) {
        return true;
    }

    public static void stopFlying(Player player) {
        // noop
    }

    public static void sendFlightNotice(Player player) {
        // noop
    }

    public static void sendTeleportNotice(Player player) {
        // noop
    }

    public static boolean isFlying(Player player) {
        return false;
    }
}
