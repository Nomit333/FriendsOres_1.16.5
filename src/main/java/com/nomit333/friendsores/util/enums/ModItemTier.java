package com.nomit333.friendsores.util.enums;

import com.nomit333.friendsores.init.ModItems;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ModItemTier implements IItemTier {
    Lindroid(3,1550,6.0F,2.5F,14, () -> {
        return Ingredient.fromItems(ModItems.LINDROID.get());
    }),
    FABIBUM(3,1561,9.0F,6.0F,15, () -> {
        return Ingredient.fromItems(ModItems.FABIBUM.get());
    });

    private final int harvestlevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackdamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterial;

    ModItemTier(int harvestlevel, int maxUses, float efficiency, float attackdamage, int enchantability, Supplier<Ingredient> repairMaterial) {
        this.harvestlevel = harvestlevel;
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackdamage = attackdamage;
        this.enchantability = enchantability;
        this.repairMaterial = repairMaterial;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackdamage;
    }

    @Override
    public int getHarvestLevel() {
        return harvestlevel;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMaterial.get();
    }
}