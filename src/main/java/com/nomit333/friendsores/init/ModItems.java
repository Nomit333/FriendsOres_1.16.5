package com.nomit333.friendsores.init;

import com.nomit333.friendsores.FriendsOres;
import com.nomit333.friendsores.blocks.BlockItemBase;
import com.nomit333.friendsores.items.ItemBase;
import com.nomit333.friendsores.util.enums.ModArmorMaterial;
import com.nomit333.friendsores.util.enums.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FriendsOres.MOD_ID);




    //Lindroid
    public static final RegistryObject<SwordItem> LINDROID_SWORD = ITEMS.register( "lindroid_sword", () ->
            new SwordItem(ModItemTier.Lindroid,4,-1.4F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<PickaxeItem> LINDROID_PICKAXE = ITEMS.register( "lindroid_pickaxe", () ->
            new PickaxeItem(ModItemTier.Lindroid,1,-1.8F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<AxeItem> LINDROID_AXE = ITEMS.register( "lindroid_axe", () ->
            new AxeItem(ModItemTier.Lindroid,6.5F,-2.5F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<ShovelItem> LINDROID_SHOVEL = ITEMS.register( "lindroid_shovel", () ->
            new ShovelItem(ModItemTier.Lindroid,2,-2.0F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<HoeItem> LINDROID_HOE = ITEMS.register( "lindroid_hoe", () ->
            new HoeItem(ModItemTier.Lindroid,-2,-0.5F, new Item.Properties().group(FriendsOres.TAB)));


    public static final RegistryObject<Item> LINDROID_ORE_ITEM = ITEMS.register("lindroid_ore",
            () -> new BlockItemBase(ModBlocks.LINDROID_ORE.get()));
    public static final RegistryObject<Item> LINDROID_BLOCK_ITEM = ITEMS.register("lindroid_block",
            () -> new BlockItemBase(ModBlocks.LINDROID_BLOCK.get()));


    public static final RegistryObject<Item> LINDROID = ITEMS.register("lindroid", ItemBase::new);

    //Fabibum
    public static final RegistryObject<SwordItem> FABIBUM_SWORD = ITEMS.register( "fabibum_sword", () ->
            new SwordItem(ModItemTier.Lindroid,4,-1.4F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<PickaxeItem> FABIBUM_PICKAXE = ITEMS.register( "fabibum_pickaxe", () ->
            new PickaxeItem(ModItemTier.Lindroid,1,-1.8F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<AxeItem> FABIBUM_AXE = ITEMS.register( "fabibum_axe", () ->
            new AxeItem(ModItemTier.Lindroid,6.5F,-2.5F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<ShovelItem> FABIBUM_SHOVEL = ITEMS.register( "fabibum_shovel", () ->
            new ShovelItem(ModItemTier.Lindroid,2,-2.0F, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<HoeItem> FABIBUM_HOE = ITEMS.register( "fabibum_hoe", () ->
            new HoeItem(ModItemTier.Lindroid,-2,-0.5F, new Item.Properties().group(FriendsOres.TAB)));


    public static final RegistryObject<ArmorItem> FABIBUM_HELMET = ITEMS.register("fabibum_helmet", () ->
            new ArmorItem(ModArmorMaterial.FABIBUM, EquipmentSlotType.HEAD, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<ArmorItem> FABIBUM_CHESTPLATE = ITEMS.register("fabibum_chestplate", () ->
            new ArmorItem(ModArmorMaterial.FABIBUM, EquipmentSlotType.CHEST, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<ArmorItem> FABIBUM_LEGGINGS = ITEMS.register("fabibum_leggings", () ->
            new ArmorItem(ModArmorMaterial.FABIBUM, EquipmentSlotType.LEGS, new Item.Properties().group(FriendsOres.TAB)));

    public static final RegistryObject<ArmorItem> FABIBUM_BOOTS = ITEMS.register("fabibum_boots", () ->
            new ArmorItem(ModArmorMaterial.FABIBUM, EquipmentSlotType.FEET, new Item.Properties().group(FriendsOres.TAB)));


    public static final RegistryObject<Item> FABIBUM = ITEMS.register("fabibum", ItemBase::new);

    public static final RegistryObject<Item> FABIBUM_ORE_ITEM = ITEMS.register("fabibum_ore",
            () -> new BlockItemBase(ModBlocks.FABIBUM_ORE.get()));
    public static final RegistryObject<Item> FABIBUM_ORE_NETHER_ITEM = ITEMS.register("fabibum_ore_nether",
            () -> new BlockItemBase(ModBlocks.FABIBUM_ORE_NETHER.get()));
    public static final RegistryObject<Item> FABIBUM_BLOCK_ITEM = ITEMS.register("fabibum_block",
            () -> new BlockItemBase(ModBlocks.FABIBUM_BLOCK.get()));

}