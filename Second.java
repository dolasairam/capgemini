 //Create a class with a method to find the difference between the sum of the squares and the square of the sum of the first n natural numbers. 
 
 class Difference
 {
	 int sumSquare;
	 int squareSum;
	 int difference;
	 int calculateDifference(int n)
	 {
		 for(int i=1;i<=n;i++)
		 {
			 sumSquare=sumSquare+(i*i);
		 }
		 //System.out.println("Sum of Squares "+sumSquare);
		 int temp=0;
		 for(int i=1;i<=n;i++)
		 {
			 temp=temp+i;
		 }
		 
		 squareSum=temp*temp;
		// System.out.println("Square of sums "+squareSum);
		 difference=sumSquare-squareSum;
		 return difference;
	 }
 }
 
 class Second
 {
	 public static void main(String args[])
	 {
		 Difference d=new Difference();
		 System.out.println(d.calculateDifference(2));
	 }
 }
 