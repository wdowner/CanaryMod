package net.canarymod.api.inventory;

/**
 * This is a basic Item wrapper, not for Itemstack, but for Item
 *
 * @author Chris (damagefilter)
 * @author Jason (darkdiplomat)
 */
public class CanaryBaseItem implements BaseItem {

    private net.minecraft.item.Item item;

    /**
     * Constructs a new Item wrapper
     *
     * @param item
     *         the Item to wrap
     */
    public CanaryBaseItem(net.minecraft.item.Item item) {
        this.item = item;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxStackSize() {
        return item.j();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getMaxDamage() {
        return item.l();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setMaxDamage(int damage) {
        item.c(damage);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDamageable() {
        return item.m();
    }

}
