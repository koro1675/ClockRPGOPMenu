package clockrpg.jpn.ph;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class GUI {

    Inventory mainGUI = Bukkit.getServer().createInventory(null, 5);
    Inventory weaponGUI = Bukkit.getServer().createInventory(null, 5);
    Inventory armorGUI = Bukkit.getServer().createInventory(null, 5);
    Inventory playerGUI = Bukkit.getServer().createInventory(null, 5);


    public GUI() {

    }


    public Inventory getMainGUI() {
        return mainGUI;
    }

    public Inventory getArmorGUI() {
        return armorGUI;
    }

    public Inventory getWeaponGUI() {
        return weaponGUI;
    }

    public Inventory getPlayerGUI() {
        return playerGUI;
    }


    private void setupMainGUI() {
        ItemStack weaponIcon = new ItemStack(Material.IRON_SWORD);
        ItemStack armorIcon = new ItemStack(Material.IRON_CHESTPLATE);
        ItemStack playerIcon = new ItemStack(Material.SKULL_ITEM);
    }

    private void setupWeaponGUI() {

    }

    public void setupArmorGUI() {

    }

    public void setupPlayerGUI() {

    }
}
