package by.epam.training.onlineshop.main;

import java.util.ArrayList;
import java.util.List;

//import by.epam.training.onlineshop.entity.Appliances;
import by.epam.training.onlineshop.entity.Book;
import by.epam.training.onlineshop.entity.FlowerPot;
import by.epam.training.onlineshop.entity.Fridge;
import by.epam.training.onlineshop.entity.Goods;
import by.epam.training.onlineshop.entity.HairDryer;
import by.epam.training.onlineshop.entity.VacuumCleaner;

public class Main {
	public static void main(String[] args) {
		List<Goods> goods = new ArrayList<Goods>();
		
		goods.add(new Book("War and Peace", 20));
		goods.add(new FlowerPot("RosePot", 15));
		goods.add(new HairDryer("HDr Rowenta", 50, 700, "A+", 3, 3, true));
		goods.add(new Fridge("Fridge Indesit", 1500, 50, "A+", 60, 2, 5));
		goods.add(new VacuumCleaner("VC Dyson", 1000, 1000, "A++", 3, 5, "carpet brush"));
		
		int totalPrice = 0;
		
		for(Goods g : goods) {
			totalPrice = totalPrice + g.price();
			System.out.println(g.title() + " - " + totalPrice);
		}
		
		System.out.println("Total price = " + totalPrice);	
		
		
		
	}

}
