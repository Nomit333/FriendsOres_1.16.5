package com.nomit333.friendsores.init;

import com.nomit333.friendsores.FriendsOres;
import com.nomit333.friendsores.blocks.*;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FriendsOres.MOD_ID);

    public static final RegistryObject<Block> LINDROID_ORE = BLOCKS.register("lindroid_ore", LindroidOre::new);
    public static final RegistryObject<Block> LINDROID_BLOCK = BLOCKS.register("lindroid_block", LindroidBlock::new);
    public static final RegistryObject<Block> FABIBUM_ORE = BLOCKS.register("fabibum_ore", FabibumOre::new);
    public static final RegistryObject<Block> FABIBUM_ORE_NETHER = BLOCKS.register("fabibum_ore_nether", FabibumOreNether::new);
    public static final RegistryObject<Block> FABIBUM_BLOCK = BLOCKS.register("fabibum_block", FabibumBlock::new);
}