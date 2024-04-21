package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import static org.example.core.Base.pathologyResultsPageObjects;
import static org.example.core.Base.welcomePageObject;

public class pathologyResultsPageStepDef {
    @And("user clicks My Results option")
    public void userClicksMyResultsOption()throws Exception {
        Assert.assertTrue(welcomePageObject.clickMyResults());
    }
    @And("user enters value {string} to filter results")
    public void userEntersValueToFilterResults(String data) throws Exception{
        Assert.assertTrue(pathologyResultsPageObjects.enterDataToFilter(data));
    }
    @Then("users validates Filtered Data by extracting all Datatable")
    public void usersValidatesFilteredDataByExtractingAllDatatable() throws Exception{
        Assert.assertTrue(pathologyResultsPageObjects.tableResultsValidation());
    }
    @And("user enters clicks on Load Report button to download documents")
    public void userEntersClicksOnLoadReportButtonToDownloadDocuments() throws Exception{
        Assert.assertTrue(pathologyResultsPageObjects.clickLoadReportButton());
    }
    @And("user clicks on third record to view Departmental reporting")
    public void userClicksOnThirdRecordToViewDepartmentalReporting()throws Exception {
        Assert.assertTrue(pathologyResultsPageObjects.downloadDepartmentReports());
    }
    @Then("user clicks on Cumulative button to download report")
    public void userClicksOnCumulativeButtonToDownloadReport() throws Exception{
        Assert.assertTrue(pathologyResultsPageObjects.downloadCumulative());
    }
}
