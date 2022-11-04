public class WallPostImpl implements WallPost {
	private String text;
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
		this.text=text;
	}

	@Override
	public WallPost text(String text) {
		this.text=text;
		return this;
	}

	@Override
	public int getLikes() {
		return this.likes;
	}

	@Override
	public WallPost like() {
		this.likes++;
		return this;
	}

	@Override
	public WallPost dislike() {
		if(this.likes>0) {
			this.likes--;
		}else{
			likes=0;
		}	
		return this;
	}

	@Override
	public boolean isFeatured() {
		return this.featured;
	}

	@Override
	public WallPost toggleFeatured() {
		this.featured=!this.featured;
		return this;
	}    

}