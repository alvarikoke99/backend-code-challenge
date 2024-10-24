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
import java.time.OffsetDateTime;
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
 * Represents a user
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public static final String SERIALIZED_NAME_CREATION_DATE = "creationDate";
  @SerializedName(SERIALIZED_NAME_CREATION_DATE)
  private OffsetDateTime creationDate;

  /**
   * Gets or Sets state
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    INACTIVE("INACTIVE"),
    
    LOCKED("LOCKED"),
    
    EXPIRED("EXPIRED"),
    
    DELETED("DELETED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return StateEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      StateEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_STATE = "state";
  @SerializedName(SERIALIZED_NAME_STATE)
  private StateEnum state;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_SURNAME1 = "surname1";
  @SerializedName(SERIALIZED_NAME_SURNAME1)
  private String surname1;

  public static final String SERIALIZED_NAME_SURNAME2 = "surname2";
  @SerializedName(SERIALIZED_NAME_SURNAME2)
  private String surname2;

  public static final String SERIALIZED_NAME_PHONE1 = "phone1";
  @SerializedName(SERIALIZED_NAME_PHONE1)
  private String phone1;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  /**
   * Gets or Sets docIdType
   */
  @JsonAdapter(DocIdTypeEnum.Adapter.class)
  public enum DocIdTypeEnum {
    NATIONAL_ID("NATIONAL_ID"),
    
    TEMPORARY_RESIDENT("TEMPORARY_RESIDENT"),
    
    PERMANENT_RESIDENT("PERMANENT_RESIDENT"),
    
    CIF("CIF"),
    
    EU_RESIDENCE_CARD("EU_RESIDENCE_CARD"),
    
    ARMY_CARD("ARMY_CARD"),
    
    AIR_FORCE_CARD("AIR_FORCE_CARD"),
    
    GENDARMERIE_CARD("GENDARMERIE_CARD"),
    
    NAVY_CARD("NAVY_CARD"),
    
    POLICE_CARD("POLICE_CARD"),
    
    CIVIL_CARD("CIVIL_CARD"),
    
    CITIZEN_CARD("CITIZEN_CARD"),
    
    PORTO_SEGURO_TREATY_CARD("PORTO_SEGURO_TREATY_CARD"),
    
    CPLP_RESIDENCE_PERMIT("CPLP_RESIDENCE_PERMIT"),
    
    PASSPORT("PASSPORT"),
    
    DRIVING_LICENCE("DRIVING_LICENCE");

    private String value;

    DocIdTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocIdTypeEnum fromValue(String value) {
      for (DocIdTypeEnum b : DocIdTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocIdTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocIdTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocIdTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocIdTypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocIdTypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOC_ID_TYPE = "docIdType";
  @SerializedName(SERIALIZED_NAME_DOC_ID_TYPE)
  private DocIdTypeEnum docIdType;

  /**
   * Gets or Sets docIdType2
   */
  @JsonAdapter(DocIdType2Enum.Adapter.class)
  public enum DocIdType2Enum {
    NATIONAL_ID("NATIONAL_ID"),
    
    TEMPORARY_RESIDENT("TEMPORARY_RESIDENT"),
    
    PERMANENT_RESIDENT("PERMANENT_RESIDENT"),
    
    CIF("CIF"),
    
    EU_RESIDENCE_CARD("EU_RESIDENCE_CARD"),
    
    ARMY_CARD("ARMY_CARD"),
    
    AIR_FORCE_CARD("AIR_FORCE_CARD"),
    
    GENDARMERIE_CARD("GENDARMERIE_CARD"),
    
    NAVY_CARD("NAVY_CARD"),
    
    POLICE_CARD("POLICE_CARD"),
    
    CIVIL_CARD("CIVIL_CARD"),
    
    CITIZEN_CARD("CITIZEN_CARD"),
    
    PORTO_SEGURO_TREATY_CARD("PORTO_SEGURO_TREATY_CARD"),
    
    CPLP_RESIDENCE_PERMIT("CPLP_RESIDENCE_PERMIT"),
    
    PASSPORT("PASSPORT"),
    
    DRIVING_LICENCE("DRIVING_LICENCE");

    private String value;

    DocIdType2Enum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DocIdType2Enum fromValue(String value) {
      for (DocIdType2Enum b : DocIdType2Enum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<DocIdType2Enum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DocIdType2Enum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DocIdType2Enum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return DocIdType2Enum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      DocIdType2Enum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_DOC_ID_TYPE2 = "docIdType2";
  @SerializedName(SERIALIZED_NAME_DOC_ID_TYPE2)
  private DocIdType2Enum docIdType2;

  public static final String SERIALIZED_NAME_DOC_ID_NUMBER = "docIdNumber";
  @SerializedName(SERIALIZED_NAME_DOC_ID_NUMBER)
  private String docIdNumber;

  public static final String SERIALIZED_NAME_DOC_ID_NUMBER2 = "docIdNumber2";
  @SerializedName(SERIALIZED_NAME_DOC_ID_NUMBER2)
  private String docIdNumber2;

  /**
   * Gets or Sets language
   */
  @JsonAdapter(LanguageEnum.Adapter.class)
  public enum LanguageEnum {
    ES_ES("es_ES"),
    
    EN_GB("en_GB"),
    
    EN_US("en_US"),
    
    PT_PT("pt_PT"),
    
    DE_DE("de_DE"),
    
    FR_FR("fr_FR"),
    
    IT_IT("it_IT"),
    
    CA_ES("ca_ES"),
    
    EU_ES("eu_ES"),
    
    GL_ES("gl_ES");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static LanguageEnum fromValue(String value) {
      for (LanguageEnum b : LanguageEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<LanguageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final LanguageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public LanguageEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return LanguageEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      LanguageEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_LANGUAGE = "language";
  @SerializedName(SERIALIZED_NAME_LANGUAGE)
  private LanguageEnum language;

  public static final String SERIALIZED_NAME_MERCHANTS = "merchants";
  @SerializedName(SERIALIZED_NAME_MERCHANTS)
  private Set<String> merchants = new LinkedHashSet<>();

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private Set<String> roles = new LinkedHashSet<>();

  public User() {
  }

  public User id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }


  public User username(String username) {
    this.username = username;
    return this;
  }

  /**
   * The username of the User
   * @return username
   */
  @javax.annotation.Nonnull
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public User creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Timestamp that indicates when the user has been created
   * @return creationDate
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }


  public User state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @javax.annotation.Nullable
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }


  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public User surname1(String surname1) {
    this.surname1 = surname1;
    return this;
  }

  /**
   * Get surname1
   * @return surname1
   */
  @javax.annotation.Nullable
  public String getSurname1() {
    return surname1;
  }

  public void setSurname1(String surname1) {
    this.surname1 = surname1;
  }


  public User surname2(String surname2) {
    this.surname2 = surname2;
    return this;
  }

  /**
   * Get surname2
   * @return surname2
   */
  @javax.annotation.Nullable
  public String getSurname2() {
    return surname2;
  }

  public void setSurname2(String surname2) {
    this.surname2 = surname2;
  }


  public User phone1(String phone1) {
    this.phone1 = phone1;
    return this;
  }

  /**
   * Get phone1
   * @return phone1
   */
  @javax.annotation.Nullable
  public String getPhone1() {
    return phone1;
  }

  public void setPhone1(String phone1) {
    this.phone1 = phone1;
  }


  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
   */
  @javax.annotation.Nonnull
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public User docIdType(DocIdTypeEnum docIdType) {
    this.docIdType = docIdType;
    return this;
  }

  /**
   * Get docIdType
   * @return docIdType
   */
  @javax.annotation.Nullable
  public DocIdTypeEnum getDocIdType() {
    return docIdType;
  }

  public void setDocIdType(DocIdTypeEnum docIdType) {
    this.docIdType = docIdType;
  }


  public User docIdType2(DocIdType2Enum docIdType2) {
    this.docIdType2 = docIdType2;
    return this;
  }

  /**
   * Get docIdType2
   * @return docIdType2
   */
  @javax.annotation.Nullable
  public DocIdType2Enum getDocIdType2() {
    return docIdType2;
  }

  public void setDocIdType2(DocIdType2Enum docIdType2) {
    this.docIdType2 = docIdType2;
  }


  public User docIdNumber(String docIdNumber) {
    this.docIdNumber = docIdNumber;
    return this;
  }

  /**
   * Get docIdNumber
   * @return docIdNumber
   */
  @javax.annotation.Nullable
  public String getDocIdNumber() {
    return docIdNumber;
  }

  public void setDocIdNumber(String docIdNumber) {
    this.docIdNumber = docIdNumber;
  }


  public User docIdNumber2(String docIdNumber2) {
    this.docIdNumber2 = docIdNumber2;
    return this;
  }

  /**
   * Get docIdNumber2
   * @return docIdNumber2
   */
  @javax.annotation.Nullable
  public String getDocIdNumber2() {
    return docIdNumber2;
  }

  public void setDocIdNumber2(String docIdNumber2) {
    this.docIdNumber2 = docIdNumber2;
  }


  public User language(LanguageEnum language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
   */
  @javax.annotation.Nullable
  public LanguageEnum getLanguage() {
    return language;
  }

  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  public User merchants(Set<String> merchants) {
    this.merchants = merchants;
    return this;
  }

  public User addMerchantsItem(String merchantsItem) {
    if (this.merchants == null) {
      this.merchants = new LinkedHashSet<>();
    }
    this.merchants.add(merchantsItem);
    return this;
  }

  /**
   * Get merchants
   * @return merchants
   */
  @javax.annotation.Nonnull
  public Set<String> getMerchants() {
    return merchants;
  }

  public void setMerchants(Set<String> merchants) {
    this.merchants = merchants;
  }


  public User roles(Set<String> roles) {
    this.roles = roles;
    return this;
  }

  public User addRolesItem(String rolesItem) {
    if (this.roles == null) {
      this.roles = new LinkedHashSet<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nonnull
  public Set<String> getRoles() {
    return roles;
  }

  public void setRoles(Set<String> roles) {
    this.roles = roles;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.username, user.username) &&
        Objects.equals(this.creationDate, user.creationDate) &&
        Objects.equals(this.state, user.state) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.surname1, user.surname1) &&
        Objects.equals(this.surname2, user.surname2) &&
        Objects.equals(this.phone1, user.phone1) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.docIdType, user.docIdType) &&
        Objects.equals(this.docIdType2, user.docIdType2) &&
        Objects.equals(this.docIdNumber, user.docIdNumber) &&
        Objects.equals(this.docIdNumber2, user.docIdNumber2) &&
        Objects.equals(this.language, user.language) &&
        Objects.equals(this.merchants, user.merchants) &&
        Objects.equals(this.roles, user.roles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, username, creationDate, state, firstName, surname1, surname2, phone1, email, docIdType, docIdType2, docIdNumber, docIdNumber2, language, merchants, roles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    surname1: ").append(toIndentedString(surname1)).append("\n");
    sb.append("    surname2: ").append(toIndentedString(surname2)).append("\n");
    sb.append("    phone1: ").append(toIndentedString(phone1)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    docIdType: ").append(toIndentedString(docIdType)).append("\n");
    sb.append("    docIdType2: ").append(toIndentedString(docIdType2)).append("\n");
    sb.append("    docIdNumber: ").append(toIndentedString(docIdNumber)).append("\n");
    sb.append("    docIdNumber2: ").append(toIndentedString(docIdNumber2)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    merchants: ").append(toIndentedString(merchants)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
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
    openapiFields.add("username");
    openapiFields.add("creationDate");
    openapiFields.add("state");
    openapiFields.add("firstName");
    openapiFields.add("surname1");
    openapiFields.add("surname2");
    openapiFields.add("phone1");
    openapiFields.add("email");
    openapiFields.add("docIdType");
    openapiFields.add("docIdType2");
    openapiFields.add("docIdNumber");
    openapiFields.add("docIdNumber2");
    openapiFields.add("language");
    openapiFields.add("merchants");
    openapiFields.add("roles");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("username");
    openapiRequiredFields.add("email");
    openapiRequiredFields.add("merchants");
    openapiRequiredFields.add("roles");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to User
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!User.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in User is not found in the empty JSON string", User.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!User.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `User` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : User.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (!jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
      if ((jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) && !jsonObj.get("state").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `state` to be a primitive type in the JSON string but got `%s`", jsonObj.get("state").toString()));
      }
      // validate the optional field `state`
      if (jsonObj.get("state") != null && !jsonObj.get("state").isJsonNull()) {
        StateEnum.validateJsonElement(jsonObj.get("state"));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("surname1") != null && !jsonObj.get("surname1").isJsonNull()) && !jsonObj.get("surname1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname1").toString()));
      }
      if ((jsonObj.get("surname2") != null && !jsonObj.get("surname2").isJsonNull()) && !jsonObj.get("surname2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `surname2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("surname2").toString()));
      }
      if ((jsonObj.get("phone1") != null && !jsonObj.get("phone1").isJsonNull()) && !jsonObj.get("phone1").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone1` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone1").toString()));
      }
      if (!jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("docIdType") != null && !jsonObj.get("docIdType").isJsonNull()) && !jsonObj.get("docIdType").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docIdType` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docIdType").toString()));
      }
      // validate the optional field `docIdType`
      if (jsonObj.get("docIdType") != null && !jsonObj.get("docIdType").isJsonNull()) {
        DocIdTypeEnum.validateJsonElement(jsonObj.get("docIdType"));
      }
      if ((jsonObj.get("docIdType2") != null && !jsonObj.get("docIdType2").isJsonNull()) && !jsonObj.get("docIdType2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docIdType2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docIdType2").toString()));
      }
      // validate the optional field `docIdType2`
      if (jsonObj.get("docIdType2") != null && !jsonObj.get("docIdType2").isJsonNull()) {
        DocIdType2Enum.validateJsonElement(jsonObj.get("docIdType2"));
      }
      if ((jsonObj.get("docIdNumber") != null && !jsonObj.get("docIdNumber").isJsonNull()) && !jsonObj.get("docIdNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docIdNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docIdNumber").toString()));
      }
      if ((jsonObj.get("docIdNumber2") != null && !jsonObj.get("docIdNumber2").isJsonNull()) && !jsonObj.get("docIdNumber2").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docIdNumber2` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docIdNumber2").toString()));
      }
      if ((jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) && !jsonObj.get("language").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `language` to be a primitive type in the JSON string but got `%s`", jsonObj.get("language").toString()));
      }
      // validate the optional field `language`
      if (jsonObj.get("language") != null && !jsonObj.get("language").isJsonNull()) {
        LanguageEnum.validateJsonElement(jsonObj.get("language"));
      }
      // ensure the required json array is present
      if (jsonObj.get("merchants") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("merchants").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchants` to be an array in the JSON string but got `%s`", jsonObj.get("merchants").toString()));
      }
      // ensure the required json array is present
      if (jsonObj.get("roles") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("roles").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `roles` to be an array in the JSON string but got `%s`", jsonObj.get("roles").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!User.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'User' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<User> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(User.class));

       return (TypeAdapter<T>) new TypeAdapter<User>() {
           @Override
           public void write(JsonWriter out, User value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public User read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of User given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of User
   * @throws IOException if the JSON string is invalid with respect to User
   */
  public static User fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, User.class);
  }

  /**
   * Convert an instance of User to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

