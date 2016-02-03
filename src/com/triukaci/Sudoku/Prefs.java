package com.triukaci.Sudoku;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
public class Prefs extends PreferenceActivity {
    // Ќазвани€ параметров и значени€ по умолчанию
    private static final String OPT_MUSIC = "music" ;
    private static final boolean OPT_MUSIC_DEF = true;
    private static final String OPT_HINTS = "hints" ;
    private static final boolean OPT_HINTS_DEF = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.settings);
    }
    /** ѕолучить текущее значение дл€ музыкального параметра */
    public static boolean getMusic(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(OPT_MUSIC, OPT_MUSIC_DEF);
    }
    /** ѕолучить текущее значение дл€ параметра подсказок */
    public static boolean getHints(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context)
                .getBoolean(OPT_HINTS, OPT_HINTS_DEF);
    }
}