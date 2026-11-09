package bz.mine.truebalance;


import bz.mine.truebalance.enchants.IceAspectEnchant;
import us.to.midensthings.nouveauEnchanting.NouveauEnchanting;
import us.to.midensthings.nouveauEnchanting.addons.CustomEnchantment;
import us.to.midensthings.nouveauEnchanting.addons.NouveauEnchantingAddon;

import java.util.ArrayList;
import java.util.List;

public class ExampleAddon implements NouveauEnchantingAddon {

    List<CustomEnchantment> enchants;

    public ExampleAddon() {
        enchants = new ArrayList<>();
        enchants.add(new IceAspectEnchant());
    }

    @Override
    public void onEnable(NouveauEnchanting plugin) {

    }

    @Override
    public void onDisable() {

    }

    @Override
    public List<CustomEnchantment> getEnchantments() {

        return enchants;
    }

}
