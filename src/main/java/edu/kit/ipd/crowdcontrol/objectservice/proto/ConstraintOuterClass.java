// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: constraint.proto

package edu.kit.ipd.crowdcontrol.objectservice.proto;

public final class ConstraintOuterClass {
    private ConstraintOuterClass() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    static com.google.protobuf.Descriptors.Descriptor
            internal_static_crowdcontrol_Constraint_descriptor;
    static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_crowdcontrol_Constraint_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\020constraint.proto\022\014crowdcontrol\"\032\n\nCons" +
                        "traint\022\014\n\004name\030\001 \001(\tB0\n,edu.kit.ipd.crow" +
                        "dcontrol.objectservice.protoP\001b\006proto3"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
        internal_static_crowdcontrol_Constraint_descriptor =
                getDescriptor().getMessageTypes().get(0);
        internal_static_crowdcontrol_Constraint_fieldAccessorTable = new
                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                internal_static_crowdcontrol_Constraint_descriptor,
                new java.lang.String[]{"Name",});
    }

    // @@protoc_insertion_point(outer_class_scope)
}
