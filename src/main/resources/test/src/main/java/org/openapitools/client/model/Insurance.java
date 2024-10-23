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
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

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
 * Represents an insurance included in a motor loan offer
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class Insurance {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_INSURANCE_TYPE = "insuranceType";
  @SerializedName(SERIALIZED_NAME_INSURANCE_TYPE)
  private String insuranceType;

  /**
   * Gets or Sets coverages
   */
  @JsonAdapter(CoveragesEnum.Adapter.class)
  public enum CoveragesEnum {
    LIFE("LIFE"),
    
    TEMPORARY_DISABILITY("TEMPORARY_DISABILITY"),
    
    UNEMPLOYMENT("UNEMPLOYMENT"),
    
    TOTAL_LOSS("TOTAL_LOSS"),
    
    LOSS_OF_LICENCE("LOSS_OF_LICENCE"),
    
    REPLACEMENT("REPLACEMENT"),
    
    MECHANICAL_BREAKDOWN("MECHANICAL_BREAKDOWN"),
    
    FULLY_COMPREHENSIVE_WITHOUT_EXCESS("FULLY_COMPREHENSIVE_WITHOUT_EXCESS"),
    
    FULLY_COMPREHENSIVE_WITH_300_EXCESS("FULLY_COMPREHENSIVE_WITH_300_EXCESS"),
    
    EXTENDED_CIVIL_LIABILITY("EXTENDED_CIVIL_LIABILITY"),
    
    SIMI30000("SIMI30000"),
    
    SIMI45000("SIMI45000"),
    
    SIMI30000_2_Y("SIMI30000_2Y"),
    
    SIMI45000_2_Y("SIMI45000_2Y");

    private String value;

    CoveragesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CoveragesEnum fromValue(String value) {
      for (CoveragesEnum b : CoveragesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CoveragesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CoveragesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CoveragesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CoveragesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      CoveragesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_COVERAGES = "coverages";
  @SerializedName(SERIALIZED_NAME_COVERAGES)
  private Set<CoveragesEnum> coverages = new LinkedHashSet<>();

  public Insurance() {
  }

  public Insurance id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the Insurance
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public Insurance insuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
    return this;
  }

  /**
   * Get insuranceType
   * @return insuranceType
   */
  @javax.annotation.Nullable
  public String getInsuranceType() {
    return insuranceType;
  }

  public void setInsuranceType(String insuranceType) {
    this.insuranceType = insuranceType;
  }


  public Insurance coverages(Set<CoveragesEnum> coverages) {
    this.coverages = coverages;
    return this;
  }

  public Insurance addCoveragesItem(CoveragesEnum coveragesItem) {
    if (this.coverages == null) {
      this.coverages = new LinkedHashSet<>();
    }
    this.coverages.add(coveragesItem);
    return this;
  }

  /**
   * Get coverages
   * @return coverages
   */
  @javax.annotation.Nullable
  public Set<CoveragesEnum> getCoverages() {
    return coverages;
  }

  public void setCoverages(Set<CoveragesEnum> coverages) {
    this.coverages = coverages;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Insurance insurance = (Insurance) o;
    return Objects.equals(this.id, insurance.id) &&
        Objects.equals(this.insuranceType, insurance.insuranceType) &&
        Objects.equals(this.coverages, insurance.coverages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, insuranceType, coverages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Insurance {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    insuranceType: ").append(toIndentedString(insuranceType)).append("\n");
    sb.append("    coverages: ").append(toIndentedString(coverages)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("insuranceType");
    openapiFields.add("coverages");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Insurance
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Insurance.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Insurance is not found in the empty JSON string", Insurance.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Insurance.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Insurance` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("insuranceType") != null && !jsonObj.get("insuranceType").isJsonNull()) && !jsonObj.get("insuranceType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `insuranceType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("insuranceType").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("coverages") != null && !jsonObj.get("coverages").isJsonNull() && !jsonObj.get("coverages").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `coverages` to be an array in the JSON string but got `%s`", jsonObj.get("coverages").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Insurance.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Insurance' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Insurance> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Insurance.class));

       return (TypeAdapter<T>) new TypeAdapter<Insurance>() {
           @Override
           public void write(JsonWriter out, Insurance value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Insurance read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Insurance given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Insurance
   * @throws IOException if the JSON string is invalid with respect to Insurance
   */
  public static Insurance fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Insurance.class);
  }

  /**
   * Convert an instance of Insurance to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

