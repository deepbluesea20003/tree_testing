package com.lbg;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchableTreeTest {

    @Test
    void populateContainer() {
        SearchableTree cut = new SearchableTree();
        String expected_value = "selvyn";
//        int test = 22/0;
        String actual_value = cut.populateContainer();
        assertEquals(expected_value,actual_value);

    }

    @Test
    void findWhenItemThere() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        int expected_value = 0;
        int actual_value = cut.find("selvyn");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findItemWhenNotThere(){
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        int expected_value = -1;
        int actual_value = cut.find("Adam");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemThere() {
        SearchableTree cut = new SearchableTree();
        cut.populateContainer();
        boolean expected_value = true;
        boolean actual_value = cut.findIfLastItem("taxes");
        assertEquals(expected_value,actual_value);
    }

    @Test
    void findIfLastItemWhenItemNotThere() {

    }

    @Test
    void findIfFirstItem() {

    }
}