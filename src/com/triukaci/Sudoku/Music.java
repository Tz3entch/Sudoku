package com.triukaci.Sudoku;

import android.content.Context;
import android.media.MediaPlayer;

public class Music {
    private static MediaPlayer mp = null;

    /** Остановка старой композиции и начало новой */
    public static void play(Context context, int resource) {
        stop(context);
// Начать проигрывать музыку только в том случае, если это не выключено в настройках
        if (Prefs.getMusic(context)) {
            mp = MediaPlayer.create(context, resource);
            mp.setLooping(true);
            mp.start();
        }
    }
    /*** Остановка проигрывания музыки*/
    public static void stop(Context context) {
        if (mp != null) {
            mp.stop();
            mp.release();
            mp = null;
        }
    }
}
