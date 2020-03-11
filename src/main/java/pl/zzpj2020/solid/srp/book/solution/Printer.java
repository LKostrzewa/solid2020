package pl.zzpj2020.solid.srp.book.solution;

import pl.zzpj2020.solid.srp.book.solution.Book;

import java.util.Map;

public class Printer {
    /**
     * Prints the current page.
     */
    public void printCurrentPage(Book book) {
        System.out.println(book.getCurrentPageContents());
    }


    /**
     * Prints all pages
     * @return
     */
    public String printAllPages(Book book, Map<Integer, String> pages) {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return  allPages;
    }
}
