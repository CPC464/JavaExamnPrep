//Imports left out

/////////////////////
// Search and replace (OPTION + CMD + F) 
// Match case 

// Book
// book



@Service
public class BookService {
	private final BookRepository bookRepository;
	
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}
	
	  // returns all the books
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }
    
    // Search by description
    public List<Book> findByDescriptionContaining(String search){
    return bookRepository.findByDescriptionContaining(search);
    }
    
    // retrieves a single book by id
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }

    // creates a book
    public Book createOrUpdateBook(Book b) {
        return bookRepository.save(b);
    }
            
    // deletes a book
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    
} // Closing bracket for BookService
