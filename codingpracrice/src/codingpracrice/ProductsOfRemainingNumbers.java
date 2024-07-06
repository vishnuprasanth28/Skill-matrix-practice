package codingpracrice;

public class ProductsOfRemainingNumbers {

	public static void main(String[] args) {
        int[] nums= {1,2,3,5};
        int[] num = new int[nums.length];
       
        

        int n =1;
        for(int i= 0;i<nums.length;i++) {
            n*= nums[i];
        }
        System.out.println(n);
        for(int i =0 ;i<nums.length;i++) {
            num[i] = n/nums[i];
        }
        
        for(int i =0;i<num.length;i++) {
            System.out.println(num[i]);
        }
	
}
}
