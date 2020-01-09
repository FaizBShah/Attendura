package com.example.attendura;

import android.content.Context;

public class ContactContract
{
    private ContactContract()
    {
    }

    public static class ContactEntry extends SharedPreferenceConfig
    {
        int getF_roll = super.readFirstRoll();
        int getL_roll = super.readLastRoll();

        public static final String TABLE_NAME = "contact_info";
        public static final String CONTACT_DATE = "date";
    }
}
