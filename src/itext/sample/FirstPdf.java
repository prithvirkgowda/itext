package itext.sample;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
//import java.util.Iterator;


import java.util.Set;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;
//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.pdf.AcroFields.Item;

/**
 * @author prithvi
 *
 */
public class FirstPdf extends FillHilton{

    private static final String Result = "D:/Eclipse Java/fill1.pdf";
	private static final String Result1 = "D:/Eclipse Java/fill2.pdf";
	private static final String Result2 = "D:/Eclipse Java/fill3.pdf";
	private static final String Result3 = "D:/Eclipse Java/fill4.pdf";
	private static final String Result4 = "D:/Eclipse Java/fill5.pdf";
	private static final String Result5 = "D:/Eclipse Java/fill6.pdf";
	private static final String Result6 = "D:/Eclipse Java/fill7.pdf";
	static String fname ,lname,mi= null;
	static String age ;
	static String dob,emp,occupation;
	static String ssn ,empadd, empcity, empstate,empzip,empphone;
	static String mar,city,add,state,zip,email,resphone;
    static int sex,marital,dom;
    
    

    public static void firstpdf() {
        new FirstPdf();
		FirstPdf.Sec1();
        FirstPdf.Sec2();
        FirstPdf.Sec3();
        FirstPdf.Sec4();
        FirstPdf.Sec5();
        FirstPdf.Sec6();
        FirstPdf.Sec7();
  
  }


