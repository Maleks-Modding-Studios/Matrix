package malek.tensor.test;

import malek.tensor.Registrar;
import malek.tensor.RegistryEntry;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

@Registrar(element = Block.class, modid = "matrix-test")
public class ModBlocks {
	@RegistryEntry("test_block")
	public static final Block BLOCK = new Block(AbstractBlock.Settings.copy(Blocks.DIRT));
}
