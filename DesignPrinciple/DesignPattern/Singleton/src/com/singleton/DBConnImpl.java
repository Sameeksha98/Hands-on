package com.singleton;

public class DBConnImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConn dbconn = DBConn.getInstance();
		dbconn.getConnection();
	}

}
