package view;


import java.text.SimpleDateFormat;

import java.util.TimeZone;

public class ApprovalPayload {
    public ApprovalPayload() {
        super();
    }
    public static final String userName="oaopdtst";
    public static final String password="O_0Pst#819";
    
    public static final String PAYROLL_WSDL ="http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/ProcessReimbursement/processreimbursementbpel_client_ep?WSDL";
    public static final String PAYROLL_METHOD = "process";
    
    public static final String PAYROLL_TAP_WSDL ="http://oaosoatst-wls-1.sub08071802371.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/TAP_Payroll/tap_payroll_bpel_client_ep?WSDL";
    
    // when we move to PROD.
 //   public static final String PAYROLL_WSDL ="http://oaosoaprd-wls-1.sub08071802370.oandopaasvcn.oraclevcn.com:9073/soa-infra/services/default/ProcessReimbursement/processreimbursementbpel_client_ep?WSDL";
  //  public static final String PAYROLL_METHOD = "process";
    
    public static String businessTypeXMLData(String p_EmployeeName,String p_EmployeeNumber,String p_Email,String p_BusinessGroup,String p_ExtraDutyNo, String p_TransDate,String p_AllowanceTyp,String p_Rate, String p_StartDate,
                                             String p_EndDate,String p_Days,String p_AllowancAmount,String p_ApprovalStatus,String p_Comments
                                               )
                                              {
        String[] info=payloadHeader();       
        System.err.println("Created time===>"+info[0]);
        System.err.println("User===========>"+info[1]);
        System.err.println("Password=======>"+info[2]);
        System.err.println("End time=======>"+info[3]);  
        String xmlData="<soapenv:Envelope xmlns:ext=\"http://xmlns.oracle.com/extradutyallowanceapproval\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
        "   <soapenv:Header/>\n" +  
        "   <soapenv:Body>\n" + 
               " <ext:processRequest>\n" + 
               "         <ext:EmployeeName>"+p_EmployeeName+"</ext:EmployeeName>\n" + 
               "         <ext:EmployeeNumber>"+p_EmployeeNumber+"</ext:EmployeeNumber>\n" + 
               "         <ext:EmailAddress>"+p_Email+"</ext:EmailAddress>\n" + 
               "         <ext:BusinessGroup>"+p_BusinessGroup+"</ext:BusinessGroup>\n" + 
               "         <ext:TapEmpFormID>"+p_ExtraDutyNo+"</ext:ExtraDutyAllowanceID>\n" + 
               "         <ext:Comments>"+p_AllowancAmount+"</ext:AllowanceAmount>\n" + 
               "         <ext:TransactionDate>"+p_TransDate+"</ext:TransactionDate>\n" + 
               "         <ext:AllowanceType>"+p_AllowanceTyp+"</ext:AllowanceType>\n" + 
               "         <ext:AllowanceRate>"+p_Rate+"</ext:AllowanceRate>\n" + 
               "         <ext:StartDate>"+p_StartDate+"</ext:StartDate>\n" + 
               "         <ext:EndDate>"+p_EndDate+"</ext:EndDate>\n" + 
               "         <ext:AllowanceDays>"+p_Days+"</ext:AllowanceDays>\n" +        
               "         <ext:Status>"+p_ApprovalStatus+"</ext:Status>\n" + 
               "         <ext:Remarks>"+p_Comments+"</ext:Remarks>\n" + 
               "  </ext:processRequest>\n"+
        "   </soapenv:Body>\n" + 
        "   </soapenv:Envelope>";
        return xmlData;
    }
      
    public static String payrollTypeXMLData(String p_EmployeeNumber)
                                              
                                              {
        String[] info=payloadHeader();       
        System.err.println("Created time===>"+info[0]);
        System.err.println("User===========>"+info[1]);
        System.err.println("Password=======>"+info[2]);
        System.err.println("End time=======>"+info[3]);  
        String xmlData="<soapenv:Envelope xmlns:tap=\"http://xmlns.oracle.com/TAP_Volunteer_Form/TAP_Payroll/TAP_PAYROLL_BPEL\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n" + 
        "   <soapenv:Header>\n" + 
        "      <wsse:Security soapenv:mustUnderstand=\"0\" xmlns:wsse=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd\" xmlns:wsu=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd\">\n" + 
        "         <wsu:Timestamp wsu:Id=\"TS-988C12359B702BB95515717394461996\">\n" + 
        "            <wsu:Created>"+info[0]+"</wsu:Created>\n" + 
        "            <wsu:Expires>"+info[3]+"</wsu:Expires>\n" + 
        "         </wsu:Timestamp>\n" + 
        "         <wsse:UsernameToken wsu:Id=\"UsernameToken-988C12359B702BB95515717394437215\">\n" + 
        "            <wsse:Username>"+info[1]+"</wsse:Username>\n" + 
        "            <wsse:Password Type=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-username-token-profile-1.0#PasswordText\">"+info[2]+"</wsse:Password>\n" + 
        "            <wsse:Nonce EncodingType=\"http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-soap-message-security-1.0#Base64Binary\">6C02LY6ntJQHbZ7lVvNjKQ==</wsse:Nonce>\n" + 
        "            <wsu:Created>"+info[0]+"</wsu:Created>\n" + 
        "         </wsse:UsernameToken>\n" + 
        "      </wsse:Security>\n" + 
        "   </soapenv:Header>\n" + 
        "   <soapenv:Body>\n" + 
        "      <tap:process>\n" + 
        "         <tap:input>"+p_EmployeeNumber+"</tap:input>\n" + 
        "      </tap:process>\n" + 
        "   </soapenv:Body>\n" + 
        "</soapenv:Envelope>";
        return xmlData;
    }
      
    public static String[] payloadHeader(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.000'Z'"); //Hours:Minutes:Seconds
        dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        java.util.Date date = new java.util.Date();
        long t = date.getTime();
        java.util.Date expDate ;
        expDate = new java.util.Date(t + (10 * 600000000));

    ////        date = new Date();
    //         dateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
    //         String expDate = dateFormat.format(DateUtils.addMinutes(date, 2));


        java.util.Date plusOne;
    //        String createdTS = dateFormat.format(date);
    //        String expiresTS = dateFormat.format(expDate);
    //        String username="praveen.c@4iapps.com";
    //        String password="Welcome#1234";
         String [] headerInfo=new String[4];
        headerInfo[0]=dateFormat.format(date);
        headerInfo[1]="oaopdtst";
        headerInfo[2]="O_0Pst#819";
        headerInfo[3]=dateFormat.format(expDate);
        return headerInfo;
    }
    
    public static String getUser(){
        
        return null;
    }
    
    
    

    
    
}
