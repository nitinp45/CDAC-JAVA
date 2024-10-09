import java.util.Scanner;

public class MatrixClass{
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int choice=0;
    int row=3;
    int col=3;
    int arr[][]=new int[row][col];
    while(choice!=5)
    {
        System.out.println("1.Accept");
        System.out.println("2.Addition of matrix");
        System.out.println("3.Addition row wise");
        System.out.println("4.Addition column wise");

        System.out.println("5.find maxmiumrow wise");
        System.out.println("6.find maxmiumcol wise");
        System.out.println("7.find minimumrow wise");
        System.out.println("8.find minimumcol wise");
        System.out.println("9.exit");
        choice=sc.nextInt();
        switch (choice) {
            case 1:ArrayImplementation.acceptData(arr);
                   break;
            case 2:ArrayImplementation.displayData(arr);
                   break;
            case 3:ArrayImplementation.additionMatrix(arr);
                   break;
            case 4:ArrayImplementation.Data(arr);
                   break;
            case 5:ArrayImplementation.AcceptData(arr);
                   break;
            case 6:ArrayImplementation.AcceptData(arr);
                   break;
            case 7:ArrayImplementation.AcceptData(arr);
                   break;
            case 8:ArrayImplementation.AcceptData(arr);
                   break;
            case 9:System.exit(0);
                   break;
            default:
                break;
        }
    }
}
}