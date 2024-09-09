/**
 * @ Author: Pedro Pinto (pmap@ua.pt) & Guilherme Santos (gui.santos91@ua.pt)
 * @ Create Time: 2024-04-22
 */
package ex3;
public class InventoryState implements State {

    private Book book;

    public InventoryState(Book book) {
        this.book = book;
    }

    @Override
    public void registerBook() {
        book.setState(new AvailableState(book));
    }

    @Override
    public void requireBook() {
        System.err.println("Book can't be required from inventory");
    }

    @Override
    public void returnBook() {
        System.err.println("Book can't be returned from inventory");
    }

    @Override
    public void reserveBook() {
        System.err.println("Book can't be reserved from inventory");
    }

    @Override
    public void cancelBook() {
        System.err.println("Book can't be canceled from inventory");
    }
    
}
