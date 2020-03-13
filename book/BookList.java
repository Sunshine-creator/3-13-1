package book;
public class BookList {
    private Book[] books =new Book[100];
    private int size =0;
    public BookList() {
        books[0] = new Book("西游记",35,
                "吴承恩","古典名著",false);
        books[1] = new Book("水浒传",89,"施纳曼",
                "古典名著",false);
        size =2;
    }
    public  Book getBook(int pos){
        return  books[pos];
    }
    public  void setBook(int pos , Book book){
        books[pos] =book;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
}
