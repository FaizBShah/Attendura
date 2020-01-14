package com.example.attendura;

import android.content.Context;

public class ContactContract
{
    private ContactContract()
    {
    }

    public static class ContactEntry
    {
        public static final String TABLE_NAME = "contact_info";
        public static final String CONTACT_DATE = "date";
        public static final String ROLL_NUMBER = "roll_no";
        public static final String ATTENDANCE = "attendance";
    }
}
