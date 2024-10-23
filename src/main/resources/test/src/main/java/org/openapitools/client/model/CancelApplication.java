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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * CancelApplication
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class CancelApplication {
  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  /**
   * Gets or Sets cancellationReason
   */
  @JsonAdapter(CancellationReasonEnum.Adapter.class)
  public enum CancellationReasonEnum {
    OTHER_PAYMENT_METHOD("OTHER_PAYMENT_METHOD"),
    
    OTHER_FINANCING_OPTION("OTHER_FINANCING_OPTION"),
    
    NO_LONGER_INTERESTED("NO_LONGER_INTERESTED"),
    
    DUPLICATED_APPLICATION("DUPLICATED_APPLICATION"),
    
    CLONED_APPLICATION("CLONED_APPLICATION"),
    
    NON_ELIGIBLE("NON_ELIGIBLE"),
    
    IRREGULAR_DOCUMENTS("IRREGULAR_DOCUMENTS"),
    
    ILLNESS("ILLNESS"),
    
    SERVICE_PERIOD_EXCEEDED("SERVICE_PERIOD_EXCEEDED"),
    
    QUOTE_INCREASE("QUOTE_INCREASE"),
    
    NOT_SPECIFIED("NOT_SPECIFIED"),
    
    TTL_CONCLUDED("TTL_CONCLUDED"),
    
    JUST_BROWSING("JUST_BROWSING"),
    
    TOO_EXPENSIVE("TOO_EXPENSIVE"),
    
    UNCLEAR_TERMS("UNCLEAR_TERMS"),
    
    ERROR_OCCURRED("ERROR_OCCURRED");

    private String value;

    CancellationReasonEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CancellationReasonEnum fromValue(String value) {
      for (CancellationReasonEnum b : CancellationReasonEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CancellationReasonEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CancellationReasonEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CancellationReasonEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CancellationReasonEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CancellationReasonEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CANCELLATION_REASON = "cancellationReason";
  @SerializedName(SERIALIZED_NAME_CANCELLATION_REASON)
  private CancellationReasonEnum cancellationReason;

  public CancelApplication() {
  }

  public CancelApplication username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public CancelApplication cancellationReason(CancellationReasonEnum cancellationReason) {
    this.cancellationReason = cancellationReason;
    return this;
  }

  /**
   * Get cancellationReason
   * @return cancellationReason
   */
  @javax.annotation.Nullable
  public CancellationReasonEnum getCancellationReason() {
    return cancellationReason;
  }

  public void setCancellationReason(CancellationReasonEnum cancellationReason) {
    this.cancellationReason = cancellationReason;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CancelApplication cancelApplication = (CancelApplication) o;
    return Objects.equals(this.username, cancelApplication.username) &&
        Objects.equals(this.cancellationReason, cancelApplication.cancellationReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, cancellationReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CancelApplication {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    cancellationReason: ").append(toIndentedString(cancellationReason)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("username");
    openapiFields.add("cancellationReason");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to CancelApplication
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CancelApplication.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CancelApplication is not found in the empty JSON string", CancelApplication.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!CancelApplication.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CancelApplication` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("cancellationReason") != null && !jsonObj.get("cancellationReason").isJsonNull()) && !jsonObj.get("cancellationReason").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cancellationReason` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cancellationReason").toString()));
      }
      // validate the optional field `cancellationReason`
      if (jsonObj.get("cancellationReason") != null && !jsonObj.get("cancellationReason").isJsonNull()) {
        CancellationReasonEnum.validateJsonElement(jsonObj.get("cancellationReason"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CancelApplication.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CancelApplication' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CancelApplication> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CancelApplication.class));

       return (TypeAdapter<T>) new TypeAdapter<CancelApplication>() {
           @Override
           public void write(JsonWriter out, CancelApplication value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CancelApplication read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of CancelApplication given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of CancelApplication
   * @throws IOException if the JSON string is invalid with respect to CancelApplication
   */
  public static CancelApplication fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CancelApplication.class);
  }

  /**
   * Convert an instance of CancelApplication to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

