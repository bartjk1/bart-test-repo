package tests;

import reports.TestNGListener;
import ie.curiositysoftware.testmodeller.TestModellerPath;
import ie.curiositysoftware.testmodeller.TestModellerSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import ie.curiositysoftware.allocation.dto.ResultMergeMethod;
import ie.curiositysoftware.allocation.dto.DataAllocationRow;
import reports.ExtentTestListener;
import ie.curiositysoftware.allocation.dto.DataAllocationResult;
import ie.curiositysoftware.allocation.engine.DataAllocation;
import utilities.testmodeller.TestModellerLogger;

//https://curiosity.partner.testinsights.io/app/#!/model-engine/guid/08f2caaf-3c70-49ba-9c1c-eb1461676ed3
@Listeners(TestNGListener.class)
@TestModellerSuite(id = 11369, profileId = 127168)
public class GitHubModelPRTest_TestCases extends TestBase
{
    

    
    @Test  (groups= {"GitHub Model PR Test","GitHub Model PR Test - Test Cases"})
    @TestModellerPath(guid = "28f227bb-ccf2-42b9-8ca2-8cdbfa8ee59c")
    public void GitHubModelPRTestEnd()
    {
        
        pages.bart_github_module _bart_github_module = new pages.bart_github_module(driver);
    TestModellerLogger.SetLastNodeGuid("e58c5c44-f64b-47ff-8d39-2526fc4276fa");
    _bart_github_module.github_test_1();

    }


    @Test  (groups= {"GitHub Model PR Test","GitHub Model PR Test - Test Cases"})
    @TestModellerPath(guid = "932666be-bbf1-4735-a9b1-49192bc7e1f0")
    public void GitHubModelPRTestEnd1()
    {
        
        pages.bart_github_module _bart_github_module = new pages.bart_github_module(driver);
    TestModellerLogger.SetLastNodeGuid("d6b256a6-00a7-4987-9008-273cb936a305");
    _bart_github_module.github_test_1();

    }


}