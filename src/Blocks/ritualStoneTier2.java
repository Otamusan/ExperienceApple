package Blocks;
import java.util.Random;

import ExperienceApple.eaMain;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockGlass;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
public class ritualStoneTier2 extends BlockGlass
{
    @SideOnly(Side.CLIENT)
    private IIcon TopIcon;

    @SideOnly(Side.CLIENT)
    private IIcon SideIcon;

    public ritualStoneTier2() {
        super(Material.ground,true);
        this.setCreativeTab(eaMain.tabAdd);
        this.setBlockName("RitualStoneTier2");
        this.setBlockBounds(0.125F,0.125F,0.125F,0.875F,0.875F,0.875F);
        this.setLightOpacity(1);
        this.setStepSound(soundTypeStone);
        this.setResistance(400F);
        this.setHardness(1.5F);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister par1IconRegister)
    {
        this.TopIcon = par1IconRegister.registerIcon("eamod:ritualStoneTier2");
        this.SideIcon = par1IconRegister.registerIcon("eamod:ritualStoneTier2");
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if(par1 == 0 || par1 == 1)
        {
            return TopIcon;
        }
        else
        {
            return SideIcon;
        }
    }

    public void randomDisplayTick(World world, int x, int y, int z, Random rnd)
    {
    	if (eaMain.particle==true) return;
    	for (int i = 0; i < 2; i++){
    		double rx = (double)((float)x +rnd.nextFloat());
        	double ry = (double)((float)y +rnd.nextFloat());
        	double rz = (double)((float)z +rnd.nextFloat());
        	world.spawnParticle("happyVillager",rx,ry,rz,0.0D,0.0D,0.0D);
    	}
    }
}