package com.subodh.collection;

public class Ex implements Comparable <Ex>{
	private int x;
	private int y;
	

	


	public Ex(int x, int y) {
		this.x = x;
		this.y = y;
	}


	@Override
	public String toString() {
		return "Ex [x=" + x + ", y=" + y + "]";
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int compareTo(Ex e) { //ts.add(e1);
		//return this.x-e.x;  	//ts.add(e2);->e2.compareTo(e1);
		return e.x-this.x;		//Current Object-Argument Object=>ASE order  ->default order
								//AO-CO=>DSE order
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
