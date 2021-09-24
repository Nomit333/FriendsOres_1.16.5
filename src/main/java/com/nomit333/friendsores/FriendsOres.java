package com.nomit333.friendsores;

import com.nomit333.friendsores.init.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.nomit333.friendsores.FriendsOres.MOD_ID;


@Mod(MOD_ID)
public class FriendsOres {

    public static final String MOD_ID = "friendsores";
    public static final Logger LOGGER = LogManager.getLogger();


    public FriendsOres() {



        MinecraftForge.EVENT_BUS.register(this);
    }

    public static final ItemGroup TAB = new ItemGroup("FriendsOres") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.LINDROID.get());
        }
    };


}