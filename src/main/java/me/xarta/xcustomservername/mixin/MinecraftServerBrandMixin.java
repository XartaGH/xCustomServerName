package me.xarta.xcustomservername.mixin;

import me.xarta.xcustomservername.config.ConfigHandler;
import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftServer.class)
public abstract class MinecraftServerBrandMixin {
    @Inject(method = "getServerModName", at = @At("HEAD"), cancellable = true)
    private void xcustomservername$overrideBrand(CallbackInfoReturnable<String> cir) {
        String configured = ConfigHandler.SERVER_BRAND.get();
        if (!configured.isBlank()) {
            cir.setReturnValue(configured);
        }
    }
}