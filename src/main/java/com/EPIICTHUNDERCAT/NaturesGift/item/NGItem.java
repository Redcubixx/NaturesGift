package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class NGItem extends Item {

	public NGItem(String name) {
		this.setRegistryName(name);
		this.setUnlocalizedName(name.toLowerCase());
		this.setCreativeTab(CreativeTabs.MISC);
		addToItems(this);
	}

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}
}