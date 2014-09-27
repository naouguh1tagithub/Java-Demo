package com.china.shanghai.guoanhu;

public class BuilderPatternDemo {
	
	private final int a ;
	private final int b ;
	private BuilderPatternDemo(Builder builder){
		this.a = builder.a;
		this.b = builder.b;
	}
	
	public static class Builder{
		
		private int a;
		private int b;
		public Builder(int a){
			this.a = a;
		}
		public Builder b(int b){
			this.b = b;
			return this;
		}
		public BuilderPatternDemo build(){
			return new BuilderPatternDemo(this);
		}
	}
	
	
}
