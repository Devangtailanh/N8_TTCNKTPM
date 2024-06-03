/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DBConnect;
import java.sql.*;

/**
 *
 * @author HUU PHUC
 */
public class testjdbc {
    public static void main(String[] args) {
        DBConnect cn = new DBConnect();
        try{
            Connection conn = cn.getConnection();
            System.out.println(conn);
        }catch(Exception e){
            System.out.println(e.toString());
            System.out.println("Loi!");
        }
    }
}
