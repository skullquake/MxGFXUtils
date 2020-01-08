package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(gfxutils.actions.ja_acos.class);
    registrator.registerUserAction(gfxutils.actions.ja_and.class);
    registrator.registerUserAction(gfxutils.actions.ja_asin.class);
    registrator.registerUserAction(gfxutils.actions.ja_atan.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_circle.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_crt.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_fill_rgb.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_fill_rgba.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_get.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_hline.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_line.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_lst.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_putpixel_rgb.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_putpixel_rgba.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_rm.class);
    registrator.registerUserAction(gfxutils.actions.ja_bufferedimage_vline.class);
    registrator.registerUserAction(gfxutils.actions.ja_cos.class);
    registrator.registerUserAction(gfxutils.actions.ja_lsh.class);
    registrator.registerUserAction(gfxutils.actions.ja_perlin.class);
    registrator.registerUserAction(gfxutils.actions.ja_rsh.class);
    registrator.registerUserAction(gfxutils.actions.ja_sin.class);
    registrator.registerUserAction(gfxutils.actions.ja_tan.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
