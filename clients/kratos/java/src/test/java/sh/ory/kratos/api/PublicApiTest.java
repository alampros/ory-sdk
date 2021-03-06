/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: v0.4.6-alpha.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.api;

import sh.ory.kratos.ApiException;
import sh.ory.kratos.model.CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload;
import sh.ory.kratos.model.ErrorContainer;
import sh.ory.kratos.model.GenericError;
import sh.ory.kratos.model.LoginRequest;
import sh.ory.kratos.model.RecoveryRequest;
import sh.ory.kratos.model.RegistrationRequest;
import sh.ory.kratos.model.Session;
import sh.ory.kratos.model.SettingsRequest;
import sh.ory.kratos.model.VerificationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PublicApi
 */
@Ignore
public class PublicApiTest {

    private final PublicApi api = new PublicApi();

    
    /**
     * Complete the browser-based recovery flow using a recovery link
     *
     * &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Account Recovery Documentation](../self-service/flows/password-reset-account-recovery).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserRecoveryLinkStrategyFlowTest() throws ApiException {
        api.completeSelfServiceBrowserRecoveryLinkStrategyFlow();

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based settings flow for the OpenID Connect strategy
     *
     * This endpoint completes a browser-based settings flow. This is usually achieved by POSTing data to this endpoint.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](../self-service/flows/user-settings).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserSettingsOIDCSettingsFlowTest() throws ApiException {
        api.completeSelfServiceBrowserSettingsOIDCSettingsFlow();

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based settings flow for the password strategy
     *
     * This endpoint completes a browser-based settings flow. This is usually achieved by POSTing data to this endpoint.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](../self-service/flows/user-settings).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserSettingsPasswordStrategyFlowTest() throws ApiException {
        api.completeSelfServiceBrowserSettingsPasswordStrategyFlow();

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based settings flow for profile data
     *
     * This endpoint completes a browser-based settings flow. This is usually achieved by POSTing data to this endpoint.  If the provided profile data is valid against the Identity&#39;s Traits JSON Schema, the data will be updated and the browser redirected to &#x60;url.settings_ui&#x60; for further steps.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](../self-service/flows/user-settings).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserSettingsProfileStrategyFlowTest() throws ApiException {
        String request = null;
        CompleteSelfServiceBrowserSettingsStrategyProfileFlowPayload body = null;
        api.completeSelfServiceBrowserSettingsProfileStrategyFlow(request, body);

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based verification flows
     *
     * This endpoint completes a browser-based verification flow. This is usually achieved by POSTing data to this endpoint.  If the provided data is valid against the Identity&#39;s Traits JSON Schema, the data will be updated and the browser redirected to &#x60;url.settings_ui&#x60; for further steps.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void completeSelfServiceBrowserVerificationFlowTest() throws ApiException {
        String request = null;
        String via = null;
        api.completeSelfServiceBrowserVerificationFlow(request, via);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a traits schema definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchemaTest() throws ApiException {
        String id = null;
        Object response = api.getSchema(id);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based login user flows
     *
     * This endpoint returns a login request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserLoginRequestTest() throws ApiException {
        String request = null;
        LoginRequest response = api.getSelfServiceBrowserLoginRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based recovery flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos Account Recovery Documentation](../self-service/flows/password-reset-account-recovery).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserRecoveryRequestTest() throws ApiException {
        String request = null;
        RecoveryRequest response = api.getSelfServiceBrowserRecoveryRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based registration user flows
     *
     * This endpoint returns a registration request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserRegistrationRequestTest() throws ApiException {
        String request = null;
        RegistrationRequest response = api.getSelfServiceBrowserRegistrationRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based settings flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](../self-service/flows/user-settings).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserSettingsRequestTest() throws ApiException {
        String request = null;
        SettingsRequest response = api.getSelfServiceBrowserSettingsRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get user-facing self-service errors
     *
     * This endpoint returns the error associated with a user-facing self service errors.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes.  More information can be found at [ORY Kratos User User Facing Error Documentation](https://www.ory.sh/docs/kratos/self-service/flows/user-facing-errors).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceErrorTest() throws ApiException {
        String error = null;
        ErrorContainer response = api.getSelfServiceError(error);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based verification flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceVerificationRequestTest() throws ApiException {
        String request = null;
        VerificationRequest response = api.getSelfServiceVerificationRequest(request);

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based login user flow
     *
     * This endpoint initializes a browser-based user login flow. Once initialized, the browser will be redirected to &#x60;selfservice.flows.login.ui_url&#x60; with the request ID set as a query parameter. If a valid user session exists already, the browser will be redirected to &#x60;urls.default_redirect_url&#x60;.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserLoginFlowTest() throws ApiException {
        Boolean refresh = null;
        api.initializeSelfServiceBrowserLoginFlow(refresh);

        // TODO: test validations
    }
    
    /**
     * Initialize Browser-Based Logout User Flow
     *
     * This endpoint initializes a logout flow.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  On successful logout, the browser will be redirected (HTTP 302 Found) to &#x60;urls.default_return_to&#x60;.  More information can be found at [ORY Kratos User Logout Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-logout).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserLogoutFlowTest() throws ApiException {
        api.initializeSelfServiceBrowserLogoutFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based registration user flow
     *
     * This endpoint initializes a browser-based user registration flow. Once initialized, the browser will be redirected to &#x60;selfservice.flows.registration.ui_url&#x60; with the request ID set as a query parameter. If a valid user session exists already, the browser will be redirected to &#x60;urls.default_redirect_url&#x60;.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserRegistrationFlowTest() throws ApiException {
        api.initializeSelfServiceBrowserRegistrationFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based verification flow
     *
     * This endpoint initializes a browser-based verification flow. Once initialized, the browser will be redirected to &#x60;selfservice.flows.settings.ui_url&#x60; with the request ID set as a query parameter. If no valid user session exists, a login flow will be initialized.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceBrowserVerificationFlowTest() throws ApiException {
        String via = null;
        api.initializeSelfServiceBrowserVerificationFlow(via);

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based account recovery flow
     *
     * This endpoint initializes a browser-based account recovery flow. Once initialized, the browser will be redirected to &#x60;selfservice.flows.recovery.ui_url&#x60; with the request ID set as a query parameter. If a valid user session exists, the request is aborted.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos Account Recovery Documentation](../self-service/flows/password-reset-account-recovery).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceRecoveryFlowTest() throws ApiException {
        api.initializeSelfServiceRecoveryFlow();

        // TODO: test validations
    }
    
    /**
     * Initialize browser-based settings flow
     *
     * This endpoint initializes a browser-based settings flow. Once initialized, the browser will be redirected to &#x60;selfservice.flows.settings.ui_url&#x60; with the request ID set as a query parameter. If no valid user session exists, a login flow will be initialized.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...).  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](../self-service/flows/user-settings).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void initializeSelfServiceSettingsFlowTest() throws ApiException {
        api.initializeSelfServiceSettingsFlow();

        // TODO: test validations
    }
    
    /**
     * Complete the browser-based verification flows
     *
     * This endpoint completes a browser-based verification flow.  &gt; This endpoint is NOT INTENDED for API clients and only works with browsers (Chrome, Firefox, ...) and HTML Forms.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void selfServiceBrowserVerifyTest() throws ApiException {
        String code = null;
        String via = null;
        api.selfServiceBrowserVerify(code, via);

        // TODO: test validations
    }
    
    /**
     * Check who the current HTTP session belongs to
     *
     * Uses the HTTP Headers in the GET request to determine (e.g. by using checking the cookies) who is authenticated. Returns a session object in the body or 401 if the credentials are invalid or no credentials were sent. Additionally when the request it successful it adds the user ID to the &#39;X-Kratos-Authenticated-Identity-Id&#39; header in the response.  This endpoint is useful for reverse proxies and API Gateways.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void whoamiTest() throws ApiException {
        Session response = api.whoami();

        // TODO: test validations
    }
    
}
