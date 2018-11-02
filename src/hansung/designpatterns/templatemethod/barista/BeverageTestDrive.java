package hansung.designpatterns.templatemethod.barista;


import java.awt.*;

public class BeverageTestDrive {
	public static void main(String[] args) {
 
		TeaWithHook tea = new TeaWithHook();
		CoffeeWithHook coffee = new CoffeeWithHook();
		DutchCoffeeWithHook dutch = new DutchCoffeeWithHook();
 
		System.out.println("\nMaking tea...");
		tea.prepareRecipe();
		System.out.println("\nMaking coffee...");
		coffee.prepareRecipe();
		System.out.println("\nMaking dutch coffee...");
		dutch.prepareRecipe();
	}
}
