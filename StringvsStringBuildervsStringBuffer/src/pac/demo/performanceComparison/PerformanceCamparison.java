package pac.demo.performanceComparison;

public class PerformanceCamparison {
	public static void main(String[] args) {
		long startTime,endTime;
		//String 
		String s ="";
		startTime = System.currentTimeMillis();
		for(int i= 0;i<100000;i++) {
			s += i;
		}
		endTime = System.currentTimeMillis();
		System.out.println("String time : "+(endTime - startTime )+"ms");
		
		
		//StringBuilder
		StringBuilder sb = new StringBuilder();
		startTime =System.currentTimeMillis();
		for(int i = 0;i<100000;i++) {
			sb.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuilder time : "+(endTime - startTime )+"ms");
		
		//StringBuffer
		StringBuffer sbf = new StringBuffer();
		startTime =System.currentTimeMillis();
		for(int i = 0;i<100000;i++) {
			sbf.append(i);
		}
		endTime = System.currentTimeMillis();
		System.out.println("StringBuffer time : "+(endTime - startTime )+"ms");
		
		
		
		
//		System.out.println(s);
//		System.out.println(sb);
//		System.out.println(sbf);
		
	}
	
	
	

}
