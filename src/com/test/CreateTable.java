package com.test;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public void createContactTable(String dburi) throws SQLException{
		String statement="DROP TABLE IF EXISTS CONTACT2; CREATE TABLE CONTACT2"
				+ "("
				+ "		ID SERIAL PRIMARY KEY NOT NULL,"
				+ "		firstname varchar(255) NOT NULL,"
				+ "		lastname varchar(255) NOT NULL,"
				+ "		account integer,"
				+ "		created_date date,"
				+ "		FOREIGN KEY(account) references account(id)"
				+ ")";
		
		Connection dbConnection = new Connect().getConnection(dburi);
		Statement mStatement = dbConnection.createStatement();
		mStatement.executeUpdate(statement);
		mStatement.close();
		dbConnection.close();
		
	}
	public void insertSampleContact(){
		
	}
	
	public static void main(String[] args){
		String uri = "jdbc:postgresql://ec2-34-206-239-11.compute-1.amazonaws.com:5432/dan5aser0k39ht?user=u81qb1t3r74suk"
				+ "&password=p4ab1144e9997175eff43ceada614c4bcd3487662e140c0cdccfbc928801d4516"
				+ "&ssl=true&sslfactory=org.postgresql.ssl.NonValidatingFactory";
		try{
			CreateTable newTable = new CreateTable();
			newTable.createContactTable(uri);
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			System.out.println("Database created");
		}
	}
	
}
