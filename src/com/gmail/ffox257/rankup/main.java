package com.gmail.ffox257.rankup;

import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.chat.hover.content.Text;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;


public class main extends JavaPlugin {
    public static main instance;
    static Plugin plugin;
    public static PluginManager pm = Bukkit.getPluginManager();
    private Economy Econ;

    public void onEnable() {
        instance = this;
        plugin = this;
        pm.registerEvents(new ChatListener(), this);
        this.getLogger().info("Version:0.1 Made by " + this.getDescription().getAuthors());
    }

    public void onDisable() {
    }

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if (s instanceof Player p) {
            if (cmd.getName().equalsIgnoreCase("winton")) {
                TextComponent Mes;
                String prefix = "&bWinton&r: ";
                if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
                    ArrayList<TextComponent> msg = new ArrayList<>();
                    Mes = new TextComponent(ChatColor.translateAlternateColorCodes('&', prefix + "Version:0.1 Made by " + this.getDescription().getAuthors()));
                    Mes.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("Click to open dev page")));
                    Mes.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "https://www.spigotmc.org/members/jerzean.67685/"));
                    msg.add(Mes);
                    Mes = new TextComponent("");
                    msg.add(Mes);
                    Mes = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Discord"));
                    Mes.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new Text("§fClick me to join the discord")));
                    Mes.setClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, "/psbuy bedrock"));
                    msg.add(Mes);
                    try {
                        for (TextComponent i : msg) {
                            p.spigot().sendMessage(i);
                        }
                    } catch (ArrayIndexOutOfBoundsException ignored) {

                    }
                    return true;
                }
            }
        }
        return false;
    }
}