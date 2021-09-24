package com.nomit333.friendsores.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OregenConfig {

    public static ForgeConfigSpec.BooleanValue FO_generate_overworld;
    public static ForgeConfigSpec.BooleanValue FO_generate_nether;
    public static ForgeConfigSpec.BooleanValue LO_generate_overworld;

    public static void init(ForgeConfigSpec.Builder server, ForgeConfigSpec.Builder client) {
        server.comment("Oregen Config");

        FO_generate_overworld = server
                .comment("Disables the Spawing of the Fabibum Ore in the Overworld if the Value is false instead of true")
                .translation("friendsores.configgui.FO_generate_overworld")
                .define("oregen.FO_generate_overworld", true);

        FO_generate_nether = server
                .comment("Disables the Spawing of the Fabibum Ore in the Nether if the Value is false instead of true")
                .translation("friendsores.configgui.FO_generate_nether")
                .define("oregen.FO_generate_nether", true);

        LO_generate_overworld = server
                .comment("Disables the Spawing of the Lindroid Ore in the Overworld if the Value is false instead of true")
                .translation("friendsores.configgui.LO_generate_overworld")
                .define("oregen.LO_generate_overworld", true);
    }
}