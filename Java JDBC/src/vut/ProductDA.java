/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList; 
/**
 *
 * @author Motebang letseng
 */
public class ProductDA {
    private static Connection con;
    private static Statement stmt;
    private static ResultSet rs; 
    private static PreparedStatement ps;
    
    private static ArrayList<Product> arProduct = new ArrayList<>();
    
    //method to connecting to the database 
    public static void initialise() throws DataStorageException{
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductsDB", "root", "");
        } catch (ClassNotFoundException e) {
            throw new DataStorageException("DataBase Driver is Missing\n" + e.getMessage());
        } catch (SQLException e) {
            throw new DataStorageException("Connection Failed");
        }
    }
    
    //metod for returning all data from  the database
    public static ArrayList<Product> viewAll() throws NotFoundException{
        arProduct.clear();
        try {
            ps = con.prepareStatement("select * from tblProducts");
            rs = ps.executeQuery();
            while (rs.next()) {                
                arProduct.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
            }
        } catch (SQLException e) {
            throw new NotFoundException("No Data retrieved\n"+ e.getMessage());
        }
        return  arProduct;
    }
    
    public static ArrayList<Product> viewOutofStockItems() throws NotFoundException{
        String sql = "SELECT * FROM tblProducts WHERE Quantity = 0";
        try{
            ps = con.prepareStatement("sql");
            rs = ps.executeQuery();
            while (rs.next()){
                arProduct.add(new Product(rs.getString(1), rs.getString(2), rs.getDouble(3), rs.getInt(4)));
            }
        }catch(SQLException e){
           throw new NotFoundException("No Data retrived \n"+ e.getMessage());
        }
        return arProduct;
    }
    
    public static void replenish(int qty, String itemNumber) throws NotFoundException{
        String sql = "UPDATE tblProducts SET Quantity = Quantity + (Qauntity * ?) WHERE ItemNumber = ?"; 
        try {
           ps = con.prepareStatement(sql);
           ps.setInt(1, qty);
           ps.setString(2, itemNumber);
           ps.executeUpdate();
        } catch (SQLException e) {
            throw new NotFoundException(e.getMessage());
        }
    }
    
}
