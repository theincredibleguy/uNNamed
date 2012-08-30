package bookmark

class Bookmark {

    static hasMany = [tags:Tag]
    String url
    String title
    String notes
    Date dateCreated = new Date()
	Integer rating
	String type

    static constraints = {
		url(url:true)
		title(blank:false)
		rating(range:1..10)
		type(inList:['blog','article','general','news'])
		notes(maxSize:1000)
    }

    static optionals = ['notes']
	
	String toString() {
		return "$title - $url";
	}
    
}
