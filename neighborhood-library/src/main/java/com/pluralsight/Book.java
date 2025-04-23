package com.pluralsight;

public class Book {
    //class properties that describes a book
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;
    //Constructor
    public Book(int id,String isbn,String title){
        this.id=id;
        this.isbn=isbn;
        this.title=title;
        this.isCheckedOut=false;
        this.checkedOutTo="";
    }

    //my custom methods
    public void checkOut(String name){
        //set isCheckedOut to true using setter
        this.setCheckedOut(true);
        //set checkout to, to the name passed in
        this.setCheckedOutTo(name);
    }
    //my custom methods
    public void checkIn(String name) {
        //set isCheckedIn to true using setter
        this.setCheckedOut(false);
        //set checkout to, to the name passed in
        this.setCheckedOutTo("");
    }
    //getters and setters for
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}

