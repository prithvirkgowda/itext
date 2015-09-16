package itext;

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

public class Page20 {
private static final String Result = "D:/Eclipse Java/fill4.pdf";
static PdfReader reader;
static PdfStamper stamper;

public static void page20(){
	try{
		reader = new PdfReader("D:/Eclipse Java/fill3.pdf");
		stamper = new PdfStamper(reader, new FileOutputStream(Result));
	} catch (IOException | DocumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
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
        /*PdfReader reader;
        PdfStamper stamper;
        */ResultSet rs = null;
        rs = stm.executeQuery("SELECT * FROM Page20 ORDER BY Page20ID DESC LIMIT 1");
        while ( rs.next() ) {
        	 /*reader = new PdfReader("D:/Eclipse Java/Page9.pdf");//reading the existing pdf
        	 stamper = new PdfStamper(reader, new FileOutputStream(Result1));
             */AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
             String dob,age,weight,height,occupation,pname,tdate,fam_doc,referred,operations,medical,allergies,meds,illnesses,relatives;
             int domhand,hbp,dia,bleeding,asth,pneu,major,heart,phlebitis,ulcers,kidney,hep,liver;
             occupation = rs.getString("Occupation");
             pname = rs.getString("PName");
             tdate = rs.getString("TDate");
             fam_doc = rs.getString("Fam_Doc");
             referred = rs.getString("Referred");
             operations = rs.getString("Operations");
              medical = rs.getString("Medical");
             allergies = rs.getString("Allergies");
             meds = rs.getString("Meds");
             illnesses = rs.getString("Illnesses");
             relatives = rs.getString("Relatives");
             dob = rs.getString("DOB");
             age = rs.getString("Age");
             weight = rs.getString("Weight");
             height = rs.getString("Height");
             domhand = rs.getInt("DomHand");
             hbp = rs.getInt("HBP");
             dia = rs.getInt("Diab");
             bleeding = rs.getInt("Bleeding");
             asth = rs.getInt("Asth");
             pneu = rs.getInt("Pneu");
             major = rs.getInt("Major");
             heart = rs.getInt("Heart");
             phlebitis = rs.getInt("Phlebitis");
             ulcers = rs.getInt("Ulcers");
             kidney = rs.getInt("Kidney");
             hep = rs.getInt("Hep");
             liver = rs.getInt("Liver");
                if (rs != null)
                form.setField("OCCUPATION_ledger",occupation);
                form.setField("Printed Name of Patient_hilton_disclosure",pname);
                form.setField("DATE_ledger",tdate);
                form.setField("Who is your family doctor or internist  Please include full name",fam_doc);
                form.setField("Who referred you here",referred);
                form.setField("List any and all operations that you have had in the past including dates 1",operations);
                form.setField("List any medical conditions that you may have 1",medical);
                form.setField("List allergies and reaction to medications that you may have 1",allergies);
                form.setField("List medications and doses you are currently take 1",meds);
                form.setField("List any illnesses or medical problems that run in your family 1",illnesses);
                form.setField("List any relatives or friends who may have seen a doctor in this group and which doctor",relatives);
                form.setField("DOB",dob);
                form.setField("Current Age",age);
                form.setField("Weight",weight);
                form.setField("Height",height);
                
                
             	                 	/*Set<String> fldNames = form.getFields().keySet();
             	for (String fldName : fldNames) {
             	  System.out.println( fldName + ": " + form.getField( fldName ) );
             	}
*/                 	 /*   if(domhand ==1){
     	           
             		form.setField("dominant hand", "right" );
             		}
             		
             		else{
             			form.setField("dominant hand", "left");
             		}
					*/if(hbp ==1){
					     
							form.setField("hbp", "yes" );
							}
							else{
								form.setField("hbp", "no");
							}
					 
					 if(dia ==1){
	         	           
	                 		form.setField("diabetes", "yes" );
	                 		}
	                 		else{
	                 			form.setField("diabetes", "n0");
	                 		}

					 if(bleeding ==1){
	         	           
	                 		form.setField("bleedingproblem", "yes" );
	                 		}
	                 		else{
	                 			form.setField("bleedingproblem", "no");
	                 		}

					 if(asth ==1){
	         	           
	                 		form.setField("asthma", "yes" );
	                 		}
	                 		else{
	                 			form.setField("asthma", "no");
	                 		}

					 if(pneu ==1){
	         	           
	                 		form.setField("pneumonia", "yes" );
	                 		}
	                 		else{
	                 			form.setField("pneumonia", "no");
	                 		}

					 if(major ==1){
	         	           
	                 		form.setField("majorinfections", "yes" );
	                 		}
	                 		else{
	                 			form.setField("majorinfections", "no");
	                 		}

					 if(heart ==1){
	         	           
	                 		form.setField("heartattack", "yes" );
	                 		}
	                 		else{
	                 			form.setField("heartattack", "no");
	                 		}

					 if(phlebitis ==1){
	         	           
	                 		form.setField("phlebitis", "yes" );
	                 		}
	                 		else{
	                 			form.setField("phlebitis", "no");
	                 		}

					 if(ulcers ==1){
	         	           
	                 		form.setField("ulcers", "yes" );
	                 		}
	                 		else{
	                 			form.setField("ulcers", "no");
	                 		}

					 if(kidney ==1){
	         	           
	                 		form.setField("kidneyproblems", "yes" );
	                 		}
	                 		else{
	                 			form.setField("kidneyproblems", "no");
	                 		}

					 if(hep ==1){
	         	           
	                 		form.setField("hepatitis", "yes" );
	                 		}
	                 		else{
	                 			form.setField("hepatitis", "no");
	                 		}

					 if(liver ==1){
	         	           
	                 		form.setField("liverproblems", "yes" );
	                 		}
	                 		else{
	                 			form.setField("liverproblems", "no");
	                 		}
									 	
					/* String [] states = stamper.getAcroFields().getAppearanceStates("dominant hand"); 
              		System.out.println(Arrays.toString(states)); 
              	*/
             	form.setGenerateAppearances(true);
          	   // stamper.setFormFlattening(true);
             	
                stamper.close();
                reader.close();
               
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