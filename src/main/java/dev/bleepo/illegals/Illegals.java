package dev.bleepo.illegals;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public final class Illegals extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info(ChatColor.AQUA + "Loaded properly");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("stack")) {
            //gimme a minute
            Player player = (Player) sender;
            ItemStack item = player.getInventory().getItemInMainHand();
            item.setAmount(64);
            getLogger().info(ChatColor.AQUA + "EZZZ STACK"); //time to test

        }

        if (command.getName().equals("32k")) {
            //gimme a minute
            Player player = (Player) sender;
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getDisplayName() + " minecraft:diamond_sword 1 0 {ench:[{id:16,lvl:32767},{id:19,lvl:10},{id:20,lvl:32767},{id:21,lvl:10},{id:22,lvl:3},{id:34,lvl:32767},{id:70,lvl:1},{id:71,lvl:1}]}");
            getLogger().info(ChatColor.AQUA + "EZZZ 32KS"); //time to test

        }

        return true;
    }

}
