package malek.tensor.test;

import malek.tensor.Tensor;

import net.minecraft.util.registry.Registry;

import net.fabricmc.api.ModInitializer;

public class Test implements ModInitializer {
	@Override
	public void onInitialize() {
		Tensor.register(ModBlocks.class, Registry.BLOCK);
		Tensor.register(ModItems.class, Registry.ITEM);
	}
}
