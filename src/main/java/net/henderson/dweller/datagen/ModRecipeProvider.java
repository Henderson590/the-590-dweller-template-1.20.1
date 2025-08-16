package net.henderson.dweller.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.henderson.dweller.block.ModBlocks;
import net.henderson.dweller.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> INFECTION_CRAFTABLE = List.of(ModItems.GLOB_OF_INFECTION,
            ModBlocks.INFECTION_BLOCK);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.GLOB_OF_INFECTION, RecipeCategory.DECORATIONS,
                ModBlocks.INFECTION_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.INFECTED_STEAK, 1)
                .pattern("GGG")
                .pattern("GSG")
                .pattern("GGG")
                .input('G', ModItems.GLOB_OF_INFECTION)
                .input('S', Items.COOKED_BEEF)
                .criterion(hasItem(ModItems.GLOB_OF_INFECTION), conditionsFromItem(ModItems.GLOB_OF_INFECTION))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.INFECTED_STEAK)));



        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_DOOR, 2)
                .pattern("II ")
                .pattern("II ")
                .pattern("II ")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_DOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_BUTTON, 2)
                .pattern("I  ")
                .pattern("   ")
                .pattern("   ")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_BUTTON)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_FENCE, 2)
                .pattern("   ")
                .pattern("III")
                .pattern("I I")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_FENCE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_FENCE_GATE, 2)
                .pattern("   ")
                .pattern("I I")
                .pattern("III")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_FENCE_GATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_STAIRS, 2)
                .pattern("I  ")
                .pattern("II ")
                .pattern("III")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_STAIRS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_SLAB, 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("III")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_SLAB)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_WALL, 2)
                .pattern("   ")
                .pattern("III")
                .pattern("III")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_WALL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_TRAPDOOR, 2)
                .pattern("   ")
                .pattern("II ")
                .pattern("II ")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_TRAPDOOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.INFECTED_PRESSURE_PLATE, 2)
                .pattern("   ")
                .pattern("   ")
                .pattern("II ")
                .input('I', ModBlocks.INFECTION_BLOCK)
                .criterion(hasItem(ModBlocks.INFECTION_BLOCK), conditionsFromItem(ModBlocks.INFECTION_BLOCK))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.INFECTED_PRESSURE_PLATE)));
    }
}
