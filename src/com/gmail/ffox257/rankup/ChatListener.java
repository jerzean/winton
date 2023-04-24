package com.gmail.ffox257.rankup;

import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static com.gmail.ffox257.rankup.main.plugin;

public class ChatListener implements Listener {
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onPlayerChat(PlayerChatEvent e) {
        if (e.getMessage().toLowerCase().contains("winton")) {
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
                @Override
                public void run(){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": This will protect us \",\"color\":\"white\"},{\"text\":\"\\u2b24\",\"bold\":true,\"color\":\"aqua\"}]");
                }
            }, 10L);
        } else if (e.getMessage().toLowerCase().contains("meownod")) {
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable(){
                @Override
                public void run(){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\"yes\"}]");
                }
            }, 10L);
        }
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public  void onPlayerJoinEvent(PlayerJoinEvent e) {
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
            @Override
            public void run(){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\"Excuse me for.. dropping in.\"}]");
            }
        }, 10L);

    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public  void onPlayerLeaveEvent(PlayerQuitEvent e) {
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
            @Override
            public void run(){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\"I hope I didn't upset anyone.\"}]");
            }
        }, 10L);

    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void  onPlayerLeaveEvent(PlayerDeathEvent e){
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
            @Override
            public void run(){
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\"Critical hit!\"}]");
            }
        }, 10L);
    }
    @EventHandler(priority = EventPriority.HIGHEST)
    public void onEntityspawn(EntitySpawnEvent e){
        if (e.getEntity().getType() == EntityType.WARDEN) {
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
                @Override
                public void run(){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\" I calculate our chance of survival at 2.33%, repeating of course.\"}]");
                }
            }, 10L);
        } else if (e.getEntity().getType() == EntityType.ENDER_DRAGON) {
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
                @Override
                public void run(){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\" Is this really a good idea?\"}]");
                }
            }, 10L);
        } else if (e.getEntity().getType() == EntityType.WITHER) {
            Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(Bukkit.getPluginManager().getPlugin("Winton"), new Runnable(){
                @Override
                public void run(){
                    Bukkit.dispatchCommand(Bukkit.getConsoleSender(),"tellraw @a [\"\",{\"text\":\"Winton\",\"color\":\"aqua\"},{\"text\":\": \",\"color\":\"white\"},{\"text\":\" Houston, uh... we have a problem.\"}]");
                }
            }, 10L);
        }

    }
}


