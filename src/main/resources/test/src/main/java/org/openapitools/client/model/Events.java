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
 * Holds information about the events e.g. callback url, event types you&#39;re interested in ...
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class Events {
  public static final String SERIALIZED_NAME_EVENTS_U_R_L = "eventsURL";
  @SerializedName(SERIALIZED_NAME_EVENTS_U_R_L)
  private String eventsURL;

  /**
   * The events that you want to be notified about. If left empty or null we will assume that you&#39;re interested in all of them.
   */
  @JsonAdapter(EventTypesEnum.Adapter.class)
  public enum EventTypesEnum {
    OFFER_UPDATE("OFFER_UPDATE"),
    
    STATE_UPDATE("STATE_UPDATE"),
    
    SIGNATURE_UPDATE("SIGNATURE_UPDATE"),
    
    INCIDENT_UPDATE("INCIDENT_UPDATE"),
    
    COMMENT_UPDATE("COMMENT_UPDATE"),
    
    DELETED("DELETED"),
    
    PAYMENT_STATE_CHANGE("PAYMENT_STATE_CHANGE"),
    
    DOCS_UPDATE("DOCS_UPDATE"),
    
    DOWN_PAYMENT("DOWN_PAYMENT"),
    
    PARTIAL_RETURN("PARTIAL_RETURN");

    private String value;

    EventTypesEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EventTypesEnum fromValue(String value) {
      for (EventTypesEnum b : EventTypesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<EventTypesEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EventTypesEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EventTypesEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return EventTypesEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      String value = jsonElement.getAsString();
      EventTypesEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_EVENT_TYPES = "eventTypes";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPES)
  private Set<EventTypesEnum> eventTypes = new LinkedHashSet<>();

  public Events() {
  }

  public Events eventsURL(String eventsURL) {
    this.eventsURL = eventsURL;
    return this;
  }

  /**
   * The URL we will POST event information when an event occurs
   * @return eventsURL
   */
  @javax.annotation.Nonnull
  public String getEventsURL() {
    return eventsURL;
  }

  public void setEventsURL(String eventsURL) {
    this.eventsURL = eventsURL;
  }


  public Events eventTypes(Set<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
    return this;
  }

  public Events addEventTypesItem(EventTypesEnum eventTypesItem) {
    if (this.eventTypes == null) {
      this.eventTypes = new LinkedHashSet<>();
    }
    this.eventTypes.add(eventTypesItem);
    return this;
  }

  /**
   * The events that you want to be notified about. If left empty or null we will assume that you&#39;re interested in all of them.
   * @return eventTypes
   */
  @javax.annotation.Nullable
  public Set<EventTypesEnum> getEventTypes() {
    return eventTypes;
  }

  public void setEventTypes(Set<EventTypesEnum> eventTypes) {
    this.eventTypes = eventTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Events events = (Events) o;
    return Objects.equals(this.eventsURL, events.eventsURL) &&
        Objects.equals(this.eventTypes, events.eventTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventsURL, eventTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Events {\n");
    sb.append("    eventsURL: ").append(toIndentedString(eventsURL)).append("\n");
    sb.append("    eventTypes: ").append(toIndentedString(eventTypes)).append("\n");
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
    openapiFields.add("eventsURL");
    openapiFields.add("eventTypes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("eventsURL");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Events
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Events.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Events is not found in the empty JSON string", Events.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Events.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Events` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Events.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("eventsURL").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventsURL` to be a primitive type in the JSON string but got `%s`", jsonObj.get("eventsURL").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("eventTypes") != null && !jsonObj.get("eventTypes").isJsonNull() && !jsonObj.get("eventTypes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `eventTypes` to be an array in the JSON string but got `%s`", jsonObj.get("eventTypes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Events.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Events' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Events> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Events.class));

       return (TypeAdapter<T>) new TypeAdapter<Events>() {
           @Override
           public void write(JsonWriter out, Events value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Events read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Events given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Events
   * @throws IOException if the JSON string is invalid with respect to Events
   */
  public static Events fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Events.class);
  }

  /**
   * Convert an instance of Events to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

