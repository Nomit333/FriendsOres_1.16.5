package com.nomit333.friendsores.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class FabibumBlock extends Block {

    public FabibumBlock() {
        super(AbstractBlock.Properties.create(Material.IRON)
                .hardnessAndResistance(5.0f,3.0f)
                .sound(SoundType.METAL)
                .harvestLevel(3)
                .setRequiresTool()
        );
    }
}
