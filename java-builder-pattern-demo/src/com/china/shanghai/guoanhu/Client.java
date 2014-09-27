package com.china.shanghai.guoanhu;

import com.china.shanghai.guoanhu.BuilderPatternDemo.Builder;

public class Client {
	
	public static void main(String[] args) {
		
		Builder builder = new BuilderPatternDemo.Builder(1);
		BuilderPatternDemo demo = builder.b(2).build();
		
	}
}
