package net.radient.gems.world;




    import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
    import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
    import net.radient.gems.Gems;

    import java.util.List;

    public class ModPlacedFeatures {
        public static final RegistryKey<PlacedFeature> SAPPHIRE_ORE_PLACED_KEY = registerKey("sapphire_ore_placed");
        public static final RegistryKey<PlacedFeature> RUBY_ORE_PLACED_KEY = registerKey("ruby_ore_placed");
        public static final RegistryKey<PlacedFeature> GALAXIUM_ORE_PLACED_KEY = registerKey("galaxium_ore_placed");

        public static void boostrap(Registerable<PlacedFeature> context) {
            var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

            register(context, SAPPHIRE_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.SAPPHIRE_ORE_KEY),
                    ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));


            register(context, RUBY_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.RUBY_ORE_KEY),
                    ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));


            register(context, GALAXIUM_ORE_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GALAXIUM_ORE_KEY),
                    ModOrePlacement.modifiersWithCount(2, // Veins per Chunk
                            HeightRangePlacementModifier.uniform(YOffset.fixed(-80), YOffset.fixed(80))));
        }

        public static RegistryKey<PlacedFeature> registerKey(String name) {
            return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(Gems.MOD_ID, name));
        }

        private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration,
                                     List<PlacementModifier> modifiers) {
            context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
        }
}
