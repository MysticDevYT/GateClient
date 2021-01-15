package com.thef1xer.gateclient.managers;

import com.thef1xer.gateclient.modules.EnumModuleCategory;
import com.thef1xer.gateclient.modules.Module;
import com.thef1xer.gateclient.modules.combat.KillAura;
import com.thef1xer.gateclient.modules.movement.Sprint;
import com.thef1xer.gateclient.modules.player.Freecam;
import com.thef1xer.gateclient.modules.render.*;

import java.util.ArrayList;
import java.util.List;

public class ModuleManager {
    public List<Module> moduleList = new ArrayList<>();

    public void init() {
        //Combat
        moduleList.add(new KillAura());
        //Movement
        moduleList.add(new Sprint());
        //Player
        moduleList.add(new Freecam());
        //Render
        moduleList.add(new StorageESP());
        moduleList.add(new FullBright());
        moduleList.add(new HUDController());
        moduleList.add(new Tracers());
        moduleList.add(new XRay());
    }

    public List<Module> getModuleByCategory(EnumModuleCategory category) {
        List<Module> list = new ArrayList<>();
        for (Module module : moduleList) {
            if (module.getModuleCategory() == category) {
                list.add(module);
            }
        }
        return list;
    }
}
