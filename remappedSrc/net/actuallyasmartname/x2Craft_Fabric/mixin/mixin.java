package net.actuallyasmartname.x2Craft_Fabric.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.actuallyasmartname.x2Craft_Fabric.item.items;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

@Mixin(PlayerEntity.class)
public abstract class mixin extends LivingEntity {

    @Inject(at = @At("HEAD"), method = "tick")
    private void tick(CallbackInfo info) {
        updatehelmet();
        updateChest();
        updateLeggings();
        updateBoots();

        if (!this.world.isClient) {
            updatehelmet();
            updateChest();
            updateLeggings();
            updateBoots();
        }
    }
    private void updatehelmet() {
        ItemStack helmetStack = this.getEquippedStack(EquipmentSlot.HEAD);
        if (helmetStack.getItem() == items.HARDENED_OBSIDIAN_HELMET) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2, 0, false, false, false));
        }
    }
    private void updateChest() {
        ItemStack chestStack = this.getEquippedStack(EquipmentSlot.CHEST);
        if (chestStack.getItem() == items.HARDENED_OBSIDIAN_CHESTPLATE) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2, 0, false, false, false));
        }
    }
    private void updateLeggings() {
        ItemStack leggingsStack = this.getEquippedStack(EquipmentSlot.LEGS);
        if (leggingsStack.getItem() == items.HARDENED_OBSIDIAN_LEGGINGS) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2, 0, false, false, false));
        }
    }
    private void updateBoots() {
        ItemStack bootsStack = this.getEquippedStack(EquipmentSlot.FEET);
        if (bootsStack.getItem() == items.HARDENED_OBSIDIAN_BOOTS) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 2, 0, false, false, false));
        }
    }
    
    protected mixin(EntityType<? extends LivingEntity> entityType, World world) {
        super(entityType, world);
    }

}