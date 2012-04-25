package net.minecraft.src;

public class RenderWolf extends RenderLiving
{
    public RenderWolf(ModelBase par1ModelBase, float par2)
    {
        super(par1ModelBase, par2);
    }

    public void renderWolf(EntityWolf par1EntityWolf, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRenderLiving(par1EntityWolf, par2, par4, par6, par8, par9);
    }

    protected float getTailRotation(EntityWolf par1EntityWolf, float par2)
    {
        return par1EntityWolf.getTailRotation();
    }

    protected void func_25006_b(EntityWolf entitywolf, float f)
    {
    }

    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void preRenderCallback(EntityLiving par1EntityLiving, float par2)
    {
        func_25006_b((EntityWolf)par1EntityLiving, par2);
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityLiving par1EntityLiving, float par2)
    {
        return getTailRotation((EntityWolf)par1EntityLiving, par2);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        renderWolf((EntityWolf)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        renderWolf((EntityWolf)par1Entity, par2, par4, par6, par8, par9);
    }
}
