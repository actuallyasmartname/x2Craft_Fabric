package net.actuallyasmartname.x2Craft_Fabric.potion;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import net.actuallyasmartname.mixin.*;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class potionregistry {
    public static String MODID = "x2craft";
	private static final Collection<RecipeInit> RECIPES = new ArrayList<RecipeInit>();
	
	public static final Potion HASTE = register("haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 2 * 60 * 20)), Items.GLISTERING_MELON_SLICE, Potions.SWIFTNESS);
	public static final Potion LONG_HASTE = register("long_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 4 * 60 * 20)));
	public static final Potion STRONG_HASTE = register("strong_haste", new Potion(new StatusEffectInstance(StatusEffects.HASTE, 60 * 20, 1)));

	
	public static final Potion UNLUCKINESS = register("unluckiness", new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 6000)), Items.FERMENTED_SPIDER_EYE, Potions.LUCK);
	public static final Potion LONG_UNLUCKINESS = register("long_unluckiness", new Potion(new StatusEffectInstance(StatusEffects.UNLUCK, 4 * 60 * 20)));

	public static final Potion HEALTH_BOOST = register("health_boost", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 2 * 60 * 20)), Items.GLISTERING_MELON_SLICE, Potions.REGENERATION);
	public static final Potion LONG_HEALTH_BOOST = register("long_health_boost", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 4 * 60 * 20)));
	public static final Potion STRONG_HEALTH_BOOST = register("strong_health_boost", new Potion(new StatusEffectInstance(StatusEffects.HEALTH_BOOST, 60 * 20, 1)));

	public static final Potion ABSORPTION = register("absorption", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 2 * 60 * 20, 1)), Items.GOLDEN_CARROT, Potions.AWKWARD);
	public static final Potion LONG_ABSORPTION = register("long_absorption", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 4 * 60 * 20, 1)));
	public static final Potion STRONG_ABSORPTION = register("strong_absorption", new Potion(new StatusEffectInstance(StatusEffects.ABSORPTION, 1 * 60 * 20, 3)));
	
	public static void initialize() {
		RECIPES.forEach(RecipeInit::init);
		mappotion(Potions.AWKWARD, Items.EMERALD, Potions.LUCK);
	}
	
	private static Potion register(String id, Potion potion) {
		return Registry.register(Registry.POTION, new Identifier(MODID, id), potion);
	}
	
	private static Potion register(String id, Potion potion, Item ingredient, Potion from) {
		RECIPES.add(new RecipeInit(from, ingredient, potion));
		return Registry.register(Registry.POTION, new Identifier(MODID, id), potion);
	}
	
	private static void mappotion(Potion in, Item ingredient, Potion result) {
		Identifier potionInId = Registry.POTION.getId(in);
		Identifier potionOutId = Registry.POTION.getId(result);
		Optional<Potion> inLong = Registry.POTION.getOrEmpty(new Identifier(potionInId.getNamespace(), "long_" + potionInId.getPath()));
		Optional<Potion> inStrong = Registry.POTION.getOrEmpty(new Identifier(potionInId.getNamespace(), "strong_" + potionInId.getPath()));
		Optional<Potion> outLong = Registry.POTION.getOrEmpty(new Identifier(potionOutId.getNamespace(), "long_" + potionOutId.getPath()));
		Optional<Potion> outStrong = Registry.POTION.getOrEmpty(new Identifier(potionOutId.getNamespace(), "strong_" + potionOutId.getPath()));
		if(outLong.isPresent() && inLong.isPresent()) {
			BrewingRecipeRegistryAccessor.invokeRegisterPotionRecipe(inLong.get(), ingredient, outLong.get());
		}
		if(outStrong.isPresent() && inStrong.isPresent()) {
			BrewingRecipeRegistryAccessor.invokeRegisterPotionRecipe(inStrong.get(), ingredient, outStrong.get());
		}
		BrewingRecipeRegistryAccessor.invokeRegisterPotionRecipe(in, ingredient, result);
	}
	
	private static void Recipevariant(Potion potion) {
		Identifier id = Registry.POTION.getId(potion);
		Optional<Potion> lengthy = Registry.POTION.getOrEmpty(new Identifier(id.getNamespace(), "long_" + id.getPath()));
		Optional<Potion> strong = Registry.POTION.getOrEmpty(new Identifier(id.getNamespace(), "strong_" + id.getPath()));
		if(lengthy.isPresent()) {
			BrewingRecipeRegistryAccessor.invokeRegisterPotionRecipe(potion, Items.REDSTONE, lengthy.get());
		}
		if(strong.isPresent()) {
			BrewingRecipeRegistryAccessor.invokeRegisterPotionRecipe(potion, Items.GLOWSTONE_DUST, strong.get());
		}
	}
	
	private static class RecipeInit {
		
		private final Potion in;
		private final Item ingredient;
		private final Potion result;
		
		private RecipeInit(Potion in, Item ingredient, Potion result) {
			this.in = in;
			this.ingredient = ingredient;
			this.result = result;
		}
		
		public void init() {
			mappotion(in, ingredient, result);
			Recipevariant(result);
		}
	}
}