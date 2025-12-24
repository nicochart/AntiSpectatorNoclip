package fr.factionbedrock.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class PlayerTickMixin
{
	@Inject(method = "tickMovement", at = @At("HEAD"))
	private void disableSpectatorNoclip(CallbackInfo ci)
	{
		PlayerEntity self = (PlayerEntity)(Object)this;

		if (self.isSpectator() && self.noClip)
		{
			self.noClip = false;
		}
	}
}