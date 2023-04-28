// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: services/rockpaperscissors.proto

package service;

public final class RockPaperScissorsProto {
  private RockPaperScissorsProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_PlayReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_PlayReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_PlayRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_PlayRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_LeaderboardRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_LeaderboardRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_services_LeaderboardEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_services_LeaderboardEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n services/rockpaperscissors.proto\022\010serv" +
      "ices\032\033google/protobuf/empty.proto\"l\n\007Pla" +
      "yReq\022\014\n\004name\030\001 \001(\t\022&\n\004play\030\002 \001(\0162\030.servi" +
      "ces.PlayReq.Played\"+\n\006Played\022\010\n\004ROCK\020\000\022\t" +
      "\n\005PAPER\020\001\022\014\n\010SCISSORS\020\002\"I\n\007PlayRes\022\021\n\tis" +
      "Success\030\001 \001(\010\022\013\n\003win\030\002 \001(\010\022\017\n\007message\030\003 " +
      "\001(\t\022\r\n\005error\030\004 \001(\t\"c\n\016LeaderboardRes\022\021\n\t" +
      "isSuccess\030\001 \001(\010\022/\n\013leaderboard\030\002 \003(\0132\032.s" +
      "ervices.LeaderboardEntry\022\r\n\005error\030\003 \001(\t\"" +
      "J\n\020LeaderboardEntry\022\014\n\004name\030\001 \001(\t\022\014\n\004ran" +
      "k\030\002 \001(\005\022\014\n\004wins\030\003 \001(\005\022\014\n\004lost\030\004 \001(\0052\206\001\n\021" +
      "RockPaperScissors\022.\n\004play\022\021.services.Pla" +
      "yReq\032\021.services.PlayRes\"\000\022A\n\013leaderboard" +
      "\022\026.google.protobuf.Empty\032\030.services.Lead" +
      "erboardRes\"\000B#\n\007serviceB\026RockPaperScisso" +
      "rsProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_services_PlayReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_services_PlayReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_PlayReq_descriptor,
        new java.lang.String[] { "Name", "Play", });
    internal_static_services_PlayRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_services_PlayRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_PlayRes_descriptor,
        new java.lang.String[] { "IsSuccess", "Win", "Message", "Error", });
    internal_static_services_LeaderboardRes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_services_LeaderboardRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_LeaderboardRes_descriptor,
        new java.lang.String[] { "IsSuccess", "Leaderboard", "Error", });
    internal_static_services_LeaderboardEntry_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_services_LeaderboardEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_services_LeaderboardEntry_descriptor,
        new java.lang.String[] { "Name", "Rank", "Wins", "Lost", });
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
