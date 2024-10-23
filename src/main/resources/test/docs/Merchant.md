

# Merchant

Represents the merchant from where the loan application is being submitted

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | **String** | The code of the Merchant, a list of codes was provided to you by Lendismart&#39;s team. |  |
|**user** | **String** | The username of the user that will perform the operation. |  |
|**redirectUrl** | **String** | The URL you would like Lendismart to redirect the customer after the signature and documentation upload has been completed. Only applies if the &#39;managedBy&#39; field is set to &#39;APPLICANT&#39;. |  [optional] |
|**redirectAfterScoring** | **Boolean** | Indicates if you&#39;d like us to redirect the user to the redirectUrl after the scoring has finished. |  [optional] |
|**emailAfterScoring** | **Boolean** | Indicates if you&#39;d like us to email the user after the scoring has finished in order to inform the scoring result. |  [optional] |
|**events** | [**Events**](Events.md) |  |  [optional] |



