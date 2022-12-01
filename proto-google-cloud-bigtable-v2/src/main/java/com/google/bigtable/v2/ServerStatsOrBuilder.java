// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/bigtable/v2/bigtable.proto

package com.google.bigtable.v2;

public interface ServerStatsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.bigtable.v2.ServerStats)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Currently we have 1 entry per underlying RPC. Note that multiple RPCs may
   * be sent to the same tabletserver and we don't de-duplicate. We only get the
   * stats if the RPC returns OK.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ServerStats.ServerCPUStats cpu_stats = 1;</code>
   */
  java.util.List<com.google.bigtable.v2.ServerStats.ServerCPUStats> 
      getCpuStatsList();
  /**
   * <pre>
   * Currently we have 1 entry per underlying RPC. Note that multiple RPCs may
   * be sent to the same tabletserver and we don't de-duplicate. We only get the
   * stats if the RPC returns OK.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ServerStats.ServerCPUStats cpu_stats = 1;</code>
   */
  com.google.bigtable.v2.ServerStats.ServerCPUStats getCpuStats(int index);
  /**
   * <pre>
   * Currently we have 1 entry per underlying RPC. Note that multiple RPCs may
   * be sent to the same tabletserver and we don't de-duplicate. We only get the
   * stats if the RPC returns OK.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ServerStats.ServerCPUStats cpu_stats = 1;</code>
   */
  int getCpuStatsCount();
  /**
   * <pre>
   * Currently we have 1 entry per underlying RPC. Note that multiple RPCs may
   * be sent to the same tabletserver and we don't de-duplicate. We only get the
   * stats if the RPC returns OK.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ServerStats.ServerCPUStats cpu_stats = 1;</code>
   */
  java.util.List<? extends com.google.bigtable.v2.ServerStats.ServerCPUStatsOrBuilder> 
      getCpuStatsOrBuilderList();
  /**
   * <pre>
   * Currently we have 1 entry per underlying RPC. Note that multiple RPCs may
   * be sent to the same tabletserver and we don't de-duplicate. We only get the
   * stats if the RPC returns OK.
   * </pre>
   *
   * <code>repeated .google.bigtable.v2.ServerStats.ServerCPUStats cpu_stats = 1;</code>
   */
  com.google.bigtable.v2.ServerStats.ServerCPUStatsOrBuilder getCpuStatsOrBuilder(
      int index);
}