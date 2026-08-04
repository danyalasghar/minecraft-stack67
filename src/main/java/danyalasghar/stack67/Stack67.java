package danyalasghar.stack67;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.DefaultItemComponentEvents;
import net.minecraft.core.component.DataComponents;

public class Stack67 implements ModInitializer {
	@Override
	public void onInitialize() {
		DefaultItemComponentEvents.MODIFY.register(context -> context.modify(
                item -> item.components().getOrDefault(DataComponents.MAX_STACK_SIZE, 64) == 64,
                (builder, item) -> builder.set(DataComponents.MAX_STACK_SIZE, 67)
        ));
	}

}
