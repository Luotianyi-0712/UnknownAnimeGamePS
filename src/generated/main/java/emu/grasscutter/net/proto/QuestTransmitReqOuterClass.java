// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QuestTransmitReq.proto

package emu.grasscutter.net.proto;

public final class QuestTransmitReqOuterClass {
  private QuestTransmitReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QuestTransmitReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:QuestTransmitReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    int getQuestId();

    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    int getPointId();

    /**
     * <code>uint32 LAJGLCIFKCP = 10;</code>
     * @return The lAJGLCIFKCP.
     */
    int getLAJGLCIFKCP();
  }
  /**
   * <pre>
   * CmdId: 2854
   * Obf: FGDGCAJEJPM
   * </pre>
   *
   * Protobuf type {@code QuestTransmitReq}
   */
  public static final class QuestTransmitReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:QuestTransmitReq)
      QuestTransmitReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QuestTransmitReq.newBuilder() to construct.
    private QuestTransmitReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QuestTransmitReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QuestTransmitReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private QuestTransmitReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              pointId_ = input.readUInt32();
              break;
            }
            case 16: {

              questId_ = input.readUInt32();
              break;
            }
            case 80: {

              lAJGLCIFKCP_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.internal_static_QuestTransmitReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.internal_static_QuestTransmitReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.class, emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.Builder.class);
    }

    public static final int QUEST_ID_FIELD_NUMBER = 2;
    private int questId_;
    /**
     * <code>uint32 quest_id = 2;</code>
     * @return The questId.
     */
    @java.lang.Override
    public int getQuestId() {
      return questId_;
    }

    public static final int POINT_ID_FIELD_NUMBER = 1;
    private int pointId_;
    /**
     * <code>uint32 point_id = 1;</code>
     * @return The pointId.
     */
    @java.lang.Override
    public int getPointId() {
      return pointId_;
    }

    public static final int LAJGLCIFKCP_FIELD_NUMBER = 10;
    private int lAJGLCIFKCP_;
    /**
     * <code>uint32 LAJGLCIFKCP = 10;</code>
     * @return The lAJGLCIFKCP.
     */
    @java.lang.Override
    public int getLAJGLCIFKCP() {
      return lAJGLCIFKCP_;
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
      if (pointId_ != 0) {
        output.writeUInt32(1, pointId_);
      }
      if (questId_ != 0) {
        output.writeUInt32(2, questId_);
      }
      if (lAJGLCIFKCP_ != 0) {
        output.writeUInt32(10, lAJGLCIFKCP_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (pointId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, pointId_);
      }
      if (questId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, questId_);
      }
      if (lAJGLCIFKCP_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, lAJGLCIFKCP_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq other = (emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq) obj;

      if (getQuestId()
          != other.getQuestId()) return false;
      if (getPointId()
          != other.getPointId()) return false;
      if (getLAJGLCIFKCP()
          != other.getLAJGLCIFKCP()) return false;
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
      hash = (37 * hash) + QUEST_ID_FIELD_NUMBER;
      hash = (53 * hash) + getQuestId();
      hash = (37 * hash) + POINT_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPointId();
      hash = (37 * hash) + LAJGLCIFKCP_FIELD_NUMBER;
      hash = (53 * hash) + getLAJGLCIFKCP();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq prototype) {
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
     * <pre>
     * CmdId: 2854
     * Obf: FGDGCAJEJPM
     * </pre>
     *
     * Protobuf type {@code QuestTransmitReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:QuestTransmitReq)
        emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.internal_static_QuestTransmitReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.internal_static_QuestTransmitReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.class, emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.newBuilder()
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
        questId_ = 0;

        pointId_ = 0;

        lAJGLCIFKCP_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.internal_static_QuestTransmitReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq build() {
        emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq buildPartial() {
        emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq result = new emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq(this);
        result.questId_ = questId_;
        result.pointId_ = pointId_;
        result.lAJGLCIFKCP_ = lAJGLCIFKCP_;
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
        if (other instanceof emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq) {
          return mergeFrom((emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq other) {
        if (other == emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq.getDefaultInstance()) return this;
        if (other.getQuestId() != 0) {
          setQuestId(other.getQuestId());
        }
        if (other.getPointId() != 0) {
          setPointId(other.getPointId());
        }
        if (other.getLAJGLCIFKCP() != 0) {
          setLAJGLCIFKCP(other.getLAJGLCIFKCP());
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
        emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int questId_ ;
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return The questId.
       */
      @java.lang.Override
      public int getQuestId() {
        return questId_;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @param value The questId to set.
       * @return This builder for chaining.
       */
      public Builder setQuestId(int value) {
        
        questId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 quest_id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuestId() {
        
        questId_ = 0;
        onChanged();
        return this;
      }

      private int pointId_ ;
      /**
       * <code>uint32 point_id = 1;</code>
       * @return The pointId.
       */
      @java.lang.Override
      public int getPointId() {
        return pointId_;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @param value The pointId to set.
       * @return This builder for chaining.
       */
      public Builder setPointId(int value) {
        
        pointId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 point_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPointId() {
        
        pointId_ = 0;
        onChanged();
        return this;
      }

      private int lAJGLCIFKCP_ ;
      /**
       * <code>uint32 LAJGLCIFKCP = 10;</code>
       * @return The lAJGLCIFKCP.
       */
      @java.lang.Override
      public int getLAJGLCIFKCP() {
        return lAJGLCIFKCP_;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 10;</code>
       * @param value The lAJGLCIFKCP to set.
       * @return This builder for chaining.
       */
      public Builder setLAJGLCIFKCP(int value) {
        
        lAJGLCIFKCP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 LAJGLCIFKCP = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAJGLCIFKCP() {
        
        lAJGLCIFKCP_ = 0;
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


      // @@protoc_insertion_point(builder_scope:QuestTransmitReq)
    }

    // @@protoc_insertion_point(class_scope:QuestTransmitReq)
    private static final emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq();
    }

    public static emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QuestTransmitReq>
        PARSER = new com.google.protobuf.AbstractParser<QuestTransmitReq>() {
      @java.lang.Override
      public QuestTransmitReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new QuestTransmitReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<QuestTransmitReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QuestTransmitReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.QuestTransmitReqOuterClass.QuestTransmitReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QuestTransmitReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_QuestTransmitReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026QuestTransmitReq.proto\"K\n\020QuestTransmi" +
      "tReq\022\020\n\010quest_id\030\002 \001(\r\022\020\n\010point_id\030\001 \001(\r" +
      "\022\023\n\013LAJGLCIFKCP\030\n \001(\rB\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_QuestTransmitReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QuestTransmitReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_QuestTransmitReq_descriptor,
        new java.lang.String[] { "QuestId", "PointId", "LAJGLCIFKCP", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
