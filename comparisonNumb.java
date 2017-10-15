import java.util.Scanner;

public class comparisonNumb {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("¬ведите первое целое число:");
		int x1 = in.nextInt();
		System.out.println("¬ведите второе целое число:");
		int x2 = in.nextInt();
		System.out.println("¬ведите первое целое число:");
		int x3 = in.nextInt();
        int max;
        int min;
        if(x1>=x2){
            if(x2>=x3){
                max=x1;
                min=x3;
            }else{
                if(x1>=x3){
                    max=x1;
                }else{
                    max=x3;
                }
                min = x2;
            }
        }else{
            if(x2>=x3){
                if(x1>=x3){
                    min=x3;
                }else{
                    min=x1;
                }
                max=x2;
            }else{
                max=x3;
                min=x1;
            }
        }
        int sum;
        sum = min+max;
        System.out.println("—умма большего и меньшего чисел равна: " + sum);
	}

}
