package eu.codefounders.training.designpatterns.chainof;

public class ChainPatternApp {

	public static void main(String[] args) {
		ContainsSpaceFilter containsSpaceFilter = new ContainsSpaceFilter();
		CharacterCheckFilter characterCheckFilter = new CharacterCheckFilter("Te");
		StringStartsWithUppercaseFilter f2 = new StringStartsWithUppercaseFilter();

		// containsSpaceFilter.setNextFilter(characterCheckFilter);
		// characterCheckFilter.setNextFilter(f2);
		
		containsSpaceFilter.setNextFilter(f2);

		System.out.println("Test string '   '");
		containsSpaceFilter.checkFilter("    ");
		System.out.println("");

		System.out.println("Test string '__Teeee'");
		containsSpaceFilter.checkFilter(" _Teeee");
		System.out.println("");

		System.out.println("Test string 'Z   Te'");
		containsSpaceFilter.checkFilter("Z   Te");
		System.out.println("");

	}

}
