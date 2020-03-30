// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: printer.proto

package devices;

/**
 * Protobuf type {@code printer.MultiStringResponse}
 */
public  final class MultiStringResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:printer.MultiStringResponse)
    MultiStringResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MultiStringResponse.newBuilder() to construct.
  private MultiStringResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MultiStringResponse() {
    multiresponse_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MultiStringResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MultiStringResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              multiresponse_ = new java.util.ArrayList<devices.StringRequest>();
              mutable_bitField0_ |= 0x00000001;
            }
            multiresponse_.add(
                input.readMessage(devices.StringRequest.parser(), extensionRegistry));
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
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        multiresponse_ = java.util.Collections.unmodifiableList(multiresponse_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return devices.PrinterServiceImpl.internal_static_printer_MultiStringResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return devices.PrinterServiceImpl.internal_static_printer_MultiStringResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            devices.MultiStringResponse.class, devices.MultiStringResponse.Builder.class);
  }

  public static final int MULTIRESPONSE_FIELD_NUMBER = 1;
  private java.util.List<devices.StringRequest> multiresponse_;
  /**
   * <code>repeated .printer.StringRequest multiresponse = 1;</code>
   */
  public java.util.List<devices.StringRequest> getMultiresponseList() {
    return multiresponse_;
  }
  /**
   * <code>repeated .printer.StringRequest multiresponse = 1;</code>
   */
  public java.util.List<? extends devices.StringRequestOrBuilder> 
      getMultiresponseOrBuilderList() {
    return multiresponse_;
  }
  /**
   * <code>repeated .printer.StringRequest multiresponse = 1;</code>
   */
  public int getMultiresponseCount() {
    return multiresponse_.size();
  }
  /**
   * <code>repeated .printer.StringRequest multiresponse = 1;</code>
   */
  public devices.StringRequest getMultiresponse(int index) {
    return multiresponse_.get(index);
  }
  /**
   * <code>repeated .printer.StringRequest multiresponse = 1;</code>
   */
  public devices.StringRequestOrBuilder getMultiresponseOrBuilder(
      int index) {
    return multiresponse_.get(index);
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
    for (int i = 0; i < multiresponse_.size(); i++) {
      output.writeMessage(1, multiresponse_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < multiresponse_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, multiresponse_.get(i));
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
    if (!(obj instanceof devices.MultiStringResponse)) {
      return super.equals(obj);
    }
    devices.MultiStringResponse other = (devices.MultiStringResponse) obj;

    if (!getMultiresponseList()
        .equals(other.getMultiresponseList())) return false;
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
    if (getMultiresponseCount() > 0) {
      hash = (37 * hash) + MULTIRESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getMultiresponseList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static devices.MultiStringResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static devices.MultiStringResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static devices.MultiStringResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static devices.MultiStringResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static devices.MultiStringResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static devices.MultiStringResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static devices.MultiStringResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static devices.MultiStringResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static devices.MultiStringResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static devices.MultiStringResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static devices.MultiStringResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static devices.MultiStringResponse parseFrom(
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
  public static Builder newBuilder(devices.MultiStringResponse prototype) {
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
   * Protobuf type {@code printer.MultiStringResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:printer.MultiStringResponse)
      devices.MultiStringResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return devices.PrinterServiceImpl.internal_static_printer_MultiStringResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return devices.PrinterServiceImpl.internal_static_printer_MultiStringResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              devices.MultiStringResponse.class, devices.MultiStringResponse.Builder.class);
    }

    // Construct using devices.printer.MultiStringResponse.newBuilder()
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
        getMultiresponseFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (multiresponseBuilder_ == null) {
        multiresponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        multiresponseBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return devices.PrinterServiceImpl.internal_static_printer_MultiStringResponse_descriptor;
    }

    @java.lang.Override
    public devices.MultiStringResponse getDefaultInstanceForType() {
      return devices.MultiStringResponse.getDefaultInstance();
    }

    @java.lang.Override
    public devices.MultiStringResponse build() {
      devices.MultiStringResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public devices.MultiStringResponse buildPartial() {
      devices.MultiStringResponse result = new devices.MultiStringResponse(this);
      int from_bitField0_ = bitField0_;
      if (multiresponseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          multiresponse_ = java.util.Collections.unmodifiableList(multiresponse_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.multiresponse_ = multiresponse_;
      } else {
        result.multiresponse_ = multiresponseBuilder_.build();
      }
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
      if (other instanceof devices.MultiStringResponse) {
        return mergeFrom((devices.MultiStringResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(devices.MultiStringResponse other) {
      if (other == devices.MultiStringResponse.getDefaultInstance()) return this;
      if (multiresponseBuilder_ == null) {
        if (!other.multiresponse_.isEmpty()) {
          if (multiresponse_.isEmpty()) {
            multiresponse_ = other.multiresponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMultiresponseIsMutable();
            multiresponse_.addAll(other.multiresponse_);
          }
          onChanged();
        }
      } else {
        if (!other.multiresponse_.isEmpty()) {
          if (multiresponseBuilder_.isEmpty()) {
            multiresponseBuilder_.dispose();
            multiresponseBuilder_ = null;
            multiresponse_ = other.multiresponse_;
            bitField0_ = (bitField0_ & ~0x00000001);
            multiresponseBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMultiresponseFieldBuilder() : null;
          } else {
            multiresponseBuilder_.addAllMessages(other.multiresponse_);
          }
        }
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
      devices.MultiStringResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (devices.MultiStringResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<devices.StringRequest> multiresponse_ =
      java.util.Collections.emptyList();
    private void ensureMultiresponseIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        multiresponse_ = new java.util.ArrayList<devices.StringRequest>(multiresponse_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        devices.StringRequest, devices.StringRequest.Builder, devices.StringRequestOrBuilder> multiresponseBuilder_;

    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public java.util.List<devices.StringRequest> getMultiresponseList() {
      if (multiresponseBuilder_ == null) {
        return java.util.Collections.unmodifiableList(multiresponse_);
      } else {
        return multiresponseBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public int getMultiresponseCount() {
      if (multiresponseBuilder_ == null) {
        return multiresponse_.size();
      } else {
        return multiresponseBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public devices.StringRequest getMultiresponse(int index) {
      if (multiresponseBuilder_ == null) {
        return multiresponse_.get(index);
      } else {
        return multiresponseBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder setMultiresponse(
        int index, devices.StringRequest value) {
      if (multiresponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiresponseIsMutable();
        multiresponse_.set(index, value);
        onChanged();
      } else {
        multiresponseBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder setMultiresponse(
        int index, devices.StringRequest.Builder builderForValue) {
      if (multiresponseBuilder_ == null) {
        ensureMultiresponseIsMutable();
        multiresponse_.set(index, builderForValue.build());
        onChanged();
      } else {
        multiresponseBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder addMultiresponse(devices.StringRequest value) {
      if (multiresponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiresponseIsMutable();
        multiresponse_.add(value);
        onChanged();
      } else {
        multiresponseBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder addMultiresponse(
        int index, devices.StringRequest value) {
      if (multiresponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMultiresponseIsMutable();
        multiresponse_.add(index, value);
        onChanged();
      } else {
        multiresponseBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder addMultiresponse(
        devices.StringRequest.Builder builderForValue) {
      if (multiresponseBuilder_ == null) {
        ensureMultiresponseIsMutable();
        multiresponse_.add(builderForValue.build());
        onChanged();
      } else {
        multiresponseBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder addMultiresponse(
        int index, devices.StringRequest.Builder builderForValue) {
      if (multiresponseBuilder_ == null) {
        ensureMultiresponseIsMutable();
        multiresponse_.add(index, builderForValue.build());
        onChanged();
      } else {
        multiresponseBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder addAllMultiresponse(
        java.lang.Iterable<? extends devices.StringRequest> values) {
      if (multiresponseBuilder_ == null) {
        ensureMultiresponseIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, multiresponse_);
        onChanged();
      } else {
        multiresponseBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder clearMultiresponse() {
      if (multiresponseBuilder_ == null) {
        multiresponse_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        multiresponseBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public Builder removeMultiresponse(int index) {
      if (multiresponseBuilder_ == null) {
        ensureMultiresponseIsMutable();
        multiresponse_.remove(index);
        onChanged();
      } else {
        multiresponseBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public devices.StringRequest.Builder getMultiresponseBuilder(
        int index) {
      return getMultiresponseFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public devices.StringRequestOrBuilder getMultiresponseOrBuilder(
        int index) {
      if (multiresponseBuilder_ == null) {
        return multiresponse_.get(index);  } else {
        return multiresponseBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public java.util.List<? extends devices.StringRequestOrBuilder> 
         getMultiresponseOrBuilderList() {
      if (multiresponseBuilder_ != null) {
        return multiresponseBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(multiresponse_);
      }
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public devices.StringRequest.Builder addMultiresponseBuilder() {
      return getMultiresponseFieldBuilder().addBuilder(
          devices.StringRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public devices.StringRequest.Builder addMultiresponseBuilder(
        int index) {
      return getMultiresponseFieldBuilder().addBuilder(
          index, devices.StringRequest.getDefaultInstance());
    }
    /**
     * <code>repeated .printer.StringRequest multiresponse = 1;</code>
     */
    public java.util.List<devices.StringRequest.Builder> 
         getMultiresponseBuilderList() {
      return getMultiresponseFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        devices.StringRequest, devices.StringRequest.Builder, devices.StringRequestOrBuilder> 
        getMultiresponseFieldBuilder() {
      if (multiresponseBuilder_ == null) {
        multiresponseBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            devices.StringRequest, devices.StringRequest.Builder, devices.StringRequestOrBuilder>(
                multiresponse_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        multiresponse_ = null;
      }
      return multiresponseBuilder_;
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


    // @@protoc_insertion_point(builder_scope:printer.MultiStringResponse)
  }

  // @@protoc_insertion_point(class_scope:printer.MultiStringResponse)
  private static final devices.MultiStringResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new devices.MultiStringResponse();
  }

  public static devices.MultiStringResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiStringResponse>
      PARSER = new com.google.protobuf.AbstractParser<MultiStringResponse>() {
    @java.lang.Override
    public MultiStringResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MultiStringResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MultiStringResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiStringResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public devices.MultiStringResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

