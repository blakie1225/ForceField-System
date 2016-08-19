package com.blake.forcefieldsystem;

import com.blake.forcefieldsystem.proxy.CommonProxy;
import cpw.mods.fml.common.FMLLog;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;

import static cpw.mods.fml.common.Mod.*;

@Mod(modid = Reference.MODID, name = Reference.MODNAME, version = Reference.VERSION)
public class Main {

    @Instance(Reference.MODID)
    public static Main instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY, serverSide= Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        FMLLog.getLogger().log(Level.INFO, "YAY FORCEFIELDS!");

        proxy.Renders();

    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        FMLLog.getLogger().log(Level.INFO, "YAY FORCEFIELDS!");

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        FMLLog.getLogger().log(Level.INFO, "YAY FORCEFIELDS!");

    }
}
