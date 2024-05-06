package net.mcreator.pinguharveylmtmarvels.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.pinguharveylmtmarvels.item.IronManMark1Item;
import net.mcreator.pinguharveylmtmarvels.PingusharveymarvelMod;

import java.util.Map;

public class IronmanMark1BootsOnBlockRightClickedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				PingusharveymarvelMod.LOGGER.warn("Failed to load dependency world for procedure IronmanMark1BootsOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				PingusharveymarvelMod.LOGGER.warn("Failed to load dependency x for procedure IronmanMark1BootsOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				PingusharveymarvelMod.LOGGER.warn("Failed to load dependency y for procedure IronmanMark1BootsOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				PingusharveymarvelMod.LOGGER.warn("Failed to load dependency z for procedure IronmanMark1BootsOnBlockRightClicked!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				PingusharveymarvelMod.LOGGER.warn("Failed to load dependency entity for procedure IronmanMark1BootsOnBlockRightClicked!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		world.setBlockState(new BlockPos(x, y, z), Blocks.AIR.getDefaultState(), 3);
		if (entity instanceof LivingEntity) {
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).inventory.armorInventory.set((int) 0, new ItemStack(IronManMark1Item.boots));
			else
				((LivingEntity) entity).setItemStackToSlot(EquipmentSlotType.FEET, new ItemStack(IronManMark1Item.boots));
			if (entity instanceof ServerPlayerEntity)
				((ServerPlayerEntity) entity).inventory.markDirty();
		}
	}
}
