import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ModuleATest {
    @Test
    public void moduleATest() throws IOException {
        Properties moduleProperties = new Properties();
        InputStream in = getClass().getResourceAsStream("module.properties");
        try {
            moduleProperties.load(in);
        } finally {
            in.close();
        }
        assertThat(moduleProperties.getProperty("module"), is("moduleA"));
    }
}
