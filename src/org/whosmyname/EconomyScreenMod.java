package org.whosmyname;

// Absolute Chads:
// https://fractalsoftworks.com/forum/index.php?topic=6809.0
// https://starsector.fandom.com/wiki/Modding#Economy
// Wisp
// Examples:
// https://fractalsoftworks.com/forum/index.php?topic=16490.0
//    at com.fs.starfarer.campaign.command.OutpostItemRow.renderImpl(Unknown Source)
//   at com.fs.starfarer.ui.Q.render(Unknown Source)



// find some OSS mod that opens a window
// Reference: https://fractalsoftworks.com/starfarer.api


import com.fs.starfarer.api.BaseModPlugin;

public class EconomyScreenMod extends BaseModPlugin {

    @Override
    public void onEnabled(boolean wasEnabledBefore){
        System.out.println("TEST!");
        if (wasEnabledBefore) // seems like all is well
            return;

        // create the settings file
        //??????????
        super.onEnabled(wasEnabledBefore);
    }

    public void	onGameLoad(boolean newGame){
        // load the config file
        // instantiate the screen

        super.onGameLoad(newGame);
    }
    @Override
    public void onApplicationLoad() throws Exception {
        super.onApplicationLoad();
    }

    @Override
    public void onNewGame() {
        super.onNewGame();
    }

}
