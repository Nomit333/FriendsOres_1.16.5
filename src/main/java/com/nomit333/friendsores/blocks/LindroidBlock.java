package com.nomit333.friendsores.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class LindroidBlock extends Block {

    public LindroidBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
            .hardnessAndResistance(2.0f,6.5f)
            .sound(SoundType.METAL)
            .harvestLevel(2)
            .setRequiresTool()
        );
    }
}
