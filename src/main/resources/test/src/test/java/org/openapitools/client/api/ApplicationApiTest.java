/*
 * Lendismart API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v2.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Application;
import org.openapitools.client.model.ApplicationApiSearchResponse;
import org.openapitools.client.model.ApplicationResponse;
import java.math.BigDecimal;
import org.openapitools.client.model.CancelApplication;
import org.openapitools.client.model.Error;
import java.time.OffsetDateTime;
import org.openapitools.client.model.ReturnRequest;
import org.openapitools.client.model.UploadApplicationDocumentRequest;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ApplicationApi
 */
@Disabled
public class ApplicationApiTest {

    private final ApplicationApi api = new ApplicationApi();

    /**
     * Cancels an application if possible (i.e. if its state is not APPROVED nor RETURNED).
     *
     * The application state will be updated to CANCELED and offer cancellation requests will be submitted to the lenders that support this feature
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void cancelApplicationTest() throws ApiException {
        String id = null;
        CancelApplication cancelApplication = null;
        ApplicationResponse response = api.cancelApplication(id, cancelApplication);
        // TODO: test validations
    }

    /**
     * Checks the validity of an API-KEY
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void checkApiKeyTest() throws ApiException {
        api.checkApiKey();
        // TODO: test validations
    }

    /**
     * Creates a new application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createApplicationTest() throws ApiException {
        Application application = null;
        ApplicationResponse response = api.createApplication(application);
        // TODO: test validations
    }

    /**
     * Gets an existing application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getApplicationTest() throws ApiException {
        String id = null;
        ApplicationResponse response = api.getApplication(id);
        // TODO: test validations
    }

    /**
     * Initiates the return of an approved loan
     *
     * Will commence the loan return process for an approved loan, which may, depending on the Group&#39;s settings, necessitate specific internal approvals.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void offerReturnRequestTest() throws ApiException {
        String id = null;
        ReturnRequest returnRequest = null;
        ApplicationResponse response = api.offerReturnRequest(id, returnRequest);
        // TODO: test validations
    }

    /**
     * Search applications
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void searchApplicationsTest() throws ApiException {
        Integer page = null;
        Integer pageSize = null;
        String pageToken = null;
        List<String> merchant = null;
        OffsetDateTime fromDate = null;
        OffsetDateTime toDate = null;
        Boolean signed = null;
        Boolean docsSubmitted = null;
        List<String> state = null;
        List<String> offerState = null;
        List<String> lender = null;
        String registrationNumber = null;
        String vin = null;
        Boolean offerDocsSubmitted = null;
        Boolean isNotCancelled = null;
        String createdByUsername = null;
        String createdByDocIdNumber = null;
        List<String> groupCode = null;
        String readableId = null;
        String province = null;
        String surname = null;
        String docIdNumber = null;
        String productType = null;
        String goodsType = null;
        OffsetDateTime fromPreapprovalDate = null;
        OffsetDateTime untilPreapprovalDate = null;
        OffsetDateTime fromApprovalDate = null;
        OffsetDateTime untilApprovalDate = null;
        OffsetDateTime fromDocsSubmissionDate = null;
        OffsetDateTime untilDocsSubmissionDate = null;
        OffsetDateTime fromPayoutDate = null;
        OffsetDateTime untilPayoutDate = null;
        String term = null;
        String feeType = null;
        BigDecimal fromLoanAmount = null;
        BigDecimal untilLoanAmount = null;
        ApplicationApiSearchResponse response = api.searchApplications(page, pageSize, pageToken, merchant, fromDate, toDate, signed, docsSubmitted, state, offerState, lender, registrationNumber, vin, offerDocsSubmitted, isNotCancelled, createdByUsername, createdByDocIdNumber, groupCode, readableId, province, surname, docIdNumber, productType, goodsType, fromPreapprovalDate, untilPreapprovalDate, fromApprovalDate, untilApprovalDate, fromDocsSubmissionDate, untilDocsSubmissionDate, fromPayoutDate, untilPayoutDate, term, feeType, fromLoanAmount, untilLoanAmount);
        // TODO: test validations
    }

    /**
     * Updates an application
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateApplicationTest() throws ApiException {
        String id = null;
        Application application = null;
        Boolean validate = null;
        ApplicationResponse response = api.updateApplication(id, application, validate);
        // TODO: test validations
    }

    /**
     * Creates an application document.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void uploadApplicationDocumentTest() throws ApiException {
        String id = null;
        UploadApplicationDocumentRequest uploadApplicationDocumentRequest = null;
        api.uploadApplicationDocument(id, uploadApplicationDocumentRequest);
        // TODO: test validations
    }

}