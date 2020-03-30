package devices;

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
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: strings.proto")
public final class PrinterServiceGrpc {

  private PrinterServiceGrpc() {}

  public static final String SERVICE_NAME = "printer.PrinterService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getTurnOnMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOn",
      requestType = devices.StringRequest.class,
      responseType = devices.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getTurnOnMethod() {
    io.grpc.MethodDescriptor<devices.StringRequest, devices.StringResponse> getTurnOnMethod;
    if ((getTurnOnMethod = PrinterServiceGrpc.getTurnOnMethod) == null) {
      synchronized (PrinterServiceGrpc.class) {
        if ((getTurnOnMethod = PrinterServiceGrpc.getTurnOnMethod) == null) {
          PrinterServiceGrpc.getTurnOnMethod = getTurnOnMethod = 
              io.grpc.MethodDescriptor.<devices.StringRequest, devices.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "printer.PrinterService", "turnOn"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrinterServiceMethodDescriptorSupplier("turnOn"))
                  .build();
          }
        }
     }
     return getTurnOnMethod;
  }

  private static volatile io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getTurnOffMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "turnOff",
      requestType = devices.StringRequest.class,
      responseType = devices.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getTurnOffMethod() {
    io.grpc.MethodDescriptor<devices.StringRequest, devices.StringResponse> getTurnOffMethod;
    if ((getTurnOffMethod = PrinterServiceGrpc.getTurnOffMethod) == null) {
      synchronized (PrinterServiceGrpc.class) {
        if ((getTurnOffMethod = PrinterServiceGrpc.getTurnOffMethod) == null) {
          PrinterServiceGrpc.getTurnOffMethod = getTurnOffMethod = 
              io.grpc.MethodDescriptor.<devices.StringRequest, devices.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "printer.PrinterService", "turnOff"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrinterServiceMethodDescriptorSupplier("turnOff"))
                  .build();
          }
        }
     }
     return getTurnOffMethod;
  }

  private static volatile io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getGetStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStatus",
      requestType = devices.StringRequest.class,
      responseType = devices.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<devices.StringRequest,
      devices.StringResponse> getGetStatusMethod() {
    io.grpc.MethodDescriptor<devices.StringRequest, devices.StringResponse> getGetStatusMethod;
    if ((getGetStatusMethod = PrinterServiceGrpc.getGetStatusMethod) == null) {
      synchronized (PrinterServiceGrpc.class) {
        if ((getGetStatusMethod = PrinterServiceGrpc.getGetStatusMethod) == null) {
          PrinterServiceGrpc.getGetStatusMethod = getGetStatusMethod = 
              io.grpc.MethodDescriptor.<devices.StringRequest, devices.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "printer.PrinterService", "getStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrinterServiceMethodDescriptorSupplier("getStatus"))
                  .build();
          }
        }
     }
     return getGetStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<devices.MultiStringRequest,
      devices.StringResponse> getPrintMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Print",
      requestType = devices.MultiStringRequest.class,
      responseType = devices.StringResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<devices.MultiStringRequest,
      devices.StringResponse> getPrintMethod() {
    io.grpc.MethodDescriptor<devices.MultiStringRequest, devices.StringResponse> getPrintMethod;
    if ((getPrintMethod = PrinterServiceGrpc.getPrintMethod) == null) {
      synchronized (PrinterServiceGrpc.class) {
        if ((getPrintMethod = PrinterServiceGrpc.getPrintMethod) == null) {
          PrinterServiceGrpc.getPrintMethod = getPrintMethod = 
              io.grpc.MethodDescriptor.<devices.MultiStringRequest, devices.StringResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "printer.PrinterService", "Print"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.MultiStringRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  devices.StringResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PrinterServiceMethodDescriptorSupplier("Print"))
                  .build();
          }
        }
     }
     return getPrintMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PrinterServiceStub newStub(io.grpc.Channel channel) {
    return new PrinterServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PrinterServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PrinterServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PrinterServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PrinterServiceFutureStub(channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class PrinterServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void turnOn(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOnMethod(), responseObserver);
    }

    /**
     */
    public void turnOff(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTurnOffMethod(), responseObserver);
    }

    /**
     */
    public void getStatus(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStatusMethod(), responseObserver);
    }

    /**
     */
    public void print(devices.MultiStringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getPrintMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTurnOnMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                devices.StringRequest,
                devices.StringResponse>(
                  this, METHODID_TURN_ON)))
          .addMethod(
            getTurnOffMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                devices.StringRequest,
                devices.StringResponse>(
                  this, METHODID_TURN_OFF)))
          .addMethod(
            getGetStatusMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                devices.StringRequest,
                devices.StringResponse>(
                  this, METHODID_GET_STATUS)))
          .addMethod(
            getPrintMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                devices.MultiStringRequest,
                devices.StringResponse>(
                  this, METHODID_PRINT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PrinterServiceStub extends io.grpc.stub.AbstractStub<PrinterServiceStub> {
    private PrinterServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterServiceStub(channel, callOptions);
    }

    /**
     */
    public void turnOn(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void turnOff(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStatus(devices.StringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void print(devices.MultiStringRequest request,
        io.grpc.stub.StreamObserver<devices.StringResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PrinterServiceBlockingStub extends io.grpc.stub.AbstractStub<PrinterServiceBlockingStub> {
    private PrinterServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public devices.StringResponse turnOn(devices.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOnMethod(), getCallOptions(), request);
    }

    /**
     */
    public devices.StringResponse turnOff(devices.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getTurnOffMethod(), getCallOptions(), request);
    }

    /**
     */
    public devices.StringResponse getStatus(devices.StringRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public devices.StringResponse print(devices.MultiStringRequest request) {
      return blockingUnaryCall(
          getChannel(), getPrintMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class PrinterServiceFutureStub extends io.grpc.stub.AbstractStub<PrinterServiceFutureStub> {
    private PrinterServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PrinterServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PrinterServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PrinterServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<devices.StringResponse> turnOn(
        devices.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOnMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<devices.StringResponse> turnOff(
        devices.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTurnOffMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<devices.StringResponse> getStatus(
        devices.StringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<devices.StringResponse> print(
        devices.MultiStringRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getPrintMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TURN_ON = 0;
  private static final int METHODID_TURN_OFF = 1;
  private static final int METHODID_GET_STATUS = 2;
  private static final int METHODID_PRINT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PrinterServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PrinterServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TURN_ON:
          serviceImpl.turnOn((devices.StringRequest) request,
              (io.grpc.stub.StreamObserver<devices.StringResponse>) responseObserver);
          break;
        case METHODID_TURN_OFF:
          serviceImpl.turnOff((devices.StringRequest) request,
              (io.grpc.stub.StreamObserver<devices.StringResponse>) responseObserver);
          break;
        case METHODID_GET_STATUS:
          serviceImpl.getStatus((devices.StringRequest) request,
              (io.grpc.stub.StreamObserver<devices.StringResponse>) responseObserver);
          break;
        case METHODID_PRINT:
          serviceImpl.print((devices.MultiStringRequest) request,
              (io.grpc.stub.StreamObserver<devices.StringResponse>) responseObserver);
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

  private static abstract class PrinterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PrinterServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return devices.PrinterServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PrinterService");
    }
  }

  private static final class PrinterServiceFileDescriptorSupplier
      extends PrinterServiceBaseDescriptorSupplier {
    PrinterServiceFileDescriptorSupplier() {}
  }

  private static final class PrinterServiceMethodDescriptorSupplier
      extends PrinterServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PrinterServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PrinterServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PrinterServiceFileDescriptorSupplier())
              .addMethod(getTurnOnMethod())
              .addMethod(getTurnOffMethod())
              .addMethod(getGetStatusMethod())
              .addMethod(getPrintMethod())
              .build();
        }
      }
    }
    return result;
  }
}
