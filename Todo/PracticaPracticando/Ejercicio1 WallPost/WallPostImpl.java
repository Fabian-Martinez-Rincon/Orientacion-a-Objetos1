package ar.edu.unlp.oo1.ejercicio1.impl;
import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean featured;
	
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	public String getText() { return this.text;}

	public void setText(String text) {this.text = text;}

	public WallPost text(String text) {this.setText(text);
		return this;
	}

	public int getLikes() { return this.likes;}

	public WallPost like() { this.likes++;
		return this;
	}

	public WallPost dislike() {
		if(this.likes > 0)
			this.likes--;
		return this;
	}

	public boolean isFeatured() { return this.featured;}

	public WallPost toggleFeatured() { this.featured = !this.featured;
		return this;
	}

	public WallPostImpl() {
		this.text = "";
		this.likes = 0;
		this.featured = false;
	}
	
	
}