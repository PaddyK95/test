package devices;


import java.io.IOException;
import java.util.Iterator;
import java.util.logging.Logger;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import devices.PrinterServiceGrpc.PrinterServiceImplBase;
import io.grpc.stub.StreamObserver;

public class SmartServer extends PrinterServiceImplBase{

	private static final Logger logger = Logger.getLogger(SmartServer.class.getName());

	
	 public static void main(String[] args) throws IOException, InterruptedException {
		 SmartServer stringserver = new SmartServer();
		   
		    int port = 50051;
		    Server server = ServerBuilder.forPort(port)
		        .addService(stringserver)
		        .build()
		        .start();
		    
		    logger.info("Server started, listening on " + port);
		    		    
		    server.awaitTermination();
	 }
	
	
	
	
	
	
}
