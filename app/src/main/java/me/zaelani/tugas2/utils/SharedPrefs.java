package me.zaelani.tugas2.utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefs
{
    private static SharedPreferences mSharedPref;
    public static final String NAME = "NAME";
    public static final String BLOOD_TYPE = "BLOOD_TYPE";

    private SharedPrefs()
    {

    }

    public static void init(Context context)
    {
        if(mSharedPref == null)
            mSharedPref = context.getSharedPreferences(context.getPackageName(), Activity.MODE_PRIVATE);
    }

    public static void saveName(String name) {
        write(NAME, name);
    }

    public static String getName() {
        return read(NAME, "Unknown");
    }

    public static void saveBloodType(String bloodType) {
        write(BLOOD_TYPE, bloodType);
    }

    public static String getBloodTpe() {
        return read(BLOOD_TYPE, "Unknown");
    }

    public static String read(String key, String defValue) {
        return mSharedPref.getString(key, defValue);
    }

    public static void write(String key, String value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putString(key, value);
        prefsEditor.commit();
    }

    public static boolean read(String key, boolean defValue) {
        return mSharedPref.getBoolean(key, defValue);
    }

    public static void write(String key, boolean value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putBoolean(key, value);
        prefsEditor.commit();
    }

    public static Integer read(String key, int defValue) {
        return mSharedPref.getInt(key, defValue);
    }

    public static void write(String key, Integer value) {
        SharedPreferences.Editor prefsEditor = mSharedPref.edit();
        prefsEditor.putInt(key, value).commit();
    }
}