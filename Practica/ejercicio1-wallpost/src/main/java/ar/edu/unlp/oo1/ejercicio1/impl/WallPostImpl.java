package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */

public class WallPostImpl implements WallPost {

	private String text = "Undefined post";
	private int likes;
	private boolean featured;

    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

	@Override
	public String getText() {
		return this.text;
	}

	@Override
	public void setText(String text) {
		this.text = text;
		
	}

	@Override
	public int getLikes() {
		return this.likes;
	}

	@Override
	public void like() {
		this.likes++;
		
	}

	@Override
	public void dislike() {
		if (this.likes > 0){
			this.likes--;
		}
	}

	@Override
	public boolean isFeatured() {
		if (this.featured) {
			return true;
		}
		return false;
	}

	@Override
	public void toggleFeatured() {
		this.featured = !this.featured;
	}




}
