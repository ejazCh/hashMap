package TestProject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class TestProject1{
	
	private List<String> testlist=new ArrayList<String>();
	private String name="rPakistanPaksitanatukl";  
    private String reverseString="";
    char[] chArray=name.toCharArray();
	private int count=0;
	private int numer=12345;
	private int GetCharcterCount(){
		for(char ch: chArray){
			if(ch=='a'){
				count++;
			}
		}
		return count;
	}
	private  HashMap<Character,Integer> GetDuplicateCharectersCount(String name){
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		List<Character> dupilcate=new ArrayList<Character>();
		for(int i=0;i<name.length();i++){
			char charAt=name.charAt(i);
				if(!hmap.containsKey(charAt)){
					hmap.put(charAt,1);
				}
				else{
					hmap.put(charAt, hmap.get(charAt)+1);
				}
		}		
		Set<Character> charters=hmap.keySet();
			for(char charter : charters){
				if(hmap.get(charter)>1){
					System.out.println("No of Duplicates Charecters"+""+ hmap.get(charter));
				}
			}
			return hmap;
	}
	private String reverseNumber(int num){
		String reverse="";
		int temp=0;
		while(num>0){
			temp=num%10;
			reverse= reverse+Integer.toString(temp);
			num=num/10;
		}
		return reverse;
		
	}
//		if(num==0 && num==1){
//			return num;
//		}
//		else{
//			num=num%10;
//			
//		}
	
    private void helloworld(){
		System.out.println("Hello how are you?");
	}
	
	private List<String> AddNames(){
		testlist.add("Bio");
		testlist.add("Chemestry");
		testlist.add("Maths");
		testlist.add("Maths");
		return testlist;	
	}
	
	public String reverseStringMethod(){
		String result=""; 
		for(int i=chArray.length-1;i>=0;i--){
			 reverseString=reverseString+chArray[i];
		 }
		 	if(name.equals(reverseString)){
		 		result="Strings are equal";
		 	}
		 	else{
		 		result="Strings are not equal";
		 	}
		return result;
	}
	
	public static void main(String[] args) {
		TestProject1 experiment=new TestProject1();
		//experiment.GetDuplicateCharectersCount("PaksitanPaksiatnna");
		System.out.println(experiment.GetDuplicateCharectersCount("heleleiel"));
		//System.out.println(experiment.reverseNumber(3245));
		//experiment.helloworld();
		//experiment.AddNames();
		//String reverseString=experiment.reverseStringMethod();
		//System.out.println(reverseString);
		//experiment.AddNames();
		//System.out.println(experiment.AddNames());
		 //int noOfCharcters=experiment.GetCharcterCount();
		 //System.out.println(noOfCharcters);
	}	
}
