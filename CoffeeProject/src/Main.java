import java.time.LocalDate;

import adapters.MernisServiceAdapter;
import business.concretes.CustomerManager;
import business.concretes.NeroManager;
import business.concretes.StarbucksManager;
import entities.concretes.Customer; 

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new StarbucksManager(new MernisServiceAdapter());
		customerManager.save(new Customer("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1)));
		

		System.out.println("\n----\n");
		
		CustomerManager customerManager2 = new NeroManager();
		customerManager2.save(new Customer("Engin","Demiroð",28861499108L,LocalDate.of(1985,6,1)));
		
		System.out.println("\n----\n");


		CustomerManager customerManager3 = new StarbucksManager(new MernisServiceAdapter());
		customerManager3.save(new Customer("Engin","Demiroð",28861499108L,LocalDate.of(1987,6,1)));
		
		
		
		
		
	}

}