	private static void Sec1() {
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
	            ResultSet rs = stm.executeQuery("SELECT * FROM Sec1 ORDER BY Sec1ID DESC LIMIT 1");
	            String tdate = null;
	            String doctoday;
	            while ( rs.next() ) {
	            	PdfReader reader = new PdfReader("D:/Eclipse Java/HiltonForms2014_r.pdf");//reading the existing pdf
	            	PdfStamper stamper = new PdfStamper(reader, new FileOutputStream(Result));
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 age = rs.getString("Age");
	                 fname = rs.getString("FirstName");
	                 lname = rs.getString("LastName");
	                 mi = rs.getString("MI");
	                 mar = rs.getString("Marital");
	                 sex = rs.getInt("Sex");
	                 emp = rs.getString("Employer");
	                 city = rs.getString("City");
	                 state = rs.getString("State");
	                 zip = rs.getString("Zip");
	                 ssn = rs.getString("SSN");
	                 email = rs.getString("Email");
	                 resphone = rs.getString("ResPhoneNum");
	                 add = rs.getString("Address");
	                 empadd = rs.getString("EmpAddress");
	                 empcity = rs.getString("EmpCity");
	                 empstate = rs.getString("EmpState");
	                 empzip = rs.getString("EmpZip");
	                 empphone = rs.getString("EmpPhone");
	                 occupation = rs.getString("Occupation");
	                 dob = rs.getString("Dob");
	                 dom = rs.getInt("DomHand");
	                 marital = rs.getInt("Marital");
	              //   doctoday=rs.getString("");
	                 
	                 //Section 1
	                 
	                 if (rs != null)
	                	 form.setField("DATE_ledger",tdate);
	                	form.setField("first_ledger",fname);
	                 	//System.out.println("Fields: "+form.getFields());
	                 	form.setField("Last_ledger",lname);
	                 	form.setField("AGE_ledger", age);
	                 	form.setField("M.I_ledger", mi);
	                 	form.setField("CITY_ledger", city);
	                 	form.setField("SOCIAL SECURITY NUMBER_ledger", ssn);   
	                 	form.setField("ZIP_ledger", zip);
	                 	form.setField("EMAIL ADDRESS_ledger", email);
	                 	form.setField("Res. Phone_ledger", resphone);
	                 	form.setField("ADDRESS_ledger", add);
	                 	form.setField("EMPLOYER_ledger", emp);
	                 	form.setField("EMPLOYER ADDRESS_ledger", empadd);
	                 	form.setField("CITY_2_ledger", empcity);
	                 	form.setField("STATE_2_ledger", empstate);
	                 	form.setField("ZIP_2_ledger", empzip);
	                 	form.setField("PHONE_2_ledger", empphone);
	                 	form.setField("OCCUPATION_ledger", occupation);
	                 	form.setField("DOB", dob);
	                 	//form.setField("DOCTOR YOU ARE SEEING TODAY_ledger", doctoday);
	                	
	                 		if(sex ==1){
	           
	                 		form.setField("sex1_ledger", "M" );
	                 		
	                 		}
	                 		else
	                 			form.setField("sex1_ledger", "F");
	                 	
	                 		if(marital == 1)
	                 		{
	                 			form.setField("Marital Status_ledger", "M");
	                 		}
	                 		else if(marital == 2){
	                 			form.setField("Marital Status_ledger", "S");
	                 		}
	                 		else if(marital == 3){
	                 			form.setField("Marital Status_ledger", "W");
	                 		}
	                 		else if(marital == 4){
	                 			form.setField("Marital Status_ledger", "Div");
	                 		}
	                 		else if(marital == 5){
	                 			form.setField("Marital Status_ledger", "sep");
	                 		}
	                 		if(dom == 0){
	                 			form.setField("Dominant Hand_ledger", "right");
	                 		}
	                 		else
	                 			form.setField("Dominant Hand_ledger","left");
	                 		/*Set<String> fldNames = form.getFields().keySet();

 							for (String fldName : fldNames) {
 	  						System.out.println( fldName + ": " + form.getField( fldName ) );}
*/
     	                 		
	                 		String [] states = stamper.getAcroFields().getAppearanceStates("attorney_ledger"); 
	                 		System.out.println(Arrays.toString(states)); 
	                 	
	                 		/*String[] a = form.getAppearanceStates("dominant hand");
	                 		System.out.println(a);
	                 	*/
	                 	System.out.println(dom);
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
	
	private static void Sec2() {
		// TODO Auto-generated method stub
		
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec2 ORDER BY Sec2ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill1.pdf");//reading the existing pdf
	            	 
	                 stamper = new PdfStamper(reader, new FileOutputStream(Result1));
	                 
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String fname = null;
	                 String lname = null;
	                 String mi = null;
	                 String age ,relation;
	                 String dob,emp,occupation;
	                 String ssn ,empadd, empcity, empstate,empzip,empphone;
	                 age = rs.getString("Age");
	                 fname = rs.getString("FirstName");
	                 lname = rs.getString("LastName");
	                 mi = rs.getString("MI");
	                 sex = rs.getInt("Sex");
	                 emp = rs.getString("Employer");
	                 ssn = rs.getString("SSN");
	                 empadd = rs.getString("EmpAddress");
	                 empcity = rs.getString("EmpCity");
	                 empstate = rs.getString("EmpState");
	                 empzip = rs.getString("EmpZip");
	                 empphone = rs.getString("EmpPhoneNum");
	                 occupation = rs.getString("Occupation");
	                 dob = rs.getString("Dob");
	                 relation = rs.getString("Relationship");
	                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	                 
	                	form.setField("Spouse First_ledger",fname);
	                 
	                 	form.setField("Spouse last_ledger",lname);
	                 	form.setField("AGE_2_ledger", age);
	                 	form.setField("Spouse MI_ledger", mi);
	                 	form.setField("SOCIAL SECURITY NUMBER_2_ledger", ssn);   
	                 	form.setField("EMPLOYER_2_ledger", emp);
	                 	form.setField("EMPLOYER ADDRESS_2_ledger", empadd);
	                 	form.setField("CITY_3_ledger", empcity);
	                 	form.setField("STATE_3_ledger", empstate);
	                 	form.setField("ZIP_3_ledger", empzip);
	                 	form.setField("PHONE_2_ledger", empphone);
	                 	form.setField("OCCUPATION_2_ledger", occupation);
	                 	form.setField("DOB", dob);
	                 	form.setField("RELATIONSHIP_ledger", relation);
	                 	if(sex ==1){
	         	           
	                 		form.setField("sex2_ledger", "M" );
	                 		
	                 		}
	                 		else
	                 			form.setField("sex2_ledger", "F");
	                 	
	           
	                 	
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

	private static void Sec3() {
		// TODO Auto-generated method stub
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec3 ORDER BY Sec3ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill2.pdf");//reading the existing pdf
	            	 
	                 stamper = new PdfStamper(reader, new FileOutputStream(Result2));
	                 
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String rpname,rpadd ,rpcity ,rpstate ,rpzip, rpphone;
	                 String ppname, ppadd ,ppcity ,ppstate ,ppzip ,ppphone;
	                 String tpname,tpadd,tpcity,tpstate,tpzip,tpphone;
	                 rpname = rs.getString("RPName");
	                 rpadd = rs.getString("RPAddress");
	                 rpcity = rs.getString("RPCity");
	                 rpstate = rs.getString("RPState");
	                 rpzip = rs.getString("RPZip");
	                 rpphone = rs.getString("RPPhone");
	                 ppname = rs.getString("NamePP");
	                 ppadd = rs.getString("AddressPP");
	                 ppcity = rs.getString("CityPP");
	                 ppstate = rs.getString("StatePP");
	                 ppzip = rs.getString("ZipPP");
	                 ppphone = rs.getString("PhonePP");
	                 tpname = rs.getString("TPName");
	                 tpadd = rs.getString("TPAddress");
	                 tpcity = rs.getString("TPCity");
	                 tpstate = rs.getString("TPState");
	                 tpzip = rs.getString("TPZip");
	                 tpphone = rs.getString("TPPhone");
	                 
	                 if (rs != null)
	              
	                	form.setField("NAME_ledger",rpname);
	                 	form.setField("NAME_2_ledger",ppname);
	                 	form.setField("NAME_3_ledger",tpname);
	                 	form.setField("ADDRESS_2_ledger",rpadd);
	                 	form.setField("ADDRESS_3_ledger",ppadd);
	                 	form.setField("ADDRESS_4_ledger",tpadd);
	                 	form.setField("CITY_4_ledger",rpcity);
	                 	form.setField("CITY_5_ledger",ppcity);
	                 	form.setField("CITY_6_ledger",tpcity);
	                 	form.setField("STATE_4_ledger",rpstate);
	                 	form.setField("STATE_5_ledger",ppstate);
	                 	form.setField("STATE_6_ledger",tpstate);
	                 	form.setField("ZIP_4_ledger",rpzip);
	                 	form.setField("ZIP_5_ledger",ppzip);
	                 	form.setField("ZIP_6_ledger",tpzip);
	                 	form.setField("PHONE_4_ledger",ppphone);
	                 	form.setField("PHONE_3_ledger",rpphone);
	                 	form.setField("PHONE_5_ledger",tpphone);
	                 	//stamper.setFormFlattening(true);
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

	private static void Sec4() {
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec4 ORDER BY Sec4ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill3.pdf");//reading the existing pdf
	            	 
	                 stamper = new PdfStamper(reader, new FileOutputStream(Result3));
	                 
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String picompany,pipolicynum,pigroup,piinsured,pidob,pinetwork;
	                 String sicompany,sipolicynum,sigroup,siinsured,sidob,sinetwork;
	                picompany = rs.getString("PICompany");
	                 sicompany = rs.getString("SICompany");
	                 pipolicynum = rs.getString("PIPolicyNum");
	                 sipolicynum = rs.getString("SIPolicyNum");
	                 pigroup = rs.getString("PIGroupNum");
	                 sigroup = rs.getString("SIGroupNum");
	                 piinsured = rs.getString("PIInsuredsName");
	                 siinsured = rs.getString("SIInsuredsName");
	                 pidob = rs.getString("PIInsuredsDOB");
	                 sidob = rs.getString("SIInsuredsDOB");
	                 pinetwork = rs.getString("PINetwork");
	                 sinetwork = rs.getString("SINetwork");
	                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	              
	                	form.setField("INSURANCE COMPANY_ledger",picompany);
	                	form.setField("INSURANCE COMPANY_2_ledger",sicompany);
	                	form.setField("POLICY_ledger",pipolicynum);
	                	form.setField("POLICY_2_ledger",sipolicynum);
	                	form.setField("GROUP_ledger",pigroup);
	                	form.setField("GROUP_2_ledger",sigroup);
	                	form.setField("INSUREDS NAME_ledger",piinsured);
	                	form.setField("INSUREDS NAME_2_ledger",siinsured);
	                	form.setField("NETWORK_ledger",pinetwork);
	                	form.setField("NETWORK_2_ledger",sinetwork);
	                 	
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
	
	
	private static void Sec5() {
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec5 ORDER BY Sec5ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill4.pdf");//reading the existing pdf
	            	 stamper = new PdfStamper(reader, new FileOutputStream(Result4));
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String ecname,ecadd,eccity,ecstate,eczip,ecphone,relationship;
	                 int prefcon;
	                 ecname= rs.getString("ECName");
	                 ecadd = rs.getString("ECAddress");
	                 eccity = rs.getString("ECCity");
	                 ecstate = rs.getString("ECState");
	                 eczip = rs.getString("ECZip");
	                 ecphone = rs.getString("ECPhone");
	                 relationship = rs.getString("ECRelationship");
	                 prefcon = rs.getInt("PrefMoC");
	                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	                	 form.setField("NAME_4_ledger",ecname);
		                 form.setField("ADDRESS_5_ledger",ecadd); 
		                 form.setField("CITY_7_ledger",eccity);
		                 form.setField("STATE_7_ledger",ecstate);
		                 form.setField("ZIP_7_ledger",eczip);
		                 form.setField("PHONE_6_ledger",ecphone);
		                 form.setField("RELATIONSHIP_2_ledger",relationship);
		                 if(prefcon==1){
		                	 form.setField("contact method_ledger","hp");
		                 }
		                 else if(prefcon==2){
		                	 form.setField("contact method_ledger","wp");
		                 }
		                 else if(prefcon==3){
		                	 form.setField("contact method_ledger","em");
		                 } else if(prefcon==4){
		                	 form.setField("contact method_ledger","pm");
		                 } else {
		                	 form.setField("contact method_ledger","cp");
		                 }
		                 
		                
		                 
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
	
	
	private static void Sec6() {
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec6 ORDER BY Sec6ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill5.pdf");//reading the existing pdf
	            	 stamper = new PdfStamper(reader, new FileOutputStream(Result5));
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String emp,doi,empname,empaddress,empcity,empstate,empzip,cclaim;
	                 String wcic,wcnet,wcaddress,wccity,wcstate,wczip,adjname,adjphone;
	                 int cfilled;
	                 emp = rs.getString("Emp");
	                 doi = rs.getString("DOI");
	                 empname = rs.getString("EmpName");
	                 empaddress = rs.getString("EmpAddress");
	                 empcity = rs.getString("EmpCity");
	                 empstate = rs.getString("EmpState");
	                 empzip = rs.getString("EmpZip");
	                 cfilled = rs.getInt("CFilled");
	                 cclaim = rs.getString("ClaimNum");
	                wcic = rs.getString("WCIC");
	                 wcnet = rs.getString("WCNet");
	                 wcaddress = rs.getString("WCAddress");
	                 wccity = rs.getString("WCCity");
	                 wcstate = rs.getString("WCState");
	                 wczip = rs.getString("WCZip");
	                 adjname = rs.getString("AdjName");
	                 adjphone = rs.getString("AdjPhone");
	                 System.out.println(emp);
	                 System.out.println(wcnet);
	                 System.out.println(empname);
	                 //System.out.println("Test:"+ Arrays.toString(form.getFields().entrySet().toArray()));
	                 if (rs != null)
	                 {
	                	form.setField("EMPLOYER AT TIME OF INJURY_ledger",emp);
	                	form.setField("DATE OF INJURY_ledger",doi);
	                	form.setField("INSURANCE COMPANY_3_ledger",empname);
	                	form.setField("ADDRESS_5_ledger",empaddress);
	                	form.setField("CITY_7_ledger",empcity);
	                	form.setField("STATE_6_ledger",empstate);
	                	form.setField("ZIP_6_ledger",empzip);
	                	form.setField("CLAIM_ledger",cclaim);
	                	form.setField("WORKERS COMPENSATION INSURANCE COMPANY_ledger",wcic);
	                	form.setField("NETWORK_3_ledger",wcnet);
	                	form.setField("ADDRESS_6_ledger",wcaddress);
	                	form.setField("CITY_8_ledger",wccity);
	                	form.setField("STATE_7_ledger",wcstate);
	                	form.setField("ZIP_7_ledger",wczip);
	                	form.setField("ADJUSTOR NAME_ledger",adjname);
	                	form.setField("ADJUSTOR PHONE_ledger",adjphone);
	                 	
	                 	if (cfilled==1)
	                 		form.setField("claim filed_ledger", "y");
	                 	form.setField("claim filed_ledger", "n");
	                 	/*String [] states = stamper.getAcroFields().getAppearanceStates("attorney involved"); 
	              		System.out.println(Arrays.toString(states)); 
	              		*/
	                 }   
	               //stamper.setFormFlattening(true);
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

	

	private static void Sec7() {
		try {

            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your MySQL JDBC Driver?");
            e.printStackTrace();
            return;

        }
      System.out.println("MySQL JDBC Driver Registered!");
        java.sql.Connection connection = null;
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
	            rs = stm.executeQuery("SELECT * FROM Sec7 ORDER BY Sec7ID DESC LIMIT 1");
	            while ( rs.next() ) {
	            	 reader = new PdfReader("D:/Eclipse Java/fill6.pdf");//reading the existing pdf
	            	 stamper = new PdfStamper(reader, new FileOutputStream(Result6));
	                 AcroFields form = stamper.getAcroFields(); // using acro fields to fill out the pdf
	                 String  attname,stateio,addio,dateoi,citoi,state,zipoi,phone,sign,todaydate;
	                 int arerep;
	                 arerep = rs.getInt("AreRep");
	                 attname = rs.getString("AttName");
	                 stateio = rs.getString("StateIO");
	                 addio = rs.getString("AddressIO");
	                 dateoi = rs.getString("DateOI");
	                 citoi = rs.getString("CitoOI");
	                 state = rs.getString("State");
	                 zipoi = rs.getString("ZipOI");
	                 phone = rs.getString("Phone");
	                 sign = rs.getString("Sign");
	                 todaydate = rs.getString("TodayDate");
	                 if(rs!=null)
	                	form.setField("ATTORNEYS FULL NAME_ledger",attname);
	                 	form.setField("", addio);
	                	form.setField("STATE INJURY OCCURRED IN_ledger",stateio);
	                	form.setField("DATE OF INJURY_2_ledger",dateoi);
	                	form.setField("ADDRESS_5_ledger",citoi);
	                	form.setField("CITY_7_ledger",state);
	                	form.setField("STATE_6_ledger",zipoi);
	                	form.setField("ZIP_6_ledger",phone);
	                	form.setField("CLAIM_ledger",sign);
	                	form.setField("WORKERS COMPENSATION INSURANCE COMPANY_ledger",todaydate);
	                
	                 if (arerep == 1)
	                	 form.setField("attorney_ledger", "y");
	                 form.setField("attorney_ledger", "n");
	                 System.out.println("attorney name"+ attname);
	                 /*String [] states = stamper.getAcroFields().getAppearanceStates("musculoskeletalbroken"); 
              		System.out.println(Arrays.toString(states)); 
              	
              		String[] a = form.getAppearanceStates("musculoskeletalbroken");
              		System.out.println(a);
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

