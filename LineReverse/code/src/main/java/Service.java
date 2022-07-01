import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Service {
    private Line line;
    public String reverseLine(){
        StringBuilder reversedLine = new StringBuilder();
        for(int i=line.getLine().length() - 1;i >=0; i--){
            reversedLine.append(line.getLine().charAt(i));
        }
        return reversedLine.toString();
    }

    public long testReverseLine(int repetitionAmount){
        long startTime=System.currentTimeMillis();
        for(int i=0;i<repetitionAmount;i++)
            reverseLine();
        return System.currentTimeMillis() - startTime;
    }
}
