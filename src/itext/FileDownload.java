package itext;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.PreparedStatement;

public class FileDownload {
public static void filedownload(){
	 Connection dbConnection;
	 ResultSet rs;

     String myConnectionString =
             "jdbc:mysql://69.167.139.172/bluedb";
     try {
			dbConnection = DriverManager.getConnection(myConnectionString, "color", "prithvi");
	 
     PreparedStatement ps=(PreparedStatement) dbConnection.prepareStatement("select AppID from Form_BL where AppID='1' ");
      rs=ps.executeQuery();
      rs.next();
     Blob b = (Blob) rs.getBlob(1);
      InputStream is = b.getBinaryStream();
      FileOutputStream fos = new FileOutputStream("D:/download.pdf");
      int i = 0;

      // IMPORTANT: Remember to handle/close all I/O properly
      while ((i = is.read()) != -1) {
        fos.write(i); 
      }      
          
  }catch(Exception e){
      e.printStackTrace();
  }
     
}
}
