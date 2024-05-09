public class Book implements Publication{
    
    private String title;
    private String author;
    private int totalPages;
    private int actualPages;
    private boolean open;
    private Person reader;

    public Book(String title,String author,int totalPages, Person reader){

        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.reader = reader;
        this.open = false;
        this.actualPages = 0;
    }

    @Override
    public void open() {
        this.open = true;
    }

    @Override
    public void close() {
        this.open = false;
    }

    @Override
    public void skim(int page) {
        this.actualPages = page;
    }

    @Override
    public void nextPage() {
        this.actualPages++;
    }

    @Override
    public void previousPage() {
        this.actualPages--;
    }
}
