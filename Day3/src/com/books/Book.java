package com.books;

public class Book {
    private int camlin;

    public int getCamlin() {
        return camlin;
    }

    public void setCamlin(int camlin) {
        if(camlin>0)
        this.camlin = camlin;
    }
    void increaseNumberOfBooks(int howmuch){
      setCamlin(this.camlin+howmuch);
    //    this.camlin=this.camlin+howmuch;
  }

    void decreaseNumberOfBooks(int howmuch){
        setCamlin(this.camlin-howmuch);
      //  this.camlin=this.camlin-howmuch;
    }

}
