class test{
	public static void main(String args[]){
		/* 
			for(int a = 1,b = 10; a < b; a++, b--){
				System.out.println(a + "<" + b);
			}
		*/
		/* 
			for(int number = 10000; number <= 99999; number ++){
				int[] digit = new int[5];
				for(int i = 0; i < digit.length; i ++){
					digit[i] = number / (int)Math.pow(10,i) % 10;
				}
				int result = digit[0] + digit[1] + digit[3] + digit[4];
				if(result == digit[2]){
					System.out.println(number);
				}
			}
		*/
		/* 
			int count = 0;
			for(int number = 1; number <= 1000; number ++){
				if(number % 3 == 2 && number % 5 == 3 && number % 7 == 2){
					count += 1;
					System.out.println(number);
				}
			}
			System.out.println(count);
		*/
		/* 
			int count = 0;
			int[] digit = new int[3];
			int number = 100;
			while(number <= 999){
				int i = 0;
				while(i < digit.length){
					digit[i] = number / (int)Math.pow(10,i) % 10;
					i++;
				}
				int result = 0;
				i = 0;
				while(i < digit.length){
					result = result + (int)Math.pow(digit[i],3);
					i++;
				}
				if(result == number){
					count += 1;
				}
				number++;
			}
			System.out.println(count);
		*/
		/* 
			int sum = 0;
			int i = 1;
			while(i <= 100){
				sum += i;
				i++;
			}
			System.out.println(sum);
		*/
		/*
			纸张没折叠一次厚度翻倍
			high为珠穆朗玛峰的高度
			time为折叠的次数
			thick为纸张的厚度
		*/
		/* 
			final double high = 8848;
			double thick = 0.01;
			int time = 0;
			while(thick < high){
				thick *= 2;
				time +=1;
			}
			System.out.println("time = " + time);
			System.out.println("thick = " + thick);
		*/
		/* 
			final double high = 8848;
			double thick = 0.01;
			int time = 0;
			for(; thick <= high; time ++){
				thick *= 2;
			}
			System.out.println("time = " + time);
			System.out.println("thick = " + thick);
		*/
		/* 
			for(int i = 1; i <= 4; i++){
				for(int j = 1; j <= 5; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		/* 
			for(int i = 1; i <= 5; i++){
				for(int j = 1; j <= i; j++){
					System.out.print("*");
				}
				System.out.println();
			}
		*/
		/* 
			for(int i = 1; i <= 9; i++){
				for(int j = 1; j <= i; j++){
					
					if(j == 4){
						continue;
					}
					System.out.print(i+"*"+j+"="+(i*j)+"\t");
				}
				System.out.println();
			}
		*/
		/*
		小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。
		double money = 0;
		int day = 1;
		*/
		
		double money = 0;
		int day = 0;
		while(money < 100){
			if(day == 5 || day % 5 == 0 && day != 0){
				money -= 6;
			}
			money += 2.5;
			day++;
		}
		System.out.println("day = " + day);
		System.out.println("money = " + money);
	
		// double money = 0;
		// int day = 1
		day = 0;
		money = 0;
		for(; money < 100; day++){
			if(day == 5 || day % 5 == 0 && day != 0){
				money -= 6;
			}
			money += 2.5;
		}
		System.out.println("day = " + day);
		System.out.println("money = " + money);
	}
}