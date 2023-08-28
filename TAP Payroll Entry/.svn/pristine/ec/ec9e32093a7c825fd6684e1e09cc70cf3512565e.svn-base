package view;

import com.view.uiutils.ADFUtils;

import javax.faces.event.ActionEvent;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.context.AdfFacesContext;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;

public class SearchReimbursement {
    private RichPopup myPopup;
    private RichOutputText messageBind;

    public SearchReimbursement() {
    }

    public void onclickSubmit(ActionEvent actionEvent) {
        ViewObject HdrVO = ADFUtils.findIterator("Reimbursement_ROVOIterator").getViewObject();
        ViewObjectImpl VO = (ViewObjectImpl) ADFUtils.findIterator("Reimbursement_VOIterator").getViewObject();

        ViewObjectImpl hdrIter = (ViewObjectImpl) ADFUtils.findIterator("Reimbursement_VOIterator").getViewObject();
        RowSetIterator iter = HdrVO.createRowSetIterator(null);
        System.err.println(HdrVO.getCurrentRow().getAttribute("Trans_Active"));
        while (iter.hasNext()) {
            Row r = iter.next();

            if (r.getAttribute("Trans_Active") != null && r.getAttribute("Trans_Active").equals(true)) {
                System.err.println("staus==" + r.getAttribute("Trans_Active"));
                System.err.println(r.getAttribute("ReimbursementRequestId"));
                //System.err.println("Count"+iter.getAllRowsInRange());
                ViewCriteria vc = VO.getViewCriteria("findById");
                VO.applyViewCriteria(vc);
                VO.setNamedWhereClauseParam("BV_ID", r.getAttribute("ReimbursementRequestId"));
                VO.executeQuery();
                System.err.println("count1--------" + VO.getEstimatedRowCount());
                if (VO.getEstimatedRowCount() > 0) {
                    System.err.println("insude");

                    VO.first().setAttribute("ApprovalStatus", "SUBMITTED FOR PAYROLL");
                    ADFUtils.findOperation("Commit").execute();
                    Object obj = ADFContext.getCurrent()
                                           .getPageFlowScope()
                                           .get("headerId");
                    //Object obj1 =  ADFContext.getCurrent().getPageFlowScope().get("date");
                    //                           ViewObject remVo = ADFUtils.findIterator("Reimbursement_VOIterator").getViewObject();
                    //                                           ViewCriteria hdrVC = remVo.createViewCriteria();
                    //                                           ViewCriteriaRow hdrVcr = hdrVC.createViewCriteriaRow();
                    //                                           hdrVcr.setAttribute("ReimbursementRequestId", obj);
                    //                                           hdrVC.addRow(hdrVcr);
                    //                                           remVo.applyViewCriteria(hdrVC);
                    //                                           remVo.executeQuery();

                    HdrVO.applyViewCriteria(HdrVO.getViewCriteriaManager().getViewCriteria("Search_VC"));
                    HdrVO.executeQuery();
                }


            }
        }

        String xmlData = null;
        String[] a = null;
        String payRollWSDL = null;
        payRollWSDL = ApprovalPayload.PAYROLL_WSDL;
        ViewObject HdrVo = ADFUtils.findIterator("Reimbursement_ROVOIterator").getViewObject();

        String p_EmployeeNumber = "Test";

        //             HdrVo.getCurrentRow().getAttribute("PersonNumber") == null ? " " :
        //             HdrVo.getCurrentRow()
        //                                                                                                          .getAttribute("PersonNumber")
        //                                                                                                          .toString();
        //
        xmlData = ApprovalPayload.payrollTypeXMLData(p_EmployeeNumber);

        System.err.println("xmlData =>" + xmlData);
        a = ApprovalProcess.invokeWsdl(xmlData, payRollWSDL, ApprovalPayload.PAYROLL_METHOD);
        if (a[0] != null && a[0].equals("True")) {

            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("showMsg", "Payroll Submitted Successfully");
            RichPopup.PopupHints hints = new RichPopup.PopupHints();
            myPopup.show(hints);
            AdfFacesContext.getCurrentInstance().addPartialTarget(messageBind);


        } else {

            ADFContext.getCurrent()
                      .getPageFlowScope()
                      .put("showMsg", "Error");
            RichPopup.PopupHints hints = new RichPopup.PopupHints();
            myPopup.show(hints);
            AdfFacesContext.getCurrentInstance().addPartialTarget(messageBind);

            // JSFUtils.addFacesInformationMessage("Error");

        }
    }

    public void setMyPopup(RichPopup myPopup) {
        this.myPopup = myPopup;
    }

    public RichPopup getMyPopup() {
        return myPopup;
    }

    public void setMessageBind(RichOutputText messageBind) {
        this.messageBind = messageBind;
    }

    public RichOutputText getMessageBind() {
        return messageBind;
    }

    public void hidePopup(ActionEvent actionEvent) {
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        getMyPopup().hide();
    }
}
