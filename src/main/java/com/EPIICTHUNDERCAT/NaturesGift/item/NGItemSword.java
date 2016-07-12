package com.EPIICTHUNDERCAT.NaturesGift.item;

import com.EPIICTHUNDERCAT.NaturesGift.init.NGItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.translation.I18n;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class NGItemSword extends ItemSword {
	public NGItemSword(String name, ToolMaterial material) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name.toLowerCase());
		addToItems(this);
		this.setCreativeTab(CreativeTabs.COMBAT);
	}

	@Override
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);
		if (target instanceof EntityLivingBase) {
			if (stack.getItem() == NGItems.SEQS_SCEPTER) {
				((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.SLOWNESS, 180, 4, false, true));
			} else if (stack.getItem() == NGItems.NATURE_INFESTED_SWORD) {
				((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.POISON, 180, 3, false, true));
			} else if (stack.getItem() == NGItems.BARTZ_DAGGER) {
				((EntityLivingBase) target).addPotionEffect(new PotionEffect(MobEffects.WITHER, 10, 2, false, true));
			} else if (stack.getItem() == NGItems.BARTZ_WAND) {
				((EntityLivingBase) target)
						.addPotionEffect(new PotionEffect(MobEffects.LEVITATION, 200, 3, false, true));
			}
		}
		return true;
	}

	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		if (toRepair.getItem() == NGItems.SEQS_SCEPTER) {
			return repair.getItem() == NGItems.GOO_ESSENCE;
		} else if (toRepair.getItem() == NGItems.NATURE_INFESTED_SWORD) {
			return repair.getItem() == NGItems.NATURE_CHIPS;
		} else if (toRepair.getItem() == NGItems.BARTZ_DAGGER) {
			return repair.getItem() == NGItems.SKY_GEM;
		} else if (toRepair.getItem() == NGItems.BARTZ_WAND) {
			return repair.getItem() == NGItems.BARTZ_ESSENCE;
		}

		return false;
	}

	@Override
	public String getItemStackDisplayName(ItemStack stack) {
		return (TextFormatting.BLUE + I18n.translateToLocal(this.getUnlocalizedNameInefficiently(stack) + ".name"))
				.trim();
	}

	private void addToItems(Item item) {

		NGItems.items.add(item);

	}

}