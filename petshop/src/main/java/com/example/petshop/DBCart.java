package com.example.petshop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ExecutionException;

import com.h2.examples.H2FileDatabaseExample;

public class DBCart implements ICart {

    @Override
    public Pet add(Pet thePet) throws Exception {
        Connection connection = H2FileDatabaseExample.getDBConnection();
        Statement stmt = null;
        StringBuffer petsInDB = new StringBuffer();
        try {
            connection.setAutoCommit(false);
            stmt = connection.createStatement();
            stmt.execute("INSERT INTO PET(name) VALUES('"+ thePet.getClass().getSimpleName()+"')");

            ResultSet rs = stmt.executeQuery("select * from PET");
            while (rs.next()) {
                petsInDB.append("<li> "+rs.getString("name"));
            }
            stmt.close();
            connection.commit();
        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connection.close();
        }
        
    }

    @Override
    public Pet remove(Pet pet) throws Exception {
        return pet;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("입양목록 : <br>");

        Connection connection = H2FileDatabaseExample.getDBConnection();
        Statement stmt = null;
        try {
            ResultSet rs = stmt.executeQuery("select * from PET");
            while (rs.next()) {
                buffer.append("<li> "+rs.getString("name"));
            }
            stmt.close();
        } catch (SQLException e) {
            System.out.println("Exception Message " + e.getLocalizedMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }

        return buffer.toString();
    }
}
