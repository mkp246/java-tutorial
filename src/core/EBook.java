package core;

import java.util.ArrayList;

public class EBook implements Readable {
    private String name;
    private int pageNumber;
    private ArrayList<String> pages;

    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public int howManyPages(){
        return pages.size();
    }

    @Override
    public String read() {
        return pages.get(nextPage());
    }

    private int nextPage(){
        int temp = pageNumber;
        pageNumber = (pageNumber + 1) % howManyPages();
        return temp;
    }
}
