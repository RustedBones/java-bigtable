/*
 * Copyright 2020 Google LLC
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

public interface EncryptionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.admin.v2.EncryptionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The type of encryption used to protect this resource.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.EncryptionInfo.EncryptionType encryption_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for encryptionType.
   */
  int getEncryptionTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The type of encryption used to protect this resource.
   * </pre>
   *
   * <code>
   * .google.bigtable.admin.v2.EncryptionInfo.EncryptionType encryption_type = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionType.
   */
  com.google.bigtable.admin.v2.EncryptionInfo.EncryptionType getEncryptionType();

  /**
   *
   *
   * <pre>
   * Output only. The status of encrypt/decrypt calls on underlying data for
   * this resource. Regardless of status, the existing data is always encrypted
   * at rest.
   * </pre>
   *
   * <code>.google.rpc.Status encryption_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the encryptionStatus field is set.
   */
  boolean hasEncryptionStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of encrypt/decrypt calls on underlying data for
   * this resource. Regardless of status, the existing data is always encrypted
   * at rest.
   * </pre>
   *
   * <code>.google.rpc.Status encryption_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The encryptionStatus.
   */
  com.google.rpc.Status getEncryptionStatus();
  /**
   *
   *
   * <pre>
   * Output only. The status of encrypt/decrypt calls on underlying data for
   * this resource. Regardless of status, the existing data is always encrypted
   * at rest.
   * </pre>
   *
   * <code>.google.rpc.Status encryption_status = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.rpc.StatusOrBuilder getEncryptionStatusOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The version of the Cloud KMS key specified in the parent
   * cluster that is in use for the data underlying this table.
   * </pre>
   *
   * <code>
   * string kms_key_version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The kmsKeyVersion.
   */
  java.lang.String getKmsKeyVersion();
  /**
   *
   *
   * <pre>
   * Output only. The version of the Cloud KMS key specified in the parent
   * cluster that is in use for the data underlying this table.
   * </pre>
   *
   * <code>
   * string kms_key_version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for kmsKeyVersion.
   */
  com.google.protobuf.ByteString getKmsKeyVersionBytes();
}