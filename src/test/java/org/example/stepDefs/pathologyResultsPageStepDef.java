package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.driver.SeleniumDriver;
import org.example.pageobjects.PathologyResults;
import org.example.pageobjects.WelcomePage;
//import static org.example.core.Base.pathologyResultsPageObjects;

public class pathologyResultsPageStepDef  {

    WelcomePage welcomePageObject = new WelcomePage(SeleniumDriver.getDriver());
    PathologyResults pathologyResultsPageObjects = new PathologyResults(SeleniumDriver.getDriver());
    @And("user clicks My Results option")
    public void userClicksMyResultsOption()throws Exception {welcomePageObject.clickMyResults();}
    @And("user enters value {string} to filter results")
    public void userEntersValueToFilterResults(String data) throws Exception{pathologyResultsPageObjects.enterDataToFilter(data);}
    @Then("users validates Filtered Data by extracting all Datatable")
    public void usersValidatesFilteredDataByExtractingAllDatatable() throws Exception{pathologyResultsPageObjects.tableResultsValidation();}
    @And("user enters clicks on Load Report button to download documents")
    public void userEntersClicksOnLoadReportButtonToDownloadDocuments() throws Exception{pathologyResultsPageObjects.clickLoadReportButton();}
    @And("user clicks on third record to view Departmental reporting")
    public void userClicksOnThirdRecordToViewDepartmentalReporting()throws Exception {pathologyResultsPageObjects.downloadDepartmentReports();}
    @Then("user clicks on Cumulative button to download report")
    public void userClicksOnCumulativeButtonToDownloadReport() throws Exception{pathologyResultsPageObjects.downloadCumulative();}
}
