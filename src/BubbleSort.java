import java.sql.SQLOutput;

public class BubbleSort {
    private int[] data;
    //Constructor
    public BubbleSort(){
    }
    public int[] getData(){
        return data;
    }
    public void setData(int[] data){
        this.data = data;
    }
    public void sortData(){
        int lenData = this.data.length;
        for (int i = 0;i<lenData;i++){
            System.out.println("-----------");
            System.out.println("| Untuk i = "+ i +" |");
            System.out.println("------------");
            for (int j=i+1;j<lenData;j++){
                System.out.println("\t-------------");
                System.out.println("\t| \tUntuk j = " +j+" |");
                System.out.println("\t---------");
                if (this.data[j])
            }
        }
    }
}
