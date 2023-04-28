// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/woof.proto

package service;

public final class WoofProto {
  private WoofProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_WoofReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_WoofReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GetWoofsReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GetWoofsReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_WoofRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_WoofRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_GetWoofsResp_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_GetWoofsResp_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_WoofPost_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_WoofPost_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023services/woof.proto\022\010services\032\033google/" +
      "protobuf/empty.proto\"%\n\007WoofReq\022\014\n\004name\030" +
      "\001 \001(\t\022\014\n\004body\030\002 \001(\t\"\033\n\013GetWoofsReq\022\014\n\004na" +
      "me\030\001 \001(\t\"<\n\007WoofRes\022\021\n\tisSuccess\030\001 \001(\010\022\017" +
      "\n\007message\030\002 \001(\t\022\r\n\005error\030\003 \001(\t\"S\n\014GetWoo" +
      "fsResp\022\021\n\tisSuccess\030\001 \001(\010\022!\n\005woofs\030\002 \003(\013" +
      "2\022.services.WoofPost\022\r\n\005error\030\003 \001(\t\"4\n\010W" +
      "oofPost\022\014\n\004name\030\001 \001(\t\022\014\n\004body\030\002 \001(\t\022\014\n\004t" +
      "ime\030\003 \001(\t2\271\001\n\004Woof\022.\n\004woof\022\021.services.Wo" +
      "ofReq\032\021.services.WoofRes\"\000\022@\n\rgetUsersWo" +
      "ofs\022\025.services.GetWoofsReq\032\026.services.Ge" +
      "tWoofsResp\"\000\022?\n\013getAllWoofs\022\026.google.pro" +
      "tobuf.Empty\032\026.services.GetWoofsResp\"\000B\026\n" +
      "\007serviceB\tWoofProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_services_WoofReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_WoofReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_WoofReq_descriptor,
        new java.lang.String[] { "Name", "Body", });
    internal_static_services_GetWoofsReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_GetWoofsReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GetWoofsReq_descriptor,
        new java.lang.String[] { "Name", });
    internal_static_services_WoofRes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_WoofRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_WoofRes_descriptor,
        new java.lang.String[] { "IsSuccess", "Message", "Error", });
    internal_static_services_GetWoofsResp_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_GetWoofsResp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_GetWoofsResp_descriptor,
        new java.lang.String[] { "IsSuccess", "Woofs", "Error", });
    internal_static_services_WoofPost_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_services_WoofPost_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_WoofPost_descriptor,
        new java.lang.String[] { "Name", "Body", "Time", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}