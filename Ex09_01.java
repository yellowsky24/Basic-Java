package lab09;
interface IntSequence{
	boolean hasNext();
	int next();
}
class SimpleSequence implements IntSequence {
	private int num=1;
	@Override
	public boolean hasNext() {
		return true;
	}
	@Override
	public int next() {
		return num++;
	}
}
class DigitSequence implements IntSequence{
	private int number;
	public DigitSequence(int n) {		
		number=n;
	}
	@Override
	public boolean hasNext() {
		return number!=0;
	}
	@Override
	public int next() {
		int result=number %10;
		number/=10;
		return result;
	}
	public int rest() {return number;}
}
class SquareSequence implements IntSequence{
	int num=1;
	@Override
	public boolean hasNext() {
		return true;
	}

	@Override
	public int next() {
		// TODO Auto-generated method stub
		return num*(num++);
	}
	
}
public class Ex09_01 {

	public static double average(IntSequence seq, int n) {
		double sum=0;
		int count=0;
		while(seq.hasNext()&&count<n) {
			sum+=seq.next();
			count++;
		}
		if(count==0)return 0;
		return sum/count;
		
	}
	public static void main(String[] args) {
		IntSequence sequence1=new DigitSequence(1234);
		
		IntSequence sequence2=new SquareSequence();
		//DigitSequence d=(DigitSequence) sequence2;실행하기 전에는 에러가 없지만 실행하면, ClasscastException을 얻는다.
		if(sequence2 instanceof IntSequence)//sequence2는 IntSequence variable이기에 여기를 true로 통과한다. 
		{
			DigitSequence d=(DigitSequence) sequence2;//이것도 실행하기 전에는 에러가 없지만 실행하면 CCE가 발생한다. 
		}
		IntSequence sequence3=new SimpleSequence();
		double avg1=average(sequence1, 10);
		double avg2=average(sequence2, 10);
		double avg3=average(sequence3, 10);
		System.out.println("average of DigitSequence is: "+avg1);
		System.out.println("average of SimpleSequence is: "+avg3);
		System.out.println("average of SquareSequence is: "+avg2);
	}

}
