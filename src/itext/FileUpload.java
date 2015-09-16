package itext;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class FileUpload {
	public static void fileupload() throws FileNotFoundException{
       
        String inFile="D:/Eclipse Java/fill6.pdf";
		FileInputStream io = new FileInputStream(inFile);
        byte[] pdfData = new byte[(int) inFile.length()];
        DataInputStream dis;
		try {
			dis = new DataInputStream(new FileInputStream(inFile));
			dis.readFully(pdfData);  // read from file into byte[] array
	        dis.close();
		
          Connection dbConnection;

        String myConnectionString =
                "jdbc:mysql://69.167.139.172/bluedb";
        
			dbConnection = DriverManager.getConnection(myConnectionString, "color", "prithvi");
			PreparedStatement ps = (PreparedStatement) dbConnection.prepareStatement("INSERT INTO Form_BL (AppID,Form) VALUES (?,?)");
	        ps.setString(1, "1");
	        ps.setBytes(2, pdfData);  // byte[] array
	        ps.executeUpdate();
	        ps.setBinaryStream(1,  (InputStream)dis,(int)inFile.length());
        }
             catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        
}
}
