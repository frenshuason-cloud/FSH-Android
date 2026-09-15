package com.fsh.social;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;

import androidx.browser.customtabs.CustomTabsIntent;

public class MainActivity extends Activity {
    private static final String FSH_URL = "https://fsh-b0573c.v2.appdeploy.ai/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        openFsh();
    }

    private void openFsh() {
        Uri uri = Uri.parse(FSH_URL);
        CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder()
                .setShowTitle(true)
                .build();
        customTabsIntent.launchUrl(this, uri);
    }
}
