package serializer;

import classes.Cat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomSerializerTest {
    private Cat cat;
    @BeforeEach
    void setUp() {
        cat = new Cat();
        cat.setName("Ologbo");
        cat.setAge(10);
        cat.setColor("black");
    }
    @Test
    void testWriteCatToJson(){
        String expectedJsonResponse ="{\"name\":\"Ologbo\",\"age\":10,\"color\":\"black\"}";
        String catAsJson = CustomSerializer.catToJson(cat);
        assertEquals(expectedJsonResponse,catAsJson);
    }
}