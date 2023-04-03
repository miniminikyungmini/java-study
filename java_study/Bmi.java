import java.util.Scanner;

public class Bmi{
	public static void main(String args[]){

	// String name="왕현주";
	//System.out.println("당신이 좋아하는 연예인은 "+name+" 입니다.");
	
	/*
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.print("당신이 좋아하는 연예인은? ");
	name=sc.next();
	System.out.println("당신이 좋아하는 연예인은 "+name+" 입니다.");
	*/


	/*	정적 프로그램
	float height=1.60f;
	float weight=45.0f;
	float result;
	result=weight/(height*height);
	*/
	
	// Scanner을 이용한 동적 프로그램 작성
	String name, bmi;
	float height, weight;

	Scanner sc=new Scanner(System.in);
	System.out.print("이름 입력:");
	name=sc.next();

	System.out.print("키 입력:");
	height=sc.nextFloat();
	

	System.out.print("몸무게 입력:");
	weight=sc.nextFloat();

	float result=weight/(height*height);

	if(result > 30.0){
			bmi="비만";
			
}
	else if(result > 25.0){
			bmi="과체중";
}
else if(result > 18.5){
		bmi="정상";
}
else{
		bmi="저체중";
}
	System.out.println("당신의 체질량 지수는 "+result+" 이고, 결과는 "+bmi+" 입니다.");
	
	
}
}