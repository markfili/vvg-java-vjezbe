package hr.vvg.java.vjezbe.entities;

/**
 * Created by marko on 3/19/15.
 */
public class Magazine extends Publication {

    private static final float PRICE_PER_COPY = 10;

    private int monthPublished;

    public Magazine(String publicationTitle, int monthPublished, int yearPublished, int numberOfPages, String typeOfPublication) {
        super(publicationTitle, yearPublished, numberOfPages, typeOfPublication, checkPricePerPage(numberOfPages));
        this.monthPublished = monthPublished;
    }

    private static double checkPricePerPage(int pagesNum) {
        return (float) pagesNum / PRICE_PER_COPY;
    }

    public int getMonthPublished() {
        return monthPublished;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Mjesec izdanja: " + getMonthPublished());
    }

}
