package com.example.attendura;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ContactDBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "contact_db";
    public static final int DATABASE_VERSION = 1;

    public static final String CREATE_TABLE = "create table "+ContactContract.ContactEntry.TABLE_NAME+"("+ContactContract.ContactEntry.CONTACT_DATE+" number,"+ContactContract.ContactEntry.ROLL_NUMBER+" Array,"+ContactContract.ContactEntry.ATTENDANCE+" Array);";
    public static final String DROP_TABLE = "drop table if exists "+ContactContract.ContactEntry.TABLE_NAME;

    public ContactDBHelper(Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(CREATE_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL(DROP_TABLE);
        onCreate(db);

    }
}
