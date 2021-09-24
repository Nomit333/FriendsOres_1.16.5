package com.nomit333.friendsores.blocks;

import com.nomit333.friendsores.FriendsOres;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {
    public BlockItemBase(Block block) {super(block, new Item.Properties().group(FriendsOres.TAB)); }
}