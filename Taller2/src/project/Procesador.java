/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Procesador{
    String lat1;
    String lon1;
    String La(javax.swing.JTextField splat){
        lat1=splat.getText();
        return lat1;
    }
    String Lo(javax.swing.JTextField splon){
        lon1=splon.getText();
        return lon1;
    }
}
