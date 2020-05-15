package Creational.Prototype;

public class ExecMovies {
	public static void main(String[] args) {
		Catalog catalog = new Catalog();
		
		HorrorMovie horror = (HorrorMovie) catalog.cloneMovie(MovieType.HORROR);
		System.out.println(horror.toString());
		
		horror.setTitle("Run!");
		horror.setDuration(100);
		horror.setScareScenes(5);
		Character character = new Character();
		character.setName("Bam");
		horror.setCharacter(character);
		System.out.println(horror.toString());
		
		HorrorMovie horror2 = (HorrorMovie) catalog.cloneMovie(MovieType.HORROR);
		System.out.println(horror2.toString());		
	}
}
