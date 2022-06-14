import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer myPrinter;

    @Before
    public void before() {
        myPrinter = new Printer();
    }

    @Test
    public void canPrint() {
        myPrinter.print(5,2);
        assertEquals(5,myPrinter.getPages());
        assertEquals(2,myPrinter.getCopies());
        assertEquals(90,myPrinter.getSheetsOfPaperLeft());
    }

    @Test
    public void canNotPrint() {
        myPrinter.print(5,100);
        assertEquals(100,myPrinter.getSheetsOfPaperLeft());
    }

}
