package com.apples.test_quilt_mod

import org.quiltmc.loader.api.ModContainer
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object MainMod : ModInitializer {
    val LOGGER: Logger = LoggerFactory.getLogger("Example Mod")
    val TEST_ITEM: Item = Item(itemSettingsOf(group = ItemGroup.MISC))
    
    override fun onInitialize(mod: ModContainer) {
        LOGGER.info("Hello Quilt world from {}!", mod.metadata()?.name())
        
        registryScope(mod.metadata().id()) {
            TEST_ITEM withPath "test_item" toRegistry Registry.ITEM
        }
    }
}
