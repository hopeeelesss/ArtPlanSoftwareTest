import java.util.Scanner;

public class Controller {
    public void app(){
        Scanner in = new Scanner(System.in,"utf-8");
        System.setProperty("console.encoding","utf-8");
        System.out.println("Enter a line:");
        Line line= new Line(in.nextLine());
        Service service=new Service(line);
        System.out.println("Start line: "+line.getLine());
        System.out.println("Reversed line: "+service.reverseLine());
        System.out.println(service.testReverseLine(1000));
        System.out.println(service.testReverseLine(10000));
        System.out.println(service.testReverseLine(100000));
    }
}
