package test_p6;

import test_p6.Car;

public class test_p6 {
	public static void main(String[] args) {
		RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
	}
}

class Car{
	private int num;
	private double gas;
	
	public Car(int n, double g){
		num = n;
		gas = g;
		System.out.println("�Ͳ��F������" + num+"�T�o�q��"+gas+"�����l");
	}
	
	public void setCar(int n, double g) {
		num=n;
		gas=g;
		System.out.println("�N�����]��" + num+ "�A�T�o�q�]��"+gas);
	}
	
	public void show(){
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		
	}
}

class RacingCar extends Car{
	private int course;
	public RacingCar(int n, double g, int c){
		super(n, g);
		course = c;
		System.out.println("�Ͳ��F�s����" + course + "���ɨ�");
	}
	
	public void setCource(int c) {
		course = c;
		System.out.println("�N�ɨ��s���]��" + course);
	}
}