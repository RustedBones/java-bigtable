/*
 * Copyright 2023 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/admin/v2/table.proto

package com.google.bigtable.admin.v2;

/**
 *
 *
 * <pre>
 * Change stream configuration.
 * </pre>
 *
 * Protobuf type {@code google.bigtable.admin.v2.ChangeStreamConfig}
 */
public final class ChangeStreamConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.bigtable.admin.v2.ChangeStreamConfig)
    ChangeStreamConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ChangeStreamConfig.newBuilder() to construct.
  private ChangeStreamConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ChangeStreamConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ChangeStreamConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.bigtable.admin.v2.TableProto
        .internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.bigtable.admin.v2.TableProto
        .internal_static_google_bigtable_admin_v2_ChangeStreamConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.bigtable.admin.v2.ChangeStreamConfig.class,
            com.google.bigtable.admin.v2.ChangeStreamConfig.Builder.class);
  }

  public static final int RETENTION_PERIOD_FIELD_NUMBER = 1;
  private com.google.protobuf.Duration retentionPeriod_;
  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   *
   * @return Whether the retentionPeriod field is set.
   */
  @java.lang.Override
  public boolean hasRetentionPeriod() {
    return retentionPeriod_ != null;
  }
  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   *
   * @return The retentionPeriod.
   */
  @java.lang.Override
  public com.google.protobuf.Duration getRetentionPeriod() {
    return retentionPeriod_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : retentionPeriod_;
  }
  /**
   *
   *
   * <pre>
   * How long the change stream should be retained. Change stream data older
   * than the retention period will not be returned when reading the change
   * stream from the table.
   * Values must be at least 1 day and at most 7 days, and will be truncated to
   * microsecond granularity.
   * </pre>
   *
   * <code>.google.protobuf.Duration retention_period = 1;</code>
   */
  @java.lang.Override
  public com.google.protobuf.DurationOrBuilder getRetentionPeriodOrBuilder() {
    return retentionPeriod_ == null
        ? com.google.protobuf.Duration.getDefaultInstance()
        : retentionPeriod_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (retentionPeriod_ != null) {
      output.writeMessage(1, getRetentionPeriod());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (retentionPeriod_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRetentionPeriod());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.bigtable.admin.v2.ChangeStreamConfig)) {
      return super.equals(obj);
    }
    com.google.bigtable.admin.v2.ChangeStreamConfig other =
        (com.google.bigtable.admin.v2.ChangeStreamConfig) obj;

    if (hasRetentionPeriod() != other.hasRetentionPeriod()) return false;
    if (hasRetentionPeriod()) {
      if (!getRetentionPeriod().equals(other.getRetentionPeriod())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasRetentionPeriod()) {
      hash = (37 * hash) + RETENTION_PERIOD_FIELD_NUMBER;
      hash = (53 * hash) + getRetentionPeriod().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.bigtable.admin.v2.ChangeStreamConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Change stream configuration.
   * </pre>
   *
   * Protobuf type {@code google.bigtable.admin.v2.ChangeStreamConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.bigtable.admin.v2.ChangeStreamConfig)
      com.google.bigtable.admin.v2.ChangeStreamConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ChangeStreamConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.bigtable.admin.v2.ChangeStreamConfig.class,
              com.google.bigtable.admin.v2.ChangeStreamConfig.Builder.class);
    }

    // Construct using com.google.bigtable.admin.v2.ChangeStreamConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      retentionPeriod_ = null;
      if (retentionPeriodBuilder_ != null) {
        retentionPeriodBuilder_.dispose();
        retentionPeriodBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.bigtable.admin.v2.TableProto
          .internal_static_google_bigtable_admin_v2_ChangeStreamConfig_descriptor;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ChangeStreamConfig getDefaultInstanceForType() {
      return com.google.bigtable.admin.v2.ChangeStreamConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ChangeStreamConfig build() {
      com.google.bigtable.admin.v2.ChangeStreamConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.bigtable.admin.v2.ChangeStreamConfig buildPartial() {
      com.google.bigtable.admin.v2.ChangeStreamConfig result =
          new com.google.bigtable.admin.v2.ChangeStreamConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.bigtable.admin.v2.ChangeStreamConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.retentionPeriod_ =
            retentionPeriodBuilder_ == null ? retentionPeriod_ : retentionPeriodBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.bigtable.admin.v2.ChangeStreamConfig) {
        return mergeFrom((com.google.bigtable.admin.v2.ChangeStreamConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.bigtable.admin.v2.ChangeStreamConfig other) {
      if (other == com.google.bigtable.admin.v2.ChangeStreamConfig.getDefaultInstance())
        return this;
      if (other.hasRetentionPeriod()) {
        mergeRetentionPeriod(other.getRetentionPeriod());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(getRetentionPeriodFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Duration retentionPeriod_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        retentionPeriodBuilder_;
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     *
     * @return Whether the retentionPeriod field is set.
     */
    public boolean hasRetentionPeriod() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     *
     * @return The retentionPeriod.
     */
    public com.google.protobuf.Duration getRetentionPeriod() {
      if (retentionPeriodBuilder_ == null) {
        return retentionPeriod_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retentionPeriod_;
      } else {
        return retentionPeriodBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public Builder setRetentionPeriod(com.google.protobuf.Duration value) {
      if (retentionPeriodBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retentionPeriod_ = value;
      } else {
        retentionPeriodBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public Builder setRetentionPeriod(com.google.protobuf.Duration.Builder builderForValue) {
      if (retentionPeriodBuilder_ == null) {
        retentionPeriod_ = builderForValue.build();
      } else {
        retentionPeriodBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public Builder mergeRetentionPeriod(com.google.protobuf.Duration value) {
      if (retentionPeriodBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && retentionPeriod_ != null
            && retentionPeriod_ != com.google.protobuf.Duration.getDefaultInstance()) {
          getRetentionPeriodBuilder().mergeFrom(value);
        } else {
          retentionPeriod_ = value;
        }
      } else {
        retentionPeriodBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public Builder clearRetentionPeriod() {
      bitField0_ = (bitField0_ & ~0x00000001);
      retentionPeriod_ = null;
      if (retentionPeriodBuilder_ != null) {
        retentionPeriodBuilder_.dispose();
        retentionPeriodBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public com.google.protobuf.Duration.Builder getRetentionPeriodBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRetentionPeriodFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    public com.google.protobuf.DurationOrBuilder getRetentionPeriodOrBuilder() {
      if (retentionPeriodBuilder_ != null) {
        return retentionPeriodBuilder_.getMessageOrBuilder();
      } else {
        return retentionPeriod_ == null
            ? com.google.protobuf.Duration.getDefaultInstance()
            : retentionPeriod_;
      }
    }
    /**
     *
     *
     * <pre>
     * How long the change stream should be retained. Change stream data older
     * than the retention period will not be returned when reading the change
     * stream from the table.
     * Values must be at least 1 day and at most 7 days, and will be truncated to
     * microsecond granularity.
     * </pre>
     *
     * <code>.google.protobuf.Duration retention_period = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Duration,
            com.google.protobuf.Duration.Builder,
            com.google.protobuf.DurationOrBuilder>
        getRetentionPeriodFieldBuilder() {
      if (retentionPeriodBuilder_ == null) {
        retentionPeriodBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Duration,
                com.google.protobuf.Duration.Builder,
                com.google.protobuf.DurationOrBuilder>(
                getRetentionPeriod(), getParentForChildren(), isClean());
        retentionPeriod_ = null;
      }
      return retentionPeriodBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.bigtable.admin.v2.ChangeStreamConfig)
  }

  // @@protoc_insertion_point(class_scope:google.bigtable.admin.v2.ChangeStreamConfig)
  private static final com.google.bigtable.admin.v2.ChangeStreamConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.bigtable.admin.v2.ChangeStreamConfig();
  }

  public static com.google.bigtable.admin.v2.ChangeStreamConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChangeStreamConfig> PARSER =
      new com.google.protobuf.AbstractParser<ChangeStreamConfig>() {
        @java.lang.Override
        public ChangeStreamConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<ChangeStreamConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChangeStreamConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.bigtable.admin.v2.ChangeStreamConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}