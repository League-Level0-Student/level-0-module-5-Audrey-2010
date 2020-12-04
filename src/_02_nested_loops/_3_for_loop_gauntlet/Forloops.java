package _02_nested_loops._3_for_loop_gauntlet;

public class Forloops {
public static void main(String[] args) {
	for (int i=0; i<100; i++) {
		System.out.print(i+" ");
	}
	System.out.println();
	for(int o=100; o>0; o--) {
		System.out.print(o+" ");
	}
	System.out.println();
	for(int p=2; p<100; p++) {
		if(p % 2 ==0) {
			System.out.print(p+" ");
		}
	}
	System.out.println();
	for(int a=1; a<99; a++) {
		if(a % 2 ==1) {
			System.out.print(a+" ");
		}
	}
	System.out.println();
	for(int s=0; s<500; s++) {
		if(s % 2 ==0) {
			System.out.print(s+" even ");
		}
		if(s % 2 == 1) {
			System.out.print(s+" odd ");
		}
	}
	System.out.println();
	for(int d=7; d<778; d++) {
		if(d % 7 == 0) {
			System.out.print(d+" ");
		}
}
	System.out.println();
	for(int f=2010; f<2021; f++) {
	System.out.print("In "+f+", I was "+(-(2010-f))+" ");
	
		
		}
	
System.out.println();
for(int g=0; g<3; g++) {
	for(int h=0; h<3; h++) {
		System.out.println(g+" "+h);
	}
		System.out.println();
		for(int j=1; j<8; j+=3) {
		for(int k=j; k<j+3; k++) {
	
			System.out.print(k+" ");
		
		}
		System.out.println();
		}
}
for(int l=1; l<101; l+=10) {
	for(int z=l; z<l+10; z++ ) {
		System.out.print(z+" ");
	}
	System.out.println();
}
}}
