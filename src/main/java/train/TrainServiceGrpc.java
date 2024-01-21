package train;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: train.proto")
public final class TrainServiceGrpc {

  private TrainServiceGrpc() {}

  public static final String SERVICE_NAME = "train.TrainService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<train.Train.User,
      train.Train.ModifySeatResponse> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddUser",
      requestType = train.Train.User.class,
      responseType = train.Train.ModifySeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.User,
      train.Train.ModifySeatResponse> getAddUserMethod() {
    io.grpc.MethodDescriptor<train.Train.User, train.Train.ModifySeatResponse> getAddUserMethod;
    if ((getAddUserMethod = TrainServiceGrpc.getAddUserMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getAddUserMethod = TrainServiceGrpc.getAddUserMethod) == null) {
          TrainServiceGrpc.getAddUserMethod = getAddUserMethod = 
              io.grpc.MethodDescriptor.<train.Train.User, train.Train.ModifySeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "AddUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ModifySeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("AddUser"))
                  .build();
          }
        }
     }
     return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<train.Train.PurchaseRequest,
      train.Train.ReceiptResponse> getPurchaseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Purchase",
      requestType = train.Train.PurchaseRequest.class,
      responseType = train.Train.ReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.PurchaseRequest,
      train.Train.ReceiptResponse> getPurchaseMethod() {
    io.grpc.MethodDescriptor<train.Train.PurchaseRequest, train.Train.ReceiptResponse> getPurchaseMethod;
    if ((getPurchaseMethod = TrainServiceGrpc.getPurchaseMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getPurchaseMethod = TrainServiceGrpc.getPurchaseMethod) == null) {
          TrainServiceGrpc.getPurchaseMethod = getPurchaseMethod = 
              io.grpc.MethodDescriptor.<train.Train.PurchaseRequest, train.Train.ReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "Purchase"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.PurchaseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ReceiptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("Purchase"))
                  .build();
          }
        }
     }
     return getPurchaseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<train.Train.ViewUsersBySectionRequest,
      train.Train.ViewUsersBySectionResponse> getViewUsersBySectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ViewUsersBySection",
      requestType = train.Train.ViewUsersBySectionRequest.class,
      responseType = train.Train.ViewUsersBySectionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.ViewUsersBySectionRequest,
      train.Train.ViewUsersBySectionResponse> getViewUsersBySectionMethod() {
    io.grpc.MethodDescriptor<train.Train.ViewUsersBySectionRequest, train.Train.ViewUsersBySectionResponse> getViewUsersBySectionMethod;
    if ((getViewUsersBySectionMethod = TrainServiceGrpc.getViewUsersBySectionMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getViewUsersBySectionMethod = TrainServiceGrpc.getViewUsersBySectionMethod) == null) {
          TrainServiceGrpc.getViewUsersBySectionMethod = getViewUsersBySectionMethod = 
              io.grpc.MethodDescriptor.<train.Train.ViewUsersBySectionRequest, train.Train.ViewUsersBySectionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "ViewUsersBySection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ViewUsersBySectionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ViewUsersBySectionResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("ViewUsersBySection"))
                  .build();
          }
        }
     }
     return getViewUsersBySectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<train.Train.RemoveUserRequest,
      train.Train.ModifySeatResponse> getRemoveUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RemoveUser",
      requestType = train.Train.RemoveUserRequest.class,
      responseType = train.Train.ModifySeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.RemoveUserRequest,
      train.Train.ModifySeatResponse> getRemoveUserMethod() {
    io.grpc.MethodDescriptor<train.Train.RemoveUserRequest, train.Train.ModifySeatResponse> getRemoveUserMethod;
    if ((getRemoveUserMethod = TrainServiceGrpc.getRemoveUserMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getRemoveUserMethod = TrainServiceGrpc.getRemoveUserMethod) == null) {
          TrainServiceGrpc.getRemoveUserMethod = getRemoveUserMethod = 
              io.grpc.MethodDescriptor.<train.Train.RemoveUserRequest, train.Train.ModifySeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "RemoveUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.RemoveUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ModifySeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("RemoveUser"))
                  .build();
          }
        }
     }
     return getRemoveUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<train.Train.ModifySeatRequest,
      train.Train.ModifySeatResponse> getModifySeatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ModifySeat",
      requestType = train.Train.ModifySeatRequest.class,
      responseType = train.Train.ModifySeatResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.ModifySeatRequest,
      train.Train.ModifySeatResponse> getModifySeatMethod() {
    io.grpc.MethodDescriptor<train.Train.ModifySeatRequest, train.Train.ModifySeatResponse> getModifySeatMethod;
    if ((getModifySeatMethod = TrainServiceGrpc.getModifySeatMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getModifySeatMethod = TrainServiceGrpc.getModifySeatMethod) == null) {
          TrainServiceGrpc.getModifySeatMethod = getModifySeatMethod = 
              io.grpc.MethodDescriptor.<train.Train.ModifySeatRequest, train.Train.ModifySeatResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "ModifySeat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ModifySeatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ModifySeatResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("ModifySeat"))
                  .build();
          }
        }
     }
     return getModifySeatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<train.Train.User,
      train.Train.ReceiptResponse> getGetReceiptForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetReceiptForUser",
      requestType = train.Train.User.class,
      responseType = train.Train.ReceiptResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<train.Train.User,
      train.Train.ReceiptResponse> getGetReceiptForUserMethod() {
    io.grpc.MethodDescriptor<train.Train.User, train.Train.ReceiptResponse> getGetReceiptForUserMethod;
    if ((getGetReceiptForUserMethod = TrainServiceGrpc.getGetReceiptForUserMethod) == null) {
      synchronized (TrainServiceGrpc.class) {
        if ((getGetReceiptForUserMethod = TrainServiceGrpc.getGetReceiptForUserMethod) == null) {
          TrainServiceGrpc.getGetReceiptForUserMethod = getGetReceiptForUserMethod = 
              io.grpc.MethodDescriptor.<train.Train.User, train.Train.ReceiptResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "train.TrainService", "GetReceiptForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  train.Train.ReceiptResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new TrainServiceMethodDescriptorSupplier("GetReceiptForUser"))
                  .build();
          }
        }
     }
     return getGetReceiptForUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TrainServiceStub newStub(io.grpc.Channel channel) {
    return new TrainServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TrainServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TrainServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TrainServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TrainServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class TrainServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void addUser(train.Train.User request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    public void purchase(train.Train.PurchaseRequest request,
        io.grpc.stub.StreamObserver<train.Train.ReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPurchaseMethod(), responseObserver);
    }

    /**
     */
    public void viewUsersBySection(train.Train.ViewUsersBySectionRequest request,
        io.grpc.stub.StreamObserver<train.Train.ViewUsersBySectionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getViewUsersBySectionMethod(), responseObserver);
    }

    /**
     */
    public void removeUser(train.Train.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveUserMethod(), responseObserver);
    }

    /**
     */
    public void modifySeat(train.Train.ModifySeatRequest request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getModifySeatMethod(), responseObserver);
    }

    /**
     */
    public void getReceiptForUser(train.Train.User request,
        io.grpc.stub.StreamObserver<train.Train.ReceiptResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetReceiptForUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.User,
                train.Train.ModifySeatResponse>(
                  this, METHODID_ADD_USER)))
          .addMethod(
            getPurchaseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.PurchaseRequest,
                train.Train.ReceiptResponse>(
                  this, METHODID_PURCHASE)))
          .addMethod(
            getViewUsersBySectionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.ViewUsersBySectionRequest,
                train.Train.ViewUsersBySectionResponse>(
                  this, METHODID_VIEW_USERS_BY_SECTION)))
          .addMethod(
            getRemoveUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.RemoveUserRequest,
                train.Train.ModifySeatResponse>(
                  this, METHODID_REMOVE_USER)))
          .addMethod(
            getModifySeatMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.ModifySeatRequest,
                train.Train.ModifySeatResponse>(
                  this, METHODID_MODIFY_SEAT)))
          .addMethod(
            getGetReceiptForUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                train.Train.User,
                train.Train.ReceiptResponse>(
                  this, METHODID_GET_RECEIPT_FOR_USER)))
          .build();
    }
  }

  /**
   */
  public static final class TrainServiceStub extends io.grpc.stub.AbstractStub<TrainServiceStub> {
    private TrainServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrainServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrainServiceStub(channel, callOptions);
    }

    /**
     */
    public void addUser(train.Train.User request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void purchase(train.Train.PurchaseRequest request,
        io.grpc.stub.StreamObserver<train.Train.ReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void viewUsersBySection(train.Train.ViewUsersBySectionRequest request,
        io.grpc.stub.StreamObserver<train.Train.ViewUsersBySectionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getViewUsersBySectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeUser(train.Train.RemoveUserRequest request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void modifySeat(train.Train.ModifySeatRequest request,
        io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getModifySeatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getReceiptForUser(train.Train.User request,
        io.grpc.stub.StreamObserver<train.Train.ReceiptResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetReceiptForUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TrainServiceBlockingStub extends io.grpc.stub.AbstractStub<TrainServiceBlockingStub> {
    private TrainServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrainServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrainServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public train.Train.ModifySeatResponse addUser(train.Train.User request) {
      return blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public train.Train.ReceiptResponse purchase(train.Train.PurchaseRequest request) {
      return blockingUnaryCall(
          getChannel(), getPurchaseMethod(), getCallOptions(), request);
    }

    /**
     */
    public train.Train.ViewUsersBySectionResponse viewUsersBySection(train.Train.ViewUsersBySectionRequest request) {
      return blockingUnaryCall(
          getChannel(), getViewUsersBySectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public train.Train.ModifySeatResponse removeUser(train.Train.RemoveUserRequest request) {
      return blockingUnaryCall(
          getChannel(), getRemoveUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public train.Train.ModifySeatResponse modifySeat(train.Train.ModifySeatRequest request) {
      return blockingUnaryCall(
          getChannel(), getModifySeatMethod(), getCallOptions(), request);
    }

    /**
     */
    public train.Train.ReceiptResponse getReceiptForUser(train.Train.User request) {
      return blockingUnaryCall(
          getChannel(), getGetReceiptForUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TrainServiceFutureStub extends io.grpc.stub.AbstractStub<TrainServiceFutureStub> {
    private TrainServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TrainServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TrainServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TrainServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ModifySeatResponse> addUser(
        train.Train.User request) {
      return futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ReceiptResponse> purchase(
        train.Train.PurchaseRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPurchaseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ViewUsersBySectionResponse> viewUsersBySection(
        train.Train.ViewUsersBySectionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getViewUsersBySectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ModifySeatResponse> removeUser(
        train.Train.RemoveUserRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ModifySeatResponse> modifySeat(
        train.Train.ModifySeatRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getModifySeatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<train.Train.ReceiptResponse> getReceiptForUser(
        train.Train.User request) {
      return futureUnaryCall(
          getChannel().newCall(getGetReceiptForUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_USER = 0;
  private static final int METHODID_PURCHASE = 1;
  private static final int METHODID_VIEW_USERS_BY_SECTION = 2;
  private static final int METHODID_REMOVE_USER = 3;
  private static final int METHODID_MODIFY_SEAT = 4;
  private static final int METHODID_GET_RECEIPT_FOR_USER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TrainServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TrainServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_USER:
          serviceImpl.addUser((train.Train.User) request,
              (io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse>) responseObserver);
          break;
        case METHODID_PURCHASE:
          serviceImpl.purchase((train.Train.PurchaseRequest) request,
              (io.grpc.stub.StreamObserver<train.Train.ReceiptResponse>) responseObserver);
          break;
        case METHODID_VIEW_USERS_BY_SECTION:
          serviceImpl.viewUsersBySection((train.Train.ViewUsersBySectionRequest) request,
              (io.grpc.stub.StreamObserver<train.Train.ViewUsersBySectionResponse>) responseObserver);
          break;
        case METHODID_REMOVE_USER:
          serviceImpl.removeUser((train.Train.RemoveUserRequest) request,
              (io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse>) responseObserver);
          break;
        case METHODID_MODIFY_SEAT:
          serviceImpl.modifySeat((train.Train.ModifySeatRequest) request,
              (io.grpc.stub.StreamObserver<train.Train.ModifySeatResponse>) responseObserver);
          break;
        case METHODID_GET_RECEIPT_FOR_USER:
          serviceImpl.getReceiptForUser((train.Train.User) request,
              (io.grpc.stub.StreamObserver<train.Train.ReceiptResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TrainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TrainServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return train.Train.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TrainService");
    }
  }

  private static final class TrainServiceFileDescriptorSupplier
      extends TrainServiceBaseDescriptorSupplier {
    TrainServiceFileDescriptorSupplier() {}
  }

  private static final class TrainServiceMethodDescriptorSupplier
      extends TrainServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TrainServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TrainServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TrainServiceFileDescriptorSupplier())
              .addMethod(getAddUserMethod())
              .addMethod(getPurchaseMethod())
              .addMethod(getViewUsersBySectionMethod())
              .addMethod(getRemoveUserMethod())
              .addMethod(getModifySeatMethod())
              .addMethod(getGetReceiptForUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
