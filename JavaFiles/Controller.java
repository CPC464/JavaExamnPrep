// Search and replace (OPTION + CMD + F) 
// NB: Match case 
// Print statements left out for brevity


// Books
// books
// language
// Language
// name
// Name
// creator
// Creator
// version
// Version

@Controller
public class BooksController {
    // Reference to service file. NB: If multiple Service classes repeat line for each one 
    private final BookService bookService;

    // Constructor. NB: If multiple Service classes pass each of them in as arguments and repeat the "this." line
    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    // Route to render all elements from db
    @RequestMapping("/books")
    public String index(Model model) {
        List<Book> books = bookService.allBooks();
        model.addAttribute("books", books);
        return "/books/index.jsp";
    }
    
    // Route to render one specific element
    @RequestMapping("/books/{id}")
    public String show(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/show.jsp";
    }
    
    // Route to render form to create new element
    @GetMapping("/books/new")
    public String newBook(@ModelAttribute("book") Book book) {
        return "/books/new.jsp";
    }
    
    // Route to create new element and save it in db
    @PostMapping(value="/books/new")	
    public String create(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/new.jsp";
        } else {
            bookService.createOrUpdateBook(book);
            return "redirect:/books";
        }
    }
    

     // Route to render form to edit an existing element
    @GetMapping("/books/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Book book = bookService.findBook(id);
        model.addAttribute("book", book);
        return "/books/edit.jsp";
    }

    // Route to perform the update of an existing element
    @PutMapping("/books/{id}/edit")	
    public String edit(@Valid @ModelAttribute("book") Book book, BindingResult result) {
        if (result.hasErrors()) {
            return "/books/edit.jsp";
        }
        else {
            bookService.createOrUpdateBook(book);
        }
        return "redirect:/books";
    }
    
     // Route to delete an existing element
    @RequestMapping("/books/{id}/destroy")
    public String delete(@PathVariable("id") Long id, Model model) {
        bookService.deleteBook(id);
        return "redirect:/books";
    }

} //Closing bracket for BooksController class