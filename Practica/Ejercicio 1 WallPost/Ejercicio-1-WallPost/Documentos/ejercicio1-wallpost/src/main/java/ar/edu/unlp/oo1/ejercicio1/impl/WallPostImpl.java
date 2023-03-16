package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {
	
	private String texto = "Undefined post";
	private int likes;
	private boolean esMarcado;
	
	public String getText() {
		return this.texto;
	}
	
	public void setText(String text) {
		this.texto = text;
	}
	public int getLikes() {
		return this.likes;
	}
	
	public void like() {
		this.likes++;
	}
	public void dislike() {
		if (this.likes > 0) {
			this.likes--;
		}
		
	}
	
	public boolean isFeatured() {
		if (this.esMarcado) {
			return true;
		}
		return false;
	}
	
	public void toggleFeatured() {
		if (this.esMarcado) {
			this.esMarcado = false;
		}
		else {
			this.esMarcado = true;
		}
	}
	
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }


}
