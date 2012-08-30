package bookmark

class BookmarkController {
	
	def scaffold = Bookmark

    def create1 = {
    	
	def b = new Bookmark(url: new URL('http://grails.org'),
	      	    		  title:'Grails ' + new java.util.Date(),
				  notes:'Groovy-based web framework')

	b.save(flush: true)

	render 'new bookmark saved version 1'	
    
    }

    def readBookmarks = {
		
		Bookmark.list().each {
    		render 'title: ' + it.title + '   URL: '+ it.url + '\n'
		}
    }
	
	def countBookmarks = {
		render Bookmark.count
	}
	
	
	
}