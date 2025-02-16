package net.summit.practicemod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.summit.practicemod.PracticeMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, PracticeMod.MOD_ID);

    public static final RegistryObject<Item> MARLITE = ITEMS.register("marlite", () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_MARLITE = ITEMS.register("raw_marlite", () -> new Item(new Item.Properties()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
