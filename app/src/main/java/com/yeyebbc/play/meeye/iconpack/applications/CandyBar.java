package com.yeyebbc.play.meeye.iconpack.applications;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    @NonNull
    @Override
    public Configuration onInit() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);
        //configuration.setHomeGridStyle(GridStyle.FLAT);
        //configuration.setAboutStyle(Style.PORTRAIT_FLAT_LANDSCAPE_FLAT);
        configuration.setShowTabIconsCount(false);
        configuration.setNavigationIcon(NavigationIcon.STYLE_3);

        /*ShadowOptions options = new ShadowOptions();
        options.setCardEnabled(false);
        configuration.setShadowEnabled(options);*/

        /*configuration.setWallpaperJsonStructure(
                new JsonStructure.Builder("wallpapers")
                        .name("Meeye Wallpapers")
                        .author("YeyeBBC")
                        .url("url")
                        .thumbUrl("thumbUrl")
                        .build());*/


        //initApplication(configuration);

        return configuration;
    }
}
