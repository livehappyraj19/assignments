package assignments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment4_CollectionsInJava {

	public static void main(String[] args) {
		System.out.println("---Assessment 4-- Collections-----");
//	Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		System.out.println("1. Top 5 largest cities Are : ");
		
		List<String> largestCities = new  ArrayList<String> (); //--Cities List
		largestCities.add("Delhi");
		largestCities.add("Bangalore");
		largestCities.add("Hyderabad");
		largestCities.add("Mumbai");
		largestCities.add("Ahmedabad");		
		largestCities.remove("Mumbai");
		largestCities.add(3,"Bombay");
		
		System.out.println(largestCities); 
		System.out.println("Size : " +largestCities.size());  // Printing the size of List
		
		List<Double> largestCityByArea = new ArrayList<>(); //--Cannot convert string to Int 
		
		largestCityByArea.add(1484.0); // Area of the cities List
		largestCityByArea.add(741.1);
		largestCityByArea.add(650.2);
		largestCityByArea.add(603.3);
		largestCityByArea.add(505.4);	
		
		System.out.println(largestCityByArea); 
		
		double city3Area =largestCityByArea.get(2);
		double city4Area =largestCityByArea.get(3);
		double combinedArea = city3Area + city4Area;
		
		System.out.println("Total Area of 3rd and 4th Cities Combined : " + largestCities.get(2) +" , "+largestCities.get(3) ); 
		
		System.out.print ("Total Area -- :" + largestCityByArea.get(2) +" + "+largestCityByArea.get(3) +" = " ); 
		System.out.println( combinedArea);
		
//-------Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		Set<String> touristAttraction =new HashSet<String> (); // --Saved in Random Order
		
		touristAttraction.add("Eiffel Tower, France");
		touristAttraction.add("Louvre Museum, France");
		touristAttraction.add("Great Wall of China");
		touristAttraction.add("Colosseum, Italy");
		touristAttraction.add("Sagrada Familia, Spain");
		touristAttraction.add("Taj Mahal, India");
		touristAttraction.add("");
		touristAttraction.add("Angkor Wat, Cambodia");
		touristAttraction.add("Grand Canyon, USA");
		touristAttraction.add("Central Park, USA");
		touristAttraction.add("Grand Bazaar, Istanbul, Turkey");
		touristAttraction.add("Eiffel Tower, France"); // Duplicate check
		
		System.out.println("------=============================--------------");
		System.out.println("2. Top 10 most visited tourist attractions in the world are : ");
		System.out.println(touristAttraction);
		System.out.println("Total num of Attractions  : " + touristAttraction.size());
		
		Set<String> touristAttractionSize = new HashSet <> ();
		touristAttractionSize.add("324 meters");
		touristAttractionSize.add("72735 square meters");
		touristAttractionSize.add("13170 miles");
		touristAttractionSize.add("1750 feet");
		touristAttractionSize.add("172 meters");
		touristAttractionSize.add("42 acres");
		touristAttractionSize.add("");
		touristAttractionSize.add("1626000 square meters");
		touristAttractionSize.add("277 miles");
		touristAttractionSize.add("843 acres");
		touristAttractionSize.add("30,700 square meters");
		
		System.out.println(touristAttractionSize);
		
		System.out.println("-------Top 10 most visited tourist attractions in the world are : " );
		
		touristAttractionSize.remove("843 acres");   //---Dint remove anything
		System.out.println("--After Removed --" + touristAttractionSize); // --No change ---Its removed now
		
		System.out.println("------=============================--------------");
		System.out.println("3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value. : ");
		
		int [] numbers  = { 54, 25,31, 10, 19, 38 , 15, 1, 28, 46  };
		double average4n5 = (numbers [4] + numbers[5] )/2; 
		System.out.println(" Average of 5th and 6th Value. : " + average4n5);
		
		
		System.out.println("------=============================--------------");
		System.out.println("4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list. ");
		
		List<String> topMovies = Arrays.asList(
				"Avatar", "Avengers: Endgame", "Avatar: The Way of Water", "Titanic", "Ne Zha 2" );
		System.out.println("the third movie in top 5 highest-grossing movies : " + topMovies.get(2));
		
	}

}
