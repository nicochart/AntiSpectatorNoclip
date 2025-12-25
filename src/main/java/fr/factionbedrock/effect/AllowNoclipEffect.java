package fr.factionbedrock.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class AllowNoclipEffect extends StatusEffect
{
    public AllowNoclipEffect(StatusEffectCategory category, int liquidColor) {super(category, liquidColor);}

    @Override public boolean canApplyUpdateEffect(int duration, int amplifier) {return true;}

    @Override public boolean isInstant() {return false;}
}
