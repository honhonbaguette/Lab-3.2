
public class Runner 
{
	//testing arrays
	String[] test1 = {"apple","cucmber","microsoft","zorro"};
	String[] test2 = {"banana","cherry","mahogany","oreos","pinata"};
	int [] test3 = {3,4,2,7,12,22,0,1};
	
	//merge test
	long start = System.nanoTime();
	String[] mergeResult = merge(test1, test2);
	long end = System.nanoTime();
	long time = end - start;
	Sysyem.out.println("Merge test took: " + time +"nanoseconds");
	System.out.println(Arrays.toString(mergeResult));
	
	//partition test
	start = System.nanoTime();
	int pivotFinalPos = partition(test3);
	end = System.nanoTime();
	time = end - start;
	Sysyem.out.println("Partition test took: " + time +"nanoseconds");
	System.out.println("Final Pivot Position: " + pivotFinalPos);
	System.out.println(Arrays.toString(test3));
}
