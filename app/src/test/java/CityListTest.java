import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CityList;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CityListTest {
    private CityList cityList = new CityList();

    @Before
    public void createList() {
        cityList.add(new City("Edmonton", "Alberta"));
    }
    @Test
    public void testHasCity() {
        City city = new City("Red deer", "Alberta");
        cityList.add(city);
        assertEquals(cityList.getCities().contains(city), cityList.hasCity(city));
        assertTrue(cityList.getCities().contains(city));
    }
    @Test
    public void testDelete() {
        //assertEquals(1, cityList.getCities().size());
        City city = new City("Calgary", "Edmonton");
        cityList.add(city);
        assertTrue(cityList.hasCity(city));
        cityList.delete(city);
        assertFalse(cityList.hasCity(city));
    }
}
