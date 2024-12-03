package hust.soict.dsai.test.cart;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        //Create a new cart
        Cart cart = new Cart();

        //Create new dvd objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        cart.addMedia(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars","Science Fiction","George Lucas",87,24.95f);
        cart.addMedia(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
//        cart.addMedia(dvd3);
        
        Book book = new Book("Learn Java", "Programming", 29.99f);
        cart.addMedia(book);
        //Test the print method
        cart.addMedia(dvd3);
        cart.addMedia(dvd3);
        cart.print();

        //To-do: Test the search method
        //Search by ID
        cart.searchCart(1);
        cart.searchCart(6);
        
//        //Search by Title
        cart.searchCart("Star Wars");
        cart.searchCart("One Piece");
        
        cart.sortMediaByCost();
        cart.sortMediaByTitle();
        cart.print();
    }
}