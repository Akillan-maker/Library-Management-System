public class Book {

    private String bookName;
    private String author;
    private long isbm;
    private int rate;
    private String availability;

    public Book(String bookName,String author,long isbm,int rate,String availability){

        this.bookName=bookName;
        this.author=author;
        this.isbm=isbm;
        this.rate=rate;
        this.availability=availability;

    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public long getIsbm() {
        return isbm;
    }

    public int getRate() {
        return rate;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    @Override
    public String toString(){
        return "Book Name: "+this.getBookName()+"\nAuthor: "+this.getAuthor()+"\nIsbm: "+this.getIsbm()+"\nAvailability: "+this.getAvailability();
    }
}
