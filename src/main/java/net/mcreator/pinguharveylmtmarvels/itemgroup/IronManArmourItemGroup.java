
package net.mcreator.pinguharveylmtmarvels.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.pinguharveylmtmarvels.item.IronManMark1Item;
import net.mcreator.pinguharveylmtmarvels.PingusharveymarvelModElements;

@PingusharveymarvelModElements.ModElement.Tag
public class IronManArmourItemGroup extends PingusharveymarvelModElements.ModElement {
	public IronManArmourItemGroup(PingusharveymarvelModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabiron_man_armour") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(IronManMark1Item.body);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
