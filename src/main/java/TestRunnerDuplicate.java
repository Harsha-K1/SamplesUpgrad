import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;

public class TestRunnerDuplicate {

    static int[] studentIdArr = {5,5,3,3,6,6};
    private static int outerLoopcount = 0;
    private static int innerLoopcount = 0;

    public static void findDuplicates(int[]id){
        System.out.print("Duplicate student id : ");
        for(int i=0;i<id.length;i++){
            outerLoopcount++;
            for(int j=i+1;j<id.length;j++){
                innerLoopcount++;
                if(id[i]==id[j]){
                    System.out.println(id[i]+" ");
                    break;
                }
            }
        }
        System.out.println("outerLoopcount = " + outerLoopcount + " | innerLoopcount = " + innerLoopcount);
    }

    public static void findDuplicatesCount(int[] id) {
        System.out.println("Duplicate data : ");
        int count[] = new int[7];
        for (int i = 0; i < id.length; i++) {
            outerLoopcount++;
            count[id[i]]++;
//            if (count[id[i]] == 2)
//                System.out.print(id[i] + " ");
        }
        //Arrays.stream(count).forEach(System.out::print);
        System.out.println("outerLoopcount = " + outerLoopcount);
    }

    public static void main(String[] args) {
        //findDuplicates(studentIdArr);
        findDuplicatesCount(studentIdArr);
        //function(5);
    }

    public static void function(int n){
        //System.out.println("outerLoopcount = "+outerLoopcount+" | innerLoopCount = "+innerLoopcount);
        for(int i = 1; i <= n; i++){
            System.out.println(">>>>>>>>>>>> OuterLoop iteration "+i+" : >>>>>>>>>>>>>>>");
            for(int j = 0; j < i; j++){
                System.out.println("Hello "+j);
            }
        }
        //System.out.println("outerLoopcount = "+outerLoopcount+" | innerLoopCount = "+innerLoopcount);
    }


}
