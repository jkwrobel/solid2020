package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class BookPrinter {
    
    public BookPrinter() {
    }

    /**
     * Prints all pages
     * @return
     */
    public String printAllPages(Book book) {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
