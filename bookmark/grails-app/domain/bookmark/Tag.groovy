package bookmark

class Tag {

    static constraints = {
    }

    static belongsTo = Bookmark
	
    Bookmark bookmark
    String name
	
	String toString() {
		return name;
	}
}
