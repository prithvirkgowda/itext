package itext;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

   
public class Page5 {

	 private static final String Result = "D:/Eclipse Java/fill2.pdf";
	 static PdfReader reader;
	 static PdfStamper stamper;
	public static void page5()  {
		try {
			reader = new PdfReader("D:/Eclipse Java/fill1.pdf");
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
	            rs = stm.executeQuery("SELECT * FROM Page5 ORDER BY Page5ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 /*reader = new PdfReader("D:/Eclipse Java/HiltonForms2014_r.pdf");//reading the existing pdf
	            	 stamper = new PdfStamper(reader, new FileOutputStream(Result));
	            	 */
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String  rec_drugs,complaint,gradually,resolved,better, worse, howlong= null;
	                 String if_yes_desc,years,packs,alch_how_much,bedrest,medi,pt,traction,tens,injections,otherdocs,pneck;
	                 int alch,prev_back_pain,missedwork, workingnow,smoke;
	                 String nneck,nrarm,nlarm,nlb,nrl,nll,wneck,wrarm,wlarm,wlb,wrl,wll,prarm,plarm,plb,prl,pll;
	                 rec_drugs = rs.getString("Rec_Drugs");
	                 complaint = rs.getString("Complaint");
	                 gradually = rs.getString("Gradually");
	                 resolved = rs.getString("Resolved");
	                 better = rs.getString("Better");
	                 worse = rs.getString("Worse");
	                 howlong= rs.getString("How_Long");
	                 if_yes_desc = rs.getString("If_Yes_Desc");
	                 years = rs.getString("Years");
	                 packs = rs.getString("Packs");
	                 alch = rs.getInt("Alch");
	                 smoke = rs.getInt("Smoker");
	                 alch_how_much = rs.getString("Alch_How_Much");
	                 prev_back_pain = rs.getInt("Prev_Back_Pain");
	                 missedwork = rs.getInt("MissedWork");
	                 workingnow = rs.getInt("Working_Now");
	                 bedrest = rs.getString("Bedrest");
	                 medi =rs.getString("Med");
	                 pt =rs.getString("PT");
	                 traction =rs.getString("Traction");
	                 tens =rs.getString("TENS");
	                 injections =rs.getString("Injections");
	                 otherdocs =rs.getString("Otherdocs");
	                 pneck = rs.getString("PNeck");
	                 prarm = rs.getString("PRArm");
	                 plarm = rs.getString("PLArm");
	                 plb = rs.getString("PBack");
	                 prl = rs.getString("PRLeg");
	                 pll = rs.getString("PLLeg");
	                 nneck= rs.getString("NNeck");
	                 nrarm= rs.getString("NRArm");
	                 nlarm= rs.getString("NLArm");
	                 nlb= rs.getString("NBack");
	                 nrl= rs.getString("NRLeg");
	                 nll= rs.getString("NLLEg");
	                 wneck= rs.getString("WNeck");
	                 wrarm= rs.getString("WRArm");
	                 wlarm= rs.getString("WLArm");
	                 wlb= rs.getString("WBack");
	                 wrl= rs.getString("WRLeg");
	                 wll= rs.getString("WLLeg");
	                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	                    form.setField("Do you currently use recreational drugs",rec_drugs);
	                 	//System.out.println("Fields: "+form.getFields());
	                 	//form.setField("",complaint);
	                 	form.setField("Did your problems start gradually or suddenly", gradually);
	                 	form.setField("Has it resolved or is it ongoing", resolved);
	                 	form.setField("Better", better);   
	                 	form.setField("Worse", worse);
	                 	form.setField(" If yes how long were you out", howlong);
	                 	form.setField("If yes please describe 1", if_yes_desc);
	                 	form.setField("If yes how long", years);
	                 	form.setField("Packs per day", packs);
	                 	form.setField("If yes how much", alch_how_much);
	                 	form.setField("What have you done to treat your problem   And for how long", bedrest);
	                 	form.setField("Medications", medi);
	                 	form.setField("Physical Therapy 1", pt);
	                 	form.setField("neckpain", pneck);
	                 	form.setField("rightarmpain", prarm);
	                 	form.setField("leftarmpain", plarm);
	                 	form.setField("lowbackpain", plb);
	                 	form.setField("rightlegpain", prl);
	                 	form.setField("leftlegpain", pll);
	                 	form.setField("necknumb", nneck);
	                 	form.setField("rightarmnumb", nrarm);
	                 	form.setField("leftarmnumb", nlarm);
	                 	form.setField("lowbacknumb", nlb);
	                 	form.setField("rightlegnumb", nrl);
	                 	form.setField("leftlegnumb", nll);
	                 	form.setField("neckweak", wneck);
	                 	form.setField("rightarmweak", wrarm);
	                 	form.setField("leftarmweak", wlarm);
	                 	form.setField("lowbackweak", wlb);
	                 	form.setField("rightlegweak", wrl);
	                 	form.setField("leftlegweak", wll);
	                 	/*form.setField("", traction);
	                 	form.setField("", tens);
	                 	form.setField("", injections);
	                 	*/form.setField("Which other physicians have you seen for this problem 1", otherdocs);
	                    if(alch==1){
	                    	form.setField("alcohol?","yes");
	                    }else
	                    	form.setField("alcohol?","no");
	                    if(smoke ==1){
	                    	form.setField("smoke?","yes");
	                    }else
	                    	form.setField("smoke?","no");
	                    if(missedwork==1){
	                    	form.setField("missed work?","yes");
	                    }else
	                    	form.setField("missed work?","no");
	                    if(workingnow==1){
	                    	form.setField("working now?","yes");
	                    }else
	                    	form.setField("working now?","no");
	                 	
	                    /*String [] states = stamper.getAcroFields().getAppearanceStates("rightarmpain"); 
                 		System.out.println(Arrays.toString(states)); 
                 		*/
	                    form.setGenerateAppearances(true);
                 		
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