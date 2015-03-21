package apprenderJava;

public class FraseOMatic {

	public static void main(String[] args) 
	{
		String[] wordListOne = {"круглосуточный","трёх-звенный","3000-метровый",
				"взаимный","обоюдный выигрыш","фронтэнд","на основе вэб технологий",
				"проникающий","умный","шесть сигм","метод критического пути","динамичный"};
		
		String[] wordListTwo = {"уполномоченный","трудный","чистый продукт","ориентированный",
				"центральный","распределённый","кластеризованный","фирменный","нестандартный ум",
				"позиционированный", "сетевой","сфокусированный","использованный с выгодой",
				"выровненный","нацеленный на","общий","совместный","ускоренный"};
		
		String[] wordListThree = {"процесс","пункт разгрузки","выход из положения",
				"тип структуры","талант","подход","уровень завоёванного внимания",
				"портал","период времени","обзор","образец","период следования"};
		
		int oneLenth = wordListOne.length;
		int twoLenth = wordListTwo.length;
		int threeLenth = wordListThree.length;
		
		int rand1 = (int) (Math.random() * oneLenth);
		int rand2 = (int) (Math.random() * twoLenth);
		int rand3 = (int) (Math.random() * threeLenth);
		
		String theFrase = wordListOne[rand1] +" "+ wordListTwo[rand2] +" "+ wordListThree[rand3];
		
		System.out.println("\n\tВсё, что нам нужно, это - " + theFrase + ".");
		

	}

}
