// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/recipes.proto

package service;

public interface IngredientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:services.Ingredient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * in grams
   * </pre>
   *
   * <code>int32 quantity = 2;</code>
   * @return The quantity.
   */
  int getQuantity();

  /**
   * <pre>
   * any user details
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The details.
   */
  java.lang.String getDetails();
  /**
   * <pre>
   * any user details
   * </pre>
   *
   * <code>string details = 3;</code>
   * @return The bytes for details.
   */
  com.google.protobuf.ByteString
      getDetailsBytes();
}
