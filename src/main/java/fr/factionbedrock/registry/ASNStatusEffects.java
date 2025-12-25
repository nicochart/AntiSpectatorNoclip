package fr.factionbedrock.registry;

import fr.factionbedrock.AntiSpectatorNoclip;
import fr.factionbedrock.effect.AllowNoclipEffect;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;

public class ASNStatusEffects
{
    public static final RegistryEntry<StatusEffect> ALLOW_NOCLIP = register("allow_noclip", new AllowNoclipEffect(StatusEffectCategory.BENEFICIAL, 8171462));

    private static RegistryEntry<StatusEffect> register(String name, StatusEffect statusEffect)
    {
        return Registry.registerReference(Registries.STATUS_EFFECT, AntiSpectatorNoclip.id(name), statusEffect);
    }

    public static void load() {}
}
