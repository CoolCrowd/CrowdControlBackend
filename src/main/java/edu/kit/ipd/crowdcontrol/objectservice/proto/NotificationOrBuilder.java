// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public interface NotificationOrBuilder extends
        // @@protoc_insertion_point(interface_extends:crowdcontrol.Notification)
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 id = 1;</code>
     */
    int getId();

    /**
     * <code>optional string name = 2;</code>
     */
    java.lang.String getName();

    /**
     * <code>optional string name = 2;</code>
     */
    com.google.protobuf.ByteString
    getNameBytes();

    /**
     * <code>optional string description = 3;</code>
     */
    java.lang.String getDescription();

    /**
     * <code>optional string description = 3;</code>
     */
    com.google.protobuf.ByteString
    getDescriptionBytes();

    /**
     * <code>optional string query = 4;</code>
     */
    java.lang.String getQuery();

    /**
     * <code>optional string query = 4;</code>
     */
    com.google.protobuf.ByteString
    getQueryBytes();

    /**
     * <code>optional int32 check_period = 5;</code>
     */
    int getCheckPeriod();

    /**
     * <code>optional int32 send_threshold = 6;</code>
     */
    int getSendThreshold();
}
