package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.domain.ClobDomain;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 21 15:58:22 IST 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class XxsshrTapEmpFormVORowImpl extends ViewRowImpl {
    public static final int ENTITY_XXSSHRTAPEMPFORMEO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        TapEmpFormId,
        TapEmpFormNo,
        PersonId,
        BusinessUnitId,
        TransactionDate,
        Comments,
        ApprovalStatus,
        CreatedBy,
        CreationDate,
        LastUpdatedBy,
        LastUpdateDate,
        LastUpdateLogin,
        PayrollBatchName,
        SoaFlowid,
        ErrorMsg,
        ApproverComments;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int TAPEMPFORMID = AttributesEnum.TapEmpFormId.index();
    public static final int TAPEMPFORMNO = AttributesEnum.TapEmpFormNo.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int BUSINESSUNITID = AttributesEnum.BusinessUnitId.index();
    public static final int TRANSACTIONDATE = AttributesEnum.TransactionDate.index();
    public static final int COMMENTS = AttributesEnum.Comments.index();
    public static final int APPROVALSTATUS = AttributesEnum.ApprovalStatus.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATIONDATE = AttributesEnum.CreationDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int LASTUPDATELOGIN = AttributesEnum.LastUpdateLogin.index();
    public static final int PAYROLLBATCHNAME = AttributesEnum.PayrollBatchName.index();
    public static final int SOAFLOWID = AttributesEnum.SoaFlowid.index();
    public static final int ERRORMSG = AttributesEnum.ErrorMsg.index();
    public static final int APPROVERCOMMENTS = AttributesEnum.ApproverComments.index();

    /**
     * This is the default constructor (do not remove).
     */
    public XxsshrTapEmpFormVORowImpl() {
    }

    /**
     * Gets XxsshrTapEmpFormEO entity object.
     * @return the XxsshrTapEmpFormEO
     */
    public EntityImpl getXxsshrTapEmpFormEO() {
        return (EntityImpl) getEntity(ENTITY_XXSSHRTAPEMPFORMEO);
    }

    /**
     * Gets the attribute value for TAP_EMP_FORM_ID using the alias name TapEmpFormId.
     * @return the TAP_EMP_FORM_ID
     */
    public BigDecimal getTapEmpFormId() {
        return (BigDecimal) getAttributeInternal(TAPEMPFORMID);
    }

    /**
     * Sets <code>value</code> as attribute value for TAP_EMP_FORM_ID using the alias name TapEmpFormId.
     * @param value value to set the TAP_EMP_FORM_ID
     */
    public void setTapEmpFormId(BigDecimal value) {
        setAttributeInternal(TAPEMPFORMID, value);
    }

    /**
     * Gets the attribute value for TAP_EMP_FORM_NO using the alias name TapEmpFormNo.
     * @return the TAP_EMP_FORM_NO
     */
    public String getTapEmpFormNo() {
        return (String) getAttributeInternal(TAPEMPFORMNO);
    }

    /**
     * Sets <code>value</code> as attribute value for TAP_EMP_FORM_NO using the alias name TapEmpFormNo.
     * @param value value to set the TAP_EMP_FORM_NO
     */
    public void setTapEmpFormNo(String value) {
        setAttributeInternal(TAPEMPFORMNO, value);
    }

    /**
     * Gets the attribute value for PERSON_ID using the alias name PersonId.
     * @return the PERSON_ID
     */
    public BigDecimal getPersonId() {
        return (BigDecimal) getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value value to set the PERSON_ID
     */
    public void setPersonId(BigDecimal value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @return the BUSINESS_UNIT_ID
     */
    public BigDecimal getBusinessUnitId() {
        return (BigDecimal) getAttributeInternal(BUSINESSUNITID);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_UNIT_ID using the alias name BusinessUnitId.
     * @param value value to set the BUSINESS_UNIT_ID
     */
    public void setBusinessUnitId(BigDecimal value) {
        setAttributeInternal(BUSINESSUNITID, value);
    }

    /**
     * Gets the attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @return the TRANSACTION_DATE
     */
    public Timestamp getTransactionDate() {
        return (Timestamp) getAttributeInternal(TRANSACTIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for TRANSACTION_DATE using the alias name TransactionDate.
     * @param value value to set the TRANSACTION_DATE
     */
    public void setTransactionDate(Timestamp value) {
        setAttributeInternal(TRANSACTIONDATE, value);
    }

    /**
     * Gets the attribute value for COMMENTS using the alias name Comments.
     * @return the COMMENTS
     */
    public String getComments() {
        return (String) getAttributeInternal(COMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for COMMENTS using the alias name Comments.
     * @param value value to set the COMMENTS
     */
    public void setComments(String value) {
        setAttributeInternal(COMMENTS, value);
    }

    /**
     * Gets the attribute value for APPROVAL_STATUS using the alias name ApprovalStatus.
     * @return the APPROVAL_STATUS
     */
    public String getApprovalStatus() {
        return (String) getAttributeInternal(APPROVALSTATUS);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVAL_STATUS using the alias name ApprovalStatus.
     * @param value value to set the APPROVAL_STATUS
     */
    public void setApprovalStatus(String value) {
        setAttributeInternal(APPROVALSTATUS, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public String getCreatedBy() {
        return (String) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(String value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATION_DATE using the alias name CreationDate.
     * @return the CREATION_DATE
     */
    public Timestamp getCreationDate() {
        return (Timestamp) getAttributeInternal(CREATIONDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATION_DATE using the alias name CreationDate.
     * @param value value to set the CREATION_DATE
     */
    public void setCreationDate(Timestamp value) {
        setAttributeInternal(CREATIONDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public String getLastUpdatedBy() {
        return (String) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(String value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @return the LAST_UPDATE_DATE
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_DATE using the alias name LastUpdateDate.
     * @param value value to set the LAST_UPDATE_DATE
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @return the LAST_UPDATE_LOGIN
     */
    public String getLastUpdateLogin() {
        return (String) getAttributeInternal(LASTUPDATELOGIN);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATE_LOGIN using the alias name LastUpdateLogin.
     * @param value value to set the LAST_UPDATE_LOGIN
     */
    public void setLastUpdateLogin(String value) {
        setAttributeInternal(LASTUPDATELOGIN, value);
    }

    /**
     * Gets the attribute value for PAYROLL_BATCH_NAME using the alias name PayrollBatchName.
     * @return the PAYROLL_BATCH_NAME
     */
    public String getPayrollBatchName() {
        return (String) getAttributeInternal(PAYROLLBATCHNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PAYROLL_BATCH_NAME using the alias name PayrollBatchName.
     * @param value value to set the PAYROLL_BATCH_NAME
     */
    public void setPayrollBatchName(String value) {
        setAttributeInternal(PAYROLLBATCHNAME, value);
    }

    /**
     * Gets the attribute value for SOA_FLOWID using the alias name SoaFlowid.
     * @return the SOA_FLOWID
     */
    public BigDecimal getSoaFlowid() {
        return (BigDecimal) getAttributeInternal(SOAFLOWID);
    }

    /**
     * Sets <code>value</code> as attribute value for SOA_FLOWID using the alias name SoaFlowid.
     * @param value value to set the SOA_FLOWID
     */
    public void setSoaFlowid(BigDecimal value) {
        setAttributeInternal(SOAFLOWID, value);
    }

    /**
     * Gets the attribute value for ERROR_MSG using the alias name ErrorMsg.
     * @return the ERROR_MSG
     */
    public ClobDomain getErrorMsg() {
        return (ClobDomain) getAttributeInternal(ERRORMSG);
    }

    /**
     * Sets <code>value</code> as attribute value for ERROR_MSG using the alias name ErrorMsg.
     * @param value value to set the ERROR_MSG
     */
    public void setErrorMsg(ClobDomain value) {
        setAttributeInternal(ERRORMSG, value);
    }

    /**
     * Gets the attribute value for APPROVER_COMMENTS using the alias name ApproverComments.
     * @return the APPROVER_COMMENTS
     */
    public String getApproverComments() {
        return (String) getAttributeInternal(APPROVERCOMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVER_COMMENTS using the alias name ApproverComments.
     * @param value value to set the APPROVER_COMMENTS
     */
    public void setApproverComments(String value) {
        setAttributeInternal(APPROVERCOMMENTS, value);
    }
}
