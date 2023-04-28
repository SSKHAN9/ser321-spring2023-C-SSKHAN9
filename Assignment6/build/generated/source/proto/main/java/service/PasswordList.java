// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/password.proto

package service;

/**
 * Protobuf type {@code services.PasswordList}
 */
public final class PasswordList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:services.PasswordList)
    PasswordListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PasswordList.newBuilder() to construct.
  private PasswordList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PasswordList() {
    passList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PasswordList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PasswordList(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              passList_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            passList_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        passList_ = passList_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return service.CaesarProto.internal_static_services_PasswordList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return service.CaesarProto.internal_static_services_PasswordList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            service.PasswordList.class, service.PasswordList.Builder.class);
  }

  public static final int PASSLIST_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList passList_;
  /**
   * <pre>
   * list of names of the saved passwords
   * </pre>
   *
   * <code>repeated string passList = 1;</code>
   * @return A list containing the passList.
   */
  public com.google.protobuf.ProtocolStringList
      getPassListList() {
    return passList_;
  }
  /**
   * <pre>
   * list of names of the saved passwords
   * </pre>
   *
   * <code>repeated string passList = 1;</code>
   * @return The count of passList.
   */
  public int getPassListCount() {
    return passList_.size();
  }
  /**
   * <pre>
   * list of names of the saved passwords
   * </pre>
   *
   * <code>repeated string passList = 1;</code>
   * @param index The index of the element to return.
   * @return The passList at the given index.
   */
  public java.lang.String getPassList(int index) {
    return passList_.get(index);
  }
  /**
   * <pre>
   * list of names of the saved passwords
   * </pre>
   *
   * <code>repeated string passList = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the passList at the given index.
   */
  public com.google.protobuf.ByteString
      getPassListBytes(int index) {
    return passList_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < passList_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, passList_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < passList_.size(); i++) {
        dataSize += computeStringSizeNoTag(passList_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPassListList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof service.PasswordList)) {
      return super.equals(obj);
    }
    service.PasswordList other = (service.PasswordList) obj;

    if (!getPassListList()
        .equals(other.getPassListList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPassListCount() > 0) {
      hash = (37 * hash) + PASSLIST_FIELD_NUMBER;
      hash = (53 * hash) + getPassListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static service.PasswordList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.PasswordList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.PasswordList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.PasswordList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.PasswordList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static service.PasswordList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static service.PasswordList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.PasswordList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.PasswordList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static service.PasswordList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static service.PasswordList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static service.PasswordList parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(service.PasswordList prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code services.PasswordList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:services.PasswordList)
      service.PasswordListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return service.CaesarProto.internal_static_services_PasswordList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return service.CaesarProto.internal_static_services_PasswordList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              service.PasswordList.class, service.PasswordList.Builder.class);
    }

    // Construct using service.PasswordList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      passList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return service.CaesarProto.internal_static_services_PasswordList_descriptor;
    }

    @java.lang.Override
    public service.PasswordList getDefaultInstanceForType() {
      return service.PasswordList.getDefaultInstance();
    }

    @java.lang.Override
    public service.PasswordList build() {
      service.PasswordList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public service.PasswordList buildPartial() {
      service.PasswordList result = new service.PasswordList(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        passList_ = passList_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.passList_ = passList_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof service.PasswordList) {
        return mergeFrom((service.PasswordList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(service.PasswordList other) {
      if (other == service.PasswordList.getDefaultInstance()) return this;
      if (!other.passList_.isEmpty()) {
        if (passList_.isEmpty()) {
          passList_ = other.passList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePassListIsMutable();
          passList_.addAll(other.passList_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      service.PasswordList parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (service.PasswordList) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList passList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePassListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        passList_ = new com.google.protobuf.LazyStringArrayList(passList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @return A list containing the passList.
     */
    public com.google.protobuf.ProtocolStringList
        getPassListList() {
      return passList_.getUnmodifiableView();
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @return The count of passList.
     */
    public int getPassListCount() {
      return passList_.size();
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param index The index of the element to return.
     * @return The passList at the given index.
     */
    public java.lang.String getPassList(int index) {
      return passList_.get(index);
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the passList at the given index.
     */
    public com.google.protobuf.ByteString
        getPassListBytes(int index) {
      return passList_.getByteString(index);
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param index The index to set the value at.
     * @param value The passList to set.
     * @return This builder for chaining.
     */
    public Builder setPassList(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePassListIsMutable();
      passList_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param value The passList to add.
     * @return This builder for chaining.
     */
    public Builder addPassList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePassListIsMutable();
      passList_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param values The passList to add.
     * @return This builder for chaining.
     */
    public Builder addAllPassList(
        java.lang.Iterable<java.lang.String> values) {
      ensurePassListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, passList_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPassList() {
      passList_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * list of names of the saved passwords
     * </pre>
     *
     * <code>repeated string passList = 1;</code>
     * @param value The bytes of the passList to add.
     * @return This builder for chaining.
     */
    public Builder addPassListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePassListIsMutable();
      passList_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:services.PasswordList)
  }

  // @@protoc_insertion_point(class_scope:services.PasswordList)
  private static final service.PasswordList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new service.PasswordList();
  }

  public static service.PasswordList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PasswordList>
      PARSER = new com.google.protobuf.AbstractParser<PasswordList>() {
    @java.lang.Override
    public PasswordList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PasswordList(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PasswordList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PasswordList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public service.PasswordList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
