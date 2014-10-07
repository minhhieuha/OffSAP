package com.erp.sap.datasource;

import com.erp.sap.model.User;
import com.erp.sap.sqlite.DatabaseHelper;
import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class UsersDataSource {
	// Database fields
	private SQLiteDatabase database;
	private DatabaseHelper dbHelper;

	public UsersDataSource(Context context) {
		dbHelper = new DatabaseHelper(context);
	}

	public void open() throws SQLException {
		database = dbHelper.getWritableDatabase();
	}

	public void close() {
		dbHelper.close();
	}

	public void createUser(User user) {
		ContentValues values = new ContentValues();
		values.put(DatabaseHelper.KEY_USERNAME, user.getUserName());
		values.put(DatabaseHelper.KEY_PASSWORD, user.getPassword());
		database.close();
	}
}
