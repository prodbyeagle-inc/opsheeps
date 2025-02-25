package com.chilllounge.opsheeps.item;

import com.chilllounge.opsheeps.Opsheeps;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OpSheepsItemGroups {

	public static final RegistryKey<ItemGroup> SUPER_ITEM_GROUP_KEY = RegistryKey.of(
			Registries.ITEM_GROUP.getKey(),
			Identifier.of(Opsheeps.MOD_ID, "super_items")
	);

	public static final ItemGroup SUPER_ITEM_GROUP = Registry.register(
			Registries.ITEM_GROUP,
			SUPER_ITEM_GROUP_KEY.getValue(),
			FabricItemGroup.builder()
					.icon(() -> new ItemStack(OpSheepsItems.SUPER_DYE))
					.displayName(Text.translatable("itemgroups.opsheeps.super_items"))
					.entries((displayContext, entries) -> {
						entries.add(OpSheepsItems.SUPER_DYE);
						entries.add(OpSheepsItems.SUPER_SHEAR_V69);
						entries.add(OpSheepsItems.SUPER_SHEAR_V1);
						entries.add(OpSheepsItems.SUPER_SHEAR_V2);
						entries.add(OpSheepsItems.SUPER_SHEAR_V3);
						entries.add(OpSheepsItems.SUPER_SHEAR_V4);
						entries.add(OpSheepsItems.SUPER_SHEAR_V5);
						entries.add(OpSheepsItems.GROW_BACK);

						entries.add(OpSetLoot.OP_HELMET);
						entries.add(OpSetLoot.OP_CHESTPLATE);
						entries.add(OpSetLoot.OP_LEGGINGS);
						entries.add(OpSetLoot.OP_BOOTS);

						entries.add(OpSetLoot.OP_SWORD);
						entries.add(OpSetLoot.OP_AXE);
						entries.add(OpSetLoot.OP_PICKAXE);
						entries.add(OpSetLoot.OP_SHOVEL);
						entries.add(OpSetLoot.OP_HOE);
					})
					.build()
	);

	public static void registerItemGroups() {
		Opsheeps.LOGGER.info("🐑 REGISTER ITEMGROUPS");
	}
}