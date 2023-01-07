//the below code demonstrates For,While,Continue,If-Else and Switch
public class Demo {
    public static void main(String[] args){
        String[] books={"To Kill a MockingBird","Spare","The light We Carry","The Silent Patient","Rich Dad Poor Dad"};
        
        printBooks(books, books.length);
        String[] excludedBooks=excludeBook(books,"Spare");
        printBooks(excludedBooks,excludedBooks.length);
        String author=fetchAuthor("Rich Dad Poor Dad");
    }

    public static void printBooks(String[] books, int length){
        //print All Books in console using for loop
        for(int i=0; i<length; i++){   //for(String book: books){S.O.P(book);}
            System.out.println(books[i]);
        }
    }

    public static String[] excludeBook(String[] books, String bookToExclude){
        int counter =books.length;
        String[] excludedBooks;
        //using if else for reducing unnecessary processing
        if(books.length == 0){
            return books;
        }
        else{
            excludedBooks=new String[books.length-1];
            int index=0;
            //using while loop to itterate and continue to skip adding "SPARE" book
            while(counter>0){
                if(books[books.length-counter].equals(bookToExclude)){
                    counter--;
                    continue;
                }
                excludedBooks[index]=books[books.length-counter];
                index++;
                counter--;
            }
        }
        return excludedBooks;
    }

    public static String fetchAuthor(String book){
        String author;
        //using switch block for select the author for the book
        switch(book){
            case "To Kill a MockingBird":
                author="Harper Lee";
                break;
            case "Spare":
                author="Prince Harry";
                break;
            case "The light We Carry":
                author="Michelle Obama";
                break;
            case "The Silent Patient":
                author="Alex Michaelides";
                break;
            case "Rich Dad Poor Dad":
                author="Robert Kiyosaki";
                break;
            case default:
                System.out.println("Book Details not present");
                author="";
                break;
        }
        return author;
    }
}