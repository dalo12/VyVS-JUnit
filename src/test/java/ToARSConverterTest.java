import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToARSConverterTest {
    protected final static boolean BUY = false;
    protected final static boolean SELL = true;
    protected ToARSConverter toARSConverter = new ToARSConverter();

    @Test
    public void usdToArsForBuyTest(){
        double value = toARSConverter.usdToArs(10, BUY);
        assertEquals(value, 3500.78);
    }

    @Test
    public void usdToArsForSellTest(){
        double value = toARSConverter.usdToArs(10, SELL);
        assertEquals(value, 3675.82);
    }

    @Test
    public void cnyToArsForBuyTest(){
        double value = toARSConverter.cnyToArs(100, BUY);
        assertEquals(value, 4783.40);
    }

    @Test
    public void cnyToArsForSellTest(){
        double value = toARSConverter.cnyToArs(100, SELL);
        assertEquals(value, 5022.57);
    }
}
