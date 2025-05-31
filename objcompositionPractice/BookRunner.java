package objcompositionPractice;


public class BookRunner {
    public static void main(String[]args){
        Book book = new Book(2,"Harry potter","harry");
        book.addReview(new Review(10,"great",5));
        book.addReview(new Review(7,"awesome", 5));

    System.out.println(book);
    }
}

