package ar.edu.unlp.oo1.ejercicio1;

public interface WallPost {
	
	String getText();
	
	void setText(String text);
	
	WallPost text(String text);

	int getLikes();
	
	WallPost like();
	
	WallPost dislike();
	
	boolean isFeatured();
	
	WallPost toggleFeatured();
	
}