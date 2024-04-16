import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("[과세금액 계산 프로그램]");

        System.out.println("연소득을 입력해 주세요.: ");
        Scanner scanner = new Scanner(System.in);
        Integer income = scanner.nextInt();
        scanner.close();

        int tax = 0;

        int [] rangeList= {0, 12000000, 46000000, 88000000, 150000000,300000000, 500000000, 1000000000 };


        int [] taxList = {6,15,24,35,38,40,42,45};



        for (int i=0; i < 8; i++){
            tax= (int)((income-rangeList[i])*((double)taxList[i]/100));
            //i=0
            if(rangeList[0]<=income && income <= rangeList[1]){
                break;
            }
            //i=1~
            else if(rangeList[i] < income && income<=rangeList[i+1]){
                for(int j = 0; j < i; j++) {
                    tax += (int) ((rangeList[j+1] - rangeList[j]) * ((double) taxList[j] / 100));
                    System.out.println(tax);
                }
                break;
            }

        }



        /*
        if(income <= range1){
            tax= (int)(income*((double)tax1/100));

        }else if( income <= range2){
            tax= (int)(range1*((double)tax1/100)+(income-range1)*(double)tax2/100);

        }else if(income <= range3){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (income-range2)*(double)tax3/100);
        }else if(income <= range4){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (range3-range2)*(double)tax3/100 +(income-range3)*(double)tax4/100 );
        }else if(income <= range5){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (range3-range2)*(double)tax3/100 +(range4-range3)*(double)tax4/100 +(income-range4)*(double)tax5/100 );
        }else if(income <= range6){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (range3-range2)*(double)tax3/100 +(range4-range3)*(double)tax4/100 +(range5-range4)*(double)tax5/100 + (income-range5)*(double)tax6/100);
        }else if(income <= range7){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (range3-range2)*(double)tax3/100 +(range4-range3)*(double)tax4/100 +(range5-range4)*(double)tax5/100 + (range6-range5)*(double)tax6/100+(income-range6)*(double)tax7/100 );
        }else if (income > range7){
            tax = (int)(range1*((double)tax1/100)+(range2-range1)*(double)tax2/100+ (range3-range2)*(double)tax3/100 +(range4-range3)*(double)tax4/100 +(range5-range4)*(double)tax5/100 + (range6-range5)*(double)tax6/100+(range7-range6)*(double)tax7/100 +(income-range7)*(double)tax8/100);
        }
        */

        String output1 = String.format("세율에 의한 세금: %d", tax);
        System.out.println(output1);
    }
}



