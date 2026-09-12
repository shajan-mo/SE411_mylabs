import java.util.List;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Execise 1");
		String[] names = {"Shajan", "Sara", "Nora"};
		PrintableList<String> stringList = new PrintableList<>(names);
		System.out.println("Name List:");
		stringList.printItems();
		
		Integer[] numbers = {1, 2, 3};
		PrintableList<Integer> integerList = new PrintableList<>(numbers);
		System.out.println("Number List:");
		integerList.printItems();
		
		System.out.println("Execise 2");
		NumberBox<Integer> intBox = new NumberBox<>();
		intBox.setItem(40);
		System.out.println("Number box:");
		System.out.println(intBox.getItem());
		System.out.println("The Sum:");
		System.out.println(intBox.sum(30));
		
		NumberBox<Double> doubleBox = new NumberBox<>();
		doubleBox.setItem(0.5);
		System.out.println("Double box:");
		System.out.println(doubleBox.getItem());
		System.out.println("Double Sum:");
		System.out.println(doubleBox.sum(0.5));
		
		System.out.println("Execise 3");
		List<String> fruits = List.of("Apple", "Banana", "Orange");
		printList(fruits);
		List<Integer> nums = List.of(1, 2, 3, 4, 5);
		System.out.println(sumNumbers(nums));
	}
	
	
	public static void printList(List<?> list) {
	    for (Object item : list) {
	        System.out.println(item);
	    }}
	public static double sumNumbers(List<? extends Number> list) {
	    double sum = 0;

	    for (Number number : list) {
	        sum += number.doubleValue();
	    }

	    return sum;
	}
	
	
}
