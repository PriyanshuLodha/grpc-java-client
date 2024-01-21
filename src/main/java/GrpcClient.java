import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import train.Train;
import train.TrainServiceGrpc;

import java.util.Scanner;



public class GrpcClient {

    public static void main(String[] args){
        ManagedChannel channel= ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
        Scanner scanner=new Scanner(System.in);
        TrainServiceGrpc.TrainServiceBlockingStub trainStub = TrainServiceGrpc.newBlockingStub(channel);
        String options="";
        String firstName;
        String lastName;
        String email;
        String password;
        String from;
        String to;
        String view;
        do {
            System.out.println("enter a string. add purchase view modify receipt exit");
            options=scanner.nextLine();
            switch (options){
                case "add":
                    System.out.println("Enter the first name:");
                    firstName=scanner.nextLine();
                    System.out.println("Enter the last name:");
                    lastName=scanner.nextLine();
                    System.out.println("Enter the email:");
                    email=scanner.nextLine();
                    System.out.println("Enter the password:");
                    password=scanner.nextLine();
                    Train.User userRequest= Train.User.newBuilder().setUserId(password).setFirstName(firstName).setLastName(lastName).setEmail(email).build();
                    Train.ModifySeatResponse response=trainStub.addUser(userRequest);
                    System.out.println(response);
                    break;
                case "purchase":
                    System.out.println("Enter the password:");
                    password=scanner.nextLine();
                    System.out.println("Enter From:");
                    from=scanner.nextLine();
                    System.out.println("Enter to:");
                    to=scanner.nextLine();
                    Train.Ticket ticket=Train.Ticket.newBuilder().setUser(Train.User.newBuilder().setUserId(password).build()).setFrom(from).setTo(to).build();
                    Train.PurchaseRequest purchaseRequest=Train.PurchaseRequest.newBuilder().setTicket(ticket).build();
                    Train.ReceiptResponse receiptResponse=trainStub.purchase(purchaseRequest);
                    System.out.println(receiptResponse);
                    break;
                case "view":
                    System.out.println("Enter the section to view:");
                    view=scanner.nextLine();
                    Train.ViewUsersBySectionRequest sectionRequest=Train.ViewUsersBySectionRequest.newBuilder().setSection(view).build();
                    Train.ViewUsersBySectionResponse sectionResponse=trainStub.viewUsersBySection(sectionRequest);
                    System.out.println(sectionResponse);
                    break;
                case "modify":
                    System.out.println("Enter the password:");
                    password=scanner.nextLine();
                    Train.ModifySeatRequest modifySeatRequest=Train.ModifySeatRequest.newBuilder().setUserId(password).build();
                    Train.ModifySeatResponse modifySeatResponse=trainStub.modifySeat(modifySeatRequest);
                    System.out.println(modifySeatResponse);
                    break;
                case "receipt":
                    System.out.println("Enter the password:");
                    password=scanner.nextLine();
                    Train.User user=Train.User.newBuilder().setUserId(password).build();
                    Train.ReceiptResponse receiptResponse2=trainStub.getReceiptForUser(user);
                    System.out.println(receiptResponse2);
                    break;
                default:
            }

        }while (options!="exit");
    }
}
