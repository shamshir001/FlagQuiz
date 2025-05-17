package com.techmania.flagquiz.database

import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.util.Log
import com.techmania.flagquiz.model.FlagsModel
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper

class FlagsDao{

    fun getRandomTenRecords(helper: DatabaseCopyHelper): ArrayList<FlagsModel>{

        val recordList = ArrayList<FlagsModel>()
            val database: SQLiteDatabase = helper.writableDatabase            //writableDatabase
            val cursor: Cursor =
                database.rawQuery("SELECT * FROM flag ORDER BY RANDOM()", null)

            val idIndex = cursor.getColumnIndex("flag_Id")
            val countryNameIndex = cursor.getColumnIndex("country_name")
            val flagNameIndex = cursor.getColumnIndex("flag_name")

        while(cursor.moveToNext()){

            val record = FlagsModel(
                cursor.getInt(idIndex),
                cursor.getString(countryNameIndex),
                cursor.getString(flagNameIndex)
            )
            recordList.add(record)
        }

        cursor.close()
        return recordList
    }

    fun getRandomThreeRecords(helper: DatabaseCopyHelper, id: Int): ArrayList<FlagsModel>{

        val recordList = ArrayList<FlagsModel>()
        val database: SQLiteDatabase = helper.writableDatabase
        val cursor: Cursor = database.rawQuery("SELECT * FROM flag WHERE flag_Id != ? ORDER BY RANDOM() LIMIT 3", arrayOf(id.toString()))

        val idIndex =  cursor.getColumnIndex("flag_Id")
        val countryNameIndex = cursor.getColumnIndex("country_name")
        val flagNameIndex = cursor.getColumnIndex("flag_name")

        while(cursor.moveToNext()){

            val record = FlagsModel(
                cursor.getInt(idIndex),
                cursor.getString(countryNameIndex),
                cursor.getString(flagNameIndex)
            )
            recordList.add(record)
        }
        cursor.close()
        return recordList
    }
}