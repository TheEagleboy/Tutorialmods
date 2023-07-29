package net.kwock.tutorialmod.items;

import net.kwock.tutorialmod.TutorialMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TutorialMod.MOD_ID);

        public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TAB.register("tutorial_tab",
                () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.RED_RUBY.get()))
                        .title(Component.translatable("creativetab.tutorial_tab"))
                        .displayItems((pParameters, pOutput) ->{
                                pOutput.accept(ModItems.RED_RUBY.get());
                                pOutput.accept(ModItems.BLACK_OPAL.get());
                                pOutput.accept(Items.DIAMOND);
                        })
                        .build());

        public static void register(IEventBus eventBus){
                CREATIVE_MODE_TAB.register(eventBus);
        }
}

