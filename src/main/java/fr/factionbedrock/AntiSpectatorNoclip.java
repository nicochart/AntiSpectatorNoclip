package fr.factionbedrock;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AntiSpectatorNoclip implements ModInitializer
{
	public static final String MOD_ID = "anti-spectator-noclip";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override public void onInitialize()
	{
		LOGGER.info("Anti Spectator Noclip mod loaded");
	}
}