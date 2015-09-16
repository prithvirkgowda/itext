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

public class Page40 {

	private static final String Result = "D:/Eclipse Java/fill6.pdf";
	static PdfReader reader;
	static PdfStamper stamper;
	

	public static void page40() {
		try{
			reader = new PdfReader("D:/Eclipse Java/fill4.pdf");
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
	            ResultSet rs = stm.executeQuery("SELECT * FROM Page40 ORDER BY Page40ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	/*PdfReader reader = new PdfReader("D:/Eclipse Java/Page32.pdf");//reading the existing pdf
	            	PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(Result1));
	                */ AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 int fever,weight,excessive,night,infections,injuries,glaucoma,cataracts,wearh;
	                 int hearing,ear,eari,ringing,balance,nosebleeds,nasalc,inability,sinusp,sinush;
	                 int sore,mouth,chest,highblood,irregular,heart,highc,swelling,leg;
	                 int asthma,chronic,emphysema,shortness,bronchitis,pneumonia,lung,bloodys;
	                 int indigestion,nausea,vomiting,bloodv,liverdis,jaundice,abdominal,changeb,ulcers,colon;
	                 int urinary,painful,bloodu,difficultys,incontinence,kidneys,prostate,endometriosis,uterine;
	                 int broken,armw,backp,armp,arms,arthritis,skind,skinc,breast,nipple,fainting,seizures,problems,disorientation;
	                 int difficulty,inabilityc,doubles,face,coordination,anxiety,depression,otherp,diabetes,thyroids;
	                 int increased,nasuld,excessivethirst,hormone,anemia,hemophilia,bleedingt,persistent,bloodt,food,inhalant,immunologic;
	                 String mammd, mammr,listb,disorder,whent,ekg,lastchest,lastg,lasth,amount,color;
	                 //mammd = rs.getString("MammD");
	                 //mammr = rs.getString("MammR");
	                 //listb = rs.getString("List B");
	                 //disorder = rs.getString("Disorder");
	                 //whent = rs.getString("WhenT");
	                 //ekg = rs.getString("EKG");
	                 //lastchest = rs.getString("LastChest");
	                 //lastg = rs.getString("LastG");
	                 //lasth = rs.getString("LastH");
	                 amount = rs.getString("Amount");
	                 color = rs.getString("Color");
	                 fever = rs.getInt("Fever");
	                 weight = rs.getInt("Weight");
	                 excessive = rs.getInt("Excessive");
	                 night = rs.getInt("Night");
	                 infections = rs.getInt("Infections");
	                 injuries = rs.getInt("Injuries");
	                 glaucoma = rs.getInt("Glaucoma");
	                 cataracts = rs.getInt("Cataracts");
	                 wearh = rs.getInt("WearH");
	                 hearing = rs.getInt("Hearing");
	                 ear = rs.getInt("Ear");
	                 eari = rs.getInt("EarI");
	                 nasuld = rs.getInt("NasalD");
	                 ringing = rs.getInt("Ringing");
	                 balance = rs.getInt("Balance");
	                 nosebleeds = rs.getInt("Nosebleeds");
	                 nasalc = rs.getInt("NasalC");
	                 inability = rs.getInt("Inability");
	                 sinusp = rs.getInt("SinusP");
	                 sinush = rs.getInt("SinusH");
	                 sore = rs.getInt("Sore");
	                 mouth = rs.getInt("Mouth");
	                 chest = rs.getInt("Chest");
	                 highblood = rs.getInt("High");
	                 irregular = rs.getInt("Irregular");
	                 heart = rs.getInt("Heart");
	                 highc = rs.getInt("HighC");
	                 swelling = rs.getInt("Swelling");
	                 leg = rs.getInt("Leg");
	                 asthma = rs.getInt("Asthma");
	                 chronic = rs.getInt("Chronic");
	                 emphysema = rs.getInt("Emphysema");
	                 shortness = rs.getInt("Shortness");
	                 bronchitis = rs.getInt("Bronchitis");
	                 pneumonia = rs.getInt("Pneumonia");
	                 lung = rs.getInt("Lung");
	                 bloodys = rs.getInt("BloodyS");
	                 indigestion = rs.getInt("Indigestion");
	                 nausea = rs.getInt("Nausea");
	                 vomiting = rs.getInt("Vomiting");
	                 bloodv = rs.getInt("BloodV");
	                 liverdis = rs.getInt("LiverDis");
	                 jaundice = rs.getInt("Jaundice");
	                 abdominal = rs.getInt("Abdominal");
	                 changeb = rs.getInt("ChangeB");
	                 ulcers = rs.getInt("Ulcers");
	                 colon = rs.getInt("Colon");
	                 urinary = rs.getInt("Urinary");
	                 painful = rs.getInt("Painful");
	                 bloodu = rs.getInt("BloodU");
	                 difficultys = rs.getInt("DifficultyS");
	                 incontinence = rs.getInt("Incontinence");
	                 kidneys = rs.getInt("KidneyS");
	                 prostate = rs.getInt("Prostate");
	                 endometriosis = rs.getInt("Endometrosis");
	                 uterine = rs.getInt("Uterine");
	                 broken = rs.getInt("Broken");
	                 armw = rs.getInt("ArmW");
	                 backp = rs.getInt("BackP");
	                 armp = rs.getInt("ArmP");
	                 arms = rs.getInt("ArmS");
	                 arthritis = rs.getInt("Arthritis");
	                 skind = rs.getInt("SkinD");
	                 skinc = rs.getInt("SkinC");
	                 breast = rs.getInt("Breast");
	                 nipple = rs.getInt("Nipple");
	                 fainting = rs.getInt("Fainting");
	                 seizures = rs.getInt("Seizures");
	                 problems = rs.getInt("Problems");
	                 disorientation = rs.getInt("Disorientation");
	                 difficulty = rs.getInt("Difficulty");
	                 inabilityc = rs.getInt("InabilityC");
	                 doubles = rs.getInt("Doubles");
	                 face = rs.getInt("Face");
	                 coordination = rs.getInt("Coordination");
	                 anxiety = rs.getInt("Anxiety");
	                 depression = rs.getInt("Depression");
	                 otherp = rs.getInt("OtherP");
	                 diabetes = rs.getInt("Diabetes");
	                 thyroids = rs.getInt("Thyroids");
	                 increased = rs.getInt("Increased");
	                 excessivethirst = rs.getInt("ExcessiveT");
	                 hormone = rs.getInt("Hormone");
	                 anemia = rs.getInt("Anemia");
	                 hemophilia = rs.getInt("Hermophilia");
	                 bleedingt = rs.getInt("BleedingT");
	                 persistent = rs.getInt("Persistent");
	                 bloodt = rs.getInt("BloodT");
	                 food = rs.getInt("Food");
	                 inhalant = rs.getInt("Inhalant");
	                 immunologic = rs.getInt("Immunologic");
	                 //Section 1
	                 System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	                    //lastName = rs.getString("FirstName");
	                	//form.setField("first_ledger",mammd);                     
	                   /* System.out.println("Fields: "+form.getFields());
	                 	form.setField("Last_ledger",mammr);
	                 	form.setField("AGE_ledger", listb);
	                 	form.setField("M.I_ledger",disorder);
	                 	form.setField("CITY_ledger", whent);
	                 	form.setField("SOCIAL SECURITY NUMBER_ledger", ekg);   
	                 	form.setField("ZIP_ledger", lastchest);
	                 	form.setField("EMAIL ADDRESS_ledger", lastg);
	                 	form.setField("Res. Phone_ledger", lasth);
	                 	*/form.setField("Amount", amount);
	                 	form.setField("Color", color);
	                 	System.out.println(amount);
	                 	System.out.println(color);
	                 	System.out.println(anemia);
	                 		if(fever ==1){
	           
	                 		form.setField("constitutional fever", "yes" );
	                 		}
	                 		else
	                 			form.setField("constitutional fever", "no");
	                 
	                 		if(weight == 1)
	                 		{
	                 			form.setField("constitutional weight", "yes");
	                 		}
	                 		else{
	                 			form.setField("constitutional weight", "no");
	                 		}
	                 		 if(excessive == 1){
	                 			form.setField("constitutional excessive", "yes");
	                 		}
	                 		else{
	                 			form.setField("constitutional excessive", "no");
	                 		}
	                 		if(night == 1){
	                 			form.setField("constitutional night", "yes");
	                 		}
	                 		else{
	                 			form.setField("constitutional night", "no");
	                 		}
	                 	
	                 		if(infections == 1){
	                 			form.setField("eyes infections", "yes");
	                 		}
	                 		else{
	                 			form.setField("eyes infections", "no");
	                 		}
	                 		if(injuries == 1){
	                 			form.setField("eyes injuries", "yes");
	                 		}
	                 		else{
	                 			form.setField("eyes injuries", "no");
	                 		}
	                 		if(glaucoma == 1){
	                 			form.setField("eyes glaucoma", "yes");
	                 		}
	                 		else{
	                 			form.setField("eyes glaucoma", "no");
	                 		}
	                 		if(cataracts == 1){
	                 			form.setField("eyes cataracts", "yes");
	                 		}
	                 		else{
	                 			form.setField("eyes cataracts", "no");
	                 		}																		                    
							  	if(wearh == 1){
								form.setField("entm hearing", "yes");
								}
								else{
							   form.setField("entm hearing", "no");
								}
								if(hearing == 1){
								form.setField("entm loss", "yes");
								}
								else{
								form.setField("entm loss", "no");
								}

								if(ear == 1){
								form.setField("entm pain", "yes");
								}
								else{
								form.setField("entm pain", "no");
								}
								if(eari == 1){
								form.setField("entm infections", "yes");
								}
								else{
								form.setField("entm infections", "no");
								}
								if(ringing == 1){
								form.setField("entm ringing", "yes");
								}
								else{
								form.setField("entm ringing", "no");
								}
								if(balance == 1){
								form.setField("entm balance", "yes");
								  		}
								else{
								form.setField("entm balance", "no");
									}
								if(nosebleeds == 1){
									form.setField("entm nosebleeds", "yes");
									  		}
									else{
									form.setField("entm nosebleeds", "no");
										}
								if(mouth == 1){
									form.setField("entm mouth", "yes");
									  		}
									else{
									form.setField("entm mouth", "no");
										}
								if(inability == 1){
									form.setField("entm inability", "yes");
									  		}
									else{
									form.setField("entm inability", "no");
										}
								if(nasalc == 1){
									form.setField("entm congestion", "yes");
									  		}
									else{
									form.setField("entm congestion", "no");
										}
								if(sinusp == 1){
									form.setField("entm problems", "yes");
									  		}
									else{
									form.setField("entm problems", "no");
										}
								if(nasuld == 1){
									form.setField("entm drainage", "yes");
									  		}
									else{
									form.setField("entm drainage", "no");
										}
								if(sore == 1){
									form.setField("entm throat", "yes");
									  		}
									else{
									form.setField("entm throat", "no");
										}
								if(sinush == 1){
									form.setField("entm headaches","yes");
								}else{
									form.setField("entm headaches","no");
								}
								
								
								if(chest == 1){
									form.setField("cardiovascular pain", "yes");
									  		}
									else{
									form.setField("cardiovascular pain", "no");
										}
								if(highblood == 1){
									form.setField("cardiovascular hbp", "yes");
									  		}
									else{
									form.setField("cardiovascular hbp", "no");
										}
								if(irregular == 1){
									form.setField("cardiovascular irregular", "yes");
									  		}
									else{
									form.setField("cardiovascular irregular", "no");
										}
								if(heart == 1){
									form.setField("cardiovascular murmur", "yes");
									  		}
									else{
									form.setField("cardiovascular murmur", "no");
										}

								if(highc == 1){
									form.setField("cardiovascular cholesterol", "yes");
									  		}
									else{
									form.setField("cardiovascular cholesterol", "no");
										}
								if(swelling == 1){
									form.setField("cardiovascular swelling", "yes");
									  		}
									else{
									form.setField("cardiovascular swelling", "no");
										}
								if(leg == 1){
									form.setField("cardiovascular walking", "yes");
									  		}
									else{
									form.setField("cardiovascular walking", "no");
										}
								if(asthma == 1){
									form.setField("respiratory asthma", "yes");
									  		}
									else{
									form.setField("respiratory asthma", "no");
										}
								if(chronic == 1){
									form.setField("respiratory chronic", "yes");
									  		}
									else{
									form.setField("respiratory chronic", "no");
										}
								if(emphysema == 1){
									form.setField("respiratory emphysema", "yes");
									  		}
									else{
									form.setField("respiratory emphysema", "no");
										}
								if( shortness== 1){
									form.setField("respiratory shortness", "yes");
									  		}
									else{
									form.setField("respiratory shortness", "no");
										}
								if( bronchitis== 1){
									form.setField("bronchitis", "yes");
									  		}
									else{
									form.setField("bronchitis", "no");
										}
								if(pneumonia == 1){
									form.setField("respiratory pneumonia", "yes");
									  		}
									else{
									form.setField("respiratory pneumonia", "no");
										}
								if( lung== 1){
									form.setField("respiratory cancer", "yes");
									  		}
									else{
									form.setField("respiratory cancer", "no");
										}
								if( bloodys== 1){
									form.setField("respiratory bloody", "yes");
									  		}
									else{
									form.setField("respiratory bloody", "no");
										}
								if(indigestion == 1){
									form.setField("gastrointestinal indigestion", "yes");
									  		}
									else{
									form.setField("gastrointestinal indigestion", "no");
										}
								if( nausea== 1){
									form.setField("gastrointestinal nausea", "yes");
									  		}
									else{
									form.setField("gastrointestinal nausea", "no");
										}
								if( vomiting== 1){
									form.setField("gastrointestinal vomiting", "yes");
									  		}
									else{
									form.setField("gastrointestinal vomiting", "no");
										}
								if( bloodv== 1){
									form.setField("gastrointestinal blood", "yes");
									  		}
									else{
									form.setField("gastrointestinal blood", "no");
										}
								if( liverdis== 1){
									form.setField("gastrointestinal liver", "yes");
									  		}
									else{
									form.setField("gastrointestinal liver", "no");
										}
								if( jaundice== 1){
									form.setField("gastrointestinal jaundice", "yes");
									  		}
									else{
									form.setField("gastrointestinal jaundice", "no");
										}
								if(abdominal == 1){
									form.setField("gastrointestinal abdominal", "yes");
									  		}
									else{
									form.setField("gastrointestinal abdominal", "no");
										}
								if( changeb== 1){
									form.setField("gastrointestinal change", "yes");
									  		}
									else{
									form.setField("gastrointestinal change", "no");
										}
								if( ulcers== 1){
									form.setField("gastrointestinal ulcers", "yes");
									  		}
									else{
									form.setField("gastrointestinal ulcers", "no");
										}
								
								if(colon == 1){
									form.setField("gastrointestinal cancer", "yes");
									  		}
									else{
									form.setField("gastrointestinal cancer", "no");
										}
								if( urinary == 1){
									form.setField("genitourinary urinary", "yes");
									  		}
									else{
									form.setField("genitourinary urinary", "no");
										}
								if( painful == 1){
									form.setField("genitourinary painful", "yes");
									  		}
									else{
									form.setField("genitourinary painful", "no");
										}
								if( bloodu == 1){
									form.setField("genitourinary blood", "yes");
									  		}
									else{
									form.setField("genitourinary blood", "no");
										}
								if( difficultys== 1){
									form.setField("genitourinary difficulty", "yes");
									  		}
									else{
									form.setField("genitourinary difficulty", "no");
										}
								if( incontinence== 1){
									form.setField("genitourinary incontinence", "yes");
									  		}
									else{
									form.setField("genitourinary incontinence", "no");
										}
								if( kidneys == 1){
									form.setField("genitourinary kidney", "yes");
									  		}
									else{
									form.setField("genitourinary kidney", "no");
										}
								if( prostate == 1){
									form.setField("genitourinary prostate", "yes");
									  		}
									else{
									form.setField("genitourinary prostate", "no");
										}
								if( endometriosis == 1){
									form.setField("genitourinary endometriosis", "yes");
									  		}
									else{
									form.setField("genitourinary endometriosis", "no");
										}
								if( uterine == 1){
									form.setField("genitourinary cancer", "yes");
									  		}
									else{
									form.setField("genitourinary cancer", "no");
										}
								
								if(broken  == 1){
									form.setField("musculoskeletalbroken", "yes");
									  		}
									else{
									form.setField("musculoskeletalbroken", "no");
										}
								if( armw == 1){
									form.setField("musculoskeletalweakness", "yes");
									  		}
									else{
									form.setField("musculoskeletalweakness", "no");
										}
								if( backp == 1){
									form.setField("musculoskeletalback", "yes");
									  		}
									else{
									form.setField("musculoskeletalback", "no");
										}
								if( armp == 1){
									form.setField("musculoskeletalpain", "yes");
									  		}
									else{
									form.setField("musculoskeletalpain", "no");
										}
								if( arms == 1){
									form.setField("musculoskeletaljoint", "yes");
									  		}
									else{
									form.setField("musculoskeletaljoint", "no");
										}
								if( arthritis == 1){
									form.setField("musculoskeletalarthritis", "yes");
									  		}
									else{
									form.setField("musculoskeletalarthritis", "no");
										}
								if(  skind == 1){
									form.setField("integumentarydisease", "yes");
									  		}
									else{
									form.setField("integumentarydisease", "no");
										}
								if( skinc == 1){
									form.setField("integumentarycancer", "yes");
									  		}
									else{
									form.setField("integumentarycancer", "no");
										}
								if( breast == 1){
									form.setField("integumentarybreast", "yes");
									  		}
									else{
									form.setField("integumentarybreast", "no");
										}
								if( nipple == 1){
									form.setField("integumentarynipple", "yes");
									  		}
									else{
									form.setField("integumentarynipple", "no");
										}
								if(  fainting == 1){
									form.setField("nuerologicalfainting", "yes");
									  		}
									else{
									form.setField("nuerologicalfainting", "no");
										}
								if(  seizures == 1){
									form.setField("nuerologicaseizures", "yes");
									  		}
									else{
									form.setField("nuerologicaseizures", "no");
										}
								if( problems == 1){
									form.setField("nuerologicalproblems", "yes");
									  		}
									else{
									form.setField("nuerologicalproblems", "no");
										}
								if( disorientation  == 1){
									form.setField("nuerologicaldisorientation", "yes");
									  		}
									else{
									form.setField("nuerologicaldisorientation", "no");
										}
								if( difficulty == 1){
									form.setField("nuerologicaldifficulty", "yes");
									  		}
									else{
									form.setField("nuerologicaldifficulty", "no");
										}
								if( inabilityc== 1){
									form.setField("nuerologicalinability", "yes");
									  		}
									else{
									form.setField("nuerologicalinability", "no");
										}
								if(doubles == 1){
									form.setField("nuerologicaldouble", "yes");
									  		}
									else{
									form.setField("nuerologicaldouble", "no");
										}
								if(face == 1){
									form.setField("nuerologicalweakface", "yes");
									  		}
									else{
									form.setField("nuerologicalweakface", "no");
										}
								if(coordination == 1){
									form.setField("nuerologicalcoordination", "yes");
									  		}
									else{
									form.setField("nuerologicalcoordination", "no");
										}
	                	                
								if( anxiety== 1){
									form.setField("psychiatricanxiety", "yes");
									  		}
									else{
									form.setField("psychiatricanxiety", "no");
										}
								if( depression == 1){
									form.setField("psychiatricdepression", "yes");
									  		}
									else{
									form.setField("psychiatricdepression", "no");
										}
								if(otherp == 1){
									form.setField("Other Psychiatric DisorderTreatment", "yes");
									  		}
									else{
									form.setField("Other Psychiatric DisorderTreatment", "no");
										}
								if( thyroids== 1){
									form.setField("endocrinethyroid", "yes");
									  		}
									else{
									form.setField("endocrinethyroid", "no");
										}
								if(diabetes == 1){
									form.setField("endocrinediabetes", "yes");
									  		}
									else{
									form.setField("endocrinediabetes", "no");
										}
								if( increased == 1){
									form.setField("endocrineincreased", "yes");
									  		}
									else{
									form.setField("endocrineincreased", "no");
										}
								if( excessivethirst == 1){
									form.setField("endocrineexcessive", "yes");
									  		}
									else{
									form.setField("endocrineexcessive", "no");
										}
								if( hormone == 1){
									form.setField("endocrinehormone", "yes");
									  		}
									else{
									form.setField("endocrinehormone", "no");
										}
								if( anemia == 1){
									form.setField("hematologicanemia", "yes");
									  		}
									else{
									form.setField("hematologicanemia", "no");
										}
								if(hemophilia == 1){
									form.setField("hematologichemophilia", "yes");
									  		}
									else{
									form.setField("hematologichemophilia", "no");
										}
								if(bleedingt == 1){
									form.setField("hematologicbleeding", "yes");
									  		}
									else{
									form.setField("hematologicbleeding", "no");
										}
								if(persistent == 1){
									form.setField("hematologicpersistent", "yes");
									  		}
									else{
									form.setField("hematologicpersistent", "no");
										}
								if(bloodt == 1){
									form.setField("hematologicblood", "yes");
									  		}
									else{
									form.setField("hematologicblood", "no");
										}
								if(food == 1){
									form.setField("allergicfood", "yes");
									  		}
									else{
									form.setField("allergicfood", "no");
										}
								if(inhalant == 1){
									form.setField("allergicinhalant", "yes");
									  		}
									else{
									form.setField("allergicinhalant", "no");
										}
								if(immunologic == 1){
									form.setField("allergicimmunologic", "yes");
									  		}
									else{
									form.setField("allergicimmunologic", "no");
										}
	                	        
								
						form.setGenerateAppearances(true);
	                 	stamper.setFormFlattening(true);
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