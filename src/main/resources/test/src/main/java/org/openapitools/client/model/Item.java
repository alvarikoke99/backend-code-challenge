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
 * Optional field that represents the collection items included in the order (by default this field is not required).
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-23T19:03:15.118012600+02:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class Item {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_QUANTITY = "quantity";
  @SerializedName(SERIALIZED_NAME_QUANTITY)
  private Integer quantity;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_PRE_TAX_PRICE = "preTaxPrice";
  @SerializedName(SERIALIZED_NAME_PRE_TAX_PRICE)
  private String preTaxPrice;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private String discount;

  public static final String SERIALIZED_NAME_TAX_RATE = "taxRate";
  @SerializedName(SERIALIZED_NAME_TAX_RATE)
  private String taxRate;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private String reference;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_SUBCATEGORY = "subcategory";
  @SerializedName(SERIALIZED_NAME_SUBCATEGORY)
  private String subcategory;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public Item() {
  }

  public Item id(UUID id) {
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


  public Item name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name/description of the item.
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Item type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Type of good or service sold.
   * @return type
   */
  @javax.annotation.Nullable
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public Item quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity of the item included in the order.
   * @return quantity
   */
  @javax.annotation.Nullable
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }


  public Item price(String price) {
    this.price = price;
    return this;
  }

  /**
   * Price per unit of the item (including any tax and/or discount). The calculation of the unit price is: price &#x3D; (preTaxPrice - discount) * (1 + taxRate)
   * @return price
   */
  @javax.annotation.Nullable
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }


  public Item preTaxPrice(String preTaxPrice) {
    this.preTaxPrice = preTaxPrice;
    return this;
  }

  /**
   * Pre-tax price per unit of the item.
   * @return preTaxPrice
   */
  @javax.annotation.Nullable
  public String getPreTaxPrice() {
    return preTaxPrice;
  }

  public void setPreTaxPrice(String preTaxPrice) {
    this.preTaxPrice = preTaxPrice;
  }


  public Item discount(String discount) {
    this.discount = discount;
    return this;
  }

  /**
   * Discount per unit of the item (in currency units).
   * @return discount
   */
  @javax.annotation.Nullable
  public String getDiscount() {
    return discount;
  }

  public void setDiscount(String discount) {
    this.discount = discount;
  }


  public Item taxRate(String taxRate) {
    this.taxRate = taxRate;
    return this;
  }

  /**
   * Article tax rate, expressed as a decimal (e.g. &#39;0.21&#39;).
   * @return taxRate
   */
  @javax.annotation.Nullable
  public String getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(String taxRate) {
    this.taxRate = taxRate;
  }


  public Item reference(String reference) {
    this.reference = reference;
    return this;
  }

  /**
   * Serial number / reference of the item.
   * @return reference
   */
  @javax.annotation.Nullable
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }


  public Item category(String category) {
    this.category = category;
    return this;
  }

  /**
   * Category of the item.
   * @return category
   */
  @javax.annotation.Nullable
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  public Item subcategory(String subcategory) {
    this.subcategory = subcategory;
    return this;
  }

  /**
   * Subcategory of the item.
   * @return subcategory
   */
  @javax.annotation.Nullable
  public String getSubcategory() {
    return subcategory;
  }

  public void setSubcategory(String subcategory) {
    this.subcategory = subcategory;
  }


  public Item description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Product description.
   * @return description
   */
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  public Item url(String url) {
    this.url = url;
    return this;
  }

  /**
   * Product page URL in the shop.
   * @return url
   */
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  public Item imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  /**
   * Item image absolute URL.
   * @return imageUrl
   */
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.name, item.name) &&
        Objects.equals(this.type, item.type) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.price, item.price) &&
        Objects.equals(this.preTaxPrice, item.preTaxPrice) &&
        Objects.equals(this.discount, item.discount) &&
        Objects.equals(this.taxRate, item.taxRate) &&
        Objects.equals(this.reference, item.reference) &&
        Objects.equals(this.category, item.category) &&
        Objects.equals(this.subcategory, item.subcategory) &&
        Objects.equals(this.description, item.description) &&
        Objects.equals(this.url, item.url) &&
        Objects.equals(this.imageUrl, item.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, quantity, price, preTaxPrice, discount, taxRate, reference, category, subcategory, description, url, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    preTaxPrice: ").append(toIndentedString(preTaxPrice)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    subcategory: ").append(toIndentedString(subcategory)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("quantity");
    openapiFields.add("price");
    openapiFields.add("preTaxPrice");
    openapiFields.add("discount");
    openapiFields.add("taxRate");
    openapiFields.add("reference");
    openapiFields.add("category");
    openapiFields.add("subcategory");
    openapiFields.add("description");
    openapiFields.add("url");
    openapiFields.add("imageUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Item
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Item.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Item is not found in the empty JSON string", Item.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Item.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Item` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if ((jsonObj.get("price") != null && !jsonObj.get("price").isJsonNull()) && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if ((jsonObj.get("preTaxPrice") != null && !jsonObj.get("preTaxPrice").isJsonNull()) && !jsonObj.get("preTaxPrice").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `preTaxPrice` to be a primitive type in the JSON string but got `%s`", jsonObj.get("preTaxPrice").toString()));
      }
      if ((jsonObj.get("discount") != null && !jsonObj.get("discount").isJsonNull()) && !jsonObj.get("discount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount").toString()));
      }
      if ((jsonObj.get("taxRate") != null && !jsonObj.get("taxRate").isJsonNull()) && !jsonObj.get("taxRate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `taxRate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("taxRate").toString()));
      }
      if ((jsonObj.get("reference") != null && !jsonObj.get("reference").isJsonNull()) && !jsonObj.get("reference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `reference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("reference").toString()));
      }
      if ((jsonObj.get("category") != null && !jsonObj.get("category").isJsonNull()) && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if ((jsonObj.get("subcategory") != null && !jsonObj.get("subcategory").isJsonNull()) && !jsonObj.get("subcategory").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subcategory` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subcategory").toString()));
      }
      if ((jsonObj.get("description") != null && !jsonObj.get("description").isJsonNull()) && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("imageUrl") != null && !jsonObj.get("imageUrl").isJsonNull()) && !jsonObj.get("imageUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Item.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Item' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Item> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Item.class));

       return (TypeAdapter<T>) new TypeAdapter<Item>() {
           @Override
           public void write(JsonWriter out, Item value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Item read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Item given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Item
   * @throws IOException if the JSON string is invalid with respect to Item
   */
  public static Item fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Item.class);
  }

  /**
   * Convert an instance of Item to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

