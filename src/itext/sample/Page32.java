package itext.sample;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

public class Page32 {
	private static final String Result1 = "D:/Eclipse Java/Page32.pdf";

	public static void page32(){
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        Connection connection = null;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://69.167.139.172/bluedb",
                            "color", "prithvi");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        try {
            Statement stm = null;
            stm = connection.createStatement();//creating a instance for the database query
            PdfReader reader;
            PdfStamper stamper;
            ResultSet rs = null;
            rs = stm.executeQuery("SELECT * FROM Page32 ORDER BY Page32ID DESC LIMIT 1");
            while ( rs.next() ) {
            	 reader = new PdfReader("D:/Eclipse Java/Page20.pdf");//reading the existing pdf
            	 stamper = new PdfStamper(reader, new FileOutputStream(Result1));
                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
                 String  dinjury,descr,aname,address,pnumber,releasesig,pname,tdate;
                 int result,checks,attorney;
                 descr = rs.getString("Descr");
                 aname = rs.getString("AName");
                 address = rs.getString("Address");
                 pnumber = rs.getString("PNumber");
                 releasesig = rs.getString("ReleaseSig");
                 pname = rs.getString("PName");
                 tdate = rs.getString("TDate");
                 result = rs.getInt("Result");
                 checks = rs.getInt("Checks");
                 dinjury = rs.getString("DInjury");
                 attorney = rs.getInt("Attorney");
                    if (rs != null)
                    form.setField("Briefly describe what happened and where 1",descr);
                    form.setField("ATTORNEYS FULL NAME_ledger",aname);
                    form.setField("When How long did you take the medicationAcetaminophen Tylenol",address);
                    form.setField("PHONE1_ledger",pnumber);
                    form.setField("Patient Signature",releasesig);
                    form.setField("Printed Name of Patient_hilton_disclosure",pname);
                    form.setField("DATE_13",tdate);
                    form.setField("Date of Injury",dinjury);
                    
                 	                 	/*Set<String> fldNames = form.getFields().keySet();

                 	for (String fldName : fldNames) {
                 	  System.out.println( fldName + ": " + form.getField( fldName ) );
                 	}
*/                 	    if(result ==1){
         	           
                 		form.setField("accident/injury", "yes" );
                 		}
                 		
                 		else{
                 			form.setField("accident/injury", "no");
                 		}
						if(checks ==1){
						     
								form.setField("check one", "auto" );
								}
								else if (checks == 2){
									form.setField("check one", "onthejob");
								}
								else
									form.setField("check one", "other");
						 
						 if(attorney ==1){
		         	           
		                 		form.setField("attorney involved", "yes" );
		                 		}
		                 		else{
		                 			form.setField("attorney involved", "no");
		                 		}
			/*							 	
						 String [] states = stamper.getAcroFields().getAppearanceStates("check one"); 
	                 		System.out.println(Arrays.toString(states));*/
                 	form.setGenerateAppearances(true);
              	    //stamper.setFormFlattening(true);
                 
                    stamper.close();
                   
            } 
            connection.close();

	    }

	                 catch (DocumentException | SQLException e1) {
	                        // TODO Auto-generated catch block
	                        e1.printStackTrace();
	                    } catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}



	}

}
