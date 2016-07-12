package com.EPIICTHUNDERCAT.NaturesGift.init;

import java.util.ArrayList;
import java.util.List;

import com.EPIICTHUNDERCAT.NaturesGift.item.BonemealNGItem;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItem;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItemFood;
import com.EPIICTHUNDERCAT.NaturesGift.item.NGItemSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGItems extends Items {
	public static List<Item> items = new ArrayList();
	public static Item NATURE_STICK = new NGItem("NATURE_STICK");
	public static Item GRASS_CLIPPINGS = new NGItem("GRASS_CLIPPINGS");
	public static Item GRASS_DOG = new NGItemFood("GRASS_DOG", 10, 0.6f, false);
	public static Item MAGICAL_NATURE_STICK = new BonemealNGItem("MAGICAL_NATURE_STICK");
	public static Item SEQS_SCEPTER = new NGItemSword("SEQS_SCEPTER", NGToolMaterials.GOO_ESSENCE);
	public static Item NATURE_INFUSED_STAR = new NGItem("NATURE_INFUSED_STAR");
	public static Item GOO_ESSENCE = new NGItem("GOO_ESSENCE");
	public static Item NATURE_CHIPS = new NGItem("NATURE_CHIPS");
	public static Item NATURE_INFESTED_SWORD = new NGItemSword("NATURE_INFESTED_SWORD", NGToolMaterials.NATURE_CHIPS);
	public static Item LIFE_CORE = new NGItem("LIFE_CORE");
	public static Item MOTOR = new NGItem("MOTOR");
	public static Item STONES = new NGItem("STONES");
	public static Item CLIPPERS = new NGItem("CLIPPERS");
	public static Item REDSTONE_WIRE = new NGItem("REDSTONE_WIRE");
	public static Item PINK_DIAMOND = new NGItem("PINK_DIAMOND");
	public static Item NATURE_ESSENCE = new NGItem("NATURE_ESSENCE");
	public static Item SKY_GEM = new NGItem("SKY_GEM");
	public static Item BARTZ_DAGGER = new NGItemSword("BARTZ_DAGGER", NGToolMaterials.SKY_GEM);
	public static Item BARTZ_WAND = new NGItemSword("BARTZ_WAND", NGToolMaterials.BARTZ_ESSENCE);
	public static Item BARTZ_ESSENCE = new NGItem("BARTZ_ESSENCE");
	public static Item HAMMER = new NGItem("HAMMER");
	public static Item BARTZ_INGOT = new NGItem("BARTZ_INGOT");
	public static Item MINI_MOTOR_BLADE = new NGItem("MINI_MOTOR_BLADE");
	public static Item HEAVY_BRANCH = new NGItem("HEAVY_BRANCH");
	public static Item SKY_ESSENCE = new NGItem("SKY_ESSENCE");
	public static Item PINK_DIAMOND_MOSSY_SHIELD = new NGItem("PINK_DIAMOND_MOSSY_SHIELD");

	private static List<Item> getItems() {
		return items;
	}

	public static void register(FMLPreInitializationEvent preEvent) {
		for (Item item : getItems()) {
			GameRegistry.register(item);
		}
	}

	public static void registerRender(FMLInitializationEvent event) {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		for (Item item : getItems()) {
			renderItem.getItemModelMesher().register(item, 0,
					new ModelResourceLocation(item.getRegistryName().toString(), "inventory"));
		}
	}

}