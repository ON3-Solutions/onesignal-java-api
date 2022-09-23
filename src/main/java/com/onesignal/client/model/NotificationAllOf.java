/*
 * OneSignal
 * A powerful way to send personalized messages at scale and build effective customer engagement strategies. Learn more at onesignal.com
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: devrel@onesignal.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.onesignal.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import java.io.Serializable;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.onesignal.client.JSON;

/**
 * NotificationAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-23T18:25:18.425Z[Etc/UTC]")
public class NotificationAllOf {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SEND_AFTER = "send_after";
  @SerializedName(SERIALIZED_NAME_SEND_AFTER)
  private OffsetDateTime sendAfter;

  public NotificationAllOf() { 
  }

  public NotificationAllOf sendAfter(OffsetDateTime sendAfter) {
    
    this.sendAfter = sendAfter;
    return this;
  }

   /**
   * Channel: All Schedule notification for future delivery. API defaults to UTC -1100 Examples: All examples are the exact same date &amp; time. \&quot;Thu Sep 24 2015 14:00:00 GMT-0700 (PDT)\&quot; \&quot;September 24th 2015, 2:00:00 pm UTC-07:00\&quot; \&quot;2015-09-24 14:00:00 GMT-0700\&quot; \&quot;Sept 24 2015 14:00:00 GMT-0700\&quot; \&quot;Thu Sep 24 2015 14:00:00 GMT-0700 (Pacific Daylight Time)\&quot; Note: SMS currently only supports send_after parameter. 
   * @return sendAfter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Channel: All Schedule notification for future delivery. API defaults to UTC -1100 Examples: All examples are the exact same date & time. \"Thu Sep 24 2015 14:00:00 GMT-0700 (PDT)\" \"September 24th 2015, 2:00:00 pm UTC-07:00\" \"2015-09-24 14:00:00 GMT-0700\" \"Sept 24 2015 14:00:00 GMT-0700\" \"Thu Sep 24 2015 14:00:00 GMT-0700 (Pacific Daylight Time)\" Note: SMS currently only supports send_after parameter. ")

  public OffsetDateTime getSendAfter() {
    return sendAfter;
  }


  public void setSendAfter(OffsetDateTime sendAfter) {
    this.sendAfter = sendAfter;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationAllOf notificationAllOf = (NotificationAllOf) o;
    return Objects.equals(this.sendAfter, notificationAllOf.sendAfter);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(sendAfter);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationAllOf {\n");
    sb.append("    sendAfter: ").append(toIndentedString(sendAfter)).append("\n");
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
    openapiFields.add("send_after");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NotificationAllOf.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NotificationAllOf' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NotificationAllOf> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NotificationAllOf.class));

       return (TypeAdapter<T>) new TypeAdapter<NotificationAllOf>() {
           @Override
           public void write(JsonWriter out, NotificationAllOf value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NotificationAllOf read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();

             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NotificationAllOf given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NotificationAllOf
  * @throws IOException if the JSON string is invalid with respect to NotificationAllOf
  */
  public static NotificationAllOf fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NotificationAllOf.class);
  }

 /**
  * Convert an instance of NotificationAllOf to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

