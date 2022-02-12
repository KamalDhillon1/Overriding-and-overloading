package Overriding;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("What's available for addidas");
		Adidas adidas = new Adidas();
		adidas.jackets();
		adidas.pants();
		adidas.shoes();
		adidas.leggings();

		System.out.println("What's available in Nike");
		Nike nike = new Nike();
		nike.jackets();
		nike.pants();
		nike.tshirts();
		nike.shoes();// running shoes}
	}


	}


