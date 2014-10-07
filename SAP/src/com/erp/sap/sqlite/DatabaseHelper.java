package com.erp.sap.sqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

	// Database Version
	private static final int DATABASE_VERSION = 1;
	// Database Name
	private static final String DATABASE_NAME = "SAPB1DB.sqlite";
	// Users table
	public static final String TABLE_USERS = "Users";
	public static final String KEY_ID = "id";
	public static final String KEY_USERNAME = "username";
	public static final String KEY_PASSWORD = "password";
	public static final String[] COLUMNS = { KEY_ID, KEY_USERNAME,
			KEY_PASSWORD };

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String CREATE_BOOK_TABLE = "CREATE TABLE " + TABLE_USERS + " ( "
				+ KEY_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
				+ KEY_USERNAME + " TEXT, " + KEY_PASSWORD + " TEXT )";
		db.execSQL(CREATE_BOOK_TABLE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		db.execSQL("DROP TABLE IF EXISTS " + TABLE_USERS);
		this.onCreate(db);
	}
}