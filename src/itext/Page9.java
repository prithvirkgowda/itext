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


public class Page9 {
	private static final String Result = "D:/Eclipse Java/fill3.pdf";
	static PdfReader reader;
	 static PdfStamper stamper;
	public static void page9(){
		try{
		reader = new PdfReader("D:/Eclipse Java/fill2.pdf");
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
            ResultSet rs = null;
            rs = stm.executeQuery("SELECT * FROM Page9 ORDER BY Page9ID DESC LIMIT 1");
            while ( rs.next() ) {
            	 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
                 String  if_yes,if_yes_long;
                 String wtyl,wvic,wcot,wcod,wnorc,wtram,wasp,wale,wmot,wcel,wmob,wmed,wsol,wflex,wskel,wsoma,woth1=null;
                 int htyl,shtyl,hvic,shvic,hcot,shcot,hcod,shcod,hnorc,shnorc;
                 int htram,shtram,hasp,shasp,hale,shale,hmot,shmot,hcel,shcel;
                 int hmob,shmob,hmed,shmed,hsol,shsol,hflex,shflex,hskel,shskel;
                 int hsoma,shsoma,hoth1,shoth1,exer,modify,factor,lost,therapy;
                 if_yes = rs.getString("if_yes");
                 if_yes_long = rs.getString("if_yes_long");
                 wtyl = rs.getString("WTyl");
                 htyl = rs.getInt("HTyl");
                 shtyl = rs.getInt("SHTyl");
                 wvic = rs.getString("WVic");
                 hvic = rs.getInt("HVic");
                 shvic = rs.getInt("SHVic");
                 wcot = rs.getString("WCot");
                 hcot = rs.getInt("HCot");
                 shcot = rs.getInt("SHCot");
                 wcod = rs.getString("WCod");
                 hcod = rs.getInt("HCod");
                 shcod = rs.getInt("SHCod");
                 wnorc = rs.getString("WNorc");
                 hnorc = rs.getInt("HNorc");
                 shnorc = rs.getInt("SHNorc");
                 wtram = rs.getString("WTram");
                 htram = rs.getInt("HTram");
                 shtram = rs.getInt("SHTram");
                 wasp = rs.getString("WAsp");
                 hasp = rs.getInt("HAsp");
                 shasp = rs.getInt("SHAsp");
                 wale = rs.getString("WAle");
                 hale = rs.getInt("HAle");
                 shale = rs.getInt("SHAle");
                 wmot = rs.getString("WMot");
                 hmot = rs.getInt("HMot");
                 shmot = rs.getInt("SHMot");
                 wmed = rs.getString("WMed");
                 hmed = rs.getInt("HMed");
                 shmed = rs.getInt("SHMed");
                 wsol = rs.getString("WSol");
                 hsol = rs.getInt("HSol");
                 shsol = rs.getInt("SHSol");
                 wflex = rs.getString("WFlex");
                 hflex = rs.getInt("HFlex");
                 shflex = rs.getInt("SHFlex");
                 wskel = rs.getString("WSkel");
                 hskel = rs.getInt("HSkel");
                 shskel = rs.getInt("SHSkel");
                 wsoma = rs.getString("WSoma");
                 hsoma = rs.getInt("HSoma");
                 shsoma = rs.getInt("SHSoma");
                 woth1 = rs.getString("WOth1");
                 hoth1 = rs.getInt("HOth1");
                 shoth1 = rs.getInt("SHOth1");
                 exer = rs.getInt("Exer");
                 modify = rs.getInt("Modify");
                 factor = rs.getInt("Factor");
                 lost = rs.getInt("Lost");
                 wcel= rs.getString("WCel");
                 wmob= rs.getString("WMob");
                 hcel=rs.getInt("HCel");
                 hmob=rs.getInt("HMob");
                 therapy = rs.getInt("Therapy");
                 shcel=rs.getInt("SHCel");
                 shmob= rs.getInt("SHMob");
                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
                 if (rs != null)
                    form.setField("If yes please provide examples 1",if_yes);
                    form.setField("Physical Therapy 1",if_yes_long);
                    form.setField("When How long did you take the medicationAcetaminophen Tylenol",wtyl);
                    form.setField("When How long did you take the medicationAcetaminophen with Hydrocodone  Vicodin",wvic);
                    form.setField("When How long did you take the medicationOxycodone OxyContin",wcot);
                    form.setField("When How long did you take the medicationOxycodone Oxycodone with Acetaminophen Percocet",wcod);
                    form.setField("When How long did you take the medicationHydrocodone with Acetaminophen Norco",wnorc);
                    form.setField("When How long did you take the medicationUltram Tramadol",wtram);
                    form.setField("Aspirin",wasp);
                    form.setField("Naproxen Aleve",wale);
                    form.setField("Ibuprofen Motrin",wmot);
                    form.setField("Celecoxib Celebrex",wcel);
                    form.setField("Meloxicam Mobic",wmob);
                    form.setField("Methylprednisolone Medrol Dose Pak",wmed);
                    form.setField("Hydrocortisone SoluCortef",wsol);
                    form.setField("Cyclobenzaprine Flexeril",wflex);
                    form.setField("Skelaxin",wskel);
                    form.setField("Soma",wsoma);
                    form.setField("Other",woth1);
                    
                 	                 	/*Set<String> fldNames = form.getFields().keySet();
                 	for (String fldName : fldNames) {
                 	  System.out.println( fldName + ": " + form.getField( fldName ) );
                 	}
*/                 	    if(htyl ==1){
         	           
                 		form.setField("medicinehelp", "yes" );
                 		}
                 		else if(htyl == 0){
                 			form.setField("medicinehelp", "no");
                 		}
                 		else{
                 			form.setField("medicinehelp", "na");
                 		}
						if(hvic ==1){
						     
								form.setField("medicinehelp1", "yes" );
								}
								else if(hvic == 0){
									form.setField("medicinehelp1", "no");
								}
								else{
									form.setField("medicinehelp1", "na");
								}
						 if(hcot ==1){
		         	           
		                 		form.setField("medicinehelp2", "yes" );
		                 		}
		                 		else if(hcot == 0){
		                 			form.setField("medicinehelp2", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp2", "na");
		                 		}
						 if(hcod ==1){
		         	           
		                 		form.setField("medicinehelp3", "yes" );
		                 		}
		                 		else if(hcod == 0){
		                 			form.setField("medicinehelp3", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp3", "na");
		                 		}
						 if(hnorc ==1){
		         	           
		                 		form.setField("medicinehelp4", "yes" );
		                 		}
		                 		else if(hnorc == 0){
		                 			form.setField("medicinehelp4", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp4", "na");
		                 		}
						 if(htram ==1){
		         	           
		                 		form.setField("medicinehelp5", "yes" );
		                 		}
		                 		else if(htram == 0){
		                 			form.setField("medicinehelp5", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp5", "na");
		                 		}
						 if(hasp ==1){
		         	           
		                 		form.setField("medicinehelp6", "yes" );
		                 		}
		                 		else if(hasp == 0){
		                 			form.setField("medicinehelp6", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp6", "na");
		                 		}
						 if(hale ==1){
		         	           
		                 		form.setField("medicinehelp7", "yes" );
		                 		}
		                 		else if(hale == 0){
		                 			form.setField("medicinehelp7", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp7", "na");
		                 		}
						 if(hmot ==1){
		         	           
		                 		form.setField("medicinehelp8", "yes" );
		                 		}
		                 		else if(hmot == 0){
		                 			form.setField("medicinehelp8", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp8", "na");
		                 		}
						 if(hcel ==1){
		         	           
		                 		form.setField("medicinehelp9", "yes" );
		                 		}
		                 		else if(hcel == 0){
		                 			form.setField("medicinehelp9", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp9", "na");
		                 		}
						 if(hmob ==1){
		         	           
		                 		form.setField("medicinehelp10", "yes" );
		                 		}
		                 		else if(hmob == 0){
		                 			form.setField("medicinehelp10", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp10", "na");
		                 		}
						 if(hmed ==1){
		         	           
		                 		form.setField("medicinehelp11", "yes" );
		                 		}
		                 		else if(hmed == 0){
		                 			form.setField("medicinehelp11", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp11", "na");
		                 		}
						 if(hsol ==1){
		         	           
		                 		form.setField("medicinehelp12", "yes" );
		                 		}
		                 		else if(hsol == 0){
		                 			form.setField("medicinehelp12", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp12", "na");
		                 		}
						 if(hflex ==1){
		         	           
		                 		form.setField("medicinehelp13", "yes" );
		                 		}
		                 		else if(hflex == 0){
		                 			form.setField("medicinehelp13", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp13", "na");
		                 		}
						 if(hskel ==1){
		         	           
		                 		form.setField("medicinehelp14", "yes" );
		                 		}
		                 		else if(hskel == 0){
		                 			form.setField("medicinehelp14", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp14", "na");
		                 		}
						 if(hsoma ==1){
		         	           
		                 		form.setField("medicinehelp15", "yes" );
		                 		}
		                 		else if(hsoma == 0){
		                 			form.setField("medicinehelp15", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp15", "na");
		                 		}
						 if(hoth1 ==1){
		         	           
		                 		form.setField("medicinehelp16", "yes" );
		                 		}
		                 		else if(hoth1 == 0){
		                 			form.setField("medicinehelp16", "no");
		                 		}
		                 		else{
		                 			form.setField("medicinehelp16", "na");
		                 		}
						 if(shtyl ==1){
		         	           
		                 		form.setField("stillhelp", "yes" );
		                 		}
		                 		else if(shtyl == 0){
		                 			form.setField("stillhelp", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp", "na");
		                 		}
						 if(shvic ==1){
		         	           
		                 		form.setField("stillhelp1", "yes" );
		                 		}
		                 		else if(shvic == 0){
		                 			form.setField("stillhelp1", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp1", "na");
		                 		}
						 if(shcot ==1){
		         	           
		                 		form.setField("stillhelp2", "yes" );
		                 		}
		                 		else if(shcot == 0){
		                 			form.setField("stillhelp2", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp2", "na");
		                 		}
						 if(shcod ==1){
		         	           
		                 		form.setField("stillhelp3", "yes" );
		                 		}
		                 		else if(shcod == 0){
		                 			form.setField("stillhelp3", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp3", "na");
		                 		}
						 if(shnorc ==1){
		         	           
		                 		form.setField("stillhelp4", "yes" );
		                 		}
		                 		else if(shnorc == 0){
		                 			form.setField("stillhelp4", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp4", "na");
		                 		}
						 if(shtram ==1){
		         	           
		                 		form.setField("stillhelp5", "yes" );
		                 		}
		                 		else if(shtram == 0){
		                 			form.setField("stillhelp5", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp5", "na");
		                 		}
						 if(shasp ==1){
		         	           
		                 		form.setField("stillhelp6", "yes" );
		                 		}
		                 		else if(shasp == 0){
		                 			form.setField("stillhelp6", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp6", "na");
		                 		}
						 if(shale ==1){
		         	           
		                 		form.setField("stillhelp7", "yes" );
		                 		}
		                 		else if(shale == 0){
		                 			form.setField("stillhelp7", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp7", "na");
		                 		}
						 if(shmot ==1){
		         	           
		                 		form.setField("stillhelp8", "yes" );
		                 		}
		                 		else if(shmot == 0){
		                 			form.setField("stillhelp8", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp8", "na");
		                 		}
						 if(shcel ==1){
		         	           
		                 		form.setField("stillhelp9", "yes" );
		                 		}
		                 		else if(shcel == 0){
		                 			form.setField("stillhelp9", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp9", "na");
		                 		}
						 if(shmob ==1){
		         	           
		                 		form.setField("stillhelp10", "yes" );
		                 		}
		                 		else if(shmob == 0){
		                 			form.setField("stillhelp10", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp10", "na");
		                 		}
						 if(shmed ==1){
		         	           
		                 		form.setField("stillhelp11", "yes" );
		                 		}
		                 		else if(shmed == 0){
		                 			form.setField("stillhelp11", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp11", "na");
		                 		}
						 if(shsol ==1){
		         	           
		                 		form.setField("stillhelp12", "yes" );
		                 		}
		                 		else if(shsol == 0){
		                 			form.setField("stillhelp12", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp12", "na");
		                 		}
						 if(shflex ==1){
		         	           
		                 		form.setField("stillhelp13", "yes" );
		                 		}
		                 		else if(shflex == 0){
		                 			form.setField("stillhelp13", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp13", "na");
		                 		}
						 if(shskel ==1){
		         	           
		                 		form.setField("stillhelp14", "yes" );
		                 		}
		                 		else if(shskel == 0){
		                 			form.setField("stillhelp14", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp14", "na");
		                 		}
						 if(shsoma ==1){
		         	           
		                 		form.setField("stillhelp15", "yes" );
		                 		}
		                 		else if(shsoma == 0){
		                 			form.setField("stillhelp15", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp15", "na");
		                 		}
						 if(shoth1 ==1){
		         	           
		                 		form.setField("stillhelp16", "yes" );
		                 		}
		                 		else if(shoth1 == 0){
		                 			form.setField("stillhelp16", "no");
		                 		}
		                 		else{
		                 			form.setField("stillhelp16", "na");
		                 		}
		
             	/*	String [] states = stamper.getAcroFields().getAppearanceStates("medicinehelp1"); 
             		System.out.println(Arrays.toString(states)); 
             	*/
              	
                 	
						 	if(exer==1){
						 		form.setField("exercisedaily", "yes");
						 	}else{
						 		form.setField("exercisedaily", "no");
						 	}
						 	if(modify==1){
						 		form.setField("activitylifestyle", "yes");
						 	}else{
						 		form.setField("activitylifestyle", "no");
						 	}
						 	if(factor==1){
						 		form.setField("contributingfactor", "yes");
						 	}else{
						 		form.setField("contributingfactor", "no");
						 	}
						 	if(lost==1){
						 		form.setField("lostweight", "yes");
						 	}else{
						 		form.setField("lostweight", "no");
						 	}
						 	if(therapy==1){
						 		form.setField("physicaltherapy", "yes");
						 	}else{
						 		form.setField("physicaltherapy", "no");
						 	}
						 	
						 	
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