package com.aimluck.eip.cayenne.om.portlet.auto;

/** Class _EipTSurveyRespondent was generated by Cayenne.
  * It is probably a good idea to avoid changing this class manually, 
  * since it may be overwritten next time code is regenerated. 
  * If you need to make any customizations, please use subclass. 
  */
public class _EipTSurveyRespondent extends org.apache.cayenne.CayenneDataObject {

    public static final String RESPONSE_DATE_PROPERTY = "responseDate";
    public static final String RESPONSE_FLAG_PROPERTY = "responseFlag";
    public static final String USER_ID_PROPERTY = "userId";
    public static final String EIP_TSURVEY_PROPERTY = "eipTSurvey";

    public static final String RESPONDENT_ID_PK_COLUMN = "RESPONDENT_ID";

    public void setResponseDate(java.util.Date responseDate) {
        writeProperty("responseDate", responseDate);
    }
    public java.util.Date getResponseDate() {
        return (java.util.Date)readProperty("responseDate");
    }
    
    
    public void setResponseFlag(String responseFlag) {
        writeProperty("responseFlag", responseFlag);
    }
    public String getResponseFlag() {
        return (String)readProperty("responseFlag");
    }
    
    
    public void setUserId(Integer userId) {
        writeProperty("userId", userId);
    }
    public Integer getUserId() {
        return (Integer)readProperty("userId");
    }
    
    
    public void setEipTSurvey(com.aimluck.eip.cayenne.om.portlet.EipTSurvey eipTSurvey) {
        setToOneTarget("eipTSurvey", eipTSurvey, true);
    }

    public com.aimluck.eip.cayenne.om.portlet.EipTSurvey getEipTSurvey() {
        return (com.aimluck.eip.cayenne.om.portlet.EipTSurvey)readProperty("eipTSurvey");
    } 
    
    
}
