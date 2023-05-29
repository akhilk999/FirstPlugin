package org.akhilk999.firstplugin;

import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.*;
//.block.Block
//.block.BlockFace
import org.bukkit.entity.Player;
import org.bukkit.event.*;
//.event.EventHandler
//.event.Listener
import org.bukkit.event.player.PlayerMoveEvent;

public class PlayerMovementListener implements Listener { //Listeners react to events
    @EventHandler //ensures that plugin uses method as response to Player movement
    public void onPlayerMove(PlayerMoveEvent event){ //method reacts to player movement (from event)
        //stores the player that just moved
        Player p = event.getPlayer();
        //gets the block below the player
        Block b = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
        //creates an explosion (power 5) on the player's location
        if(b.getType() == Material.GRASS_BLOCK){
            World w = p.getWorld();
            w.createExplosion(p.getLocation(),5);
        }
    }
}
