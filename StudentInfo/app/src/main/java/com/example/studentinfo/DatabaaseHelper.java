package com.example.studentinfo;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

public class DatabaaseHelper extends SQLiteOpenHelper {



    public DatabaaseHelper(Context context){
        super (context, "Student.db", null, 1);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL ("create table Studentdetails(id TEXT primary key, name TEXT, address TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL ("DROP Table if exists Studentdetails");
    }

    public Boolean insertstudentdata(String id, String name, String address) {
        SQLiteDatabase db = this.getWritableDatabase ();
        ContentValues contentValues = new ContentValues ();
        contentValues.put("id", id);
        contentValues.put("name", name);
        contentValues.put("address", address);
        long result=db.insert( "Studentdetails", null, contentValues);
        if (result== -1){
            return false;
        }else{
            return true;

        }
    }

    public Boolean insertupdatedata(String id, String name, String address) {
        SQLiteDatabase db = this.getWritableDatabase ();
        ContentValues contentValues = new ContentValues ();
        contentValues.put("id", id);
        contentValues.put("name", name);
        contentValues.put("address", address);
        Cursor cursor = db.rawQuery ("select * from Studentdetails where id =?", new String[]{id});
        if (cursor.getCount ()>0) {
            long result = db.update ("Studentdetails", contentValues, "id=?", new String[]{id});
            if (result == -1) {
                return false;
            } else {
                return true;
            }
        }else {
            return false;

        }
    }

        public Boolean insertdeletetdata(String id) {
            SQLiteDatabase db = this.getWritableDatabase ();
            Cursor cursor = db.rawQuery ("select * from Studentdetails where id =?", new String[]{id});
            if (cursor.getCount ()>0){
                long result = db.delete ("Studentdetails","id=?",new String[]{id});
                if (result == -1) {
                    return false;
                } else {
                    return true;
                }
            }else {
                return false;
            }
        }


        public Cursor getdata() {
                SQLiteDatabase db = this.getWritableDatabase ();
                Cursor cursor = db.rawQuery ("select * from Studentdetails", null);
                return cursor;
            }
    }
