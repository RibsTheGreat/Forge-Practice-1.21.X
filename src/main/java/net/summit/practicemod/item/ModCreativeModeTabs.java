package net.summit.practicemod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.summit.practicemod.PracticeMod;
import net.summit.practicemod.block.ModBlocks;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PracticeMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MARLITE_ITEMS_TAB = CREATIVE_MODE_TABS.register("marlite_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.MARLITE.get()))
                    .title(Component.translatable("creativetab.practicemod.marlite_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.MARLITE.get());
                        output.accept(ModItems.RAW_MARLITE.get());

                    }).build());

    public static final RegistryObject<CreativeModeTab> MARLITE_BLOCKS_TAB = CREATIVE_MODE_TABS.register("marlite_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MARLITE_BLOCK.get()))
                    .withTabsBefore(MARLITE_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.practicemod.marlite_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.MARLITE_BLOCK.get());
                        output.accept(ModBlocks.RAW_MARLITE_BLOCK.get());

                        output.accept(ModBlocks.MARLITE_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_MARLITE_ORE.get());

                    }).build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
