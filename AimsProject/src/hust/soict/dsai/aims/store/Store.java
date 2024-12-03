package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();

    public Store(){
    }

    public void addMedia(Media media) {
        if (!itemsInStore.contains(media)) {
        	itemsInStore.add(media);
            System.out.println(media.getTitle() + " has been added to the store.");
        } else {
            System.out.println(media.getTitle() + " is already in the store.");
        }
    }

    public void removeMedia(Media media) {
        if (itemsInStore.contains(media)) {
        	itemsInStore.remove(media);
            System.out.println(media.getTitle() + " has been removed from the store.");
        } else {
            System.out.println(media.getTitle() + " is not in the store.");
        }
    }
    
    public Media getMedia(String title) {
        for (Media m : itemsInStore) {
            if (m.getTitle().equals(title)) {
                return m;
            }
        }
        return null;
    }
    
    public void playMedia(Media media) {
        if (media instanceof DigitalVideoDisc) {
            DigitalVideoDisc dvd = (DigitalVideoDisc) media;
            dvd.play();
        }
        if (media instanceof CompactDisc) {
            CompactDisc cd = (CompactDisc) media;
            cd.play();
        }
    }
    
    public void printStore(){
        System.out.println("***********************STORE***********************");
        System.out.println("Items in Store:");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println(itemsInStore.get(i).toString());
        }
        System.out.println("***************************************************");
    }
}