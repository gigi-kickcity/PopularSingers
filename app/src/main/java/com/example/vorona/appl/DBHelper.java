package com.example.vorona.appl;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {

    final static public String DATABASE = "Singer_base";

    public DBHelper(Context context) {
        super(context, DATABASE, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("create table Favorites ("
                + "local_id integer primary key autoincrement,"
                + "id integer,"
                + "name text,"
                + "bio text,"
                + "albums integer,"
                + "tracks integer,"
                + "cover text,"
                + "genres text,"
                + "cover_small text"
                +");");

        db.execSQL("create table Recent ("
                + "local_id integer primary key autoincrement,"
                + "id integer,"
                + "name text,"
                + "bio text,"
                + "albums integer,"
                + "tracks integer,"
                + "cover text,"
                + "genres text,"
                + "cover_small text"
                +");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}