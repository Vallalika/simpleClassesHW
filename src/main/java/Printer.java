public class Printer {

    private int sheetsOfPaperLeft;
    private int numberOfPages;
    private int numberOfCopies;

    public Printer() {
        this.sheetsOfPaperLeft = 100;
        this.numberOfPages = 0;
        this.numberOfCopies = 0;
    }

    public int getPages() {
        return this.numberOfPages;
    }

    public int getCopies() {
        return this.numberOfCopies;
    }

    public int getSheetsOfPaperLeft() {
        return this.sheetsOfPaperLeft;
    }

    public void print(int nbOfPages, int nbOfCopies) {
        if (nbOfPages * nbOfCopies <= this.getSheetsOfPaperLeft()) {
            this.numberOfPages = nbOfPages;
            this.numberOfCopies = nbOfCopies;
            this.sheetsOfPaperLeft = this.getSheetsOfPaperLeft() - (nbOfPages * nbOfCopies);
        }
    }
}