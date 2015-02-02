package com.compostela.curso.terremotosapp;


import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by mañá on 02/02/2015.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
}
